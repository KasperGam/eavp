/**
 */
package model.tests;

import geometry.impl.ShapeImpl;
import junit.framework.TestCase;

import junit.textui.TestRunner;

import model.ModelFactory;
import model.RenderObject;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Render Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link model.IRenderElement#getMesh() <em>Get Mesh</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RenderObjectTest extends TestCase {

	/**
	 * The fixture for this Render Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderObject<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RenderObjectTest.class);
	}

	/**
	 * Constructs a new Render Object test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderObjectTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Render Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RenderObject<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Render Object test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderObject<?> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createRenderObject());
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
	 * Tests the '{@link model.IRenderElement#getMesh() <em>Get Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.IRenderElement#getMesh()
	 * @generated NOT
	 */
	public void testGetMesh() {
		//The object to test
		TestRenderObject render = new TestRenderObject();	
		
		//Set a shape of type test1 as the render's source
		render.setSource(new ShapeImpl(){
			{
				type = "test1";
			}
		});
		
		//The object should get the string "value1" from the test cache.
		assertTrue("value1".equals(render.getMesh()));
	}

} //RenderObjectTest
