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

import static org.junit.Assert.assertTrue;

import org.eclipse.eavp.viz.modeling.base.Representation;
import org.eclipse.eavp.viz.service.geometry.reactor.Pipe;
import org.eclipse.eavp.viz.service.geometry.reactor.Reactor;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorController;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshCategory;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshProperty;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeView;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXReactorView;
import org.junit.Test;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Shape3D;

/**
 * A class to test the functionality of the FXReactorView
 * 
 * @author Robert Smith
 *
 */
public class FXReactorViewTester {

	/**
	 * Test that FXReactorViews are cloned correctly
	 */
	@Test
	public void checkClone() {

		// Create a cloned view and check that it is identical to the original
		Reactor mesh = new Reactor();
		FXReactorView view = new FXReactorView(mesh);
		Object clone = view.clone();

		// The clone is not necessarily equal to the original, due to JavaFX
		// objects' lack of equals() implementations. Just check the clone's
		// type instead.
		assertTrue(clone instanceof FXReactorView);
	}

	/**
	 * Check that the view sets its shapes to the proper opacity for their
	 * transparency
	 */
	@Test
	public void checkTransparency() {

		// Create a reactor
		Reactor mesh = new Reactor();
		ReactorController reactor = new ReactorController(mesh,
				new FXReactorView(mesh));

		// Create a pipe
		Pipe pipeMesh = new Pipe();
		pipeMesh.setLength(100);
		pipeMesh.setInnerRadius(5);
		pipeMesh.setRadius(5);
		pipeMesh.setAxialSamples(3);
		pipeMesh.setProperty(ReactorMeshProperty.CORE_CHANNEL, "True");
		FXPipeView pipeView = new FXPipeView(pipeMesh);
		FXPipeController pipe = new FXPipeController(pipeMesh, pipeView);

		// Add the pipe to the reactor
		reactor.addEntityToCategory(pipe, ReactorMeshCategory.CORE_CHANNELS);

		// Get the four shapes that make up the reactor's representation
		Representation<Group> representation = reactor.getRepresentation();
		ObservableList<Node> children = ((Group) representation.getData()
				.getChildren().get(0)).getChildren();
		assertTrue(children.size() == 4);

		// Check that each shape is drawn normally
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getOpacity() == 100d);
			} else {
				assertTrue(((MeshView) child).getOpacity() == 100d);
			}
		}

		// Set the reactor to draw in wireframe mode
		reactor.setTransparentMode(true);

		// Get the current list of children
		representation = reactor.getRepresentation();
		children = ((Group) representation.getData().getChildren().get(0))
				.getChildren();
		assertTrue(children.size() == 4);

		// Check that the children are drawn in wireframe mode
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getOpacity() == 0d);
			} else {
				assertTrue(((MeshView) child).getOpacity() == 0d);
			}
		}

		// Set the reactor back to normal mode
		reactor.setTransparentMode(false);

		// Get the current list of children
		representation = reactor.getRepresentation();
		children = ((Group) representation.getData().getChildren().get(0))
				.getChildren();
		assertTrue(children.size() == 4);

		// Check that the children are drawn normally again
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getOpacity() == 100d);
			} else {
				assertTrue(((MeshView) child).getOpacity() == 100d);
			}
		}
	}

	/**
	 * Check that the view sets its shapes to the proper drawmode for
	 * wireframes.
	 */
	@Test
	public void checkWireFrame() {

		// Create a reactor
		Reactor mesh = new Reactor();
		ReactorController reactor = new ReactorController(mesh,
				new FXReactorView(mesh));

		// Create a pipe
		Pipe pipeMesh = new Pipe();
		pipeMesh.setLength(100);
		pipeMesh.setInnerRadius(5);
		pipeMesh.setRadius(5);
		pipeMesh.setAxialSamples(3);
		pipeMesh.setProperty(ReactorMeshProperty.CORE_CHANNEL, "True");
		FXPipeView pipeView = new FXPipeView(pipeMesh);
		FXPipeController pipe = new FXPipeController(pipeMesh, pipeView);

		// Add the pipe to the reactor
		reactor.addEntityToCategory(pipe, ReactorMeshCategory.CORE_CHANNELS);

		// Get the four shapes that make up the reactor's representation
		Representation<Group> representation = reactor.getRepresentation();
		ObservableList<Node> children = ((Group) representation.getData()
				.getChildren().get(0)).getChildren();
		assertTrue(children.size() == 4);

		// Check that each shape is drawn normally
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getDrawMode() == DrawMode.FILL);
			} else {
				assertTrue(((MeshView) child).getDrawMode() == DrawMode.FILL);
			}
		}

		// Set the reactor to draw in wireframe mode
		reactor.setWireframeMode(true);

		// Get the current list of children
		representation = reactor.getRepresentation();
		children = ((Group) representation.getData().getChildren().get(0))
				.getChildren();
		assertTrue(children.size() == 4);

		// Check that the children are drawn in wireframe mode
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getDrawMode() == DrawMode.LINE);
			} else {
				assertTrue(((MeshView) child).getDrawMode() == DrawMode.LINE);
			}
		}

		// Set the reactor back to normal mode
		reactor.setWireframeMode(false);

		// Get the current list of children
		representation = reactor.getRepresentation();
		children = ((Group) representation.getData().getChildren().get(0))
				.getChildren();
		assertTrue(children.size() == 4);

		// Check that the children are drawn normally again
		for (Node child : children) {
			if (child instanceof Shape3D) {
				assertTrue(((Shape3D) child).getDrawMode() == DrawMode.FILL);
			} else {
				assertTrue(((MeshView) child).getDrawMode() == DrawMode.FILL);
			}
		}
	}
}
