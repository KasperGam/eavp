/**
 */
package geometry.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import geometry.GeometryPackage;
import geometry.Tube;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Tube</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link geometry.impl.TubeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link geometry.impl.TubeImpl#getInnerRadius <em>Inner Radius</em>}</li>
 *   <li>{@link geometry.impl.TubeImpl#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TubeImpl extends ShapeImpl implements Tube {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double INNER_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInnerRadius() <em>Inner Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInnerRadius()
	 * @generated
	 * @ordered
	 */
	protected double innerRadius = INNER_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.TUBE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setHeight(double newHeight) {

		// If the value is invalid, ignore it and log an error
		if (newHeight <= 0) {
			double oldHeight = height;
			height = newHeight;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						GeometryPackage.TUBE__HEIGHT, oldHeight, height));
		} else {
			logger.error("An attempt was made to change tube " + name + " " + id
					+ "'s height to the invalid value " + newHeight + ".");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getInnerRadius() {
		return innerRadius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setInnerRadius(double newInnerRadius) {

		// The inner radius must not be larger than the radius. Ignore the call
		// if it is.
		if (newInnerRadius <= radius && newInnerRadius >= 0) {
			double oldInnerRadius = innerRadius;
			innerRadius = newInnerRadius;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						GeometryPackage.TUBE__INNER_RADIUS, oldInnerRadius,
						innerRadius));
		}

		// Log an error if the call was invalid
		else {
			String suffix = (newInnerRadius < 0) ? "."
					: ", which is greater than its outer radius.";
			logger.error("An attempt was made to change tube " + name + " " + id
					+ "'s radius to the invalid value " + newInnerRadius
					+ suffix);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void setRadius(double newRadius) {

		// If the value is invalid, ignore it and log an error
		if (newRadius >= innerRadius && newRadius >= 0) {
			double oldRadius = radius;
			radius = newRadius;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						GeometryPackage.TUBE__RADIUS, oldRadius, radius));
		} else {
			String suffix = (newRadius < 0) ? "."
					: ", which is less than its inner radius.";
			logger.error("An attempt was made to change cylinder " + name + " "
					+ id + "'s radius to the invalid value " + newRadius
					+ suffix);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.TUBE__HEIGHT:
				return getHeight();
			case GeometryPackage.TUBE__INNER_RADIUS:
				return getInnerRadius();
			case GeometryPackage.TUBE__RADIUS:
				return getRadius();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.TUBE__HEIGHT:
				setHeight((Double)newValue);
				return;
			case GeometryPackage.TUBE__INNER_RADIUS:
				setInnerRadius((Double)newValue);
				return;
			case GeometryPackage.TUBE__RADIUS:
				setRadius((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeometryPackage.TUBE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GeometryPackage.TUBE__INNER_RADIUS:
				setInnerRadius(INNER_RADIUS_EDEFAULT);
				return;
			case GeometryPackage.TUBE__RADIUS:
				setRadius(RADIUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeometryPackage.TUBE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GeometryPackage.TUBE__INNER_RADIUS:
				return innerRadius != INNER_RADIUS_EDEFAULT;
			case GeometryPackage.TUBE__RADIUS:
				return radius != RADIUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (height: ");
		result.append(height);
		result.append(", innerRadius: ");
		result.append(innerRadius);
		result.append(", radius: ");
		result.append(radius);
		result.append(')');
		return result.toString();
	}

} // TubeImpl
