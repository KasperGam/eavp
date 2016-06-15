/**
 */
package geometry.tests;

import geometry.Cube;
import geometry.Cylinder;
import geometry.GeometryFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cylinder</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CylinderTest extends ShapeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CylinderTest.class);
	}

	/**
	 * Constructs a new Cylinder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CylinderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cylinder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Cylinder getFixture() {
		return (Cylinder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GeometryFactory.eINSTANCE.createCylinder());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	/**
	 * Check that only valid values are accepted for the properties.
	 * 
	 * @generated NOT
	 */
	public void checkProperties(){
		
		//The cube to be tested
		Cylinder cylinder = GeometryFactory.eINSTANCE.createCylinder();
		
		//Check that the height can be set
		cylinder.setHeight(1);
		assertEquals(1, cylinder.getHeight());
		
		//Check that invalid values are ignored
		cylinder.setHeight(-1);
		assertEquals(1, cylinder.getHeight());
		
		//Check that the radius can be set
		cylinder.setRadius(1);
		assertEquals(1, cylinder.getRadius());
		
		//Check that invalid values are ignored
		cylinder.setRadius(-1);
		assertEquals(1, cylinder.getRadius());
	}

} //CylinderTest
