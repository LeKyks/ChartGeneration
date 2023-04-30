/**
 */
package fr.univcotedazurl3ia.project.ChartItAS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartItASFactory
 * @model kind="package"
 * @generated
 */
public interface ChartItASPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ChartItAS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ChartItAS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ChartItAS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChartItASPackage eINSTANCE = fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.NamedElementImpl
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Col</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__COL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__BACKGROUND_COLOR = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.DataImpl
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getData()
	 * @generated
	 */
	int DATA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Load Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__LOAD_DATA = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Chart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CHART = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__COL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ColImpl <em>Col</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ColImpl
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getCol()
	 * @generated
	 */
	int COL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL__COLOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Col</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.ChartType <em>Chart Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartType
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getChartType()
	 * @generated
	 */
	int CHART_TYPE = 5;

	/**
	 * The meta object id for the '{@link fr.univcotedazurl3ia.project.ChartItAS.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 6;

	/**
	 * Returns the meta object for class '{@link fr.univcotedazurl3ia.project.ChartItAS.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the reference '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Chart#getData()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Data();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Chart#getType()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Type();

	/**
	 * Returns the meta object for the reference list '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Col</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Chart#getCol()
	 * @see #getChart()
	 * @generated
	 */
	EReference getChart_Col();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.Chart#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Chart#getBackgroundColor()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_BackgroundColor();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazurl3ia.project.ChartItAS.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.Data#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Data#getPath()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Path();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazurl3ia.project.ChartItAS.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getLoadData <em>Load Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load Data</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Program#getLoadData()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_LoadData();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getChart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chart</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Program#getChart()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Chart();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.univcotedazurl3ia.project.ChartItAS.Program#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Program#getCol()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Col();

	/**
	 * Returns the meta object for class '{@link fr.univcotedazurl3ia.project.ChartItAS.Col <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Col
	 * @generated
	 */
	EClass getCol();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Col#getLabel()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Label();

	/**
	 * Returns the meta object for the attribute '{@link fr.univcotedazurl3ia.project.ChartItAS.Col#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Col#getColor()
	 * @see #getCol()
	 * @generated
	 */
	EAttribute getCol_Color();

	/**
	 * Returns the meta object for enum '{@link fr.univcotedazurl3ia.project.ChartItAS.ChartType <em>Chart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Chart Type</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartType
	 * @generated
	 */
	EEnum getChartType();

	/**
	 * Returns the meta object for enum '{@link fr.univcotedazurl3ia.project.ChartItAS.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChartItASFactory getChartItASFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.NamedElementImpl
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartImpl
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__DATA = eINSTANCE.getChart_Data();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__TYPE = eINSTANCE.getChart_Type();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHART__COL = eINSTANCE.getChart_Col();

		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__BACKGROUND_COLOR = eINSTANCE.getChart_BackgroundColor();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.DataImpl
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__PATH = eINSTANCE.getData_Path();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ProgramImpl
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Load Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__LOAD_DATA = eINSTANCE.getProgram_LoadData();

		/**
		 * The meta object literal for the '<em><b>Chart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__CHART = eINSTANCE.getProgram_Chart();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__COL = eINSTANCE.getProgram_Col();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.impl.ColImpl <em>Col</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ColImpl
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getCol()
		 * @generated
		 */
		EClass COL = eINSTANCE.getCol();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__LABEL = eINSTANCE.getCol_Label();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL__COLOR = eINSTANCE.getCol_Color();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.ChartType <em>Chart Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.ChartType
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getChartType()
		 * @generated
		 */
		EEnum CHART_TYPE = eINSTANCE.getChartType();

		/**
		 * The meta object literal for the '{@link fr.univcotedazurl3ia.project.ChartItAS.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.univcotedazurl3ia.project.ChartItAS.Color
		 * @see fr.univcotedazurl3ia.project.ChartItAS.impl.ChartItASPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //ChartItASPackage
