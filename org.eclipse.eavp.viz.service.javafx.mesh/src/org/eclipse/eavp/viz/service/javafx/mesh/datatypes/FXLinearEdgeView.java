/*******************************************************************************
 * Copyright (c) 2015 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert Smith
 *******************************************************************************/
package org.eclipse.eavp.viz.service.javafx.mesh.datatypes;

import org.eclipse.eavp.viz.modeling.Edge;
import org.eclipse.eavp.viz.modeling.ShapeController;
import org.eclipse.eavp.viz.modeling.base.BasicView;
import org.eclipse.eavp.viz.modeling.base.IController;
import org.eclipse.eavp.viz.modeling.base.IMesh;
import org.eclipse.eavp.viz.modeling.base.ITransparentView;
import org.eclipse.eavp.viz.modeling.base.IWireframeView;
import org.eclipse.eavp.viz.modeling.base.Representation;
import org.eclipse.eavp.viz.modeling.properties.MeshCategory;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.service.javafx.internal.Util;
import org.eclipse.eavp.viz.service.mesh.datastructures.MeshEditorMeshProperty;

import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.DrawMode;
import javafx.scene.transform.Rotate;

/**
 * A class which creates and manages the JavaFX graphical representation for a
 * LinearEdge.
 * 
 * @author Robert Smith
 *
 */
public class FXLinearEdgeView extends BasicView
		implements ITransparentView, IWireframeView {

	/**
	 * A group containing the shape which represents the part and a gizmo which
	 * modifies the shape's appearance
	 */
	private Group node;

	/** */
	private Cylinder mesh;

	/** */
	private PhongMaterial defaultMaterial;

	/** */
	private PhongMaterial selectedMaterial;

	/**
	 * The Material to display when the Vertex is first being made
	 */
	private PhongMaterial constructingMaterial;

	/**
	 * Whether or not the edge will be displayed as transparent. If true, the
	 * edge will be invisible. Otherwise it will be visible.
	 */
	private boolean transparent;

	/**
	 * Whether or not the edge will be displayed as a wireframe. If true, the
	 * edge will be a wireframe. Otherwise it will be a solid.
	 */
	private boolean wireframe;

	/**
	 * The nullary constructor.
	 */
	public FXLinearEdgeView() {
		super();

		// Instantiate the class variables
		node = new Group();

		// Create the materials
		defaultMaterial = new PhongMaterial(Color.rgb(80, 30, 140));
		selectedMaterial = new PhongMaterial(Color.rgb(0, 127, 255));
		constructingMaterial = new PhongMaterial(Color.rgb(0, 255, 0));

	}

	/**
	 * The default constructor.
	 * 
	 * @param model
	 *            The model which this view will display
	 */
	public FXLinearEdgeView(Edge model) {
		this();

		// Initialize the JavaFX node
		node.setId(model.getProperty(MeshProperty.NAME));

		// Set the node's transformation
		node.getTransforms()
				.setAll(Util.convertTransformation(model.getTransformation()));

		// Initialize the view
		refresh(model);

	}

	/**
	 * Creates a cylinder between the start and end points of the edge.
	 * 
	 * @return A JavaFX Cylinder representing the given LinearEdgeComponent
	 */
	private Cylinder createShape(Edge edgeComponent) {

		// If the edge does not have two vertices, a new shape cannot be created
		if (edgeComponent.getEntitiesFromCategory(MeshCategory.VERTICES)
				.size() != 2) {
			return null;
		}

		// Get the scale the vertices are being drawn at
		int scale = ((FXVertexController) edgeComponent
				.getEntitiesFromCategory(MeshCategory.VERTICES).get(0))
						.getApplicationScale();

		// Get the edge's endpoints
		double[] start = edgeComponent.getStartLocation();
		double[] end = edgeComponent.getEndLocation();

		for (int i = 0; i < 3; i++) {
			start[i] = start[i] * scale;
			end[i] = end[i] * scale;
		}

		// Create a cylinder situated at the edge's midpoint with the edge's
		// length.
		Cylinder edge = new Cylinder(.6,
				Math.sqrt((Math.pow(start[0] - end[0], 2))
						+ (Math.pow(start[1] - end[1], 2))
						+ (Math.pow(start[2] - end[2], 2))));
		edge.setTranslateX((start[0] + end[0]) / 2);
		edge.setTranslateY((start[1] + end[1]) / 2);
		edge.setTranslateZ((start[2] + end[2]) / 2);

		// Get the angle between the two points
		Point3D start3D = new Point3D(start[0], start[1], start[2]);
		Point3D end3D = new Point3D(end[0], end[1], end[2]);
		Point3D angle = end3D.subtract(start3D);

		// Get the axis of rotation for the cylinder
		Point3D axis = angle.crossProduct(0f, 1f, 0f);

		// Calculate the number of degrees to rotate about the axis.
		double rotationAmount = Math
				.acos(angle.normalize().dotProduct(0, 1, 0));

		// Apply the rotation to the cylinder
		Rotate rotation = new Rotate(-Math.toDegrees(rotationAmount), axis);
		edge.getTransforms().addAll(rotation);

		return edge;
	}

	/**
	 * Associates the view's controller with the representation's data
	 * structure, so that user interactions with the displayed shape will have a
	 * way be associated back to the controller.
	 * 
	 * @param controller
	 *            This view's controller
	 */
	public void setController(IController controller) {

		// Put the controller in the node's data structure
		node.getProperties().put(ShapeController.class, mesh);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.AbstractView#getRepresentation()
	 */
	@Override
	public Representation<Group> getRepresentation() {
		return new Representation<Group>(node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.AbstractView#refresh(org.eclipse. ice
	 * .viz.service.modeling.AbstractMeshComponent)
	 */
	@Override
	public void refresh(IMesh model) {

		// Set the node's transformation
		node.getTransforms()
				.setAll(Util.convertTransformation(model.getTransformation()));

		// Clear the current shapes
		node.getChildren().clear();

		// If the edge does not have two vertices, there is nothing to draw
		if (model.getEntitiesFromCategory(MeshCategory.VERTICES).size() == 2) {

			// Create a shape based on the model and set it as the node's child
			mesh = createShape(((Edge) model));
			node.getChildren().add(mesh);

			// If the vertex is under construction, leave the material
			// unchanged,
			// otherwise set it based on whether or not the vertex is selected
			if (!"True".equals(model
					.getProperty(MeshEditorMeshProperty.UNDER_CONSTRUCTION))) {

				// Convert the model's selected property to a boolean
				if ("True".equals(model.getProperty(MeshProperty.SELECTED))) {
					mesh.setMaterial(selectedMaterial);
				}

				else {
					mesh.setMaterial(defaultMaterial);
				}
			}

			else {
				mesh.setMaterial(constructingMaterial);
			}

			// Set the edge's transparency and wireframe states, as appropriate
			if (transparent) {
				mesh.setOpacity(0d);
			}
			if (wireframe) {
				mesh.setDrawMode(DrawMode.LINE);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.AbstractView#clone()
	 */
	@Override
	public Object clone() {
		FXLinearEdgeView clone = new FXLinearEdgeView();
		clone.copy(this);
		return clone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.base.IWireframeView#isWireframe()
	 */
	@Override
	public boolean isWireframe() {
		return wireframe;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.base.IWireframeView#setWireframeMode(
	 * boolean)
	 */
	@Override
	public void setWireframeMode(boolean on) {
		wireframe = on;

		// Set the mesh to the correct draw mode
		if (mesh != null) {
			if (on) {
				mesh.setDrawMode(DrawMode.LINE);
			} else {
				mesh.setDrawMode(DrawMode.FILL);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.base.ITransparentView#isTransparent()
	 */
	@Override
	public boolean isTransparent() {
		return transparent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.eavp.viz.modeling.base.ITransparentView#setTransparentMode(
	 * boolean)
	 */
	@Override
	public void setTransparentMode(boolean transparent) {
		this.transparent = transparent;

		// Set the mesh to the correct transparency
		if (mesh != null) {
			if (transparent) {
				mesh.setOpacity(0d);
			} else {
				mesh.setOpacity(100d);
			}
		}
	}
}
