/*******************************************************************************
 * Copyright (c) 2016 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - 
 *   Kasper Gammeltoft
 *******************************************************************************/
package org.eclipse.eavp.viz.service.geometry.widgets;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.eclipse.eavp.STLStandaloneSetup;
import org.eclipse.eavp.sTL.Model;
import org.eclipse.eavp.sTL.Normal;
import org.eclipse.eavp.sTL.STLFactory;
import org.eclipse.eavp.sTL.Triangle;
import org.eclipse.eavp.sTL.Vector;
import org.eclipse.eavp.sTL.Vertex;
import org.eclipse.eavp.sTL.Verticies;
import org.eclipse.eavp.viz.modeling.Shape;
import org.eclipse.eavp.viz.modeling.ShapeController;
import org.eclipse.eavp.viz.modeling.base.IController;
import org.eclipse.eavp.viz.modeling.properties.MeshCategory;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.service.geometry.shapes.ShapeType;
import org.eclipse.eavp.viz.service.geometry.widgets.ShapeTreeContentProvider.BlankShape;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

/**
 * Opens a dialog from the Shape view, allowing the user to import a STL file
 * and view it in the Geometry editor.
 * 
 * @author Kasper Gammeltoft
 *
 */
public class ActionImportSTL extends Action {

	/**
	 * <p>
	 * The current ShapeTreeView
	 * </p>
	 * 
	 */
	private ShapeTreeView view;

	/**
	 * <p>
	 * The current used default shape number appended to the name of every newly
	 * created shape
	 * </p>
	 * <p>
	 * Starting from zero, this number increments every time a new shape is
	 * added to the tree.
	 * </p>
	 * 
	 */
	private int currentShapeId;

	/**
	 * Logger handling notifications and logging info
	 */
	private static final Logger logger = LoggerFactory.getLogger(ActionImportSTL.class);

	/**
	 * Initialize the import action with its respective shape tree view.
	 */
	public ActionImportSTL(ShapeTreeView view) {

		// Set the view and text
		this.view = view;

		this.setText("STL");

		this.currentShapeId = 0;

	}

	/**
	 * <p>
	 * Opens the import stl dialog and reads in the mesh data to a shape
	 * </p>
	 */
	@Override
	public void run() {

		// Create the import dialog
		FileDialog dialog = new FileDialog(view.getSite().getShell());

		// Get the stl file path
		String absPath = dialog.open();

		// Make sure this is a valid file
		if (absPath != null && (absPath.endsWith(".stl") || absPath.endsWith(".STL"))) {

			// Get the selection

			ITreeSelection selection = (ITreeSelection) view.treeViewer.getSelection();
			TreePath[] paths = selection.getPaths();

			// Fail silently if multiple items are selected

			if (paths.length > 1) {
				return;
			}
			// Get the GeometryComponent from the ShapeTreeView's TreeViewer

			IController geometry = (IController) view.treeViewer.getInput();

			if (geometry == null) {
				return;
			}
			// Get the parent shape, regardless of whether an IShape or
			// BlankShape
			// is selected

			IController parentComplexShape = null;

			if (paths.length == 1) {

				// Get the selected object from the single selection

				Object selectedObject = paths[0].getLastSegment();

				if (selectedObject instanceof ShapeController) {

					// Get the selected shape's parent

					ShapeController selectedShape = (ShapeController) selectedObject;
					parentComplexShape = selectedShape.getEntitiesFromCategory(MeshCategory.PARENT).get(0);
				} else if (selectedObject instanceof BlankShape) {

					// Get the selected blank shape's parent

					BlankShape selectedBlank = (BlankShape) selectedObject;
					parentComplexShape = selectedBlank.getParent();
				}

			}

			// Add a child shape to either the GeometryComponent or the
			// parent
			// ComplexShape
			Shape shape = new Shape();

			ShapeController childShape = (ShapeController) view.getFactory().createProvider(shape)
					.createController(shape);

			childShape.setProperty(MeshProperty.TYPE, ShapeType.ComplexTriangular.toString());

			currentShapeId++;

			shape.setTriangles(null);

			// Load the file from the parser
			Model model = loadSTLFile(absPath);
			if (model != null) {

				// Set the new shape's name and triangles from the model
				childShape.setProperty(MeshProperty.NAME, model.getName());
				childShape.setProperty(MeshProperty.ID, Integer.toString(currentShapeId));
				addAllTriangles(shape, model);

			} else {
				ArrayList<Triangle> triangles = getTrianglesFromBinaryFile(absPath);

				// Set the new shape name and ID
				childShape.setProperty(MeshProperty.NAME, getFileName(absPath));
				childShape.setProperty(MeshProperty.ID, Integer.toString(currentShapeId));

				// Set the triangles
				shape.setTriangles(triangles);
			}

			// If there was an error getting the triangles, fail to load the
			// geometry
			if (shape.getTriangles() == null) {
				return;
			}

			if (parentComplexShape == null) {

				// Add a new shape to the root GeometryComponent

				synchronized (geometry) {
					geometry.addEntity(childShape);
				}

				view.treeViewer.refresh();
			}

			else {

				// Create a new shape and add it to the parentComplexShape

				synchronized (geometry) {
					parentComplexShape.addEntity(childShape);
				}

				view.treeViewer.refresh(parentComplexShape);
			}

		}

	}

	/**
	 * Adds all of the loaded triangles from the stl file to the shape object.
	 * 
	 * @param shape
	 *            The new shape to be used in the geometry editor
	 * @param model
	 *            The emf model generated by reading in the stl file
	 */
	private void addAllTriangles(Shape shape, Model model) {
		// ArrayList<Triangle> triangles = new ArrayList<Triangle>();

		EList<Triangle> triangles = model.getTriangles();
		ArrayList<Triangle> shapeTriangles = new ArrayList<Triangle>();
		for (int i = 0; i < triangles.size(); i++) {
			shapeTriangles.add(triangles.get(i));
		}

		shape.setTriangles(shapeTriangles);
	}

	/**
	 * Gets the file name from the specified file path. Returns an empty string
	 * if there is no valid file name.
	 * 
	 * @param filePath
	 *            The file path of the desired file
	 * @return Returns the name of the file from the path, given by the name of
	 *         the file in that directory without the extention. For example,
	 *         the file /home/user/example/myfile.stl will return myfile.
	 */
	private String getFileName(String filePath) {
		String fileName = "";
		int slashIndex = filePath.lastIndexOf(File.separatorChar);
		int dotIndex = filePath.indexOf('.');
		if (slashIndex < dotIndex) {
			fileName = filePath.substring(slashIndex + 1, dotIndex);
		}
		return fileName;
	}

	/**
	 * Gets the triangles from the binary file representation from a stl binary
	 * format.
	 * 
	 * @param filePath
	 *            The absolute file path to the binary stl file
	 * @return Reutrns an array of stl triangles, given by the binary file.
	 */
	private ArrayList<Triangle> getTrianglesFromBinaryFile(String filePath) {
		// Create the array list to return
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();

		try {
			Path path = Paths.get(filePath);
			byte[] fileBytes = Files.readAllBytes(path);
			ByteBuffer buffer = ByteBuffer.wrap(fileBytes, 80, fileBytes.length - 80);
			buffer.order(ByteOrder.LITTLE_ENDIAN);

			int triNum = buffer.getInt();
			for (int i = 0; i < triNum; i++) {
				// Create a triangle
				Triangle t = STLFactory.eINSTANCE.createTriangle();

				// Create a normal for the triangle
				Normal n = STLFactory.eINSTANCE.createNormal();

				// Create a vector for the normal
				Vector nv = STLFactory.eINSTANCE.createVector();
				nv.setX(buffer.getFloat());
				nv.setY(buffer.getFloat());
				nv.setZ(buffer.getFloat());

				n.setVector(nv);
				t.setNormal(n);

				// Create the triangle verticies
				Verticies vert = STLFactory.eINSTANCE.createVerticies();

				// Vertex 1
				Vertex v1 = STLFactory.eINSTANCE.createVertex();
				v1.setX(buffer.getFloat());
				v1.setY(buffer.getFloat());
				v1.setZ(buffer.getFloat());

				vert.setV1(v1);

				// Vertex 2
				Vertex v2 = STLFactory.eINSTANCE.createVertex();
				v2.setX(buffer.getFloat());
				v2.setY(buffer.getFloat());
				v2.setZ(buffer.getFloat());

				vert.setV2(v2);

				// Vertex 3
				Vertex v3 = STLFactory.eINSTANCE.createVertex();
				v3.setX(buffer.getFloat());
				v3.setY(buffer.getFloat());
				v3.setZ(buffer.getFloat());

				vert.setV3(v3);

				t.setVerticies(vert);

				// Not used
				int attributeByteCount = buffer.getShort();

				// Add this triangle to the list
				triangles.add(t);

			}
		} catch (OutOfMemoryError | IOException e) {
			// Put default error data in
			logger.error("File too large to read: " + filePath);
			triangles = null;
		}

		// Return the triangles array list
		return triangles;
	}

	/**
	 * Loads the stl file at the specified filePath
	 * 
	 * @param filePath
	 *            Specifies the absolute file path of the stl file
	 * 
	 */
	private Model loadSTLFile(String filePath) {

		// Create the stl standalone injector, get the resources and pull out
		// the EMF model from the file 
		Injector injector = new STLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createFileURI(filePath), true);

		// Get the model. If there is no model, then we will try to load as
		// binary and return this model as null.
		Model model;
		EList<EObject> contents = resource.getContents();
		if (contents == null || contents.isEmpty()) {
			model = null;
		} else {
			model = (Model) resource.getContents().get(0);
		}

		return model;

	}

}
