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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.eavp.viz.modeling.base.BasicMesh;
import org.eclipse.eavp.viz.modeling.base.BasicView;
import org.eclipse.eavp.viz.modeling.base.Representation;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.service.geometry.reactor.Pipe;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorController;
import org.eclipse.eavp.viz.service.geometry.reactor.Reactor;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshCategory;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshProperty;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPipeView;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXPlantViewRootController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXReactorView;
import org.junit.Test;

import javafx.scene.Group;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.MeshView;

/**
 * A class to test the functionality of FXPlantViewRootController
 * 
 * @author Robert Smith
 *
 */
public class FXPlantViewRootControllerTester {

	/**
	 * Check that core channels are added to reactors automatically.
	 */
	@Test
	public void checkChannels() {

		// Create objects for testing
		FXPlantViewRootController root = new FXPlantViewRootController(
				new BasicMesh(), new BasicView());
		Pipe pipeMesh = new Pipe();
		pipeMesh.setLength(100);
		pipeMesh.setInnerRadius(5);
		pipeMesh.setRadius(5);
		pipeMesh.setAxialSamples(3);
		FXPipeView pipeView = new FXPipeView(pipeMesh);
		FXPipeController pipe = new FXPipeController(pipeMesh, pipeView);
		Pipe pipeMesh2 = new Pipe();
		pipeMesh2.setLength(100);
		pipeMesh2.setInnerRadius(5);
		pipeMesh2.setRadius(5);
		pipeMesh2.setAxialSamples(3);
		FXPipeView pipeView2 = new FXPipeView(pipeMesh2);
		FXPipeController core = new FXPipeController(pipeMesh2, pipeView2);
		core.setProperty(ReactorMeshProperty.CORE_CHANNEL, "True");
		ReactorController reactor = new ReactorController(new Reactor(),
				new FXReactorView());

		// Add the reactor and two pipes to the root
		root.addEntityToCategory(reactor, ReactorMeshCategory.REACTORS);
		root.addEntity(pipe);
		root.addEntity(core);

		// The core channel should have been added to the reactor. The non-core
		// channel pipe should not have been
		assertTrue(reactor.getEntities().contains(core));
		assertFalse(reactor.getEntities().contains(pipe));

		// Create a second set of objects
		FXPlantViewRootController root2 = new FXPlantViewRootController(
				new BasicMesh(), new BasicView());
		FXPipeController pipe2 = new FXPipeController(new Pipe(),
				new FXPipeView());
		FXPipeController core2 = new FXPipeController(new Pipe(),
				new FXPipeView());
		core2.setProperty(ReactorMeshProperty.CORE_CHANNEL, "True");
		ReactorController reactor2 = new ReactorController(new Reactor(),
				new FXReactorView());

		// Add the pipes then the reactor.
		root2.addEntity(core2);
		root2.addEntity(pipe2);
		root2.addEntityToCategory(reactor2, ReactorMeshCategory.REACTORS);

		// The same thing should have happenned, regardless of what order the
		// children were added to the root.
		assertTrue(reactor2
				.getEntitiesFromCategory(ReactorMeshCategory.CORE_CHANNELS)
				.contains(core2));
		assertFalse(reactor2.getEntities().contains(pipe2));
	}

	/**
	 * Test that the FXPlantViewRootController is cloned correctly.
	 */
	@Test
	public void checkClone() {

		// Create a cloned FXPlantViewRootController and check that it is
		// identical to the original
		BasicMesh mesh = new BasicMesh();
		FXPlantViewRootController root = new FXPlantViewRootController(mesh,
				new BasicView());
		root.setProperty(MeshProperty.INNER_RADIUS, "Property");
		FXPlantViewRootController clone = (FXPlantViewRootController) root
				.clone();
		assertTrue(root.equals(clone));
	}

	/**
	 * Check that the root sets the wireframe modes of its children correctly
	 */
	@Test
	public void checkWireframe() {

		// Create some objects for testing
		FXPlantViewRootController root = new FXPlantViewRootController(
				new BasicMesh(), new BasicView());
		Pipe pipeMesh = new Pipe();
		pipeMesh.setLength(100);
		pipeMesh.setInnerRadius(5);
		pipeMesh.setRadius(5);
		pipeMesh.setAxialSamples(3);
		FXPipeView pipeView = new FXPipeView(pipeMesh);
		FXPipeController pipe = new FXPipeController(pipeMesh, pipeView);

		// Add the pipe to the root. It should still be drawn normally
		root.addEntity(pipe);
		Representation<Group> representation = pipe.getRepresentation();
		assertTrue(((MeshView) representation.getData().getChildren().get(1))
				.getDrawMode() == DrawMode.FILL);

		// Set the root to wireframe mode. The pipe should be set as well
		root.setWireframeMode(true);
		representation = pipe.getRepresentation();
		assertTrue(((MeshView) representation.getData().getChildren().get(1))
				.getDrawMode() == DrawMode.LINE);

		// Create another pipe
		Pipe pipeMesh2 = new Pipe();
		pipeMesh2.setLength(100);
		pipeMesh2.setInnerRadius(5);
		pipeMesh2.setRadius(5);
		pipeMesh2.setAxialSamples(3);
		FXPipeView pipeView2 = new FXPipeView(pipeMesh2);
		FXPipeController pipe2 = new FXPipeController(pipeMesh2, pipeView2);
		pipe2.setProperty(MeshProperty.NAME, "pipe2");

		// Add the second pipe. Since the root is set to wireframe mode, the
		// pipe should also be set when added
		root.addEntity(pipe2);
		Representation<Group> representation2 = pipe2.getRepresentation();
		assertTrue(((MeshView) representation2.getData().getChildren().get(1))
				.getDrawMode() == DrawMode.LINE);

		// Return the root to normal mode and check that the pipes are also
		// reset.
		root.setWireframeMode(false);
		representation = pipe.getRepresentation();
		representation2 = pipe2.getRepresentation();
		assertTrue(((MeshView) representation.getData().getChildren().get(1))
				.getDrawMode() == DrawMode.FILL);
		assertTrue(((MeshView) representation2.getData().getChildren().get(1))
				.getDrawMode() == DrawMode.FILL);

	}

}
