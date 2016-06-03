/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.eavp.sTL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eavp.sTL.Triangle#getNormal <em>Normal</em>}</li>
 *   <li>{@link org.eclipse.eavp.sTL.Triangle#getVerticies <em>Verticies</em>}</li>
 * </ul>
 *
 * @see org.eclipse.eavp.sTL.STLPackage#getTriangle()
 * @model
 * @generated
 */
public interface Triangle extends EObject
{
  /**
   * Returns the value of the '<em><b>Normal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Normal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Normal</em>' containment reference.
   * @see #setNormal(Normal)
   * @see org.eclipse.eavp.sTL.STLPackage#getTriangle_Normal()
   * @model containment="true"
   * @generated
   */
  Normal getNormal();

  /**
   * Sets the value of the '{@link org.eclipse.eavp.sTL.Triangle#getNormal <em>Normal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Normal</em>' containment reference.
   * @see #getNormal()
   * @generated
   */
  void setNormal(Normal value);

  /**
   * Returns the value of the '<em><b>Verticies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verticies</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verticies</em>' containment reference.
   * @see #setVerticies(Verticies)
   * @see org.eclipse.eavp.sTL.STLPackage#getTriangle_Verticies()
   * @model containment="true"
   * @generated
   */
  Verticies getVerticies();

  /**
   * Sets the value of the '{@link org.eclipse.eavp.sTL.Triangle#getVerticies <em>Verticies</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Verticies</em>' containment reference.
   * @see #getVerticies()
   * @generated
   */
  void setVerticies(Verticies value);

} // Triangle
