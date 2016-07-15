/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.eavp.sTL.impl;

import org.eclipse.eavp.sTL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class STLFactoryImpl extends EFactoryImpl implements STLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static STLFactory init()
  {
    try
    {
      STLFactory theSTLFactory = (STLFactory)EPackage.Registry.INSTANCE.getEFactory(STLPackage.eNS_URI);
      if (theSTLFactory != null)
      {
        return theSTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new STLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case STLPackage.MODEL: return createModel();
      case STLPackage.TRIANGLE: return createTriangle();
      case STLPackage.NORMAL: return createNormal();
      case STLPackage.VECTOR: return createVector();
      case STLPackage.VERTICIES: return createVerticies();
      case STLPackage.VERTEX: return createVertex();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Triangle createTriangle()
  {
    TriangleImpl triangle = new TriangleImpl();
    return triangle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Normal createNormal()
  {
    NormalImpl normal = new NormalImpl();
    return normal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Verticies createVerticies()
  {
    VerticiesImpl verticies = new VerticiesImpl();
    return verticies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vertex createVertex()
  {
    VertexImpl vertex = new VertexImpl();
    return vertex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STLPackage getSTLPackage()
  {
    return (STLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static STLPackage getPackage()
  {
    return STLPackage.eINSTANCE;
  }

} //STLFactoryImpl
