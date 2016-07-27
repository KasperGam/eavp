/**
 */
package org.eclipse.january.geometry.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.january.geometry.Face;
import org.eclipse.january.geometry.GeometryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Face</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.january.geometry.impl.FaceImpl#getVertexIndices <em>Vertex Indices</em>}</li>
 *   <li>{@link org.eclipse.january.geometry.impl.FaceImpl#getTextureIndices <em>Texture Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FaceImpl extends MinimalEObjectImpl.Container implements Face {
	/**
	 * The cached value of the '{@link #getVertexIndices() <em>Vertex Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertexIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> vertexIndices;

	/**
	 * The cached value of the '{@link #getTextureIndices() <em>Texture Indices</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextureIndices()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> textureIndices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeometryPackage.Literals.FACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getVertexIndices() {
		if (vertexIndices == null) {
			vertexIndices = new EDataTypeUniqueEList<Integer>(Integer.class, this, GeometryPackage.FACE__VERTEX_INDICES);
		}
		return vertexIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTextureIndices() {
		if (textureIndices == null) {
			textureIndices = new EDataTypeUniqueEList<Integer>(Integer.class, this, GeometryPackage.FACE__TEXTURE_INDICES);
		}
		return textureIndices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeometryPackage.FACE__VERTEX_INDICES:
				return getVertexIndices();
			case GeometryPackage.FACE__TEXTURE_INDICES:
				return getTextureIndices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeometryPackage.FACE__VERTEX_INDICES:
				getVertexIndices().clear();
				getVertexIndices().addAll((Collection<? extends Integer>)newValue);
				return;
			case GeometryPackage.FACE__TEXTURE_INDICES:
				getTextureIndices().clear();
				getTextureIndices().addAll((Collection<? extends Integer>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GeometryPackage.FACE__VERTEX_INDICES:
				getVertexIndices().clear();
				return;
			case GeometryPackage.FACE__TEXTURE_INDICES:
				getTextureIndices().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GeometryPackage.FACE__VERTEX_INDICES:
				return vertexIndices != null && !vertexIndices.isEmpty();
			case GeometryPackage.FACE__TEXTURE_INDICES:
				return textureIndices != null && !textureIndices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vertexIndices: ");
		result.append(vertexIndices);
		result.append(", textureIndices: ");
		result.append(textureIndices);
		result.append(')');
		return result.toString();
	}

} //FaceImpl
