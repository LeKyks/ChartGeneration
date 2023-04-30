/**
 */
package fr.univcotedazurl3ia.project.ChartItAS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getData <em>Data</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getType <em>Type</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getCol <em>Col</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getChart_Data()
	 * @model required="true"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.univcotedazurl3ia.project.ChartItAS.ChartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartType
	 * @see #setType(ChartType)
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getChart_Type()
	 * @model
	 * @generated
	 */
	ChartType getType();

	/**
	 * Sets the value of the '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartType
	 * @see #getType()
	 * @generated
	 */
	void setType(ChartType value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' reference list.
	 * The list contents are of type {@link fr.univcotedazurl3ia.project.ChartItAS.Col}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' reference list.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getChart_Col()
	 * @model required="true"
	 * @generated
	 */
	EList<Col> getCol();

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.univcotedazurl3ia.project.ChartItAS.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @see #setBackgroundColor(Color)
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getChart_BackgroundColor()
	 * @model
	 * @generated
	 */
	Color getBackgroundColor();

	/**
	 * Sets the value of the '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(Color value);

} // Chart
