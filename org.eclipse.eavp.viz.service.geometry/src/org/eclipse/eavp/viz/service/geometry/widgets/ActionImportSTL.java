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

import java.util.ArrayList;

import org.eclipse.eavp.STLStandaloneSetup;
import org.eclipse.eavp.sTL.Model;
import org.eclipse.eavp.sTL.Triangle;
import org.eclipse.eavp.viz.modeling.Shape;
import org.eclipse.eavp.viz.modeling.ShapeController;
import org.eclipse.eavp.viz.modeling.base.IController;
import org.eclipse.eavp.viz.modeling.properties.MeshCategory;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.service.geometry.shapes.ShapeType;
import org.eclipse.eavp.viz.service.geometry.widgets.ShapeTreeContentProvider.BlankShape;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

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
	 * Opens the import stl dialog and reads in the mesh data.
	 * </p>
	 */
	@Override
	public void run() {

		// Create the import dialog
		FileDialog dialog = new FileDialog(view.getSite().getShell());

		// Get the stl file path
		String absPath = dialog.open();

		if (absPath == null) {
			System.err.println("absPath null");
		} else {
		
			// If it is a valid file, load it in
			if (absPath.endsWith(".stl")) {
				Model model = loadSTLFile(absPath);
				
				// Get the selection

				ITreeSelection selection = (ITreeSelection) view.treeViewer
						.getSelection();
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
				// Get the parent shape, regardless of whether an IShape or BlankShape
				// is selected

				IController parentComplexShape = null;

				if (paths.length == 1) {

					// Get the selected object from the single selection

					Object selectedObject = paths[0].getLastSegment();

					if (selectedObject instanceof ShapeController) {

						// Get the selected shape's parent

						ShapeController selectedShape = (ShapeController) selectedObject;
						parentComplexShape = selectedShape
								.getEntitiesFromCategory(MeshCategory.PARENT).get(0);
					} else if (selectedObject instanceof BlankShape) {

						// Get the selected blank shape's parent

						BlankShape selectedBlank = (BlankShape) selectedObject;
						parentComplexShape = selectedBlank.getParent();
					}

				}

				// Add a child shape to either the GeometryComponent or the parent
				// ComplexShape
				Shape shape = new Shape();

				ShapeController childShape =
						(ShapeController) view.getFactory()
						.createProvider(shape)
						.createController(shape);
				
				childShape.setProperty(MeshProperty.TYPE, ShapeType.ComplexTriangular.toString());

				currentShapeId++;
				childShape.setProperty(MeshProperty.NAME, model.getName());
				childShape.setProperty(MeshProperty.ID,
						Integer.toString(currentShapeId));
				
				addAllTriangles(shape, model);
				

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

	}
	
	private void addAllTriangles(Shape shape, Model model) {
		//ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		
		EList<Triangle> triangles = model.getTriangles();
		ArrayList<Triangle> shapeTriangles = new ArrayList<Triangle>();
		for(int i=0; i<triangles.size(); i++) {
			shapeTriangles.add(triangles.get(i));
		}
		
		shape.setTriangles(shapeTriangles);
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
		Resource resource = resourceSet.getResource(URI.createURI("file:"+filePath), true);

		// Get the model (it is assumed to be the first element from the grammar)
		Model model = (Model) resource.getContents().get(0);
		
		System.out.println("reading solid: "+model.getName());
		EList<Triangle> triangles = model.getTriangles();
		
		for(Triangle tri : triangles) {
			System.out.println("Triangle: n: "+ tri.getNormal().getVector().getX() +" " +
			tri.getNormal().getVector().getY()+" "+
			tri.getNormal().getVector().getZ()+" "+ "v1: " +
			tri.getVerticies().getV1().getX()+" "+
			tri.getVerticies().getV1().getY()+" "+
			tri.getVerticies().getV1().getZ()+" "+ "v2: " +
			tri.getVerticies().getV2().getX()+" "+
			tri.getVerticies().getV2().getY()+" "+
			tri.getVerticies().getV2().getZ()+" "+ "v3: " +
			tri.getVerticies().getV3().getX()+" "+
			tri.getVerticies().getV3().getY()+" "+
			tri.getVerticies().getV3().getZ()+" ");
		}
		
		return model;

	}

}
