/**
 */
package fr.univcotedazurl3ia.project.ChartItAS.impl;

import fr.univcotedazurl3ia.project.ChartItAS.Chart;
import fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage;
import fr.univcotedazurl3ia.project.ChartItAS.ChartType;
import fr.univcotedazurl3ia.project.ChartItAS.Col;
import fr.univcotedazurl3ia.project.ChartItAS.Color;
import fr.univcotedazurl3ia.project.ChartItAS.Data;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl#getData <em>Data</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl#getType <em>Type</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl#getCol <em>Col</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChartImpl extends NamedElementImpl implements Chart {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChartType TYPE_EDEFAULT = ChartType.PIE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ChartType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<Col> col;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color BACKGROUND_COLOR_EDEFAULT = Color.BLUE;

	/**
	 * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected Color backgroundColor = BACKGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItASPackage.Literals.CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (Data) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ChartItASPackage.CHART__DATA, oldData,
							data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(Data newData) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItASPackage.CHART__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ChartType newType) {
		ChartType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItASPackage.CHART__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Col> getCol() {
		if (col == null) {
			col = new EObjectResolvingEList<Col>(Col.class, this, ChartItASPackage.CHART__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundColor(Color newBackgroundColor) {
		Color oldBackgroundColor = backgroundColor;
		backgroundColor = newBackgroundColor == null ? BACKGROUND_COLOR_EDEFAULT : newBackgroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChartItASPackage.CHART__BACKGROUND_COLOR,
					oldBackgroundColor, backgroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItASPackage.CHART__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case ChartItASPackage.CHART__TYPE:
			return getType();
		case ChartItASPackage.CHART__COL:
			return getCol();
		case ChartItASPackage.CHART__BACKGROUND_COLOR:
			return getBackgroundColor();
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
		case ChartItASPackage.CHART__DATA:
			setData((Data) newValue);
			return;
		case ChartItASPackage.CHART__TYPE:
			setType((ChartType) newValue);
			return;
		case ChartItASPackage.CHART__COL:
			getCol().clear();
			getCol().addAll((Collection<? extends Col>) newValue);
			return;
		case ChartItASPackage.CHART__BACKGROUND_COLOR:
			setBackgroundColor((Color) newValue);
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
		case ChartItASPackage.CHART__DATA:
			setData((Data) null);
			return;
		case ChartItASPackage.CHART__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ChartItASPackage.CHART__COL:
			getCol().clear();
			return;
		case ChartItASPackage.CHART__BACKGROUND_COLOR:
			setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
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
		case ChartItASPackage.CHART__DATA:
			return data != null;
		case ChartItASPackage.CHART__TYPE:
			return type != TYPE_EDEFAULT;
		case ChartItASPackage.CHART__COL:
			return col != null && !col.isEmpty();
		case ChartItASPackage.CHART__BACKGROUND_COLOR:
			return backgroundColor != BACKGROUND_COLOR_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", backgroundColor: ");
		result.append(backgroundColor);
		result.append(')');
		return result.toString();
	}

} //ChartImpl
