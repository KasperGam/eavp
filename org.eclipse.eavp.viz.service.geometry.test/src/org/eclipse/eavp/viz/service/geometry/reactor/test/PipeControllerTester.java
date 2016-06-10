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
package org.eclipse.eavp.viz.service.geometry.reactor.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.eavp.viz.modeling.base.BasicController;
import org.eclipse.eavp.viz.modeling.base.BasicMesh;
import org.eclipse.eavp.viz.modeling.base.BasicView;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.modeling.test.utils.TestController;
import org.eclipse.eavp.viz.modeling.test.utils.TestMesh;
import org.eclipse.eavp.viz.service.geometry.reactor.PipeController;
import org.eclipse.eavp.viz.service.geometry.reactor.Junction;
import org.eclipse.eavp.viz.service.geometry.reactor.JunctionController;
import org.eclipse.eavp.viz.service.geometry.reactor.Pipe;
import org.eclipse.eavp.viz.service.geometry.reactor.ReactorMeshCategory;
import org.junit.Test;

/**
 * A class to test the functionality of the PipeController.
 * 
 * @author Robert Smith
 *
 */
public class PipeControllerTester {

	/**
	 * Test the PipeMesh convenience methods and properties management.
	 */
	@Test
	public void checkProperties() {

		// Create a pipe
		Pipe pipeMesh = new Pipe();
		PipeController pipe = new PipeController(pipeMesh, new BasicView());

		// Check the number of rods
		pipe.setNumRods(1);
		assertTrue(pipe.getNumRods() == 1);

		// Check the pitch
		pipe.setPitch(2d);
		assertTrue(pipe.getPitch() == 2d);

		// Check the rod diameter
		pipe.setRodDiameter(3d);
		assertTrue(pipe.getRodDiameter() == 3d);

		// Set the radius and inner radius to different values
		pipe.setRadius(5d);
		pipe.setInnerRadius(4d);

		// Check that the radius is set and that the inner radius simply
		// redirects to the outer radius, as pipes are to be displayed as
		// infinitely thin.
		assertTrue(pipe.getRadius() == 5d);
		assertTrue(pipe.getInnerRadius() == 5d);
	}

	/**
	 * Test that the PipeMesh sends updates correctly.
	 */
	@Test
	public void checkUpdates() {

		// Create a pipe
		Pipe pipeMesh = new Pipe();
		PipeController pipe = new PipeController(pipeMesh, new BasicView());

		// Create a test object to receive and track updates from the pipe
		TestController parent = new TestController(new TestMesh(),
				new BasicView());
		parent.addEntity(pipe);

		// Add an input and output, as well as another pipe
		BasicController input = new BasicController(new BasicMesh(),
				new BasicView());
		pipe.addEntityToCategory(input, ReactorMeshCategory.INPUT);
		BasicController output = new BasicController(new BasicMesh(),
				new BasicView());
		pipe.addEntityToCategory(output, ReactorMeshCategory.OUTPUT);
		PipeController child = new PipeController(new Pipe(),
				new BasicView());
		pipe.addEntity(child);

		// Clear the received messages
		parent.isUpdated();

		// Updates from input should be ignored
		input.setProperty(MeshProperty.ID, "Update");
		assertFalse(parent.isUpdated());

		// Updates from output should be ignored
		output.setProperty(MeshProperty.ID, "Update");
		assertFalse(parent.isUpdated());

		// The pipe should receive updates from other entities
		child.setProperty(MeshProperty.ID, "Update");
		assertTrue(parent.isUpdated());
	}

	/**
	 * Check that the part is cloned correctly.
	 */
	@Test
	public void checkClone() {

		// Create a junction
		PipeController pipe = new PipeController(new Pipe(),
				new BasicView());
		pipe.setProperty(MeshProperty.ID, "Property");

		// Clone it and check that they are identical
		PipeController clone = (PipeController) pipe.clone();
		assertTrue(pipe.equals(clone));
	}
	
	/**
	 * Test that the shape can be made transparent.
	 */
	public void checkTransparency() {

		// Create a pipe
		Pipe mesh = new Pipe();
		PipeController shape = new PipeController(mesh, new TestView());

		// The view should start off opaque
		assertFalse(shape.isTransparent());

		// Make the view transparent
		shape.setTransparentMode(true);

		// Check that the transparency flag is set
		assertTrue(shape.isTransparent());
	}

	/**
	 * Test that the shape can rendered in wireframe mode
	 */
	public void checkWireframe() {

		// Create a pipe
		Pipe mesh = new Pipe();
		PipeController shape = new PipeController(mesh, new TestView());

		// The view should start off drawn normally
		assertFalse(shape.isWireframe());

		// Make the shape wireframe
		shape.setWireframeMode(true);

		// Check that the wireframe flag has been set
		assertTrue(shape.isWireframe());
	}
}
