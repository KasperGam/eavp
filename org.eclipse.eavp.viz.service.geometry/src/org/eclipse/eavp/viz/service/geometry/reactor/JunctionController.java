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
package org.eclipse.eavp.viz.service.geometry.reactor;

import org.eclipse.eavp.viz.modeling.base.BasicController;
import org.eclipse.eavp.viz.modeling.base.BasicView;
import org.eclipse.eavp.viz.modeling.base.ITransparentController;
import org.eclipse.eavp.viz.modeling.base.ITransparentView;
import org.eclipse.eavp.viz.modeling.base.IWireframeController;
import org.eclipse.eavp.viz.modeling.base.IWireframeView;

/**
 * A Junction part for the Reactor Analyzer.
 * 
 * @author Robert Smith
 *
 */
public class JunctionController extends BasicController
		implements ITransparentController, IWireframeController {

	/**
	 * The nullary constructor
	 */
	public JunctionController() {
		super();
	}

	/**
	 * The default constructor
	 * 
	 * @param model
	 * @param view
	 */
	public JunctionController(Junction model, BasicView view) {
		super(model, view);
	}

	/**
	 * Gets the center of the box representing the Junction
	 * 
	 * @return An array of the coordinates of the junciton's center, in the
	 *         order x, y, z
	 */
	public double[] getCenter() {
		return ((JunctionView) view).getCenter();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.service.reactor.javafx.datatypes.WireFramePart#
	 * setWireFrameMode(boolean)
	 */
	@Override
	public void setWireframeMode(boolean on) {
		((IWireframeView) view).setWireframeMode(on);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() {

		// Create a copy of the model
		JunctionController clone = new JunctionController();
		clone.copy(this);

		// Refresh the view to be in sync with the model
		clone.refresh();

		return clone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.eavp.viz.modeling.base.IWireframeController#getWireFrameMode(
	 * )
	 */
	@Override
	public boolean isWireframe() {
		return ((IWireframeView) view).isWireframe();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.eavp.viz.modeling.base.ITransparentController#isTransparent()
	 */
	@Override
	public boolean isTransparent() {
		return ((ITransparentView) view).isTransparent();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.eavp.viz.modeling.base.ITransparentController#
	 * setTransparentMode(boolean)
	 */
	@Override
	public void setTransparentMode(boolean transparent) {
		((ITransparentView) view).setTransparentMode(transparent);
	}
}
