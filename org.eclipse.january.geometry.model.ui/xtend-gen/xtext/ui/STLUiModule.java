/**
 * Copyright (c) 2016 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Initial API and implementation and/or initial documentation -
 *   Kasper Gammeltoft
 */
package xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import xtext.ui.AbstractSTLUiModule;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class STLUiModule extends AbstractSTLUiModule {
  public STLUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
