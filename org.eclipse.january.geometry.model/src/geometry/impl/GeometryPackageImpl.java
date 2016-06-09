/**
 */
package geometry.impl;

import geometry.ASCIISTLGeometryImporter;
import geometry.Complement;
import geometry.Cube;
import geometry.Cylinder;
import geometry.Geometry;
import geometry.GeometryFactory;
import geometry.GeometryPackage;
import geometry.IGeometryImporter;
import geometry.INode;
import geometry.IShapeObserver;
import geometry.ISubjectShape;
import geometry.Intersection;
import geometry.Material;
import geometry.Operator;
import geometry.Shape;
import geometry.ShapeChangeEvent;
import geometry.ShapeChangeEventType;
import geometry.Sphere;
import geometry.Triangle;
import geometry.Tube;
import geometry.Union;
import geometry.Vertex;

import java.nio.file.Path;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometryPackageImpl extends EPackageImpl implements GeometryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cylinderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intersectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSubjectShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iShapeObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass materialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeChangeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGeometryImporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asciistlGeometryImporterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeChangeEventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see geometry.GeometryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeometryPackageImpl() {
		super(eNS_URI, GeometryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeometryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeometryPackage init() {
		if (isInited) return (GeometryPackage)EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);

		// Obtain or create and register package
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeometryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeometryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGeometryPackage.createPackageContents();

		// Initialize created meta-data
		theGeometryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeometryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeometryPackage.eNS_URI, theGeometryPackage);
		return theGeometryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Triangles() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Center() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Type() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Material() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getShape__GetPropertyNames() {
		return shapeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getShape__GetProperty__String() {
		return shapeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getShape__SetProperty__String_double() {
		return shapeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangle() {
		return triangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangle_Vertices() {
		return (EReference)triangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriangle_Normal() {
		return (EReference)triangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_X() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Y() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Z() {
		return (EAttribute)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphere() {
		return sphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphere_Radius() {
		return (EAttribute)sphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCube() {
		return cubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCube_SideLength() {
		return (EAttribute)cubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCylinder() {
		return cylinderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_Radius() {
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCylinder_Height() {
		return (EAttribute)cylinderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometry() {
		return geometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTube() {
		return tubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTube_Height() {
		return (EAttribute)tubeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTube_InnerRadius() {
		return (EAttribute)tubeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTube_Radius() {
		return (EAttribute)tubeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getINode() {
		return iNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINode_Name() {
		return (EAttribute)iNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getINode_Id() {
		return (EAttribute)iNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getINode_Nodes() {
		return (EReference)iNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnion() {
		return unionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntersection() {
		return intersectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplement() {
		return complementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISubjectShape() {
		return iSubjectShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISubjectShape__Register__IShapeObserver() {
		return iSubjectShapeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getISubjectShape__Unregister__IShapeObserver() {
		return iSubjectShapeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIShapeObserver() {
		return iShapeObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIShapeObserver__Update__ShapeChangeEvent_ISubjectShape() {
		return iShapeObserverEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaterial() {
		return materialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeChangeEvent() {
		return shapeChangeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeChangeEvent_Type() {
		return (EAttribute)shapeChangeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeChangeEvent_Value() {
		return (EAttribute)shapeChangeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGeometryImporter() {
		return iGeometryImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIGeometryImporter_FileTypes() {
		return (EAttribute)iGeometryImporterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIGeometryImporter_Description() {
		return (EAttribute)iGeometryImporterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGeometryImporter__Load__Path() {
		return iGeometryImporterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASCIISTLGeometryImporter() {
		return asciistlGeometryImporterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShapeChangeEventType() {
		return shapeChangeEventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPath() {
		return pathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryFactory getGeometryFactory() {
		return (GeometryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shapeEClass = createEClass(SHAPE);
		createEReference(shapeEClass, SHAPE__TRIANGLES);
		createEReference(shapeEClass, SHAPE__CENTER);
		createEAttribute(shapeEClass, SHAPE__TYPE);
		createEReference(shapeEClass, SHAPE__MATERIAL);
		createEOperation(shapeEClass, SHAPE___GET_PROPERTY_NAMES);
		createEOperation(shapeEClass, SHAPE___GET_PROPERTY__STRING);
		createEOperation(shapeEClass, SHAPE___SET_PROPERTY__STRING_DOUBLE);

		triangleEClass = createEClass(TRIANGLE);
		createEReference(triangleEClass, TRIANGLE__NORMAL);
		createEReference(triangleEClass, TRIANGLE__VERTICES);

		vertexEClass = createEClass(VERTEX);
		createEAttribute(vertexEClass, VERTEX__X);
		createEAttribute(vertexEClass, VERTEX__Y);
		createEAttribute(vertexEClass, VERTEX__Z);

		sphereEClass = createEClass(SPHERE);
		createEAttribute(sphereEClass, SPHERE__RADIUS);

		cubeEClass = createEClass(CUBE);
		createEAttribute(cubeEClass, CUBE__SIDE_LENGTH);

		cylinderEClass = createEClass(CYLINDER);
		createEAttribute(cylinderEClass, CYLINDER__RADIUS);
		createEAttribute(cylinderEClass, CYLINDER__HEIGHT);

		geometryEClass = createEClass(GEOMETRY);

		tubeEClass = createEClass(TUBE);
		createEAttribute(tubeEClass, TUBE__HEIGHT);
		createEAttribute(tubeEClass, TUBE__INNER_RADIUS);
		createEAttribute(tubeEClass, TUBE__RADIUS);

		iNodeEClass = createEClass(INODE);
		createEAttribute(iNodeEClass, INODE__NAME);
		createEAttribute(iNodeEClass, INODE__ID);
		createEReference(iNodeEClass, INODE__NODES);

		operatorEClass = createEClass(OPERATOR);

		unionEClass = createEClass(UNION);

		intersectionEClass = createEClass(INTERSECTION);

		complementEClass = createEClass(COMPLEMENT);

		iSubjectShapeEClass = createEClass(ISUBJECT_SHAPE);
		createEOperation(iSubjectShapeEClass, ISUBJECT_SHAPE___REGISTER__ISHAPEOBSERVER);
		createEOperation(iSubjectShapeEClass, ISUBJECT_SHAPE___UNREGISTER__ISHAPEOBSERVER);

		iShapeObserverEClass = createEClass(ISHAPE_OBSERVER);
		createEOperation(iShapeObserverEClass, ISHAPE_OBSERVER___UPDATE__SHAPECHANGEEVENT_ISUBJECTSHAPE);

		materialEClass = createEClass(MATERIAL);

		shapeChangeEventEClass = createEClass(SHAPE_CHANGE_EVENT);
		createEAttribute(shapeChangeEventEClass, SHAPE_CHANGE_EVENT__TYPE);
		createEAttribute(shapeChangeEventEClass, SHAPE_CHANGE_EVENT__VALUE);

		iGeometryImporterEClass = createEClass(IGEOMETRY_IMPORTER);
		createEAttribute(iGeometryImporterEClass, IGEOMETRY_IMPORTER__FILE_TYPES);
		createEAttribute(iGeometryImporterEClass, IGEOMETRY_IMPORTER__DESCRIPTION);
		createEOperation(iGeometryImporterEClass, IGEOMETRY_IMPORTER___LOAD__PATH);

		asciistlGeometryImporterEClass = createEClass(ASCIISTL_GEOMETRY_IMPORTER);

		// Create enums
		shapeChangeEventTypeEEnum = createEEnum(SHAPE_CHANGE_EVENT_TYPE);

		// Create data types
		pathEDataType = createEDataType(PATH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		shapeEClass.getESuperTypes().add(this.getISubjectShape());
		shapeEClass.getESuperTypes().add(this.getINode());
		sphereEClass.getESuperTypes().add(this.getShape());
		cubeEClass.getESuperTypes().add(this.getShape());
		cylinderEClass.getESuperTypes().add(this.getShape());
		geometryEClass.getESuperTypes().add(this.getINode());
		tubeEClass.getESuperTypes().add(this.getShape());
		operatorEClass.getESuperTypes().add(this.getINode());
		unionEClass.getESuperTypes().add(this.getOperator());
		intersectionEClass.getESuperTypes().add(this.getOperator());
		complementEClass.getESuperTypes().add(this.getOperator());
		asciistlGeometryImporterEClass.getESuperTypes().add(this.getIGeometryImporter());

		// Initialize classes, features, and operations; add parameters
		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShape_Triangles(), this.getTriangle(), null, "triangles", null, 0, -1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShape_Center(), this.getVertex(), null, "center", null, 1, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Type(), ecorePackage.getEString(), "type", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShape_Material(), this.getMaterial(), null, "material", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getShape__GetPropertyNames(), ecorePackage.getEString(), "getPropertyNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getShape__GetProperty__String(), ecorePackage.getEDouble(), "getProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getShape__SetProperty__String_double(), null, "setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triangleEClass, Triangle.class, "Triangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriangle_Normal(), this.getVertex(), null, "normal", null, 0, 1, Triangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangle_Vertices(), this.getVertex(), null, "vertices", null, 0, 3, Triangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertex_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertex_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertex_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphereEClass, Sphere.class, "Sphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphere_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, Sphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cubeEClass, Cube.class, "Cube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCube_SideLength(), ecorePackage.getEDouble(), "sideLength", null, 0, 1, Cube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cylinderEClass, Cylinder.class, "Cylinder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCylinder_Radius(), ecorePackage.getEDouble(), "radius", null, 0, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCylinder_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Cylinder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geometryEClass, Geometry.class, "Geometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tubeEClass, Tube.class, "Tube", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTube_Height(), ecorePackage.getEDouble(), "height", "0.0", 0, 1, Tube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTube_InnerRadius(), ecorePackage.getEDouble(), "innerRadius", "0.0", 0, 1, Tube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTube_Radius(), ecorePackage.getEDouble(), "radius", "0.0", 0, 1, Tube.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iNodeEClass, INode.class, "INode", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getINode_Name(), ecorePackage.getEString(), "name", null, 0, 1, INode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getINode_Id(), ecorePackage.getELong(), "id", null, 0, 1, INode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINode_Nodes(), this.getINode(), null, "nodes", null, 0, -1, INode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unionEClass, Union.class, "Union", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intersectionEClass, Intersection.class, "Intersection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(complementEClass, Complement.class, "Complement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iSubjectShapeEClass, ISubjectShape.class, "ISubjectShape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getISubjectShape__Register__IShapeObserver(), null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIShapeObserver(), "observer", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getISubjectShape__Unregister__IShapeObserver(), null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIShapeObserver(), "observer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iShapeObserverEClass, IShapeObserver.class, "IShapeObserver", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIShapeObserver__Update__ShapeChangeEvent_ISubjectShape(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getShapeChangeEvent(), "event", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getISubjectShape(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(materialEClass, Material.class, "Material", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeChangeEventEClass, ShapeChangeEvent.class, "ShapeChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeChangeEvent_Type(), this.getShapeChangeEventType(), "type", null, 0, 1, ShapeChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeChangeEvent_Value(), ecorePackage.getEString(), "value", null, 0, 1, ShapeChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iGeometryImporterEClass, IGeometryImporter.class, "IGeometryImporter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIGeometryImporter_FileTypes(), ecorePackage.getEString(), "fileTypes", null, 1, -1, IGeometryImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIGeometryImporter_Description(), ecorePackage.getEString(), "description", null, 0, 1, IGeometryImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIGeometryImporter__Load__Path(), this.getGeometry(), "load", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPath(), "path", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asciistlGeometryImporterEClass, ASCIISTLGeometryImporter.class, "ASCIISTLGeometryImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(shapeChangeEventTypeEEnum, ShapeChangeEventType.class, "ShapeChangeEventType");
		addEEnumLiteral(shapeChangeEventTypeEEnum, ShapeChangeEventType.NAME_CHANGE);
		addEEnumLiteral(shapeChangeEventTypeEEnum, ShapeChangeEventType.PROP_CHANGE);
		addEEnumLiteral(shapeChangeEventTypeEEnum, ShapeChangeEventType.SHAPE_CHANGE);

		// Initialize data types
		initEDataType(pathEDataType, Path.class, "Path", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GeometryPackageImpl
