/*******************************************************************************
 * Copyright (c) 2015-2016 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Robert Smith
 *******************************************************************************/
package org.eclipse.eavp.viz.modeling.base;

/**
 * An interface for controllers for parts which can be rendered in wireframe
 * mode.
 * 
 * @author Robert Smith
 *
 */
public interface IWireframeController extends IController {

	/**
	 * Method to check whether or not the controller is currently in wireframe
	 * mode.
	 * 
	 * @return True if the part is displayed as a wireframe. False otherwise.
	 */
	public boolean isWireframe();

	/**
	 * Set the controller's view to display in either wireframe or filled mode
	 * 
	 * @param on
	 *            If true, sets the view to display its mesh in wireframe mode.
	 *            If false, sets the view to display its mesh normally.
	 */
	public void setWireframeMode(boolean on);
}
