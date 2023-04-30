/**
 */
package fr.univcotedazurl3ia.project.ChartItAS;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Col</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getLabel <em>Label</em>}</li>
 *   <li>{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getCol()
 * @model
 * @generated
 */
public interface Col extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getCol_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.univcotedazurl3ia.project.ChartItAS.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @see #setColor(Color)
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASPackage#getCol_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);
} // Col
