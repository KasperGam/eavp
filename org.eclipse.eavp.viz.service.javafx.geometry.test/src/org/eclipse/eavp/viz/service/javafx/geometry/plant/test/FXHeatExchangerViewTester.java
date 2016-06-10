/*******************************************************************************
 * Copyright (c) 2016 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert Smith
 *******************************************************************************/
package org.eclipse.eavp.viz.service.javafx.geometry.plant.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.eavp.viz.modeling.base.Representation;
import org.eclipse.eavp.viz.service.geometry.reactor.HeatExchanger;
import org.eclipse.eavp.viz.service.geometry.reactor.Junction;
import org.eclipse.eavp.viz.service.geometry.reactor.JunctionController;
import org.eclipse.eavp.viz.service.geometry.reactor.Pipe;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshCategory;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXHeatExchangerController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXHeatExchangerView;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXJunctionView;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeView;
import org.junit.Test;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.Box;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Shape3D;

/**
 * A class to test the functionality of the FXHeatExchangerView
 * 
 * @author Robert Smith
 *
 */
public class FXHeatExchangerViewTester {

	/**
	 * Test that FXHeatExchangerViews are cloned correctly
	 */
	@Test
	public void checkClone() {

		// Create a cloned view and check that it is identical to the original
		HeatExchanger mesh = new HeatExchanger();
		FXHeatExchangerView view = new FXHeatExchangerView(mesh);
		Object clone = view.clone();

		// Due to JavaFX objects' equals() implementations, a cloned view is not
		// necessarily equal to the original. Just check that the clone is of
		// the proper type.
		assertTrue(clone instanceof FXHeatExchangerView);

	}

	/**
	 * Check that the view produces the correct JavaFX output.
	 */
	@Test
	public void checkView() {

		// Create a pipe for the HeatExchanger to contain
		Pipe pipeMesh = new Pipe();
		pipeMesh.setLength(100);
		pipeMesh.setInnerRadius(25);
		pipeMesh.setRadius(25);
		pipeMesh.setAxialSamples(3);
		FXPipeView pipeView = new FXPipeView(pipeMesh);
		FXPipeController pipe = new FXPipeController(pipeMesh, pipeView);

		// Create a heat exchanger
		HeatExchanger mesh = new HeatExchanger();
		FXHeatExchangerView view = new FXHeatExchangerView(mesh);
		FXHeatExchangerController exchanger = new FXHeatExchangerController(
				mesh, view);
		exchanger.setPrimaryPipe(pipe);

		// Create a second pipe and two junctions to connect it to the exchanger
		Pipe pipeMesh2 = new Pipe();
		pipeMesh2.setLength(100);
		pipeMesh2.setInnerRadius(25);
		pipeMesh2.setRadius(25);
		pipeMesh2.setAxialSamples(3);
		FXPipeView pipeView2 = new FXPipeView(pipeMesh2);
		FXPipeController pipe2 = new FXPipeController(pipeMesh2, pipeView2);
		pipe2.setTranslation(50, 0, 0);

		Junction junctionMesh = new Junction();
		FXJunctionView junctionView = new FXJunctionView(junctionMesh);
		JunctionController junction = new JunctionController(junctionMesh,
				junctionView);
		junction.addEntityToCategory(exchanger.getSecondaryPipe(),
				ReactorMeshCategory.INPUT);
		exchanger.addEntityToCategory(junction,
				ReactorMeshCategory.SECONDARY_OUTPUT);
		junction.addEntityToCategory(pipe2, ReactorMeshCategory.OUTPUT);
		pipe2.addEntityToCategory(junction, ReactorMeshCategory.INPUT);

		Junction junctionMesh2 = new Junction();
		FXJunctionView junctionView2 = new FXJunctionView(junctionMesh2);
		JunctionController junction2 = new JunctionController(junctionMesh2,
				junctionView2);
		junction.addEntityToCategory(exchanger.getSecondaryPipe(),
				ReactorMeshCategory.OUTPUT);
		exchanger.addEntityToCategory(junction2,
				ReactorMeshCategory.SECONDARY_INPUT);
		junction2.addEntityToCategory(pipe2, ReactorMeshCategory.INPUT);
		pipe2.addEntityToCategory(junction2, ReactorMeshCategory.OUTPUT);

		// Check that the view has all four parts: a central pipe, a box around
		// it, and two pipes leading to junctions.
		Representation<Group> representation = exchanger.getRepresentation();
		Group node = representation.getData();
		assertEquals(4, node.getChildren().size());

		// The number of children of each type found
		int numPipes = 0;
		int numWalls = 0;
		int numPrimaryPipes = 0;

		// Count each child from the node
		for (Node child : node.getChildren()) {

			// MeshViews contain custom pipe meshes
			if (child instanceof MeshView) {
				numPipes++;
			}

			// A box is used to draw the seperating wall
			else if (child instanceof Box) {
				numWalls++;
			}

			// The child primary pipe will package its own rendering in a group
			else if (child instanceof Group) {
				numPrimaryPipes++;
			}
		}

		// Check that there are three pipes and a wall
		assertEquals(2, numPipes);
		assertEquals(1, numWalls);
		assertEquals(1, numPrimaryPipes);

	}

	/**
	 * Test that the shape can be made transparent.
	 */
	public void checkTransparency() {

		// Create a heat exchanger
		HeatExchanger mesh = new HeatExchanger();

		// Create a view for it
		FXHeatExchangerView view = new FXHeatExchangerView(mesh);

		// The view should start off opaque
		assertFalse(view.isTransparent());

		// Make the view transparent
		view.setTransparentMode(true);

		// Check that the transparency flag is set
		assertTrue(view.isTransparent());

		// The number of transparent shapes found
		int foundShapes = 0;

		// Get the group containing the node
		Representation<Group> representation = view.getRepresentation();

		// Search all of the node's children
		for (Node node : (representation.getData()).getChildren()) {

			// If the child is a 3D shape, it should be transparent
			if (node instanceof Shape3D) {
				assertTrue(((Shape3D) node).getOpacity() == 0d);
				foundShapes++;
			}

			// If the child is a group, check its children
			if (node instanceof Group) {
				for (Node childNode : ((Group) node).getChildren()) {
					if (childNode instanceof Shape3D) {
						assertTrue(((Shape3D) childNode).getOpacity() == 0d);
						foundShapes++;
					}
				}
			}
		}

		// Four transparent childrent should have been found
		assertTrue(foundShapes == 4);
	}

	/**
	 * Test that the shape can be made wireframe.
	 */
	public void checkWireframe() {

		// Create a heat exchanger
		HeatExchanger mesh = new HeatExchanger();

		// Create a view for it
		FXHeatExchangerView view = new FXHeatExchangerView(mesh);

		// The view should start off filled
		assertFalse(view.isWireframe());

		// Make the view wireframe
		view.setWireframeMode(true);

		// Check that the transparency flag is set
		assertTrue(view.isWireframe());

		// The number of wireframe shapes found
		int foundShapes = 0;

		// Get the group containing the node
		Representation<Group> representation = view.getRepresentation();

		// Search all of the node's children
		for (Node node : (representation.getData()).getChildren()) {

			// If the child is a 3D shape, it should be transparent
			if (node instanceof Shape3D) {
				assertTrue(((Shape3D) node).getDrawMode() == DrawMode.FILL);
				foundShapes++;
			}

			// If the child is a group, check its children
			if (node instanceof Group) {
				for (Node childNode : ((Group) node).getChildren()) {
					if (childNode instanceof Shape3D) {
						assertTrue(((Shape3D) childNode)
								.getDrawMode() == DrawMode.FILL);
						foundShapes++;
					}
				}
			}
		}

		// Four wireframe children should have been found
		assertTrue(foundShapes == 4);
	}
}
