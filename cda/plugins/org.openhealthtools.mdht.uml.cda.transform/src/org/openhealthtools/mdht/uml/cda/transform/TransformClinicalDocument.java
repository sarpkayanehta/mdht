/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - factor out CDA base model dependencies (artf3350)
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Class;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.TransformAbstract;

public class TransformClinicalDocument extends TransformAbstract {
	public TransformClinicalDocument(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object caseClass(Class umlClass) {
		/*
		 * Class cdaClass = getCDAClass(umlClass);
		 * if (cdaClass != null && "ClinicalDocument".equals(cdaClass.getName())) {
		 * Stereotype eClass = EcoreTransformUtil.getEcoreStereotype(umlClass, UMLUtil.STEREOTYPE__E_CLASS);
		 * if (!umlClass.isStereotypeApplied(eClass)) {
		 * UMLUtil.safeApplyStereotype(umlClass, eClass);
		 * }
		 * umlClass.setValue(eClass, UMLUtil.TAG_DEFINITION__XML_NAME, "ClinicalDocument");
		 * }
		 */
		return umlClass;
	}
}
