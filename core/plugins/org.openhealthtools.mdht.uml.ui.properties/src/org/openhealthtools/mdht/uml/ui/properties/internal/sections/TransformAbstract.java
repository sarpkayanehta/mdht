/*******************************************************************************
 * Copyright (c) 2009 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     John T.E. Timm (IBM Corporation) - added template parameter
 *
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.ui.properties.internal.sections;

import org.apache.commons.lang.StringUtils;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;

/**
 * Abstract base class for model transformations.
 */
public abstract class TransformAbstract extends UMLSwitch<Object> {

	public static String normalizeCodeName(String name) {
		String[] parts = name.trim().replaceAll(" +", " ").split(" ");
		StringBuilder result = new StringBuilder();
		for (String part : parts) {
			result.append(part.substring(0, 1).toUpperCase());
			result.append(part.substring(1));
		}
		return UML2Util.getValidJavaIdentifier(result.toString());
	}

	public static String getPublicationName(NamedElement namedElement) {
		if (namedElement != null) {
			String businessName = NamedElementUtil.getBusinessName(namedElement);
			if (!StringUtils.isEmpty(businessName) && businessName.compareTo(namedElement.getName()) == 0) {
				return UMLUtil.splitName(namedElement);
			} else {
				return businessName;
			}
		}
		return "";
	}
}
