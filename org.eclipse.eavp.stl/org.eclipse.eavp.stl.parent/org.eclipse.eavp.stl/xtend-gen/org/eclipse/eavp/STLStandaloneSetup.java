/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.eavp;

import org.eclipse.eavp.STLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class STLStandaloneSetup extends STLStandaloneSetupGenerated {
  public static void doSetup() {
    STLStandaloneSetup _sTLStandaloneSetup = new STLStandaloneSetup();
    _sTLStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
