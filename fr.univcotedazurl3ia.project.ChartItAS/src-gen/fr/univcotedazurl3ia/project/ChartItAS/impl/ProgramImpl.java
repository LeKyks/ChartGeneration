/**
 */
package fr.univcotedazurl3ia.project.ChartItAS.impl;

import fr.univcotedazurl3ia.project.ChartItAS.Chart;
import fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage;
import fr.univcotedazurl3ia.project.ChartItAS.Col;
import fr.univcotedazurl3ia.project.ChartItAS.Data;
import fr.univcotedazurl3ia.project.ChartItAS.Program;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl#getChart <em>Chart</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends NamedElementImpl implements Program {
	/**
	 * The cached value of the '{@link #getLoadData() <em>Load Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> loadData;

	/**
	 * The cached value of the '{@link #getChart() <em>Chart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChart()
	 * @generated
	 * @ordered
	 */
	protected EList<Chart> chart;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<Col> col;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChartItASPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getLoadData() {
		if (loadData == null) {
			loadData = new EObjectContainmentEList<Data>(Data.class, this, ChartItASPackage.PROGRAM__LOAD_DATA);
		}
		return loadData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chart> getChart() {
		if (chart == null) {
			chart = new EObjectContainmentEList<Chart>(Chart.class, this, ChartItASPackage.PROGRAM__CHART);
		}
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Col> getCol() {
		if (col == null) {
			col = new EObjectContainmentEList<Col>(Col.class, this, ChartItASPackage.PROGRAM__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChartItASPackage.PROGRAM__LOAD_DATA:
			return ((InternalEList<?>) getLoadData()).basicRemove(otherEnd, msgs);
		case ChartItASPackage.PROGRAM__CHART:
			return ((InternalEList<?>) getChart()).basicRemove(otherEnd, msgs);
		case ChartItASPackage.PROGRAM__COL:
			return ((InternalEList<?>) getCol()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChartItASPackage.PROGRAM__LOAD_DATA:
			return getLoadData();
		case ChartItASPackage.PROGRAM__CHART:
			return getChart();
		case ChartItASPackage.PROGRAM__COL:
			return getCol();
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
		case ChartItASPackage.PROGRAM__LOAD_DATA:
			getLoadData().clear();
			getLoadData().addAll((Collection<? extends Data>) newValue);
			return;
		case ChartItASPackage.PROGRAM__CHART:
			getChart().clear();
			getChart().addAll((Collection<? extends Chart>) newValue);
			return;
		case ChartItASPackage.PROGRAM__COL:
			getCol().clear();
			getCol().addAll((Collection<? extends Col>) newValue);
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
		case ChartItASPackage.PROGRAM__LOAD_DATA:
			getLoadData().clear();
			return;
		case ChartItASPackage.PROGRAM__CHART:
			getChart().clear();
			return;
		case ChartItASPackage.PROGRAM__COL:
			getCol().clear();
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
		case ChartItASPackage.PROGRAM__LOAD_DATA:
			return loadData != null && !loadData.isEmpty();
		case ChartItASPackage.PROGRAM__CHART:
			return chart != null && !chart.isEmpty();
		case ChartItASPackage.PROGRAM__COL:
			return col != null && !col.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
