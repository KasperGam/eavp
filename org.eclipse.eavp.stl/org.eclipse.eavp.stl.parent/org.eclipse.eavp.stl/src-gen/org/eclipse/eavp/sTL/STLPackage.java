/**
 * generated by Xtext 2.9.1
 */
package org.eclipse.eavp.sTL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.eavp.sTL.STLFactory
 * @model kind="package"
 * @generated
 */
public interface STLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sTL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/eavp/STL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sTL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  STLPackage eINSTANCE = org.eclipse.eavp.sTL.impl.STLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.ModelImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Triangles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TRIANGLES = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.TriangleImpl <em>Triangle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.TriangleImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getTriangle()
   * @generated
   */
  int TRIANGLE = 1;

  /**
   * The feature id for the '<em><b>Normal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIANGLE__NORMAL = 0;

  /**
   * The feature id for the '<em><b>Verticies</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIANGLE__VERTICIES = 1;

  /**
   * The number of structural features of the '<em>Triangle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIANGLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.NormalImpl <em>Normal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.NormalImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getNormal()
   * @generated
   */
  int NORMAL = 2;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL__VECTOR = 0;

  /**
   * The number of structural features of the '<em>Normal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.VectorImpl <em>Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.VectorImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVector()
   * @generated
   */
  int VECTOR = 3;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Y = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__Z = 2;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.VerticiesImpl <em>Verticies</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.VerticiesImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVerticies()
   * @generated
   */
  int VERTICIES = 4;

  /**
   * The feature id for the '<em><b>V1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICIES__V1 = 0;

  /**
   * The feature id for the '<em><b>V2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICIES__V2 = 1;

  /**
   * The feature id for the '<em><b>V3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICIES__V3 = 2;

  /**
   * The number of structural features of the '<em>Verticies</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTICIES_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.eavp.sTL.impl.VertexImpl <em>Vertex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.eavp.sTL.impl.VertexImpl
   * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVertex()
   * @generated
   */
  int VERTEX = 5;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX__Y = 1;

  /**
   * The feature id for the '<em><b>Z</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX__Z = 2;

  /**
   * The number of structural features of the '<em>Vertex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERTEX_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.eavp.sTL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.eavp.sTL.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.eavp.sTL.Model#getTriangles <em>Triangles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triangles</em>'.
   * @see org.eclipse.eavp.sTL.Model#getTriangles()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Triangles();

  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Triangle <em>Triangle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triangle</em>'.
   * @see org.eclipse.eavp.sTL.Triangle
   * @generated
   */
  EClass getTriangle();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Triangle#getNormal <em>Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Normal</em>'.
   * @see org.eclipse.eavp.sTL.Triangle#getNormal()
   * @see #getTriangle()
   * @generated
   */
  EReference getTriangle_Normal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Triangle#getVerticies <em>Verticies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Verticies</em>'.
   * @see org.eclipse.eavp.sTL.Triangle#getVerticies()
   * @see #getTriangle()
   * @generated
   */
  EReference getTriangle_Verticies();

  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Normal <em>Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal</em>'.
   * @see org.eclipse.eavp.sTL.Normal
   * @generated
   */
  EClass getNormal();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Normal#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see org.eclipse.eavp.sTL.Normal#getVector()
   * @see #getNormal()
   * @generated
   */
  EReference getNormal_Vector();

  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vector</em>'.
   * @see org.eclipse.eavp.sTL.Vector
   * @generated
   */
  EClass getVector();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vector#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.eavp.sTL.Vector#getX()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vector#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipse.eavp.sTL.Vector#getY()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vector#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.eclipse.eavp.sTL.Vector#getZ()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_Z();

  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Verticies <em>Verticies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verticies</em>'.
   * @see org.eclipse.eavp.sTL.Verticies
   * @generated
   */
  EClass getVerticies();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Verticies#getV1 <em>V1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V1</em>'.
   * @see org.eclipse.eavp.sTL.Verticies#getV1()
   * @see #getVerticies()
   * @generated
   */
  EReference getVerticies_V1();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Verticies#getV2 <em>V2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V2</em>'.
   * @see org.eclipse.eavp.sTL.Verticies#getV2()
   * @see #getVerticies()
   * @generated
   */
  EReference getVerticies_V2();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.eavp.sTL.Verticies#getV3 <em>V3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>V3</em>'.
   * @see org.eclipse.eavp.sTL.Verticies#getV3()
   * @see #getVerticies()
   * @generated
   */
  EReference getVerticies_V3();

  /**
   * Returns the meta object for class '{@link org.eclipse.eavp.sTL.Vertex <em>Vertex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Vertex</em>'.
   * @see org.eclipse.eavp.sTL.Vertex
   * @generated
   */
  EClass getVertex();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vertex#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see org.eclipse.eavp.sTL.Vertex#getX()
   * @see #getVertex()
   * @generated
   */
  EAttribute getVertex_X();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vertex#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see org.eclipse.eavp.sTL.Vertex#getY()
   * @see #getVertex()
   * @generated
   */
  EAttribute getVertex_Y();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.eavp.sTL.Vertex#getZ <em>Z</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Z</em>'.
   * @see org.eclipse.eavp.sTL.Vertex#getZ()
   * @see #getVertex()
   * @generated
   */
  EAttribute getVertex_Z();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  STLFactory getSTLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.ModelImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Triangles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TRIANGLES = eINSTANCE.getModel_Triangles();

    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.TriangleImpl <em>Triangle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.TriangleImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getTriangle()
     * @generated
     */
    EClass TRIANGLE = eINSTANCE.getTriangle();

    /**
     * The meta object literal for the '<em><b>Normal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIANGLE__NORMAL = eINSTANCE.getTriangle_Normal();

    /**
     * The meta object literal for the '<em><b>Verticies</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIANGLE__VERTICIES = eINSTANCE.getTriangle_Verticies();

    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.NormalImpl <em>Normal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.NormalImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getNormal()
     * @generated
     */
    EClass NORMAL = eINSTANCE.getNormal();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL__VECTOR = eINSTANCE.getNormal_Vector();

    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.VectorImpl <em>Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.VectorImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVector()
     * @generated
     */
    EClass VECTOR = eINSTANCE.getVector();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__X = eINSTANCE.getVector_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__Y = eINSTANCE.getVector_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__Z = eINSTANCE.getVector_Z();

    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.VerticiesImpl <em>Verticies</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.VerticiesImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVerticies()
     * @generated
     */
    EClass VERTICIES = eINSTANCE.getVerticies();

    /**
     * The meta object literal for the '<em><b>V1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICIES__V1 = eINSTANCE.getVerticies_V1();

    /**
     * The meta object literal for the '<em><b>V2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICIES__V2 = eINSTANCE.getVerticies_V2();

    /**
     * The meta object literal for the '<em><b>V3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERTICIES__V3 = eINSTANCE.getVerticies_V3();

    /**
     * The meta object literal for the '{@link org.eclipse.eavp.sTL.impl.VertexImpl <em>Vertex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.eavp.sTL.impl.VertexImpl
     * @see org.eclipse.eavp.sTL.impl.STLPackageImpl#getVertex()
     * @generated
     */
    EClass VERTEX = eINSTANCE.getVertex();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERTEX__X = eINSTANCE.getVertex_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERTEX__Y = eINSTANCE.getVertex_Y();

    /**
     * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERTEX__Z = eINSTANCE.getVertex_Z();

  }

} //STLPackage