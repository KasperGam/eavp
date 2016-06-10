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

import org.eclipse.eavp.viz.modeling.base.IMesh;
import org.eclipse.eavp.viz.modeling.properties.MeshProperty;
import org.eclipse.eavp.viz.service.geometry.reactor.HeatExchanger;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXHeatExchangerController;
import org.eclipse.eavp.viz.service.javafx.geometry.plant.FXHeatExchangerView;
import org.junit.Test;

/**
 * A class for testing the functionality of the FXHeatExchangerController
 * 
 * @author Robert Smith
 *
 */
public class FXHeatExchangerControllerTester {

	/**
	 * Test that the FXHeatExchangerController is cloned correctly.
	 */
	@Test
	public void checkClone() {

		// Create a cloned FXHeatExchangerController and check that it is
		// identical to the original
		HeatExchanger mesh = new HeatExchanger();
		FXHeatExchangerController exchanger = new FXHeatExchangerController(
				mesh, new FXHeatExchangerView(mesh));
		exchanger.setProperty(MeshProperty.ID, "Property");
		Object clone = exchanger.clone();

		// The clone is not necessarily equal to the original because of the
		// lack of JavaFX objects' implmentations of equals(). Just check that
		// the clone is of the propert type.
		assertTrue(clone instanceof FXHeatExchangerController);
	}

	/**
	 * Check that the exchanger will ignore Wireframe type messages except when
	 * they are sent by the controller's view.
	 */
	@Test
	public void checkUpdate() {

		// Create an exchanger
		HeatExchanger mesh = new HeatExchanger();
		TestHeatExchangerView view = new TestHeatExchangerView(mesh);
		FXHeatExchangerController exchanger = new FXHeatExchangerController(
				mesh, view);

		// Reset the view's refreshed state
		view.wasRefreshed();

		// Set the view to wireframe mode
		view.setWireframeMode(true);

		// This should have signaled the controller to perform a refresh
		assertTrue(view.wasRefreshed());

		// Create a second exchanger
		HeatExchanger mesh2 = new HeatExchanger();
		TestHeatExchangerView view2 = new TestHeatExchangerView(mesh2);
		FXHeatExchangerController exchanger2 = new FXHeatExchangerController(
				mesh2, view2);

		// Add it as a child to the current one
		exchanger.addEntity(exchanger2);

		// Reset the view's state
		view.wasRefreshed();

		// Set the child's view to wireframe mode
		view2.setWireframeMode(true);

		// Since the wireframe message was not received from the controller's
		// view, it should not cause the controller to refresh the view.
		assertFalse(view.wasRefreshed());

	}

	private class TestHeatExchangerView extends FXHeatExchangerView {

		/**
		 * Whether the view has been refreshed since the last time it was
		 * checked.
		 */
		boolean refreshed = false;

		/**
		 * The default constructor.
		 * 
		 * @param model
		 *            The internal model to be dispalyed.
		 */
		public TestHeatExchangerView(IMesh model) {
			super(model);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.eavp.viz.service.javafx.geometry.plant.
		 * FXHeatExchangerView
		 * #refresh(org.eclipse.eavp.viz.modeling.AbstractMesh)
		 */
		@Override
		public void refresh(IMesh model) {
			super.refresh(model);
			refreshed = true;
		}

		/**
		 * Determines if the view has been refreshed since the last time it was
		 * checked and returns it to its initial, un-refreshed state.
		 * 
		 * @return True if the view has been refreshed since the last time
		 *         wasRefreshed() was invoked. False otherwise.
		 */
		public boolean wasRefreshed() {
			boolean temp = refreshed;
			refreshed = false;
			return temp;
		}
	}
}
