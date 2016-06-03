/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.eavp.sTL.impl;

import org.eclipse.eavp.sTL.STLPackage;
import org.eclipse.eavp.sTL.Vertex;
import org.eclipse.eavp.sTL.Verticies;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verticies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.eavp.sTL.impl.VerticiesImpl#getV1 <em>V1</em>}</li>
 *   <li>{@link org.eclipse.eavp.sTL.impl.VerticiesImpl#getV2 <em>V2</em>}</li>
 *   <li>{@link org.eclipse.eavp.sTL.impl.VerticiesImpl#getV3 <em>V3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticiesImpl extends MinimalEObjectImpl.Container implements Verticies
{
  /**
   * The cached value of the '{@link #getV1() <em>V1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV1()
   * @generated
   * @ordered
   */
  protected Vertex v1;

  /**
   * The cached value of the '{@link #getV2() <em>V2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV2()
   * @generated
   * @ordered
   */
  protected Vertex v2;

  /**
   * The cached value of the '{@link #getV3() <em>V3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getV3()
   * @generated
   * @ordered
   */
  protected Vertex v3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerticiesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return STLPackage.Literals.VERTICIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex getV1()
  {
    return v1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV1(Vertex newV1, NotificationChain msgs)
  {
    Vertex oldV1 = v1;
    v1 = newV1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V1, oldV1, newV1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV1(Vertex newV1)
  {
    if (newV1 != v1)
    {
      NotificationChain msgs = null;
      if (v1 != null)
        msgs = ((InternalEObject)v1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V1, null, msgs);
      if (newV1 != null)
        msgs = ((InternalEObject)newV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V1, null, msgs);
      msgs = basicSetV1(newV1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V1, newV1, newV1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex getV2()
  {
    return v2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV2(Vertex newV2, NotificationChain msgs)
  {
    Vertex oldV2 = v2;
    v2 = newV2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V2, oldV2, newV2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV2(Vertex newV2)
  {
    if (newV2 != v2)
    {
      NotificationChain msgs = null;
      if (v2 != null)
        msgs = ((InternalEObject)v2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V2, null, msgs);
      if (newV2 != null)
        msgs = ((InternalEObject)newV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V2, null, msgs);
      msgs = basicSetV2(newV2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V2, newV2, newV2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex getV3()
  {
    return v3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetV3(Vertex newV3, NotificationChain msgs)
  {
    Vertex oldV3 = v3;
    v3 = newV3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V3, oldV3, newV3);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setV3(Vertex newV3)
  {
    if (newV3 != v3)
    {
      NotificationChain msgs = null;
      if (v3 != null)
        msgs = ((InternalEObject)v3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V3, null, msgs);
      if (newV3 != null)
        msgs = ((InternalEObject)newV3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - STLPackage.VERTICIES__V3, null, msgs);
      msgs = basicSetV3(newV3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, STLPackage.VERTICIES__V3, newV3, newV3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case STLPackage.VERTICIES__V1:
        return basicSetV1(null, msgs);
      case STLPackage.VERTICIES__V2:
        return basicSetV2(null, msgs);
      case STLPackage.VERTICIES__V3:
        return basicSetV3(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case STLPackage.VERTICIES__V1:
        return getV1();
      case STLPackage.VERTICIES__V2:
        return getV2();
      case STLPackage.VERTICIES__V3:
        return getV3();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case STLPackage.VERTICIES__V1:
        setV1((Vertex)newValue);
        return;
      case STLPackage.VERTICIES__V2:
        setV2((Vertex)newValue);
        return;
      case STLPackage.VERTICIES__V3:
        setV3((Vertex)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case STLPackage.VERTICIES__V1:
        setV1((Vertex)null);
        return;
      case STLPackage.VERTICIES__V2:
        setV2((Vertex)null);
        return;
      case STLPackage.VERTICIES__V3:
        setV3((Vertex)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case STLPackage.VERTICIES__V1:
        return v1 != null;
      case STLPackage.VERTICIES__V2:
        return v2 != null;
      case STLPackage.VERTICIES__V3:
        return v3 != null;
    }
    return super.eIsSet(featureID);
  }

} //VerticiesImpl
