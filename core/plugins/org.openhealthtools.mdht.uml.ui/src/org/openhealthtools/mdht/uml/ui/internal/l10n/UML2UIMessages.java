/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.internal.l10n;

import org.eclipse.osgi.util.NLS;

/**
 *
 * @version $Id: $
 */
public class UML2UIMessages extends NLS {

	private static final String BUNDLE_NAME = "org.openhealthtools.mdht.uml.ui.internal.l10n.messages";//$NON-NLS-1$

	// ==============================================================================
	// Actions
	// ==============================================================================

	public static String AddUMLPackage_operation_title;
	public static String AddUMLPackage_default_name;
	public static String AddUMLClass_operation_title;
	public static String AddUMLClass_default_name;
	public static String AddUMLAttribute_operation_title;
	public static String AddUMLAttribute_default_name;
	public static String AddUMLConstraint_operation_title;
	public static String AddUMLConstraint_default_name;
	
	public static String _UI_UMLEditor_menu;
	public static String _UI_ApplyProfileActionCommand_label;
	public static String _UI_ApplyStereotypeActionCommand_label;
	public static String _UI_UnapplyProfileActionCommand_label;
	public static String _UI_UnapplyStereotypeActionCommand_label;

	// ==============================================================================
	// Property page sections
	// ==============================================================================


	// ==============================================================================
	// Editors
	// ==============================================================================

	public static String TableEditor_partName;

	static {
		// load message values from bundle file
		NLS.initializeMessages(BUNDLE_NAME, UML2UIMessages.class);
	}
}
