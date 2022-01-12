/**
 * generated by Xtext 2.25.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working Dir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.WorkingDir#getWorkingDir <em>Working Dir</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getWorkingDir()
 * @model
 * @generated
 */
public interface WorkingDir extends EObject
{
  /**
   * Returns the value of the '<em><b>Working Dir</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Working Dir</em>' containment reference.
   * @see #setWorkingDir(ExistingPath)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getWorkingDir_WorkingDir()
   * @model containment="true"
   * @generated
   */
  ExistingPath getWorkingDir();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.WorkingDir#getWorkingDir <em>Working Dir</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Working Dir</em>' containment reference.
   * @see #getWorkingDir()
   * @generated
   */
  void setWorkingDir(ExistingPath value);

} // WorkingDir
