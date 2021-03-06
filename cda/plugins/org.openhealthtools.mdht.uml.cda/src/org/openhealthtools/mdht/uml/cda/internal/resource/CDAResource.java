/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Christian W. Damus - refactored CDAResource, CDAUtil, CDARegistry on the new flexible XML resource (artf3367)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.internal.resource;

import org.openhealthtools.mdht.emf.runtime.resource.FleXMLResource;

/**
 * <!-- begin-user-doc -->
 * The resource associated with the '<em><b>cda</b></em>' package.
 * <!-- end-user-doc -->
 * @generated not
 */
public interface CDAResource extends FleXMLResource {
	/**
	 * <!-- begin-user-doc -->
	 * The factory for '<em><b>cda</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public interface Factory extends FleXMLResource.Factory {

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final Factory INSTANCE = new CDAResourceFactoryImpl();

	}

	/**
	 * <!-- begin-user-doc -->
	 * The file extension for '<em><b>cda</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FILE_EXTENSION = "cda";

	/**
	 * <!-- begin-user-doc -->
	 * The default encoding for '<em><b>cda</b></em>' resources.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String DEFAULT_ENCODING = "UTF-8";

} // CDAResource
