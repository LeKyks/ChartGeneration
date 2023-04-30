/**
 */
package fr.univcotedazurl3ia.project.ChartItAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getLoadData <em>Load Data</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getChart <em>Chart</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getCol <em>Col</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Load Data</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazurl3ia.project.ChartItAS.Data}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Data</em>' containment reference list.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getProgram_LoadData()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getLoadData();

	/**
	 * Returns the value of the '<em><b>Chart</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazurl3ia.project.ChartItAS.Chart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chart</em>' containment reference list.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getProgram_Chart()
	 * @model containment="true"
	 * @generated
	 */
	EList<Chart> getChart();

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link fr.univcotedazurl3ia.project.ChartItAS.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getProgram_Col()
	 * @model containment="true"
	 * @generated
	 */
	EList<Col> getCol();

} // Program
