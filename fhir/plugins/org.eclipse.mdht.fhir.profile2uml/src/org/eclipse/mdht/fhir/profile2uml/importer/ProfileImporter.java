package org.eclipse.mdht.fhir.profile2uml.importer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PrimitiveType;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.StructureDefinitionTypeList;
import org.hl7.fhir.util.FhirResourceFactoryImpl;

public class ProfileImporter {
	public static final String MDHT_ANNOTATION_SOURCE = "org.eclipse.mdht";
	public static final String URI_ANNOTATION = "fhir.uri";
	
	public static final String UML_LIBRARIES_PATH = "org.eclipse.uml2.uml.resources/libraries/";
	public static final String XML_PRIMITIVE_TYPES_LIBRARY = UML_LIBRARIES_PATH + "XMLPrimitiveTypes.library.uml";
	
	private IContainer fhirProfileFolder;
	private Package model;
	private Package xmlPrimitiveTypes;
	
	private Map<String,Type> referenceModelTypeForName = new HashMap<String,Type>();
	private Map<String,Type> referenceModelTypeForURI = new HashMap<String,Type>();
	
	private Map<String,Type> datatypeModelTypes = new HashMap<String,Type>();
	
	public ProfileImporter(Package model, IContainer cemlFolder) {
		this.model = model;
		this.fhirProfileFolder = cemlFolder;

		initializeLibraries(model);
		catalogMembers(model);
	}
	
	private void initializeLibraries(Package umlPackage) {
		URI libraryURI = URI.createPlatformPluginURI(XML_PRIMITIVE_TYPES_LIBRARY, false);
		Resource libraryResource = umlPackage.eResource().getResourceSet().getResource(libraryURI, true);
		if (libraryResource != null) {
			for (EObject eObject : libraryResource.getContents()) {
				if (eObject instanceof Package) {
					xmlPrimitiveTypes = (Package) eObject;
					break;
				}
			}
		}
		
		if (xmlPrimitiveTypes != null) {
			PackageImport libraryImport = null;
			for (PackageImport pkgImport : model.getPackageImports()) {
				if (xmlPrimitiveTypes == pkgImport.getImportedPackage()) {
					libraryImport = pkgImport;
					break;
				}
			}
			if (libraryImport == null) {
				model.createPackageImport(xmlPrimitiveTypes);
			}
		}
	}
	
	private void catalogMembers(Package umlPackage) {
		for (NamedElement member : umlPackage.getMembers()) {
			// includes unnamed Associations
			if (member instanceof Class && member.getName() != null) {
				referenceModelTypeForName.put(member.getName(), (Class)member);

				String uri = getURIAnnotation(member);
				if (uri != null) {
					referenceModelTypeForURI.put(uri, (Class)member);
				}
			}
			else if (member instanceof Package) {
				catalogMembers((Package)member);
			}
		}
	}
	
	private String getURIAnnotation(Element element) {
		String uri = null;
		EAnnotation annotation = element.getEAnnotation(MDHT_ANNOTATION_SOURCE);
		if (annotation != null) {
			uri = annotation.getDetails().get(URI_ANNOTATION);
		}
		
		return uri;
	}
	
	private void setURIAnnotation(Element element, String uri) {
		EAnnotation annotation = element.createEAnnotation(MDHT_ANNOTATION_SOURCE);
		annotation.getDetails().put(URI_ANNOTATION, uri);
	}

	public void importAllProfiles() {
		try {
			for (IResource resource : fhirProfileFolder.members()) {
				if (resource instanceof IFile) {
					String fileExt = ((IFile)resource).getFileExtension();
					if ("xml".equals(fileExt)) {
						importProfile((IFile)resource);
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Class importProfile(IFile profileFile) {
		String profileName = profileFile.getName();
		profileName = profileName.substring(0, profileName.lastIndexOf("."));
		Class umlClass = (Class) model.getOwnedType(profileName, false, UMLPackage.eINSTANCE.getClass_(), false);
		
		if (umlClass == null) {
			URI uri = URI.createFileURI(profileFile.getLocation().toString());
			
			ResourceFactoryImpl resourceFactory = new FhirResourceFactoryImpl();
			Resource resource = resourceFactory.createResource(uri);
			try {
				resource.load(new HashMap<String,String>());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
	
			TreeIterator<?> iterator = EcoreUtil.getAllContents(Collections.singletonList(resource));
	
			while (iterator != null && iterator.hasNext()) {
				Object child = iterator.next();
				if (child instanceof StructureDefinition) {
					umlClass = importProfile((StructureDefinition)child);
					break;
				}
			}
		}
		
		return umlClass;
	}

	public Class importProfileForURI(String profileURI) {
		Class umlClass = (Class) referenceModelTypeForURI.get(profileURI);
		if (umlClass == null) {
			/*
			 * TODO not all URIs can be resolved to a file this way, e.g. 
			 * 
			 * http://hl7.org/fhir/StructureDefinition/observation-bodyPosition
			 * extension-observation-bodyposition.xml
			 * - extension prefix, no .profile.xml
			 * 
			 * During import, keep list of pending profiles.
			 */
			String profileName = profileURI.substring(profileURI.lastIndexOf("/") + 1);
			umlClass = importProfile(profileName);
		}
		
		return umlClass;
	}
	
	public Class importProfile(String profileName) {
		Class umlClass = (Class) referenceModelTypeForName.get(profileName);
		if (umlClass == null) {
			IFile profileFile = fhirProfileFolder.getFile(new Path(profileName.toLowerCase() + ".profile.xml"));
			
			if (profileFile.exists()) {
				umlClass = importProfile(profileFile);
			}
			else {
				System.err.println("Cannot find Profile: " + profileName);
			}
		}
		
		return umlClass;
	}
	
	public Class importProfile(StructureDefinition structureDef) {
		//TODO until support implemented for extensions
		StructureDefinitionTypeList structureType = null;
		if (StructureDefinitionTypeList.EXTENSION == structureType) {
			return null;
		}
		
		String typePackageName = structureDef.getType().getValue().getName();
		Package typePackage = model.getNestedPackage(typePackageName, true, UMLPackage.eINSTANCE.getPackage(), true);

		String profileClassName = structureDef.getId().getValue();
		Class profileClass = typePackage.createOwnedClass(profileClassName, false);
		profileClass.setIsAbstract(structureDef.getAbstract().isValue());
		
		setURIAnnotation(profileClass, structureDef.getUrl().getValue());
		referenceModelTypeForName.put(profileClassName, profileClass);
		referenceModelTypeForURI.put(structureDef.getUrl().getValue(), profileClass);
		
		if (structureDef.getDescription() != null) {
			Comment description = profileClass.createOwnedComment();
			description.setBody(structureDef.getDescription().getValue());
		}
		if (structureDef.getRequirements() != null) {
			Comment requirements = profileClass.createOwnedComment();
			requirements.setBody(structureDef.getRequirements().getValue());
		}
		
		// Element has base = Element, check for circular generalization
		if (structureDef.getBase() != null
				&& !structureDef.getUrl().getValue().equals(structureDef.getBase().getValue())) {
			String base = structureDef.getBase().getValue();
			Class baseClass = null;
			if (base.startsWith("http://")) {
				baseClass = importProfileForURI(base);
			}
			else {
				baseClass = importProfile(base);
			}
			
			if (baseClass != null) {
				profileClass.createGeneralization(baseClass);
			}
		}
		
		Map<String,Class> classMap = new HashMap<String,Class>();

		boolean isProfileElement = true;
		for (ElementDefinition elementDef : structureDef.getDifferential().getElement()) {
			// parse path segments to identify nested classes and property names
			String path = elementDef.getPath().getValue();
			String[] pathSegments = path.split("\\.");
			
			// Create a typeList, then create a property, and maybe a nested class
			List<Classifier> typeList = new ArrayList<Classifier>();
			for (ElementDefinitionType elementDefType : elementDef.getType()) {
				Classifier typeClass = null;
				if (elementDefType.getProfile() != null && elementDefType.getProfile().getValue() != null) {
					String profileURI = elementDefType.getProfile().getValue();
					typeClass = importProfileForURI(profileURI);
				}
				if (typeClass == null && elementDefType.getCode() != null && elementDefType.getCode().getValue() != null) {
					String typeCode = elementDefType.getCode().getValue();
					String[] typeCodes = typeCode.split(",");
					
					//TODO clarify interpretation of comma-separated value, e.g. in date.profile.xml
					for (int i = 0; i < typeCodes.length; i++) {
						String typeName = typeCodes[i].trim();
						if (typeName.startsWith("xs:")) {
							typeClass = getPrimitiveType(typeName);
						}
						else {
							typeClass = importProfile(typeName);
						}
						
						//TODO for now, use only first type from comma-separated list
						if (typeClass != null) {
							break;
						}
					}
				}
				
				if (typeClass != null) {
					typeList.add(typeClass);
				}
			}
			
			if (isProfileElement) {
				// the first ElementDefinition
				isProfileElement = false;
				classMap.put(path, profileClass);
				
				if (elementDef.getName() != null && elementDef.getName().getValue() != null) {
					profileClass.setName(elementDef.getName().getValue());
				}

				// create generalization only if not created from 'base' profile
				if (profileClass.getGeneralizations().isEmpty() && typeList.size() == 1) {
					Classifier baseType = typeList.get(0);
					//TODO Element has type Element, expand check for circular generalization references
					if (!baseType.equals(profileClass)) {
						profileClass.createGeneralization(baseType);
					}
				}

				addComments(profileClass, elementDef);
				continue;
			}
			
			Class ownerClass = null;
			if (path.indexOf(".") == -1) {
				// for type profile definitions, e.g. code.profile.xml
				ownerClass = profileClass;
			}
			else {
				String ownerClassPath = path.substring(0, path.lastIndexOf("."));
				ownerClass = classMap.get(ownerClassPath);

				if (ownerClass == null) {
					System.err.println("Owner class should never be null: " + ownerClassPath);
					continue;
				}
			}
			
			Classifier propertyType = null;
			if (typeList.isEmpty()) {
				// create a new nested class
				String nestedClassName = getClassName(elementDef);
				propertyType = (Class) ownerClass.createNestedClassifier(nestedClassName, UMLPackage.eINSTANCE.getClass_());
				classMap.put(path, (Class) propertyType);
			}
			else if (typeList.size() == 1) {
				propertyType = typeList.get(0);
			}
			else if (typeList.size() > 1) {
				// TODO all types must be same kind, some elements mix Resource and CodeableConcept
				// TODO there is no FHIR class that is superclass of all, both Element and Resource
				if (isSubclassOf(typeList.get(0), "DomainResource")) {
					propertyType = importProfile("DomainResource");
				}
				else if (isSubclassOf(typeList.get(0), "Element")) {
					propertyType = importProfile("Element");
				}
			}

			String propertyName = getPropertyName(elementDef);
			Property property = ownerClass.createOwnedAttribute(propertyName, propertyType);
			assignMultiplicity(property, elementDef);
			if (isAssociation(property)) {
				createAssociation(ownerClass, property);
			}
			//TODO redefined or subsetted from RM property

			addComments(property, elementDef);
		}
		
		return profileClass;
	}
	
	private void addComments(Element umlElement, ElementDefinition elementDef) {
		if (elementDef.getShort() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getShort().getValue());
		}
		if (elementDef.getDefinition() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getDefinition().getValue());
		}
		if (elementDef.getComments() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getComments().getValue());
		}
		if (elementDef.getRequirements() != null) {
			Comment comment = umlElement.createOwnedComment();
			comment.setBody(elementDef.getRequirements().getValue());
		}
	}

	/**
	 * Determines the class-name that the element would have if it was defining
	 * a class. This means it uses "name", if present, and the last "path"
	 * component otherwise.
	 * 
	 * @param elementDef
	 * @return
	 */
	private String getClassName(ElementDefinition elementDef) {
		String name = null;
		if (elementDef.getName() != null && elementDef.getName().getValue() != null) {
			name = elementDef.getName().getValue();
		}
		else {
			String[] path = elementDef.getPath().getValue().split("\\.");
			name = path[path.length - 1];
			
			//TODO toUpperCamelCase
			StringBuffer camelCaseNameBuffer = new StringBuffer();
			camelCaseNameBuffer.append(name.substring(0, 1).toUpperCase());
			camelCaseNameBuffer.append(name.substring(1));
			name = camelCaseNameBuffer.toString();
		}
		
		return name;
	}
	/**
	 * Determines the property from the last "path" component.
	 * 
	 * @param elementDef
	 * @return
	 */
	private String getPropertyName(ElementDefinition elementDef) {
		String[] path = elementDef.getPath().getValue().split("\\.");
		if (path.length == 1) {
			// type profiles have a simple path, e.g. 'value'
			return path[0];
		}
		else {
			return path[path.length - 1];
		}
	}
	
	private PrimitiveType getPrimitiveType(String typeName) {
		PrimitiveType primitiveType = null;
		/*
		 * TODO if prefix == xs:, strip prefix and make first char upper case
		 */
		
		if (typeName.startsWith("xs:")) {
			String name = typeName.substring(3);			
			primitiveType = (PrimitiveType) xmlPrimitiveTypes.getOwnedType(name, true, UMLPackage.eINSTANCE.getPrimitiveType(), false);
		}
		
		return primitiveType;
	}
	
//	private boolean isKindOf(Classifier umlClass, String parentName) {
//		for (Classifier parent : umlClass.allParents()) {
//			if (parentName.equals(parent.getName())) {
//				return true;
//			}
//		}
//		return false;
//	}

	private boolean isSubclassOf(Classifier umlClass, String parentName) {
		for (Classifier parent : umlClass.allParents()) {
			if (parentName.equals(parent.getName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Association if property type is a subclass of DomainResource, or type is a nested class.
	 */
	private boolean isAssociation(Property property) {
		if (property.getType() instanceof Classifier 
				&& (isSubclassOf((Classifier)property.getType(), "DomainResource") || property.getType().getOwner() instanceof Class)) {
			return true;
		}
		
		return false;
	}

	private Property createAssociation(Class umlClass, Property targetProp) {
		if (isAssociation(targetProp)) {
			Association association = (Association) model.createOwnedType(null, UMLPackage.eINSTANCE.getAssociation());
			Property sourceProp = UMLFactory.eINSTANCE.createProperty();
			sourceProp.setType(umlClass);
			sourceProp.setLower(1);
			sourceProp.setUpper(1);
			association.getOwnedEnds().add(sourceProp);
			association.getMemberEnds().add(targetProp);
		}
		
		return targetProp;
	}
	
	private void assignMultiplicity(Property property, ElementDefinition elementDef) {
		int lower = 0;
		int upper = 1;
		
		if (elementDef.getMin() != null) {
			lower = elementDef.getMin().getValue();
		}
		if (elementDef.getMax() != null) {
			String max = elementDef.getMax().getValue();
			if ("*".equals(max)) {
				upper = -1;
			}
			else {
				try {
					upper = Integer.parseInt(max);
				}
				catch (NumberFormatException e) {
					// TODO error handling
					System.err.println("Invalid max cardinality: " + max + " on " + property.getQualifiedName());
				}
			}
		}
		
		property.setLower(lower);
		property.setUpper(upper);
	}

	/*
	private void addSubsettedProperty(Class cemClass, Property property, String rmPropertyName) {
		Class rmClass = AMLUtil.referenceModelType(cemClass);
		if (rmClass != null) {
			Property rmProperty = rmClass.getOwnedAttribute(rmPropertyName, null);
			if (rmProperty != null) {
				property.getSubsettedProperties().add(rmProperty);
			}
		}
	}
	*/
	
}
