package org.eclipse.eavp.viz.service.geometry.widgets;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.eavp.viz.service.IRenderElementHolder;
import org.eclipse.eavp.viz.service.geometry.widgets.ShapeTreeContentProvider.BlankShape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.january.geometry.Geometry;
import org.eclipse.january.geometry.GeometryFactory;
import org.eclipse.january.geometry.INode;
import org.eclipse.january.geometry.xtext.obj.importer.OBJGeometryImporter;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import model.IRenderElement;

public class ActionImportGeometry extends Action {

	/**
	 * <p>
	 * The current ShapeTreeViewer associated with the DeleteShape action
	 * </p>
	 * 
	 */
	private ShapeTreeView view;

	/**
	 * The image descriptor associated with the import action's icon
	 */
	private ImageDescriptor imageDescriptor;

	/**
	 * <p>
	 * Constructor for setting the current ShapeTreeViewer
	 * </p>
	 * 
	 * @param view
	 *            <p>
	 *            The current ShapeTreeView
	 *            </p>
	 */
	public ActionImportGeometry(ShapeTreeView view) {

		this.view = view;

		this.setText("Import file");

	}

	/**
	 * Returns the image descriptor associated with the import action's icon
	 * 
	 * @return The ImageDescriptor with the loaded delete.gif file
	 * @see org.eclipse.jface.action.Action#getImageDescriptor()
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return imageDescriptor;
	}

	/**
	 * <p>
	 * Runs this action
	 * </p>
	 * <p>
	 * Each action implementation must define the steps needed to carry out this
	 * action.
	 * </p>
	 * 
	 */
	@Override
	public void run() {
		
		// Create a new dialog and get the file to import
		FileDialog dialog = new FileDialog(view.getSite().getShell());
		String filePath = dialog.open();
		
		// Only import if a valid stl file
		if (filePath != null && ((filePath.endsWith(".stl")) || (filePath.endsWith(".obj"))) ) {
			// Get current selection in shape tree view
			ITreeSelection selection = (ITreeSelection) view.treeViewer.getSelection();
			TreePath[] paths = selection.getPaths();
			
			// Silently fail if multiple selections
			if (paths.length > 1) {
				return;
			}
			
			// Get the root geometry
			Geometry geometry = (Geometry) view.treeViewer.getInput();
			
			// Silently fail if there is no root geometry
			if (geometry == null) {
				return;
			}
			// Import the geometry using the STL importer
			Path path = FileSystems.getDefault().getPath(filePath);
			Geometry imported = null;
			if (filePath.endsWith(".stl")) {
				imported = GeometryFactory.eINSTANCE.createSTLGeometryImporter().load(path);
			} else if (filePath.endsWith(".obj")) {
				imported = new OBJGeometryImporter().load(path);
			}
			
			// Try to find a parent shape to import into
			INode parentComplexShape = null;

			if (paths.length == 1) {

				// Get the selected object from the single selection

				Object selectedObject = paths[0].getLastSegment();

				if (selectedObject instanceof IRenderElement) {

					// Get the selected shape's parent

					IRenderElement selectedShape = (IRenderElement) selectedObject;
					parentComplexShape = selectedShape.getBase().getParent();
				} else if (selectedObject instanceof BlankShape) {

					// Get the selected blank shape's parent

					BlankShape selectedBlank = (BlankShape) selectedObject;
					parentComplexShape = selectedBlank.getParent().getBase();
				}

			}
			ArrayList<INode> addedNodes = new ArrayList<INode>();
			// If no complex shape, import into the base geometry
			if (parentComplexShape == null) {
				synchronized (geometry) {
					for(int i=0; i<imported.getNodes().size(); i++) {
						INode node = (INode) imported.getNodes().get(i).clone();
						geometry.addNode(node);
						addedNodes.add(node);
					}
				}
			
				view.treeViewer.refresh();
				
			// Import into the parent shape
			} else {
				
				synchronized (geometry) {
					for(int i=0; i<imported.getNodes().size(); i++) {
						INode node = (INode) imported.getNodes().get(i).clone();
						parentComplexShape.addNode(node);
						addedNodes.add(node);
					}
				}
			
				view.treeViewer.refresh();
			}
			/**
			// Get the set of render elements from the view
			IRenderElementHolder holder = view.getHolder();
			for(INode node : addedNodes) {
				// Get the render of the new shape
				IRenderElement render = holder.getRender(node);
				
				// Get the new import color from the color provider
				int[] newColor = org.eclipse.eavp.viz.service.color.ColorProvider.getNextColor();
				
				// Operators will have negative default colors to signal that they
				// should by default not override their childrens' colors.
				render.setProperty("defaultRed", newColor[0]);
				render.setProperty("defaultGreen", newColor[1]);
				render.setProperty("defaultBlue", newColor[2]);

				// Initialize the color to the default
				render.setProperty("red", render.getProperty("defaultRed"));
				render.setProperty("green", render.getProperty("defaultGreen"));
				render.setProperty("blue", render.getProperty("defaultBlue"));
			}
			*/
			
		}
		
	}
}