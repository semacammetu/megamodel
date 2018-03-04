/**
 * generated by Xtext 2.12.0
 */
package tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Design Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see tr.edu.metu.ceng.megamodel.hypomethod.hypoMethod.HypoMethodPackage#getDesignType()
 * @model
 * @generated
 */
public enum DesignType implements Enumerator
{
  /**
   * The '<em><b>FULLFACTORIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULLFACTORIAL_VALUE
   * @generated
   * @ordered
   */
  FULLFACTORIAL(0, "FULLFACTORIAL", "FULLFACTORIAL"),

  /**
   * The '<em><b>FRACTIONALFACTORIAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FRACTIONALFACTORIAL_VALUE
   * @generated
   * @ordered
   */
  FRACTIONALFACTORIAL(1, "FRACTIONALFACTORIAL", "FRACTIONALFACTORIAL"),

  /**
   * The '<em><b>OTHERS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OTHERS_VALUE
   * @generated
   * @ordered
   */
  OTHERS(2, "OTHERS", "OTHERS");

  /**
   * The '<em><b>FULLFACTORIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FULLFACTORIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULLFACTORIAL
   * @model
   * @generated
   * @ordered
   */
  public static final int FULLFACTORIAL_VALUE = 0;

  /**
   * The '<em><b>FRACTIONALFACTORIAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FRACTIONALFACTORIAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FRACTIONALFACTORIAL
   * @model
   * @generated
   * @ordered
   */
  public static final int FRACTIONALFACTORIAL_VALUE = 1;

  /**
   * The '<em><b>OTHERS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OTHERS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OTHERS
   * @model
   * @generated
   * @ordered
   */
  public static final int OTHERS_VALUE = 2;

  /**
   * An array of all the '<em><b>Design Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DesignType[] VALUES_ARRAY =
    new DesignType[]
    {
      FULLFACTORIAL,
      FRACTIONALFACTORIAL,
      OTHERS,
    };

  /**
   * A public read-only list of all the '<em><b>Design Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DesignType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Design Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DesignType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DesignType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Design Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DesignType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DesignType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Design Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DesignType get(int value)
  {
    switch (value)
    {
      case FULLFACTORIAL_VALUE: return FULLFACTORIAL;
      case FRACTIONALFACTORIAL_VALUE: return FRACTIONALFACTORIAL;
      case OTHERS_VALUE: return OTHERS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DesignType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DesignType
