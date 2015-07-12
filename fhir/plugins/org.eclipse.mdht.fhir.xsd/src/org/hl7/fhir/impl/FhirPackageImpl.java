/**
 */
package org.hl7.fhir.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FhirPackage;

import org.hl7.fhir.util.FhirValidator;

import org.w3._1999.xhtml.XhtmlPackage;

import org.w3._1999.xhtml.impl.XhtmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FhirPackageImpl extends EPackageImpl implements FhirPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "fhir.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administrativeGenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceCertaintyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceCriticalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceSeverityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allergyIntoleranceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectLifecycleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventParticipantNetworkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditEventSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backboneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingStrengthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodySiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleSearchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleTransactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleTransactionResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bundleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanActivityStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carePlanStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimDiagnosisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimMissingTeethEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimPayeeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimProsthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAddItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAdjudicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAdjudication1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAdjudication2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAdjudication3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseAdjudication4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseCoverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseDetail1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimResponseSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimSubDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalBaseGenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionFindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionInvestigationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionRuledOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalImpressionStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeableConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionAttestationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionAttesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapDependsOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapEquivalenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptMapMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionClinicalStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionDueToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOccurredFollowingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceCertificateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceEventModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceInteraction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceMessagingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceResourceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceRestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceSearchParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceSoftwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceUseContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintSeverityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractActor1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractFriendlyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractLegalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractSignerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractValuedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractValuedItem1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contraindicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contraindicationMitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAbsentReasonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataElementSpecificityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daysOfWeekEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceComponentProductionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCalibrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCalibrationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCalibrationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceMetricOperationalStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseRequestPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceUseStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticOrderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticReportStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalMediaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentManifestRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceRelatesToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentReferenceStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionSlicingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eligibilityResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterHospitalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterLocationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterParticipantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encounterStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareCareTeamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass episodeOfCareStatusHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTimingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass explanationOfBenefitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familyMemberHistoryConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fhirDefinedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flagStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceAvailableTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceNotAvailableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthcareServiceServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpVerbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityAssuranceLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingModalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionFramesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionSeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingObjectSelectionStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudyInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagingStudySeriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationExplanationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationDateCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationRecommendationRecommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immunizationVaccinationProtocolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceAvailabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueSeverityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maritalStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measmntPrincipleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationDosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationAdministrationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationBatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseDosageInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationDispenseSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescriptionDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescriptionDosageInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescriptionStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationPrescriptionSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementDosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationStatementStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderDestinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageHeaderSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSignificanceCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemIdentifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingSystemUniqueIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderEnteralFormulaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderNutrientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderOralDietEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderSupplementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nutritionOrderTextureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationReferenceRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationRelatedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationReliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationDefinitionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationKindEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationOutcomeIssueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationParameterUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderWhenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantRequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participationStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientAnimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientCommunicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentNoticeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentReconciliationNoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerPractitionerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass practitionerQualificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureBodySiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedurePerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRelatedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestBodySiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestPriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureRequestStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processRequestItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processResponseNotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenanceEntityRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityComparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireAnswersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireAnswersAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireAnswersGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireAnswersQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireAnswersStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionnaireStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referralStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedPersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remittanceOutcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceVersionPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restfulConformanceModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskAssessmentPredictionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledDataDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchEntryModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParameterContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchParamTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slicingRulesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specimenTreatmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionDifferentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureDefinitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionChannelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptionStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceIngredientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyDispenseStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplyStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRestfulInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingRepeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRestfulInteractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitsOfTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetComposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetContainsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetDefineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetDesignationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetExpansionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionEyesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visionPrescriptionDispenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionListListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressUseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrativeGenderListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCertaintyListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceCriticalityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceSeverityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum allergyIntoleranceTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum answerFormatListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appointmentStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventActionListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventObjectLifecycleListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventObjectRoleListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventObjectTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventOutcomeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum auditEventParticipantNetworkTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bindingStrengthListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bundleTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanActivityStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePlanStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalImpressionStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationRequestStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionAttestationModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compositionStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conceptMapEquivalenceListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionClinicalStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceEventModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conformanceResourceStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintSeverityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointSystemListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contactPointUseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataAbsentReasonListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataElementSpecificityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daysOfWeekListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationStateListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCalibrationTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricColorListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceMetricOperationalStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceUseRequestPriorityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceUseRequestStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticOrderPriorityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticOrderStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosticReportStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitalMediaTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentReferenceStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentRelationshipTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterClassListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterLocationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encounterStateListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum episodeOfCareStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTimingListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum extensionContextListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fhirDefinedTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterOperatorListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum goalStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identifierUseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityAssuranceLevelListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum imagingModalityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceAvailabilityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueSeverityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measmntPrincipleListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationAdministrationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationDispenseStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationKindListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationPrescriptionStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicationStatementStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageEventListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSignificanceCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameUseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemIdentifierTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namingSystemTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum narrativeStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noteTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nutritionOrderStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationRelationshipTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationReliabilityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum observationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationKindListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationParameterUseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantRequiredListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participantStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum participationStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRelationshipTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRequestPriorityListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureRequestStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum procedureStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyRepresentationListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provenanceEntityRoleListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantityComparatorListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireAnswersStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum questionnaireStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referralStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum remittanceOutcomeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceVersionPolicyListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum responseTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum restfulConformanceModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchEntryModeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum searchParamTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slicingRulesListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slotStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialValuesListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structureDefinitionTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionChannelTypeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subscriptionStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyDispenseStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum supplyStatusListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemRestfulInteractionListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeRestfulInteractionListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsOfTimeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum useListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionBaseListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visionEyesListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionListListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType addressUseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType administrativeGenderListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aggregationModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceCategoryListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceCertaintyListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceCriticalityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceSeverityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType allergyIntoleranceTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType answerFormatListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType appointmentStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventActionListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventObjectLifecycleListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventObjectRoleListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventObjectTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventOutcomeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType auditEventParticipantNetworkTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType base64BinaryPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bindingStrengthListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanPrimitiveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bundleTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType carePlanActivityCategoryListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType carePlanActivityStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType carePlanStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType claimTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clinicalBaseGenderListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType clinicalImpressionStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType communicationRequestStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType communicationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compositionAttestationModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compositionStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conceptMapEquivalenceListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conditionClinicalStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conformanceEventModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conformanceResourceStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType conformanceUseContextListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintSeverityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contactPointSystemListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contactPointUseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataAbsentReasonListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataElementSpecificityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datePrimitiveBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimePrimitiveBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType daysOfWeekListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceMetricCalibrationStateListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceMetricCalibrationTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceMetricCategoryListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceMetricColorListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceMetricOperationalStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceUseRequestPriorityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType deviceUseRequestStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticOrderPriorityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticOrderStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType diagnosticReportStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType digitalMediaTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentReferenceStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType documentRelationshipTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encounterClassListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encounterLocationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encounterStateListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType episodeOfCareStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventTimingListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType extensionContextListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fhirDefinedTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType filterOperatorListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flagStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType goalStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType groupTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpVerbListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierUseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identityAssuranceLevelListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imagingModalityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instanceAvailabilityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType instantPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerPrimitiveObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType issueSeverityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linkTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locationModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maritalStatusListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType measmntPrincipleListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medicationAdministrationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medicationDispenseStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medicationKindListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medicationPrescriptionStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType medicationStatementStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageEventListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType messageSignificanceCategoryListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modalityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nameUseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namingSystemIdentifierTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType namingSystemTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType narrativeStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType noteTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nutritionOrderStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType observationRelationshipTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType observationReliabilityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType observationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oidPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationKindListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType operationParameterUseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType participantRequiredListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType participantStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType participationStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType procedureRelationshipTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType procedureRequestPriorityListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType procedureRequestStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType procedureStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyRepresentationListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType provenanceEntityRoleListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType quantityComparatorListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType questionnaireAnswersStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType questionnaireStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referralStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType remittanceOutcomeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceVersionPolicyListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType responseTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType restfulConformanceModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sampledDataDataTypePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType searchEntryModeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType searchParamTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType slicingRulesListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType slotStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType specialValuesListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType structureDefinitionTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subscriptionChannelTypeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subscriptionStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supplyDispenseStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType supplyStatusListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemRestfulInteractionListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timePrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeRestfulInteractionListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsOfTimeListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unsignedIntPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType useListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidPrimitiveEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visionBaseListObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType visionEyesListObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.hl7.fhir.FhirPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FhirPackageImpl() {
		super(eNS_URI, FhirFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FhirPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static FhirPackage init() {
		if (isInited) return (FhirPackage)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI);

		// Obtain or create and register package
		FhirPackageImpl theFhirPackage = (FhirPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FhirPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FhirPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) instanceof XhtmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) : XhtmlPackage.eINSTANCE);

		// Load packages
		theFhirPackage.loadPackage();
		theXhtmlPackage.loadPackage();

		// Fix loaded packages
		theFhirPackage.fixPackageContents();
		theXhtmlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFhirPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FhirValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFhirPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FhirPackage.eNS_URI, theFhirPackage);
		return theFhirPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionList() {
		if (actionListEClass == null) {
			actionListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(0);
		}
		return actionListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionList_Value() {
        return (EAttribute)getActionList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		if (addressEClass == null) {
			addressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(3);
		}
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Use() {
        return (EReference)getAddress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Text() {
        return (EReference)getAddress().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Line() {
        return (EReference)getAddress().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_City() {
        return (EReference)getAddress().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_State() {
        return (EReference)getAddress().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_PostalCode() {
        return (EReference)getAddress().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Country() {
        return (EReference)getAddress().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddress_Period() {
        return (EReference)getAddress().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressUse() {
		if (addressUseEClass == null) {
			addressUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(4);
		}
		return addressUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressUse_Value() {
        return (EAttribute)getAddressUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrativeGender() {
		if (administrativeGenderEClass == null) {
			administrativeGenderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(7);
		}
		return administrativeGenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdministrativeGender_Value() {
        return (EAttribute)getAdministrativeGender().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAge() {
		if (ageEClass == null) {
			ageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(10);
		}
		return ageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationMode() {
		if (aggregationModeEClass == null) {
			aggregationModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(11);
		}
		return aggregationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationMode_Value() {
        return (EAttribute)getAggregationMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntolerance() {
		if (allergyIntoleranceEClass == null) {
			allergyIntoleranceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(14);
		}
		return allergyIntoleranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Identifier() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_RecordedDate() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Recorder() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Patient() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Reporter() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Substance() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Status() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Criticality() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Type() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Category() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_LastOccurence() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Comment() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntolerance_Event() {
        return (EReference)getAllergyIntolerance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceCategory() {
		if (allergyIntoleranceCategoryEClass == null) {
			allergyIntoleranceCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(15);
		}
		return allergyIntoleranceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceCategory_Value() {
        return (EAttribute)getAllergyIntoleranceCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceCertainty() {
		if (allergyIntoleranceCertaintyEClass == null) {
			allergyIntoleranceCertaintyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(18);
		}
		return allergyIntoleranceCertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceCertainty_Value() {
        return (EAttribute)getAllergyIntoleranceCertainty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceCriticality() {
		if (allergyIntoleranceCriticalityEClass == null) {
			allergyIntoleranceCriticalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(21);
		}
		return allergyIntoleranceCriticalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceCriticality_Value() {
        return (EAttribute)getAllergyIntoleranceCriticality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceEvent() {
		if (allergyIntoleranceEventEClass == null) {
			allergyIntoleranceEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(24);
		}
		return allergyIntoleranceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Substance() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Certainty() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Manifestation() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Description() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Onset() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Duration() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Severity() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_ExposureRoute() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllergyIntoleranceEvent_Comment() {
        return (EReference)getAllergyIntoleranceEvent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceSeverity() {
		if (allergyIntoleranceSeverityEClass == null) {
			allergyIntoleranceSeverityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(25);
		}
		return allergyIntoleranceSeverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceSeverity_Value() {
        return (EAttribute)getAllergyIntoleranceSeverity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceStatus() {
		if (allergyIntoleranceStatusEClass == null) {
			allergyIntoleranceStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(28);
		}
		return allergyIntoleranceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceStatus_Value() {
        return (EAttribute)getAllergyIntoleranceStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllergyIntoleranceType() {
		if (allergyIntoleranceTypeEClass == null) {
			allergyIntoleranceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(31);
		}
		return allergyIntoleranceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAllergyIntoleranceType_Value() {
        return (EAttribute)getAllergyIntoleranceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswerFormat() {
		if (answerFormatEClass == null) {
			answerFormatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(34);
		}
		return answerFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswerFormat_Value() {
        return (EAttribute)getAnswerFormat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointment() {
		if (appointmentEClass == null) {
			appointmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(37);
		}
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Identifier() {
        return (EReference)getAppointment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Status() {
        return (EReference)getAppointment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Type() {
        return (EReference)getAppointment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Reason() {
        return (EReference)getAppointment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Priority() {
        return (EReference)getAppointment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Description() {
        return (EReference)getAppointment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Start() {
        return (EReference)getAppointment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_End() {
        return (EReference)getAppointment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Slot() {
        return (EReference)getAppointment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Comment() {
        return (EReference)getAppointment().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Order() {
        return (EReference)getAppointment().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointment_Participant() {
        return (EReference)getAppointment().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentParticipant() {
		if (appointmentParticipantEClass == null) {
			appointmentParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(38);
		}
		return appointmentParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Type() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Actor() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Required() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentParticipant_Status() {
        return (EReference)getAppointmentParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentResponse() {
		if (appointmentResponseEClass == null) {
			appointmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(39);
		}
		return appointmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Identifier() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Appointment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantType() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Actor() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_ParticipantStatus() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Comment() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_Start() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppointmentResponse_End() {
        return (EReference)getAppointmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppointmentStatus() {
		if (appointmentStatusEClass == null) {
			appointmentStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(40);
		}
		return appointmentStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppointmentStatus_Value() {
        return (EAttribute)getAppointmentStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachment() {
		if (attachmentEClass == null) {
			attachmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(43);
		}
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_ContentType() {
        return (EReference)getAttachment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Language() {
        return (EReference)getAttachment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Data() {
        return (EReference)getAttachment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Url() {
        return (EReference)getAttachment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Size() {
        return (EReference)getAttachment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Hash() {
        return (EReference)getAttachment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Title() {
        return (EReference)getAttachment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttachment_Creation() {
        return (EReference)getAttachment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEvent() {
		if (auditEventEClass == null) {
			auditEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(44);
		}
		return auditEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Event() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Participant() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Source() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEvent_Object() {
        return (EReference)getAuditEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventAction() {
		if (auditEventActionEClass == null) {
			auditEventActionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(45);
		}
		return auditEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventAction_Value() {
        return (EAttribute)getAuditEventAction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventDetail() {
		if (auditEventDetailEClass == null) {
			auditEventDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(48);
		}
		return auditEventDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventDetail_Type() {
        return (EReference)getAuditEventDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventDetail_Value() {
        return (EReference)getAuditEventDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventEvent() {
		if (auditEventEventEClass == null) {
			auditEventEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(49);
		}
		return auditEventEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Type() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Subtype() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Action() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_DateTime() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_Outcome() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_OutcomeDesc() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventEvent_PurposeOfEvent() {
        return (EReference)getAuditEventEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventNetwork() {
		if (auditEventNetworkEClass == null) {
			auditEventNetworkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(50);
		}
		return auditEventNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventNetwork_Identifier() {
        return (EReference)getAuditEventNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventNetwork_Type() {
        return (EReference)getAuditEventNetwork().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObject() {
		if (auditEventObjectEClass == null) {
			auditEventObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(51);
		}
		return auditEventObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Identifier() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Reference() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Type() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Role() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Lifecycle() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Sensitivity() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Name() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Description() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Query() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventObject_Detail() {
        return (EReference)getAuditEventObject().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObjectLifecycle() {
		if (auditEventObjectLifecycleEClass == null) {
			auditEventObjectLifecycleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(52);
		}
		return auditEventObjectLifecycleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventObjectLifecycle_Value() {
        return (EAttribute)getAuditEventObjectLifecycle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObjectRole() {
		if (auditEventObjectRoleEClass == null) {
			auditEventObjectRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(55);
		}
		return auditEventObjectRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventObjectRole_Value() {
        return (EAttribute)getAuditEventObjectRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventObjectType() {
		if (auditEventObjectTypeEClass == null) {
			auditEventObjectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(58);
		}
		return auditEventObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventObjectType_Value() {
        return (EAttribute)getAuditEventObjectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventOutcome() {
		if (auditEventOutcomeEClass == null) {
			auditEventOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(61);
		}
		return auditEventOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventOutcome_Value() {
        return (EAttribute)getAuditEventOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventParticipant() {
		if (auditEventParticipantEClass == null) {
			auditEventParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(64);
		}
		return auditEventParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Role() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Reference() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_UserId() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_AltId() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Name() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Requestor() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Location() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Policy() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Media() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_Network() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventParticipant_PurposeOfUse() {
        return (EReference)getAuditEventParticipant().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventParticipantNetworkType() {
		if (auditEventParticipantNetworkTypeEClass == null) {
			auditEventParticipantNetworkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(65);
		}
		return auditEventParticipantNetworkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuditEventParticipantNetworkType_Value() {
        return (EAttribute)getAuditEventParticipantNetworkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditEventSource() {
		if (auditEventSourceEClass == null) {
			auditEventSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(68);
		}
		return auditEventSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Site() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Identifier() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditEventSource_Type() {
        return (EReference)getAuditEventSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackboneElement() {
		if (backboneElementEClass == null) {
			backboneElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(69);
		}
		return backboneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackboneElement_ModifierExtension() {
        return (EReference)getBackboneElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBase64Binary() {
		if (base64BinaryEClass == null) {
			base64BinaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(70);
		}
		return base64BinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBase64Binary_Value() {
        return (EAttribute)getBase64Binary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasic() {
		if (basicEClass == null) {
			basicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(72);
		}
		return basicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Identifier() {
        return (EReference)getBasic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Code() {
        return (EReference)getBasic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Subject() {
        return (EReference)getBasic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Author() {
        return (EReference)getBasic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasic_Created() {
        return (EReference)getBasic().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinary() {
		if (binaryEClass == null) {
			binaryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(73);
		}
		return binaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_ContentType() {
        return (EReference)getBinary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinary_Content() {
        return (EReference)getBinary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingStrength() {
		if (bindingStrengthEClass == null) {
			bindingStrengthEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(74);
		}
		return bindingStrengthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingStrength_Value() {
        return (EAttribute)getBindingStrength().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodySite() {
		if (bodySiteEClass == null) {
			bodySiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(77);
		}
		return bodySiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Patient() {
        return (EReference)getBodySite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Identifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Code() {
        return (EReference)getBodySite().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Modifier() {
        return (EReference)getBodySite().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Description() {
        return (EReference)getBodySite().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodySite_Image() {
        return (EReference)getBodySite().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoolean() {
		if (booleanEClass == null) {
			booleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(78);
		}
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoolean_Value() {
        return (EAttribute)getBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundle() {
		if (bundleEClass == null) {
			bundleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(81);
		}
		return bundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Type() {
        return (EReference)getBundle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Base() {
        return (EReference)getBundle().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Total() {
        return (EReference)getBundle().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Link() {
        return (EReference)getBundle().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Entry() {
        return (EReference)getBundle().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundle_Signature() {
        return (EReference)getBundle().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleEntry() {
		if (bundleEntryEClass == null) {
			bundleEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(82);
		}
		return bundleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Base() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Link() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Resource() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Search() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_Transaction() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleEntry_TransactionResponse() {
        return (EReference)getBundleEntry().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleLink() {
		if (bundleLinkEClass == null) {
			bundleLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(83);
		}
		return bundleLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Relation() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleLink_Url() {
        return (EReference)getBundleLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleSearch() {
		if (bundleSearchEClass == null) {
			bundleSearchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(84);
		}
		return bundleSearchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleSearch_Mode() {
        return (EReference)getBundleSearch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleSearch_Score() {
        return (EReference)getBundleSearch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleTransaction() {
		if (bundleTransactionEClass == null) {
			bundleTransactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(85);
		}
		return bundleTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_Method() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_Url() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_IfNoneMatch() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_IfMatch() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_IfModifiedSince() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransaction_IfNoneExist() {
        return (EReference)getBundleTransaction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleTransactionResponse() {
		if (bundleTransactionResponseEClass == null) {
			bundleTransactionResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(86);
		}
		return bundleTransactionResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransactionResponse_Status() {
        return (EReference)getBundleTransactionResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransactionResponse_Location() {
        return (EReference)getBundleTransactionResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransactionResponse_Etag() {
        return (EReference)getBundleTransactionResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBundleTransactionResponse_LastModified() {
        return (EReference)getBundleTransactionResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBundleType() {
		if (bundleTypeEClass == null) {
			bundleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(87);
		}
		return bundleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBundleType_Value() {
        return (EAttribute)getBundleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlan() {
		if (carePlanEClass == null) {
			carePlanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(90);
		}
		return carePlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Identifier() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Patient() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Status() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Period() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Author() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Modified() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Category() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Concern() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Support() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Participant() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Goal() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Activity() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlan_Notes() {
        return (EReference)getCarePlan().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivity() {
		if (carePlanActivityEClass == null) {
			carePlanActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(91);
		}
		return carePlanActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_ActionResulting() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Notes() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Reference() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanActivity_Detail() {
        return (EReference)getCarePlanActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivityCategory() {
		if (carePlanActivityCategoryEClass == null) {
			carePlanActivityCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(92);
		}
		return carePlanActivityCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarePlanActivityCategory_Value() {
        return (EAttribute)getCarePlanActivityCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanActivityStatus() {
		if (carePlanActivityStatusEClass == null) {
			carePlanActivityStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(95);
		}
		return carePlanActivityStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarePlanActivityStatus_Value() {
        return (EAttribute)getCarePlanActivityStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanDetail() {
		if (carePlanDetailEClass == null) {
			carePlanDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(98);
		}
		return carePlanDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Category() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Code() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_ReasonCodeableConcept() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_ReasonReference() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Goal() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Status() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_StatusReason() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Prohibited() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_ScheduledTiming() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_ScheduledPeriod() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_ScheduledString() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Location() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Performer() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Product() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_DailyAmount() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Quantity() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanDetail_Note() {
        return (EReference)getCarePlanDetail().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanParticipant() {
		if (carePlanParticipantEClass == null) {
			carePlanParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(99);
		}
		return carePlanParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanParticipant_Role() {
        return (EReference)getCarePlanParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCarePlanParticipant_Member() {
        return (EReference)getCarePlanParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCarePlanStatus() {
		if (carePlanStatusEClass == null) {
			carePlanStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(100);
		}
		return carePlanStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCarePlanStatus_Value() {
        return (EAttribute)getCarePlanStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		if (claimEClass == null) {
			claimEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(103);
		}
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Type() {
        return (EReference)getClaim().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Identifier() {
        return (EReference)getClaim().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Ruleset() {
        return (EReference)getClaim().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_OriginalRuleset() {
        return (EReference)getClaim().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Created() {
        return (EReference)getClaim().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Target() {
        return (EReference)getClaim().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Provider() {
        return (EReference)getClaim().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Organization() {
        return (EReference)getClaim().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Use() {
        return (EReference)getClaim().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Priority() {
        return (EReference)getClaim().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_FundsReserve() {
        return (EReference)getClaim().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Enterer() {
        return (EReference)getClaim().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Facility() {
        return (EReference)getClaim().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Prescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_OriginalPrescription() {
        return (EReference)getClaim().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Payee() {
        return (EReference)getClaim().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Referral() {
        return (EReference)getClaim().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Diagnosis() {
        return (EReference)getClaim().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Condition() {
        return (EReference)getClaim().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Patient() {
        return (EReference)getClaim().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Coverage() {
        return (EReference)getClaim().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Exception() {
        return (EReference)getClaim().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_School() {
        return (EReference)getClaim().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Accident() {
        return (EReference)getClaim().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_AccidentType() {
        return (EReference)getClaim().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_InterventionException() {
        return (EReference)getClaim().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_Item() {
        return (EReference)getClaim().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_AdditionalMaterials() {
        return (EReference)getClaim().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_MissingTeeth() {
        return (EReference)getClaim().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimCoverage() {
		if (claimCoverageEClass == null) {
			claimCoverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(104);
		}
		return claimCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Sequence() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Focal() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Coverage() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_BusinessArrangement() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_Relationship() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_PreAuthRef() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_ClaimResponse() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimCoverage_OriginalRuleset() {
        return (EReference)getClaimCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimDetail() {
		if (claimDetailEClass == null) {
			claimDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(105);
		}
		return claimDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Sequence() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Type() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Service() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Quantity() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_UnitPrice() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Factor() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Points() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Net() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_Udi() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDetail_SubDetail() {
        return (EReference)getClaimDetail().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimDiagnosis() {
		if (claimDiagnosisEClass == null) {
			claimDiagnosisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(106);
		}
		return claimDiagnosisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Sequence() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimDiagnosis_Diagnosis() {
        return (EReference)getClaimDiagnosis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimItem() {
		if (claimItemEClass == null) {
			claimItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(107);
		}
		return claimItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Sequence() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Type() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Provider() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_DiagnosisLinkId() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Service() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_ServiceDate() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Quantity() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_UnitPrice() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Factor() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Points() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Net() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Udi() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_BodySite() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_SubSite() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Modifier() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Detail() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimItem_Prosthesis() {
        return (EReference)getClaimItem().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimMissingTeeth() {
		if (claimMissingTeethEClass == null) {
			claimMissingTeethEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(108);
		}
		return claimMissingTeethEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_Tooth() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_Reason() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimMissingTeeth_ExtractionDate() {
        return (EReference)getClaimMissingTeeth().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimPayee() {
		if (claimPayeeEClass == null) {
			claimPayeeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(109);
		}
		return claimPayeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Type() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Provider() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Organization() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimPayee_Person() {
        return (EReference)getClaimPayee().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimProsthesis() {
		if (claimProsthesisEClass == null) {
			claimProsthesisEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(110);
		}
		return claimProsthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProsthesis_Initial() {
        return (EReference)getClaimProsthesis().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProsthesis_PriorDate() {
        return (EReference)getClaimProsthesis().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimProsthesis_PriorMaterial() {
        return (EReference)getClaimProsthesis().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponse() {
		if (claimResponseEClass == null) {
			claimResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(111);
		}
		return claimResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Identifier() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Request() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Ruleset() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_OriginalRuleset() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Created() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Organization() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestProvider() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_RequestOrganization() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Outcome() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Disposition() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PayeeType() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Item() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_AddItem() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Error() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalCost() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_UnallocDeductable() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_TotalBenefit() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAdjustment() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAdjustmentReason() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentDate() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentAmount() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_PaymentRef() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Reserved() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Form() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Note() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponse_Coverage() {
        return (EReference)getClaimResponse().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAddItem() {
		if (claimResponseAddItemEClass == null) {
			claimResponseAddItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(112);
		}
		return claimResponseAddItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_SequenceLinkId() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_Service() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_Fee() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_NoteNumberLinkId() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_Adjudication() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAddItem_Detail() {
        return (EReference)getClaimResponseAddItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAdjudication() {
		if (claimResponseAdjudicationEClass == null) {
			claimResponseAdjudicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(113);
		}
		return claimResponseAdjudicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication_Code() {
        return (EReference)getClaimResponseAdjudication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication_Amount() {
        return (EReference)getClaimResponseAdjudication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication_Value() {
        return (EReference)getClaimResponseAdjudication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAdjudication1() {
		if (claimResponseAdjudication1EClass == null) {
			claimResponseAdjudication1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(114);
		}
		return claimResponseAdjudication1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication1_Code() {
        return (EReference)getClaimResponseAdjudication1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication1_Amount() {
        return (EReference)getClaimResponseAdjudication1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication1_Value() {
        return (EReference)getClaimResponseAdjudication1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAdjudication2() {
		if (claimResponseAdjudication2EClass == null) {
			claimResponseAdjudication2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(115);
		}
		return claimResponseAdjudication2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication2_Code() {
        return (EReference)getClaimResponseAdjudication2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication2_Amount() {
        return (EReference)getClaimResponseAdjudication2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication2_Value() {
        return (EReference)getClaimResponseAdjudication2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAdjudication3() {
		if (claimResponseAdjudication3EClass == null) {
			claimResponseAdjudication3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(116);
		}
		return claimResponseAdjudication3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication3_Code() {
        return (EReference)getClaimResponseAdjudication3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication3_Amount() {
        return (EReference)getClaimResponseAdjudication3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication3_Value() {
        return (EReference)getClaimResponseAdjudication3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseAdjudication4() {
		if (claimResponseAdjudication4EClass == null) {
			claimResponseAdjudication4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(117);
		}
		return claimResponseAdjudication4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication4_Code() {
        return (EReference)getClaimResponseAdjudication4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication4_Amount() {
        return (EReference)getClaimResponseAdjudication4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseAdjudication4_Value() {
        return (EReference)getClaimResponseAdjudication4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseCoverage() {
		if (claimResponseCoverageEClass == null) {
			claimResponseCoverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(118);
		}
		return claimResponseCoverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Sequence() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Focal() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Coverage() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_BusinessArrangement() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_Relationship() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_PreAuthRef() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_ClaimResponse() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseCoverage_OriginalRuleset() {
        return (EReference)getClaimResponseCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseDetail() {
		if (claimResponseDetailEClass == null) {
			claimResponseDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(119);
		}
		return claimResponseDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail_SequenceLinkId() {
        return (EReference)getClaimResponseDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail_Adjudication() {
        return (EReference)getClaimResponseDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail_SubDetail() {
        return (EReference)getClaimResponseDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseDetail1() {
		if (claimResponseDetail1EClass == null) {
			claimResponseDetail1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(120);
		}
		return claimResponseDetail1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail1_Service() {
        return (EReference)getClaimResponseDetail1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail1_Fee() {
        return (EReference)getClaimResponseDetail1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseDetail1_Adjudication() {
        return (EReference)getClaimResponseDetail1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseError() {
		if (claimResponseErrorEClass == null) {
			claimResponseErrorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(121);
		}
		return claimResponseErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_SequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_DetailSequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_SubdetailSequenceLinkId() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseError_Code() {
        return (EReference)getClaimResponseError().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseItem() {
		if (claimResponseItemEClass == null) {
			claimResponseItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(122);
		}
		return claimResponseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_SequenceLinkId() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_NoteNumber() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_Adjudication() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseItem_Detail() {
        return (EReference)getClaimResponseItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseNote() {
		if (claimResponseNoteEClass == null) {
			claimResponseNoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(123);
		}
		return claimResponseNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Number() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Type() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseNote_Text() {
        return (EReference)getClaimResponseNote().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimResponseSubDetail() {
		if (claimResponseSubDetailEClass == null) {
			claimResponseSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(124);
		}
		return claimResponseSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseSubDetail_SequenceLinkId() {
        return (EReference)getClaimResponseSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimResponseSubDetail_Adjudication() {
        return (EReference)getClaimResponseSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimSubDetail() {
		if (claimSubDetailEClass == null) {
			claimSubDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(125);
		}
		return claimSubDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Sequence() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Type() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Service() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Quantity() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_UnitPrice() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Factor() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Points() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Net() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSubDetail_Udi() {
        return (EReference)getClaimSubDetail().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimType() {
		if (claimTypeEClass == null) {
			claimTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(126);
		}
		return claimTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimType_Value() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalBaseGender() {
		if (clinicalBaseGenderEClass == null) {
			clinicalBaseGenderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(129);
		}
		return clinicalBaseGenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalBaseGender_Value() {
        return (EAttribute)getClinicalBaseGender().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpression() {
		if (clinicalImpressionEClass == null) {
			clinicalImpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(131);
		}
		return clinicalImpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Patient() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Assessor() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Status() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Date() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Description() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Previous() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Problem() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_TriggerCodeableConcept() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_TriggerReference() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Investigations() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Protocol() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Summary() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Finding() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Resolved() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_RuledOut() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Prognosis() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Plan() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpression_Action() {
        return (EReference)getClinicalImpression().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionFinding() {
		if (clinicalImpressionFindingEClass == null) {
			clinicalImpressionFindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(132);
		}
		return clinicalImpressionFindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Item() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionFinding_Cause() {
        return (EReference)getClinicalImpressionFinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionInvestigations() {
		if (clinicalImpressionInvestigationsEClass == null) {
			clinicalImpressionInvestigationsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(133);
		}
		return clinicalImpressionInvestigationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigations_Code() {
        return (EReference)getClinicalImpressionInvestigations().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionInvestigations_Item() {
        return (EReference)getClinicalImpressionInvestigations().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionRuledOut() {
		if (clinicalImpressionRuledOutEClass == null) {
			clinicalImpressionRuledOutEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(134);
		}
		return clinicalImpressionRuledOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionRuledOut_Item() {
        return (EReference)getClinicalImpressionRuledOut().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalImpressionRuledOut_Reason() {
        return (EReference)getClinicalImpressionRuledOut().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalImpressionStatus() {
		if (clinicalImpressionStatusEClass == null) {
			clinicalImpressionStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(135);
		}
		return clinicalImpressionStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalImpressionStatus_Value() {
        return (EAttribute)getClinicalImpressionStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		if (codeEClass == null) {
			codeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(138);
		}
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCode_Value() {
        return (EAttribute)getCode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeableConcept() {
		if (codeableConceptEClass == null) {
			codeableConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(139);
		}
		return codeableConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeableConcept_Coding() {
        return (EReference)getCodeableConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeableConcept_Text() {
        return (EReference)getCodeableConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoding() {
		if (codingEClass == null) {
			codingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(141);
		}
		return codingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_System() {
        return (EReference)getCoding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Version() {
        return (EReference)getCoding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Code() {
        return (EReference)getCoding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Display() {
        return (EReference)getCoding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoding_Primary() {
        return (EReference)getCoding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunication() {
		if (communicationEClass == null) {
			communicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(142);
		}
		return communicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Identifier() {
        return (EReference)getCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Category() {
        return (EReference)getCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sender() {
        return (EReference)getCommunication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Recipient() {
        return (EReference)getCommunication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Payload() {
        return (EReference)getCommunication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Medium() {
        return (EReference)getCommunication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Status() {
        return (EReference)getCommunication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Encounter() {
        return (EReference)getCommunication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Sent() {
        return (EReference)getCommunication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Received() {
        return (EReference)getCommunication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Reason() {
        return (EReference)getCommunication().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunication_Subject() {
        return (EReference)getCommunication().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPayload() {
		if (communicationPayloadEClass == null) {
			communicationPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(143);
		}
		return communicationPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPayload_ContentString() {
        return (EReference)getCommunicationPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPayload_ContentAttachment() {
        return (EReference)getCommunicationPayload().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationPayload_ContentReference() {
        return (EReference)getCommunicationPayload().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequest() {
		if (communicationRequestEClass == null) {
			communicationRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(144);
		}
		return communicationRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Identifier() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Category() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Sender() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Recipient() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Payload() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Medium() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Requester() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Status() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Encounter() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_ScheduledTime() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Reason() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_OrderedOn() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Subject() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequest_Priority() {
        return (EReference)getCommunicationRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequestPayload() {
		if (communicationRequestPayloadEClass == null) {
			communicationRequestPayloadEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(145);
		}
		return communicationRequestPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequestPayload_ContentString() {
        return (EReference)getCommunicationRequestPayload().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequestPayload_ContentAttachment() {
        return (EReference)getCommunicationRequestPayload().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationRequestPayload_ContentReference() {
        return (EReference)getCommunicationRequestPayload().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationRequestStatus() {
		if (communicationRequestStatusEClass == null) {
			communicationRequestStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(146);
		}
		return communicationRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationRequestStatus_Value() {
        return (EAttribute)getCommunicationRequestStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationStatus() {
		if (communicationStatusEClass == null) {
			communicationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(149);
		}
		return communicationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationStatus_Value() {
        return (EAttribute)getCommunicationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		if (compositionEClass == null) {
			compositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(152);
		}
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Identifier() {
        return (EReference)getComposition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Date() {
        return (EReference)getComposition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Type() {
        return (EReference)getComposition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Class() {
        return (EReference)getComposition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Title() {
        return (EReference)getComposition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Status() {
        return (EReference)getComposition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Confidentiality() {
        return (EReference)getComposition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Subject() {
        return (EReference)getComposition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Author() {
        return (EReference)getComposition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Attester() {
        return (EReference)getComposition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Custodian() {
        return (EReference)getComposition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Event() {
        return (EReference)getComposition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Encounter() {
        return (EReference)getComposition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComposition_Section() {
        return (EReference)getComposition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionAttestationMode() {
		if (compositionAttestationModeEClass == null) {
			compositionAttestationModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(153);
		}
		return compositionAttestationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositionAttestationMode_Value() {
        return (EAttribute)getCompositionAttestationMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionAttester() {
		if (compositionAttesterEClass == null) {
			compositionAttesterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(156);
		}
		return compositionAttesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Mode() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Time() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionAttester_Party() {
        return (EReference)getCompositionAttester().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionEvent() {
		if (compositionEventEClass == null) {
			compositionEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(157);
		}
		return compositionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Code() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Period() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionEvent_Detail() {
        return (EReference)getCompositionEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionSection() {
		if (compositionSectionEClass == null) {
			compositionSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(158);
		}
		return compositionSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Title() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Code() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Content() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositionSection_Section() {
        return (EReference)getCompositionSection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositionStatus() {
		if (compositionStatusEClass == null) {
			compositionStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(159);
		}
		return compositionStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositionStatus_Value() {
        return (EAttribute)getCompositionStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMap() {
		if (conceptMapEClass == null) {
			conceptMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(162);
		}
		return conceptMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Url() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Identifier() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Version() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Name() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_UseContext() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Publisher() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Contact() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Description() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Requirements() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Copyright() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Status() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Experimental() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Date() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_SourceUri() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_SourceReference() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_TargetUri() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_TargetReference() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMap_Element() {
        return (EReference)getConceptMap().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapContact() {
		if (conceptMapContactEClass == null) {
			conceptMapContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(163);
		}
		return conceptMapContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapContact_Name() {
        return (EReference)getConceptMapContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapContact_Telecom() {
        return (EReference)getConceptMapContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapDependsOn() {
		if (conceptMapDependsOnEClass == null) {
			conceptMapDependsOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(164);
		}
		return conceptMapDependsOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapDependsOn_Element() {
        return (EReference)getConceptMapDependsOn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapDependsOn_CodeSystem() {
        return (EReference)getConceptMapDependsOn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapDependsOn_Code() {
        return (EReference)getConceptMapDependsOn().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapElement() {
		if (conceptMapElementEClass == null) {
			conceptMapElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(165);
		}
		return conceptMapElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapElement_CodeSystem() {
        return (EReference)getConceptMapElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapElement_Code() {
        return (EReference)getConceptMapElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapElement_DependsOn() {
        return (EReference)getConceptMapElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapElement_Map() {
        return (EReference)getConceptMapElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapEquivalence() {
		if (conceptMapEquivalenceEClass == null) {
			conceptMapEquivalenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(166);
		}
		return conceptMapEquivalenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConceptMapEquivalence_Value() {
        return (EAttribute)getConceptMapEquivalence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConceptMapMap() {
		if (conceptMapMapEClass == null) {
			conceptMapMapEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(169);
		}
		return conceptMapMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapMap_CodeSystem() {
        return (EReference)getConceptMapMap().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapMap_Code() {
        return (EReference)getConceptMapMap().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapMap_Equivalence() {
        return (EReference)getConceptMapMap().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapMap_Comments() {
        return (EReference)getConceptMapMap().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConceptMapMap_Product() {
        return (EReference)getConceptMapMap().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		if (conditionEClass == null) {
			conditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(170);
		}
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Identifier() {
        return (EReference)getCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Patient() {
        return (EReference)getCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Encounter() {
        return (EReference)getCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Asserter() {
        return (EReference)getCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_DateAsserted() {
        return (EReference)getCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Code() {
        return (EReference)getCondition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Category() {
        return (EReference)getCondition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_ClinicalStatus() {
        return (EReference)getCondition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Severity() {
        return (EReference)getCondition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OnsetDateTime() {
        return (EReference)getCondition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OnsetAge() {
        return (EReference)getCondition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OnsetPeriod() {
        return (EReference)getCondition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OnsetRange() {
        return (EReference)getCondition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OnsetString() {
        return (EReference)getCondition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementDate() {
        return (EReference)getCondition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementAge() {
        return (EReference)getCondition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementBoolean() {
        return (EReference)getCondition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementPeriod() {
        return (EReference)getCondition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementRange() {
        return (EReference)getCondition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_AbatementString() {
        return (EReference)getCondition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Stage() {
        return (EReference)getCondition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Evidence() {
        return (EReference)getCondition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Location() {
        return (EReference)getCondition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_DueTo() {
        return (EReference)getCondition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_OccurredFollowing() {
        return (EReference)getCondition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Notes() {
        return (EReference)getCondition().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionClinicalStatus() {
		if (conditionClinicalStatusEClass == null) {
			conditionClinicalStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(171);
		}
		return conditionClinicalStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionClinicalStatus_Value() {
        return (EAttribute)getConditionClinicalStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionDueTo() {
		if (conditionDueToEClass == null) {
			conditionDueToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(174);
		}
		return conditionDueToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionDueTo_Code() {
        return (EReference)getConditionDueTo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionDueTo_Target() {
        return (EReference)getConditionDueTo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionEvidence() {
		if (conditionEvidenceEClass == null) {
			conditionEvidenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(175);
		}
		return conditionEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Code() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionEvidence_Detail() {
        return (EReference)getConditionEvidence().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionLocation() {
		if (conditionLocationEClass == null) {
			conditionLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(176);
		}
		return conditionLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionLocation_SiteCodeableConcept() {
        return (EReference)getConditionLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionLocation_SiteReference() {
        return (EReference)getConditionLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOccurredFollowing() {
		if (conditionOccurredFollowingEClass == null) {
			conditionOccurredFollowingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(177);
		}
		return conditionOccurredFollowingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOccurredFollowing_Code() {
        return (EReference)getConditionOccurredFollowing().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOccurredFollowing_Target() {
        return (EReference)getConditionOccurredFollowing().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionStage() {
		if (conditionStageEClass == null) {
			conditionStageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(178);
		}
		return conditionStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Summary() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStage_Assessment() {
        return (EReference)getConditionStage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformance() {
		if (conformanceEClass == null) {
			conformanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(179);
		}
		return conformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Url() {
        return (EReference)getConformance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Version() {
        return (EReference)getConformance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Name() {
        return (EReference)getConformance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Publisher() {
        return (EReference)getConformance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Contact() {
        return (EReference)getConformance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Description() {
        return (EReference)getConformance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Requirements() {
        return (EReference)getConformance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Copyright() {
        return (EReference)getConformance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Status() {
        return (EReference)getConformance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Experimental() {
        return (EReference)getConformance().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Date() {
        return (EReference)getConformance().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Software() {
        return (EReference)getConformance().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Implementation() {
        return (EReference)getConformance().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_FhirVersion() {
        return (EReference)getConformance().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_AcceptUnknown() {
        return (EReference)getConformance().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Format() {
        return (EReference)getConformance().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Profile() {
        return (EReference)getConformance().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Rest() {
        return (EReference)getConformance().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Messaging() {
        return (EReference)getConformance().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformance_Document() {
        return (EReference)getConformance().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceCertificate() {
		if (conformanceCertificateEClass == null) {
			conformanceCertificateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(180);
		}
		return conformanceCertificateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceCertificate_Type() {
        return (EReference)getConformanceCertificate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceCertificate_Blob() {
        return (EReference)getConformanceCertificate().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceContact() {
		if (conformanceContactEClass == null) {
			conformanceContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(181);
		}
		return conformanceContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceContact_Name() {
        return (EReference)getConformanceContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceContact_Telecom() {
        return (EReference)getConformanceContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceDocument() {
		if (conformanceDocumentEClass == null) {
			conformanceDocumentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(182);
		}
		return conformanceDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Mode() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Documentation() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceDocument_Profile() {
        return (EReference)getConformanceDocument().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceEvent() {
		if (conformanceEventEClass == null) {
			conformanceEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(183);
		}
		return conformanceEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Code() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Category() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Mode() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Protocol() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Focus() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Request() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Response() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceEvent_Documentation() {
        return (EReference)getConformanceEvent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceEventMode() {
		if (conformanceEventModeEClass == null) {
			conformanceEventModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(184);
		}
		return conformanceEventModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceEventMode_Value() {
        return (EAttribute)getConformanceEventMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceImplementation() {
		if (conformanceImplementationEClass == null) {
			conformanceImplementationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(187);
		}
		return conformanceImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceImplementation_Description() {
        return (EReference)getConformanceImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceImplementation_Url() {
        return (EReference)getConformanceImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceInteraction() {
		if (conformanceInteractionEClass == null) {
			conformanceInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(188);
		}
		return conformanceInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceInteraction_Code() {
        return (EReference)getConformanceInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceInteraction_Documentation() {
        return (EReference)getConformanceInteraction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceInteraction1() {
		if (conformanceInteraction1EClass == null) {
			conformanceInteraction1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(189);
		}
		return conformanceInteraction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceInteraction1_Code() {
        return (EReference)getConformanceInteraction1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceInteraction1_Documentation() {
        return (EReference)getConformanceInteraction1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceMessaging() {
		if (conformanceMessagingEClass == null) {
			conformanceMessagingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(190);
		}
		return conformanceMessagingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Endpoint() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_ReliableCache() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Documentation() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceMessaging_Event() {
        return (EReference)getConformanceMessaging().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceOperation() {
		if (conformanceOperationEClass == null) {
			conformanceOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(191);
		}
		return conformanceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceOperation_Name() {
        return (EReference)getConformanceOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceOperation_Definition() {
        return (EReference)getConformanceOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceResource() {
		if (conformanceResourceEClass == null) {
			conformanceResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(192);
		}
		return conformanceResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_Type() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_Profile() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_Interaction() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_Versioning() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_ReadHistory() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_UpdateCreate() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_ConditionalCreate() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_ConditionalUpdate() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_ConditionalDelete() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_SearchInclude() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceResource_SearchParam() {
        return (EReference)getConformanceResource().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceResourceStatus() {
		if (conformanceResourceStatusEClass == null) {
			conformanceResourceStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(193);
		}
		return conformanceResourceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceResourceStatus_Value() {
        return (EAttribute)getConformanceResourceStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceRest() {
		if (conformanceRestEClass == null) {
			conformanceRestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(196);
		}
		return conformanceRestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Mode() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Documentation() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Security() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Resource() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Interaction() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Operation() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_DocumentMailbox() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceRest_Compartment() {
        return (EReference)getConformanceRest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceSearchParam() {
		if (conformanceSearchParamEClass == null) {
			conformanceSearchParamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(197);
		}
		return conformanceSearchParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Name() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Definition() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Type() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Documentation() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Target() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSearchParam_Chain() {
        return (EReference)getConformanceSearchParam().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceSecurity() {
		if (conformanceSecurityEClass == null) {
			conformanceSecurityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(198);
		}
		return conformanceSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSecurity_Cors() {
        return (EReference)getConformanceSecurity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSecurity_Service() {
        return (EReference)getConformanceSecurity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSecurity_Description() {
        return (EReference)getConformanceSecurity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSecurity_Certificate() {
        return (EReference)getConformanceSecurity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceSoftware() {
		if (conformanceSoftwareEClass == null) {
			conformanceSoftwareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(199);
		}
		return conformanceSoftwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_Name() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_Version() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConformanceSoftware_ReleaseDate() {
        return (EReference)getConformanceSoftware().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConformanceUseContext() {
		if (conformanceUseContextEClass == null) {
			conformanceUseContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(200);
		}
		return conformanceUseContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConformanceUseContext_Value() {
        return (EAttribute)getConformanceUseContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintSeverity() {
		if (constraintSeverityEClass == null) {
			constraintSeverityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(202);
		}
		return constraintSeverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintSeverity_Value() {
        return (EAttribute)getConstraintSeverity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactPoint() {
		if (contactPointEClass == null) {
			contactPointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(205);
		}
		return contactPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactPoint_System() {
        return (EReference)getContactPoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactPoint_Value() {
        return (EReference)getContactPoint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactPoint_Use() {
        return (EReference)getContactPoint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContactPoint_Period() {
        return (EReference)getContactPoint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactPointSystem() {
		if (contactPointSystemEClass == null) {
			contactPointSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(206);
		}
		return contactPointSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactPointSystem_Value() {
        return (EAttribute)getContactPointSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactPointUse() {
		if (contactPointUseEClass == null) {
			contactPointUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(209);
		}
		return contactPointUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactPointUse_Value() {
        return (EAttribute)getContactPointUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		if (contractEClass == null) {
			contractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(212);
		}
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Identifier() {
        return (EReference)getContract().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Issued() {
        return (EReference)getContract().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Applies() {
        return (EReference)getContract().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Subject() {
        return (EReference)getContract().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Authority() {
        return (EReference)getContract().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Domain() {
        return (EReference)getContract().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Type() {
        return (EReference)getContract().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_SubType() {
        return (EReference)getContract().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Action() {
        return (EReference)getContract().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ActionReason() {
        return (EReference)getContract().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Actor() {
        return (EReference)getContract().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_ValuedItem() {
        return (EReference)getContract().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Signer() {
        return (EReference)getContract().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Term() {
        return (EReference)getContract().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_BindingAttachment() {
        return (EReference)getContract().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_BindingReference() {
        return (EReference)getContract().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Friendly() {
        return (EReference)getContract().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Legal() {
        return (EReference)getContract().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_Rule() {
        return (EReference)getContract().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractActor() {
		if (contractActorEClass == null) {
			contractActorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(213);
		}
		return contractActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor_Entity() {
        return (EReference)getContractActor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor_Role() {
        return (EReference)getContractActor().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractActor1() {
		if (contractActor1EClass == null) {
			contractActor1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(214);
		}
		return contractActor1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor1_Entity() {
        return (EReference)getContractActor1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractActor1_Role() {
        return (EReference)getContractActor1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractFriendly() {
		if (contractFriendlyEClass == null) {
			contractFriendlyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(215);
		}
		return contractFriendlyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFriendly_ContentAttachment() {
        return (EReference)getContractFriendly().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractFriendly_ContentReference() {
        return (EReference)getContractFriendly().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractLegal() {
		if (contractLegalEClass == null) {
			contractLegalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(216);
		}
		return contractLegalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractLegal_ContentAttachment() {
        return (EReference)getContractLegal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractLegal_ContentReference() {
        return (EReference)getContractLegal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractRule() {
		if (contractRuleEClass == null) {
			contractRuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(217);
		}
		return contractRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractRule_ContentAttachment() {
        return (EReference)getContractRule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractRule_ContentReference() {
        return (EReference)getContractRule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractSigner() {
		if (contractSignerEClass == null) {
			contractSignerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(218);
		}
		return contractSignerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSigner_Type() {
        return (EReference)getContractSigner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSigner_Party() {
        return (EReference)getContractSigner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractSigner_Signature() {
        return (EReference)getContractSigner().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractTerm() {
		if (contractTermEClass == null) {
			contractTermEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(219);
		}
		return contractTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Identifier() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Issued() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Applies() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Type() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_SubType() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Subject() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Action() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ActionReason() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Actor() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Text() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_ValuedItem() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractTerm_Group() {
        return (EReference)getContractTerm().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractValuedItem() {
		if (contractValuedItemEClass == null) {
			contractValuedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(220);
		}
		return contractValuedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_EntityCodeableConcept() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_EntityReference() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Identifier() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_EffectiveTime() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Quantity() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_UnitPrice() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Factor() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Points() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem_Net() {
        return (EReference)getContractValuedItem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContractValuedItem1() {
		if (contractValuedItem1EClass == null) {
			contractValuedItem1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(221);
		}
		return contractValuedItem1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_EntityCodeableConcept() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_EntityReference() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_Identifier() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_EffectiveTime() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_Quantity() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_UnitPrice() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_Factor() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_Points() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContractValuedItem1_Net() {
        return (EReference)getContractValuedItem1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContraindication() {
		if (contraindicationEClass == null) {
			contraindicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(222);
		}
		return contraindicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Patient() {
        return (EReference)getContraindication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Category() {
        return (EReference)getContraindication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Severity() {
        return (EReference)getContraindication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Implicated() {
        return (EReference)getContraindication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Detail() {
        return (EReference)getContraindication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Date() {
        return (EReference)getContraindication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Author() {
        return (EReference)getContraindication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Identifier() {
        return (EReference)getContraindication().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Reference() {
        return (EReference)getContraindication().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindication_Mitigation() {
        return (EReference)getContraindication().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContraindicationMitigation() {
		if (contraindicationMitigationEClass == null) {
			contraindicationMitigationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(223);
		}
		return contraindicationMitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindicationMitigation_Action() {
        return (EReference)getContraindicationMitigation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindicationMitigation_Date() {
        return (EReference)getContraindicationMitigation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContraindicationMitigation_Author() {
        return (EReference)getContraindicationMitigation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCount() {
		if (countEClass == null) {
			countEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(224);
		}
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		if (coverageEClass == null) {
			coverageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(225);
		}
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Issuer() {
        return (EReference)getCoverage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Bin() {
        return (EReference)getCoverage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Period() {
        return (EReference)getCoverage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Type() {
        return (EReference)getCoverage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_SubscriberId() {
        return (EReference)getCoverage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Identifier() {
        return (EReference)getCoverage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Group() {
        return (EReference)getCoverage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Plan() {
        return (EReference)getCoverage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_SubPlan() {
        return (EReference)getCoverage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Dependent() {
        return (EReference)getCoverage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Sequence() {
        return (EReference)getCoverage().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Subscriber() {
        return (EReference)getCoverage().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Network() {
        return (EReference)getCoverage().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoverage_Contract() {
        return (EReference)getCoverage().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAbsentReason() {
		if (dataAbsentReasonEClass == null) {
			dataAbsentReasonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(226);
		}
		return dataAbsentReasonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataAbsentReason_Value() {
        return (EAttribute)getDataAbsentReason().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElement() {
		if (dataElementEClass == null) {
			dataElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(229);
		}
		return dataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Url() {
        return (EReference)getDataElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Identifier() {
        return (EReference)getDataElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Version() {
        return (EReference)getDataElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Name() {
        return (EReference)getDataElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_UseContext() {
        return (EReference)getDataElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Experimental() {
        return (EReference)getDataElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Status() {
        return (EReference)getDataElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Date() {
        return (EReference)getDataElement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Copyright() {
        return (EReference)getDataElement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Publisher() {
        return (EReference)getDataElement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Contact() {
        return (EReference)getDataElement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Specificity() {
        return (EReference)getDataElement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Mapping() {
        return (EReference)getDataElement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElement_Element() {
        return (EReference)getDataElement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementContact() {
		if (dataElementContactEClass == null) {
			dataElementContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(230);
		}
		return dataElementContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementContact_Name() {
        return (EReference)getDataElementContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementContact_Telecom() {
        return (EReference)getDataElementContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementMapping() {
		if (dataElementMappingEClass == null) {
			dataElementMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(231);
		}
		return dataElementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Identity() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Uri() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Name() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataElementMapping_Comments() {
        return (EReference)getDataElementMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataElementSpecificity() {
		if (dataElementSpecificityEClass == null) {
			dataElementSpecificityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(232);
		}
		return dataElementSpecificityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataElementSpecificity_Value() {
        return (EAttribute)getDataElementSpecificity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(235);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Value() {
        return (EAttribute)getDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDate() {
		if (dateEClass == null) {
			dateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(238);
		}
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_Value() {
        return (EAttribute)getDate().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTime() {
		if (dateTimeEClass == null) {
			dateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(241);
		}
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTime_Value() {
        return (EAttribute)getDateTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaysOfWeek() {
		if (daysOfWeekEClass == null) {
			daysOfWeekEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(244);
		}
		return daysOfWeekEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaysOfWeek_Value() {
        return (EAttribute)getDaysOfWeek().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimal() {
		if (decimalEClass == null) {
			decimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(247);
		}
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimal_Value() {
        return (EAttribute)getDecimal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		if (deviceEClass == null) {
			deviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(249);
		}
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Identifier() {
        return (EReference)getDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Type() {
        return (EReference)getDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Status() {
        return (EReference)getDevice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Manufacturer() {
        return (EReference)getDevice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Model() {
        return (EReference)getDevice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Version() {
        return (EReference)getDevice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_ManufactureDate() {
        return (EReference)getDevice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Expiry() {
        return (EReference)getDevice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Udi() {
        return (EReference)getDevice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_LotNumber() {
        return (EReference)getDevice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Owner() {
        return (EReference)getDevice().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Location() {
        return (EReference)getDevice().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Patient() {
        return (EReference)getDevice().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Contact() {
        return (EReference)getDevice().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Url() {
        return (EReference)getDevice().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponent() {
		if (deviceComponentEClass == null) {
			deviceComponentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(250);
		}
		return deviceComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Type() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Identifier() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LastSystemChange() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Source() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_Parent() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_OperationalStatus() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ParameterGroup() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_MeasurementPrinciple() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_ProductionSpecification() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponent_LanguageCode() {
        return (EReference)getDeviceComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceComponentProductionSpecification() {
		if (deviceComponentProductionSpecificationEClass == null) {
			deviceComponentProductionSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(251);
		}
		return deviceComponentProductionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_SpecType() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ComponentId() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceComponentProductionSpecification_ProductionSpec() {
        return (EReference)getDeviceComponentProductionSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetric() {
		if (deviceMetricEClass == null) {
			deviceMetricEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(252);
		}
		return deviceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Type() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Identifier() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Unit() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Source() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Parent() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_OperationalStatus() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Color() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Category() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_MeasurementPeriod() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetric_Calibration() {
        return (EReference)getDeviceMetric().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCalibration() {
		if (deviceMetricCalibrationEClass == null) {
			deviceMetricCalibrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(253);
		}
		return deviceMetricCalibrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Type() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_State() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceMetricCalibration_Time() {
        return (EReference)getDeviceMetricCalibration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCalibrationState() {
		if (deviceMetricCalibrationStateEClass == null) {
			deviceMetricCalibrationStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(254);
		}
		return deviceMetricCalibrationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceMetricCalibrationState_Value() {
        return (EAttribute)getDeviceMetricCalibrationState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCalibrationType() {
		if (deviceMetricCalibrationTypeEClass == null) {
			deviceMetricCalibrationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(257);
		}
		return deviceMetricCalibrationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceMetricCalibrationType_Value() {
        return (EAttribute)getDeviceMetricCalibrationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricCategory() {
		if (deviceMetricCategoryEClass == null) {
			deviceMetricCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(260);
		}
		return deviceMetricCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceMetricCategory_Value() {
        return (EAttribute)getDeviceMetricCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricColor() {
		if (deviceMetricColorEClass == null) {
			deviceMetricColorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(263);
		}
		return deviceMetricColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceMetricColor_Value() {
        return (EAttribute)getDeviceMetricColor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceMetricOperationalStatus() {
		if (deviceMetricOperationalStatusEClass == null) {
			deviceMetricOperationalStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(266);
		}
		return deviceMetricOperationalStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceMetricOperationalStatus_Value() {
        return (EAttribute)getDeviceMetricOperationalStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceStatus() {
		if (deviceStatusEClass == null) {
			deviceStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(269);
		}
		return deviceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceStatus_Value() {
        return (EAttribute)getDeviceStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseRequest() {
		if (deviceUseRequestEClass == null) {
			deviceUseRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(272);
		}
		return deviceUseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_BodySiteCodeableConcept() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_BodySiteReference() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Status() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Device() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Encounter() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Identifier() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Indication() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Notes() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_PrnReason() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_OrderedOn() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_RecordedOn() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Subject() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_TimingTiming() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_TimingPeriod() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_TimingDateTime() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseRequest_Priority() {
        return (EReference)getDeviceUseRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseRequestPriority() {
		if (deviceUseRequestPriorityEClass == null) {
			deviceUseRequestPriorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(273);
		}
		return deviceUseRequestPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceUseRequestPriority_Value() {
        return (EAttribute)getDeviceUseRequestPriority().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseRequestStatus() {
		if (deviceUseRequestStatusEClass == null) {
			deviceUseRequestStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(276);
		}
		return deviceUseRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceUseRequestStatus_Value() {
        return (EAttribute)getDeviceUseRequestStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceUseStatement() {
		if (deviceUseStatementEClass == null) {
			deviceUseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(279);
		}
		return deviceUseStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_BodySiteCodeableConcept() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_BodySiteReference() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_WhenUsed() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Device() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Identifier() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Indication() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Notes() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_RecordedOn() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_Subject() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_TimingTiming() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_TimingPeriod() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceUseStatement_TimingDateTime() {
        return (EReference)getDeviceUseStatement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrder() {
		if (diagnosticOrderEClass == null) {
			diagnosticOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(280);
		}
		return diagnosticOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Subject() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Orderer() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Identifier() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Encounter() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_ClinicalNotes() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_SupportingInformation() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Specimen() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Status() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Priority() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Event() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrder_Item() {
        return (EReference)getDiagnosticOrder().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderEvent() {
		if (diagnosticOrderEventEClass == null) {
			diagnosticOrderEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(281);
		}
		return diagnosticOrderEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Status() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Description() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_DateTime() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderEvent_Actor() {
        return (EReference)getDiagnosticOrderEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderItem() {
		if (diagnosticOrderItemEClass == null) {
			diagnosticOrderItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(282);
		}
		return diagnosticOrderItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Code() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Specimen() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_BodySiteCodeableConcept() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_BodySiteReference() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Status() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticOrderItem_Event() {
        return (EReference)getDiagnosticOrderItem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderPriority() {
		if (diagnosticOrderPriorityEClass == null) {
			diagnosticOrderPriorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(283);
		}
		return diagnosticOrderPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticOrderPriority_Value() {
        return (EAttribute)getDiagnosticOrderPriority().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticOrderStatus() {
		if (diagnosticOrderStatusEClass == null) {
			diagnosticOrderStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(286);
		}
		return diagnosticOrderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticOrderStatus_Value() {
        return (EAttribute)getDiagnosticOrderStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReport() {
		if (diagnosticReportEClass == null) {
			diagnosticReportEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(289);
		}
		return diagnosticReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Name() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Status() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Issued() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Subject() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Performer() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Encounter() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Identifier() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_RequestDetail() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_ServiceCategory() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_DiagnosticDateTime() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_DiagnosticPeriod() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Specimen() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Result() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_ImagingStudy() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Image() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_Conclusion() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_CodedDiagnosis() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReport_PresentedForm() {
        return (EReference)getDiagnosticReport().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReportImage() {
		if (diagnosticReportImageEClass == null) {
			diagnosticReportImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(290);
		}
		return diagnosticReportImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Comment() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnosticReportImage_Link() {
        return (EReference)getDiagnosticReportImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticReportStatus() {
		if (diagnosticReportStatusEClass == null) {
			diagnosticReportStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(291);
		}
		return diagnosticReportStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnosticReportStatus_Value() {
        return (EAttribute)getDiagnosticReportStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalMediaType() {
		if (digitalMediaTypeEClass == null) {
			digitalMediaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(294);
		}
		return digitalMediaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalMediaType_Value() {
        return (EAttribute)getDigitalMediaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistance() {
		if (distanceEClass == null) {
			distanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(297);
		}
		return distanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifest() {
		if (documentManifestEClass == null) {
			documentManifestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(298);
		}
		return documentManifestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_MasterIdentifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Identifier() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Subject() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Recipient() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Type() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Author() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Created() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Source() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Status() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Description() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Content() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifest_Related() {
        return (EReference)getDocumentManifest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestContent() {
		if (documentManifestContentEClass == null) {
			documentManifestContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(299);
		}
		return documentManifestContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestContent_PAttachment() {
        return (EReference)getDocumentManifestContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestContent_PReference() {
        return (EReference)getDocumentManifestContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentManifestRelated() {
		if (documentManifestRelatedEClass == null) {
			documentManifestRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(300);
		}
		return documentManifestRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Identifier() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentManifestRelated_Ref() {
        return (EReference)getDocumentManifestRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentMode() {
		if (documentModeEClass == null) {
			documentModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(301);
		}
		return documentModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentMode_Value() {
        return (EAttribute)getDocumentMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReference() {
		if (documentReferenceEClass == null) {
			documentReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(304);
		}
		return documentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_MasterIdentifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Identifier() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Subject() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Type() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Class() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Format() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Author() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Custodian() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Authenticator() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Created() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Indexed() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Status() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_DocStatus() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_RelatesTo() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Description() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Confidentiality() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Content() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReference_Context() {
        return (EReference)getDocumentReference().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceContext() {
		if (documentReferenceContextEClass == null) {
			documentReferenceContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(305);
		}
		return documentReferenceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Event() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Period() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_FacilityType() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_PracticeSetting() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_SourcePatientInfo() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceContext_Related() {
        return (EReference)getDocumentReferenceContext().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceRelated() {
		if (documentReferenceRelatedEClass == null) {
			documentReferenceRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(306);
		}
		return documentReferenceRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelated_Identifier() {
        return (EReference)getDocumentReferenceRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelated_Ref() {
        return (EReference)getDocumentReferenceRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceRelatesTo() {
		if (documentReferenceRelatesToEClass == null) {
			documentReferenceRelatesToEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(307);
		}
		return documentReferenceRelatesToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Code() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentReferenceRelatesTo_Target() {
        return (EReference)getDocumentReferenceRelatesTo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentReferenceStatus() {
		if (documentReferenceStatusEClass == null) {
			documentReferenceStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(308);
		}
		return documentReferenceStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentReferenceStatus_Value() {
        return (EAttribute)getDocumentReferenceStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRelationshipType() {
		if (documentRelationshipTypeEClass == null) {
			documentRelationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(311);
		}
		return documentRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRelationshipType_Value() {
        return (EAttribute)getDocumentRelationshipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(314);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AllergyIntolerance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Appointment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppointmentResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AuditEvent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Basic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Binary() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BodySite() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Bundle() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CarePlan() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Claim() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClaimResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClinicalImpression() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Communication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CommunicationRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Composition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConceptMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Condition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Conformance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Contract() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Contraindication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Coverage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DataElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Device() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceMetric() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceUseRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DeviceUseStatement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DiagnosticOrder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DiagnosticReport() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentManifest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DocumentReference() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EligibilityRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EligibilityResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Encounter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnrollmentRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EnrollmentResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EpisodeOfCare() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExplanationOfBenefit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FamilyMemberHistory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Flag() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Goal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Group() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HealthcareService() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImagingObjectSelection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImagingStudy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Immunization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ImmunizationRecommendation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_List() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Media() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Medication() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicationAdministration() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicationDispense() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicationPrescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MedicationStatement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageHeader() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NamingSystem() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NutritionOrder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Observation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OperationOutcome() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Order() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrderResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Organization() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Parameters() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Patient() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PaymentNotice() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PaymentReconciliation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Person() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Practitioner() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Procedure() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcedureRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcessRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ProcessResponse() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Provenance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Questionnaire() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QuestionnaireAnswers() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferralRequest() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RelatedPerson() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RiskAssessment() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schedule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SearchParameter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Slot() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Specimen() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StructureDefinition() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subscription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Substance() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Supply() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ValueSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_VisionPrescription() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainResource() {
		if (domainResourceEClass == null) {
			domainResourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(315);
		}
		return domainResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Text() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Contained() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_Extension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainResource_ModifierExtension() {
        return (EReference)getDomainResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		if (durationEClass == null) {
			durationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(316);
		}
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		if (elementEClass == null) {
			elementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(317);
		}
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Extension() {
        return (EReference)getElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Id() {
        return (EAttribute)getElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinition() {
		if (elementDefinitionEClass == null) {
			elementDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(318);
		}
		return elementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Path() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Representation() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Name() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Label() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Code() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Slicing() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Short() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Definition() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Comments() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Requirements() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Alias() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Min() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Max() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Type() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_NameReference() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueBoolean() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueInteger() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueDecimal() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueBase64Binary() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueInstant() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueString() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueUri() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueDate() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueDateTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueCode() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueOid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueUuid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueId() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueUnsignedInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValuePositiveInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueAttachment() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueIdentifier() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueCodeableConcept() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueCoding() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueQuantity() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueRange() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValuePeriod() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueRatio() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueReference() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueSampledData() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueSignature() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueHumanName() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueAddress() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueContactPoint() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueTiming() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_DefaultValueMeta() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_MeaningWhenMissing() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedBoolean() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedInteger() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedDecimal() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedBase64Binary() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedInstant() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedString() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedUri() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedDate() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedDateTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedCode() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedOid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedUuid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedId() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedUnsignedInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedPositiveInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedAttachment() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedIdentifier() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedCodeableConcept() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedCoding() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedQuantity() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedRange() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedPeriod() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedRatio() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedReference() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedSampledData() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedSignature() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedHumanName() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedAddress() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedContactPoint() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedTiming() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_FixedMeta() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternBoolean() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternInteger() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternDecimal() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternBase64Binary() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternInstant() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternString() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternUri() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternDate() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternDateTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternCode() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternOid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternUuid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternId() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternUnsignedInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternPositiveInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternAttachment() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternIdentifier() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternCodeableConcept() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternCoding() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternQuantity() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternRange() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternPeriod() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternRatio() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternReference() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternSampledData() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternSignature() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternHumanName() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternAddress() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternContactPoint() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternTiming() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_PatternMeta() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleBoolean() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleInteger() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleDecimal() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleBase64Binary() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleInstant() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleString() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleUri() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleDate() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleDateTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleTime() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleCode() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleOid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleUuid() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleId() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleUnsignedInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExamplePositiveInt() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleAttachment() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleIdentifier() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleCodeableConcept() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleCoding() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleQuantity() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleRange() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExamplePeriod() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleRatio() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleReference() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleSampledData() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleSignature() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleHumanName() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleAddress() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleContactPoint() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleTiming() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_ExampleMeta() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_MaxLength() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Condition() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Constraint() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_MustSupport() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_IsModifier() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_IsSummary() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Binding() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinition_Mapping() {
        return (EReference)getElementDefinition().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinitionBinding() {
		if (elementDefinitionBindingEClass == null) {
			elementDefinitionBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(319);
		}
		return elementDefinitionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_Name() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_Strength() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_Description() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetBoolean() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetInteger() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetDecimal() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetBase64Binary() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetInstant() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetString() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetUri() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetDate() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetDateTime() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetTime() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetCode() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetOid() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetUuid() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetId() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetUnsignedInt() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetPositiveInt() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetAttachment() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetIdentifier() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetCodeableConcept() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetCoding() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetQuantity() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetRange() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetPeriod() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetRatio() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetReference() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetSampledData() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetSignature() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetHumanName() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetAddress() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetContactPoint() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetTiming() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionBinding_ValueSetMeta() {
        return (EReference)getElementDefinitionBinding().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinitionConstraint() {
		if (elementDefinitionConstraintEClass == null) {
			elementDefinitionConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(320);
		}
		return elementDefinitionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionConstraint_Key() {
        return (EReference)getElementDefinitionConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionConstraint_Name() {
        return (EReference)getElementDefinitionConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionConstraint_Severity() {
        return (EReference)getElementDefinitionConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionConstraint_Human() {
        return (EReference)getElementDefinitionConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionConstraint_Xpath() {
        return (EReference)getElementDefinitionConstraint().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinitionMapping() {
		if (elementDefinitionMappingEClass == null) {
			elementDefinitionMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(321);
		}
		return elementDefinitionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionMapping_Identity() {
        return (EReference)getElementDefinitionMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionMapping_Language() {
        return (EReference)getElementDefinitionMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionMapping_Map() {
        return (EReference)getElementDefinitionMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinitionSlicing() {
		if (elementDefinitionSlicingEClass == null) {
			elementDefinitionSlicingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(322);
		}
		return elementDefinitionSlicingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionSlicing_Discriminator() {
        return (EReference)getElementDefinitionSlicing().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionSlicing_Description() {
        return (EReference)getElementDefinitionSlicing().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionSlicing_Ordered() {
        return (EReference)getElementDefinitionSlicing().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionSlicing_Rules() {
        return (EReference)getElementDefinitionSlicing().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementDefinitionType() {
		if (elementDefinitionTypeEClass == null) {
			elementDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(323);
		}
		return elementDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionType_Code() {
        return (EReference)getElementDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionType_Profile() {
        return (EReference)getElementDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementDefinitionType_Aggregation() {
        return (EReference)getElementDefinitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityRequest() {
		if (eligibilityRequestEClass == null) {
			eligibilityRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(324);
		}
		return eligibilityRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Identifier() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Ruleset() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_OriginalRuleset() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Created() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Target() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Provider() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityRequest_Organization() {
        return (EReference)getEligibilityRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEligibilityResponse() {
		if (eligibilityResponseEClass == null) {
			eligibilityResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(325);
		}
		return eligibilityResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Identifier() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Request() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Outcome() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Disposition() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Ruleset() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_OriginalRuleset() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Created() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_Organization() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestProvider() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEligibilityResponse_RequestOrganization() {
        return (EReference)getEligibilityResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounter() {
		if (encounterEClass == null) {
			encounterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(326);
		}
		return encounterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Identifier() {
        return (EReference)getEncounter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Status() {
        return (EReference)getEncounter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_StatusHistory() {
        return (EReference)getEncounter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Class() {
        return (EReference)getEncounter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Type() {
        return (EReference)getEncounter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Patient() {
        return (EReference)getEncounter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_EpisodeOfCare() {
        return (EReference)getEncounter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_IncomingReferralRequest() {
        return (EReference)getEncounter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Participant() {
        return (EReference)getEncounter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Fulfills() {
        return (EReference)getEncounter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Period() {
        return (EReference)getEncounter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Length() {
        return (EReference)getEncounter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Reason() {
        return (EReference)getEncounter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Indication() {
        return (EReference)getEncounter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Priority() {
        return (EReference)getEncounter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Hospitalization() {
        return (EReference)getEncounter().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_Location() {
        return (EReference)getEncounter().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_ServiceProvider() {
        return (EReference)getEncounter().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounter_PartOf() {
        return (EReference)getEncounter().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterClass() {
		if (encounterClassEClass == null) {
			encounterClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(327);
		}
		return encounterClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncounterClass_Value() {
        return (EAttribute)getEncounterClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterHospitalization() {
		if (encounterHospitalizationEClass == null) {
			encounterHospitalizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(330);
		}
		return encounterHospitalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_PreAdmissionIdentifier() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Origin() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_AdmitSource() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DietPreference() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialCourtesy() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_SpecialArrangement() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_Destination() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDisposition() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_DischargeDiagnosis() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterHospitalization_ReAdmission() {
        return (EReference)getEncounterHospitalization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocation() {
		if (encounterLocationEClass == null) {
			encounterLocationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(331);
		}
		return encounterLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Location() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Status() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterLocation_Period() {
        return (EReference)getEncounterLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterLocationStatus() {
		if (encounterLocationStatusEClass == null) {
			encounterLocationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(332);
		}
		return encounterLocationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncounterLocationStatus_Value() {
        return (EAttribute)getEncounterLocationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterParticipant() {
		if (encounterParticipantEClass == null) {
			encounterParticipantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(335);
		}
		return encounterParticipantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Type() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Period() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterParticipant_Individual() {
        return (EReference)getEncounterParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterState() {
		if (encounterStateEClass == null) {
			encounterStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(336);
		}
		return encounterStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncounterState_Value() {
        return (EAttribute)getEncounterState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncounterStatusHistory() {
		if (encounterStatusHistoryEClass == null) {
			encounterStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(339);
		}
		return encounterStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Status() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncounterStatusHistory_Period() {
        return (EReference)getEncounterStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentRequest() {
		if (enrollmentRequestEClass == null) {
			enrollmentRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(340);
		}
		return enrollmentRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Identifier() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Ruleset() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_OriginalRuleset() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Created() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Target() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Provider() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Organization() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Subject() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Coverage() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentRequest_Relationship() {
        return (EReference)getEnrollmentRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnrollmentResponse() {
		if (enrollmentResponseEClass == null) {
			enrollmentResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(341);
		}
		return enrollmentResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Identifier() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Request() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Outcome() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Disposition() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Ruleset() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_OriginalRuleset() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Created() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_Organization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestProvider() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnrollmentResponse_RequestOrganization() {
        return (EReference)getEnrollmentResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCare() {
		if (episodeOfCareEClass == null) {
			episodeOfCareEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(342);
		}
		return episodeOfCareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Identifier() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Status() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_StatusHistory() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Type() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Patient() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ManagingOrganization() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Period() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_Condition() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_ReferralRequest() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_CareManager() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCare_CareTeam() {
        return (EReference)getEpisodeOfCare().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareCareTeam() {
		if (episodeOfCareCareTeamEClass == null) {
			episodeOfCareCareTeamEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(343);
		}
		return episodeOfCareCareTeamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Member() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Role() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareCareTeam_Period() {
        return (EReference)getEpisodeOfCareCareTeam().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareStatus() {
		if (episodeOfCareStatusEClass == null) {
			episodeOfCareStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(344);
		}
		return episodeOfCareStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEpisodeOfCareStatus_Value() {
        return (EAttribute)getEpisodeOfCareStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpisodeOfCareStatusHistory() {
		if (episodeOfCareStatusHistoryEClass == null) {
			episodeOfCareStatusHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(345);
		}
		return episodeOfCareStatusHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Status() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpisodeOfCareStatusHistory_Period() {
        return (EReference)getEpisodeOfCareStatusHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventTiming() {
		if (eventTimingEClass == null) {
			eventTimingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(348);
		}
		return eventTimingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventTiming_Value() {
        return (EAttribute)getEventTiming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExplanationOfBenefit() {
		if (explanationOfBenefitEClass == null) {
			explanationOfBenefitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(351);
		}
		return explanationOfBenefitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Identifier() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Request() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Outcome() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Disposition() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Ruleset() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_OriginalRuleset() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Created() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_Organization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_RequestProvider() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExplanationOfBenefit_RequestOrganization() {
        return (EReference)getExplanationOfBenefit().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		if (extensionEClass == null) {
			extensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(352);
		}
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueBoolean() {
        return (EReference)getExtension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueInteger() {
        return (EReference)getExtension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueDecimal() {
        return (EReference)getExtension().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueBase64Binary() {
        return (EReference)getExtension().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueInstant() {
        return (EReference)getExtension().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueString() {
        return (EReference)getExtension().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueUri() {
        return (EReference)getExtension().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueDate() {
        return (EReference)getExtension().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueDateTime() {
        return (EReference)getExtension().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueTime() {
        return (EReference)getExtension().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueCode() {
        return (EReference)getExtension().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueOid() {
        return (EReference)getExtension().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueUuid() {
        return (EReference)getExtension().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueId() {
        return (EReference)getExtension().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueUnsignedInt() {
        return (EReference)getExtension().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValuePositiveInt() {
        return (EReference)getExtension().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueAttachment() {
        return (EReference)getExtension().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueIdentifier() {
        return (EReference)getExtension().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueCodeableConcept() {
        return (EReference)getExtension().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueCoding() {
        return (EReference)getExtension().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueQuantity() {
        return (EReference)getExtension().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueRange() {
        return (EReference)getExtension().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValuePeriod() {
        return (EReference)getExtension().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueRatio() {
        return (EReference)getExtension().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueReference() {
        return (EReference)getExtension().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueSampledData() {
        return (EReference)getExtension().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueSignature() {
        return (EReference)getExtension().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueHumanName() {
        return (EReference)getExtension().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueAddress() {
        return (EReference)getExtension().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueContactPoint() {
        return (EReference)getExtension().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueTiming() {
        return (EReference)getExtension().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_ValueMeta() {
        return (EReference)getExtension().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_Url() {
        return (EAttribute)getExtension().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionContext() {
		if (extensionContextEClass == null) {
			extensionContextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(353);
		}
		return extensionContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionContext_Value() {
        return (EAttribute)getExtensionContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistory() {
		if (familyMemberHistoryEClass == null) {
			familyMemberHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(356);
		}
		return familyMemberHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Identifier() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Patient() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Date() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Name() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Relationship() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Gender() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_BornPeriod() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_BornDate() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_BornString() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_AgeAge() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_AgeRange() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_AgeString() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_DeceasedBoolean() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_DeceasedAge() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_DeceasedRange() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_DeceasedDate() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_DeceasedString() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Note() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistory_Condition() {
        return (EReference)getFamilyMemberHistory().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilyMemberHistoryCondition() {
		if (familyMemberHistoryConditionEClass == null) {
			familyMemberHistoryConditionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(357);
		}
		return familyMemberHistoryConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Type() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Outcome() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_OnsetAge() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_OnsetRange() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_OnsetString() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFamilyMemberHistoryCondition_Note() {
        return (EReference)getFamilyMemberHistoryCondition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFHIRDefinedType() {
		if (fhirDefinedTypeEClass == null) {
			fhirDefinedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(358);
		}
		return fhirDefinedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFHIRDefinedType_Value() {
        return (EAttribute)getFHIRDefinedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterOperator() {
		if (filterOperatorEClass == null) {
			filterOperatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(361);
		}
		return filterOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterOperator_Value() {
        return (EAttribute)getFilterOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlag() {
		if (flagEClass == null) {
			flagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(364);
		}
		return flagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Identifier() {
        return (EReference)getFlag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Category() {
        return (EReference)getFlag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Status() {
        return (EReference)getFlag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Period() {
        return (EReference)getFlag().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Patient() {
        return (EReference)getFlag().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Author() {
        return (EReference)getFlag().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlag_Code() {
        return (EReference)getFlag().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlagStatus() {
		if (flagStatusEClass == null) {
			flagStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(365);
		}
		return flagStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlagStatus_Value() {
        return (EAttribute)getFlagStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		if (goalEClass == null) {
			goalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(368);
		}
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Identifier() {
        return (EReference)getGoal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Patient() {
        return (EReference)getGoal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_TargetDate() {
        return (EReference)getGoal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Description() {
        return (EReference)getGoal().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Status() {
        return (EReference)getGoal().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_StatusDate() {
        return (EReference)getGoal().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Author() {
        return (EReference)getGoal().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Priority() {
        return (EReference)getGoal().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Concern() {
        return (EReference)getGoal().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Notes() {
        return (EReference)getGoal().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Outcome() {
        return (EReference)getGoal().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalOutcome() {
		if (goalOutcomeEClass == null) {
			goalOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(369);
		}
		return goalOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOutcome_ResultCodeableConcept() {
        return (EReference)getGoalOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalOutcome_ResultReference() {
        return (EReference)getGoalOutcome().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalStatus() {
		if (goalStatusEClass == null) {
			goalStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(370);
		}
		return goalStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoalStatus_Value() {
        return (EAttribute)getGoalStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		if (groupEClass == null) {
			groupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(373);
		}
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Identifier() {
        return (EReference)getGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Type() {
        return (EReference)getGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Actual() {
        return (EReference)getGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Code() {
        return (EReference)getGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Name() {
        return (EReference)getGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Quantity() {
        return (EReference)getGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Characteristic() {
        return (EReference)getGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Member() {
        return (EReference)getGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupCharacteristic() {
		if (groupCharacteristicEClass == null) {
			groupCharacteristicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(374);
		}
		return groupCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Code() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_ValueCodeableConcept() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_ValueBoolean() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_ValueQuantity() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_ValueRange() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupCharacteristic_Exclude() {
        return (EReference)getGroupCharacteristic().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupType() {
		if (groupTypeEClass == null) {
			groupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(375);
		}
		return groupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Value() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareService() {
		if (healthcareServiceEClass == null) {
			healthcareServiceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(378);
		}
		return healthcareServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Identifier() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProvidedBy() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Location() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceCategory() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceType() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Comment() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ExtraDetails() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Photo() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Telecom() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_CoverageArea() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ServiceProvisionCode() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Eligibility() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_EligibilityNote() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ProgramName() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_Characteristic() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_ReferralMethod() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_PublicKey() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AppointmentRequired() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailableTime() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_NotAvailable() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareService_AvailabilityExceptions() {
        return (EReference)getHealthcareService().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceAvailableTime() {
		if (healthcareServiceAvailableTimeEClass == null) {
			healthcareServiceAvailableTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(379);
		}
		return healthcareServiceAvailableTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_DaysOfWeek() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AllDay() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableStartTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceAvailableTime_AvailableEndTime() {
        return (EReference)getHealthcareServiceAvailableTime().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceNotAvailable() {
		if (healthcareServiceNotAvailableEClass == null) {
			healthcareServiceNotAvailableEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(380);
		}
		return healthcareServiceNotAvailableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_Description() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceNotAvailable_During() {
        return (EReference)getHealthcareServiceNotAvailable().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthcareServiceServiceType() {
		if (healthcareServiceServiceTypeEClass == null) {
			healthcareServiceServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(381);
		}
		return healthcareServiceServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceServiceType_Type() {
        return (EReference)getHealthcareServiceServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealthcareServiceServiceType_Specialty() {
        return (EReference)getHealthcareServiceServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPVerb() {
		if (httpVerbEClass == null) {
			httpVerbEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(382);
		}
		return httpVerbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPVerb_Value() {
        return (EAttribute)getHTTPVerb().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanName() {
		if (humanNameEClass == null) {
			humanNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(385);
		}
		return humanNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Use() {
        return (EReference)getHumanName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Text() {
        return (EReference)getHumanName().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Family() {
        return (EReference)getHumanName().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Given() {
        return (EReference)getHumanName().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Prefix() {
        return (EReference)getHumanName().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Suffix() {
        return (EReference)getHumanName().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHumanName_Period() {
        return (EReference)getHumanName().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getId() {
		if (idEClass == null) {
			idEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(386);
		}
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getId_Value() {
        return (EAttribute)getId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		if (identifierEClass == null) {
			identifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(387);
		}
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Use() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Type() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_System() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Value() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Period() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifier_Assigner() {
        return (EReference)getIdentifier().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierUse() {
		if (identifierUseEClass == null) {
			identifierUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(388);
		}
		return identifierUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierUse_Value() {
        return (EAttribute)getIdentifierUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityAssuranceLevel() {
		if (identityAssuranceLevelEClass == null) {
			identityAssuranceLevelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(391);
		}
		return identityAssuranceLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityAssuranceLevel_Value() {
        return (EAttribute)getIdentityAssuranceLevel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingModality() {
		if (imagingModalityEClass == null) {
			imagingModalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(395);
		}
		return imagingModalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagingModality_Value() {
        return (EAttribute)getImagingModality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelection() {
		if (imagingObjectSelectionEClass == null) {
			imagingObjectSelectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(398);
		}
		return imagingObjectSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Uid() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Patient() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Title() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Description() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Author() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_AuthoringTime() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelection_Study() {
        return (EReference)getImagingObjectSelection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionFrames() {
		if (imagingObjectSelectionFramesEClass == null) {
			imagingObjectSelectionFramesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(399);
		}
		return imagingObjectSelectionFramesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionFrames_FrameNumbers() {
        return (EReference)getImagingObjectSelectionFrames().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionFrames_Url() {
        return (EReference)getImagingObjectSelectionFrames().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionInstance() {
		if (imagingObjectSelectionInstanceEClass == null) {
			imagingObjectSelectionInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(400);
		}
		return imagingObjectSelectionInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionInstance_SopClass() {
        return (EReference)getImagingObjectSelectionInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionInstance_Uid() {
        return (EReference)getImagingObjectSelectionInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionInstance_Url() {
        return (EReference)getImagingObjectSelectionInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionInstance_Frames() {
        return (EReference)getImagingObjectSelectionInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionSeries() {
		if (imagingObjectSelectionSeriesEClass == null) {
			imagingObjectSelectionSeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(401);
		}
		return imagingObjectSelectionSeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionSeries_Uid() {
        return (EReference)getImagingObjectSelectionSeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionSeries_Url() {
        return (EReference)getImagingObjectSelectionSeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionSeries_Instance() {
        return (EReference)getImagingObjectSelectionSeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingObjectSelectionStudy() {
		if (imagingObjectSelectionStudyEClass == null) {
			imagingObjectSelectionStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(402);
		}
		return imagingObjectSelectionStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Uid() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Url() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingObjectSelectionStudy_Series() {
        return (EReference)getImagingObjectSelectionStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudy() {
		if (imagingStudyEClass == null) {
			imagingStudyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(403);
		}
		return imagingStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Started() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Patient() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Uid() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Accession() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Identifier() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Order() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_ModalityList() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Referrer() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Availability() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Url() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfSeries() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_NumberOfInstances() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_ClinicalInformation() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Procedure() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Interpreter() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Description() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudy_Series() {
        return (EReference)getImagingStudy().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudyInstance() {
		if (imagingStudyInstanceEClass == null) {
			imagingStudyInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(404);
		}
		return imagingStudyInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Number() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Uid() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Sopclass() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Type() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Title() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudyInstance_Content() {
        return (EReference)getImagingStudyInstance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagingStudySeries() {
		if (imagingStudySeriesEClass == null) {
			imagingStudySeriesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(405);
		}
		return imagingStudySeriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Number() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Modality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Uid() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Description() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_NumberOfInstances() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Availability() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Url() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_BodySite() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Laterality() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_DateTime() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImagingStudySeries_Instance() {
        return (EReference)getImagingStudySeries().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunization() {
		if (immunizationEClass == null) {
			immunizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(406);
		}
		return immunizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Identifier() {
        return (EReference)getImmunization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Date() {
        return (EReference)getImmunization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccineType() {
        return (EReference)getImmunization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Patient() {
        return (EReference)getImmunization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_WasNotGiven() {
        return (EReference)getImmunization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Reported() {
        return (EReference)getImmunization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Performer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Requester() {
        return (EReference)getImmunization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Encounter() {
        return (EReference)getImmunization().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Manufacturer() {
        return (EReference)getImmunization().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Location() {
        return (EReference)getImmunization().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_LotNumber() {
        return (EReference)getImmunization().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_ExpirationDate() {
        return (EReference)getImmunization().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Site() {
        return (EReference)getImmunization().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Route() {
        return (EReference)getImmunization().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_DoseQuantity() {
        return (EReference)getImmunization().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Explanation() {
        return (EReference)getImmunization().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_Reaction() {
        return (EReference)getImmunization().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunization_VaccinationProtocol() {
        return (EReference)getImmunization().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationExplanation() {
		if (immunizationExplanationEClass == null) {
			immunizationExplanationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(407);
		}
		return immunizationExplanationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_Reason() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationExplanation_ReasonNotGiven() {
        return (EReference)getImmunizationExplanation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationReaction() {
		if (immunizationReactionEClass == null) {
			immunizationReactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(408);
		}
		return immunizationReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Date() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Detail() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationReaction_Reported() {
        return (EReference)getImmunizationReaction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendation() {
		if (immunizationRecommendationEClass == null) {
			immunizationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(409);
		}
		return immunizationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Identifier() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Patient() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendation_Recommendation() {
        return (EReference)getImmunizationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationDateCriterion() {
		if (immunizationRecommendationDateCriterionEClass == null) {
			immunizationRecommendationDateCriterionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(410);
		}
		return immunizationRecommendationDateCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationDateCriterion_Code() {
        return (EReference)getImmunizationRecommendationDateCriterion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationDateCriterion_Value() {
        return (EReference)getImmunizationRecommendationDateCriterion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationProtocol() {
		if (immunizationRecommendationProtocolEClass == null) {
			immunizationRecommendationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(411);
		}
		return immunizationRecommendationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationProtocol_DoseSequence() {
        return (EReference)getImmunizationRecommendationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationProtocol_Description() {
        return (EReference)getImmunizationRecommendationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationProtocol_Authority() {
        return (EReference)getImmunizationRecommendationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationProtocol_Series() {
        return (EReference)getImmunizationRecommendationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationRecommendationRecommendation() {
		if (immunizationRecommendationRecommendationEClass == null) {
			immunizationRecommendationRecommendationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(412);
		}
		return immunizationRecommendationRecommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Date() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_VaccineType() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DoseNumber() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_ForecastStatus() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_DateCriterion() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_Protocol() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingImmunization() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationRecommendationRecommendation_SupportingPatientInformation() {
        return (EReference)getImmunizationRecommendationRecommendation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmunizationVaccinationProtocol() {
		if (immunizationVaccinationProtocolEClass == null) {
			immunizationVaccinationProtocolEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(413);
		}
		return immunizationVaccinationProtocolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseSequence() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Description() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Authority() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_Series() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_SeriesDoses() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseTarget() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatus() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmunizationVaccinationProtocol_DoseStatusReason() {
        return (EReference)getImmunizationVaccinationProtocol().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceAvailability() {
		if (instanceAvailabilityEClass == null) {
			instanceAvailabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(414);
		}
		return instanceAvailabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstanceAvailability_Value() {
        return (EAttribute)getInstanceAvailability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstant() {
		if (instantEClass == null) {
			instantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(417);
		}
		return instantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstant_Value() {
        return (EAttribute)getInstant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteger() {
		if (integerEClass == null) {
			integerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(419);
		}
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteger_Value() {
        return (EAttribute)getInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueSeverity() {
		if (issueSeverityEClass == null) {
			issueSeverityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(422);
		}
		return issueSeverityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueSeverity_Value() {
        return (EAttribute)getIssueSeverity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		if (linkTypeEClass == null) {
			linkTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(425);
		}
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Value() {
        return (EAttribute)getLinkType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getList() {
		if (listEClass == null) {
			listEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(428);
		}
		return listEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Identifier() {
        return (EReference)getList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Title() {
        return (EReference)getList().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Code() {
        return (EReference)getList().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Subject() {
        return (EReference)getList().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Source() {
        return (EReference)getList().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Status() {
        return (EReference)getList().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Date() {
        return (EReference)getList().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_OrderedBy() {
        return (EReference)getList().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Mode() {
        return (EReference)getList().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Note() {
        return (EReference)getList().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_Entry() {
        return (EReference)getList().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getList_EmptyReason() {
        return (EReference)getList().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListEntry() {
		if (listEntryEClass == null) {
			listEntryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(429);
		}
		return listEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Flag() {
        return (EReference)getListEntry().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Deleted() {
        return (EReference)getListEntry().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Date() {
        return (EReference)getListEntry().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListEntry_Item() {
        return (EReference)getListEntry().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListMode() {
		if (listModeEClass == null) {
			listModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(430);
		}
		return listModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListMode_Value() {
        return (EAttribute)getListMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListStatus() {
		if (listStatusEClass == null) {
			listStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(433);
		}
		return listStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStatus_Value() {
        return (EAttribute)getListStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		if (locationEClass == null) {
			locationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(436);
		}
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Identifier() {
        return (EReference)getLocation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Name() {
        return (EReference)getLocation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Description() {
        return (EReference)getLocation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Mode() {
        return (EReference)getLocation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Type() {
        return (EReference)getLocation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Telecom() {
        return (EReference)getLocation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Address() {
        return (EReference)getLocation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PhysicalType() {
        return (EReference)getLocation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Position() {
        return (EReference)getLocation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_ManagingOrganization() {
        return (EReference)getLocation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_PartOf() {
        return (EReference)getLocation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocation_Status() {
        return (EReference)getLocation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationMode() {
		if (locationModeEClass == null) {
			locationModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(437);
		}
		return locationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationMode_Value() {
        return (EAttribute)getLocationMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationPosition() {
		if (locationPositionEClass == null) {
			locationPositionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(440);
		}
		return locationPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Longitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Latitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationPosition_Altitude() {
        return (EReference)getLocationPosition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationStatus() {
		if (locationStatusEClass == null) {
			locationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(441);
		}
		return locationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationStatus_Value() {
        return (EAttribute)getLocationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaritalStatus() {
		if (maritalStatusEClass == null) {
			maritalStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(444);
		}
		return maritalStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMaritalStatus_Value() {
        return (EAttribute)getMaritalStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasmntPrinciple() {
		if (measmntPrincipleEClass == null) {
			measmntPrincipleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(446);
		}
		return measmntPrincipleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeasmntPrinciple_Value() {
        return (EAttribute)getMeasmntPrinciple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		if (mediaEClass == null) {
			mediaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(449);
		}
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Type() {
        return (EReference)getMedia().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subtype() {
        return (EReference)getMedia().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Identifier() {
        return (EReference)getMedia().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Subject() {
        return (EReference)getMedia().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Operator() {
        return (EReference)getMedia().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_View() {
        return (EReference)getMedia().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_DeviceName() {
        return (EReference)getMedia().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Height() {
        return (EReference)getMedia().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Width() {
        return (EReference)getMedia().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Frames() {
        return (EReference)getMedia().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Duration() {
        return (EReference)getMedia().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedia_Content() {
        return (EReference)getMedia().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		if (medicationEClass == null) {
			medicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(450);
		}
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Name() {
        return (EReference)getMedication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Code() {
        return (EReference)getMedication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_IsBrand() {
        return (EReference)getMedication().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Manufacturer() {
        return (EReference)getMedication().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Kind() {
        return (EReference)getMedication().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Product() {
        return (EReference)getMedication().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Package() {
        return (EReference)getMedication().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministration() {
		if (medicationAdministrationEClass == null) {
			medicationAdministrationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(451);
		}
		return medicationAdministrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Identifier() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Status() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Patient() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Practitioner() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Encounter() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Prescription() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_WasNotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonNotGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_ReasonGiven() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_EffectiveTimeDateTime() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_EffectiveTimePeriod() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Medication() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Device() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Note() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministration_Dosage() {
        return (EReference)getMedicationAdministration().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministrationDosage() {
		if (medicationAdministrationDosageEClass == null) {
			medicationAdministrationDosageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(452);
		}
		return medicationAdministrationDosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Text() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Site() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Route() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Method() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Quantity() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationAdministrationDosage_Rate() {
        return (EReference)getMedicationAdministrationDosage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationAdministrationStatus() {
		if (medicationAdministrationStatusEClass == null) {
			medicationAdministrationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(453);
		}
		return medicationAdministrationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationAdministrationStatus_Value() {
        return (EAttribute)getMedicationAdministrationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationBatch() {
		if (medicationBatchEClass == null) {
			medicationBatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(456);
		}
		return medicationBatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationBatch_LotNumber() {
        return (EReference)getMedicationBatch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationBatch_ExpirationDate() {
        return (EReference)getMedicationBatch().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationContent() {
		if (medicationContentEClass == null) {
			medicationContentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(457);
		}
		return medicationContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationContent_Item() {
        return (EReference)getMedicationContent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationContent_Amount() {
        return (EReference)getMedicationContent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispense() {
		if (medicationDispenseEClass == null) {
			medicationDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(458);
		}
		return medicationDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Identifier() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Status() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Patient() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Dispenser() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_AuthorizingPrescription() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Type() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Quantity() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DaysSupply() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Medication() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenPrepared() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_WhenHandedOver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Destination() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Receiver() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Note() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_DosageInstruction() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispense_Substitution() {
        return (EReference)getMedicationDispense().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseDosageInstruction() {
		if (medicationDispenseDosageInstructionEClass == null) {
			medicationDispenseDosageInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(459);
		}
		return medicationDispenseDosageInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_AdditionalInstructions() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_ScheduleDateTime() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_SchedulePeriod() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_ScheduleTiming() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_AsNeededBoolean() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_AsNeededCodeableConcept() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Site() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Route() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Method() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_DoseRange() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_DoseQuantity() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_Rate() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseDosageInstruction_MaxDosePerPeriod() {
        return (EReference)getMedicationDispenseDosageInstruction().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseStatus() {
		if (medicationDispenseStatusEClass == null) {
			medicationDispenseStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(460);
		}
		return medicationDispenseStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationDispenseStatus_Value() {
        return (EAttribute)getMedicationDispenseStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationDispenseSubstitution() {
		if (medicationDispenseSubstitutionEClass == null) {
			medicationDispenseSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(463);
		}
		return medicationDispenseSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Type() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_Reason() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationDispenseSubstitution_ResponsibleParty() {
        return (EReference)getMedicationDispenseSubstitution().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationIngredient() {
		if (medicationIngredientEClass == null) {
			medicationIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(464);
		}
		return medicationIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationIngredient_Item() {
        return (EReference)getMedicationIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationIngredient_Amount() {
        return (EReference)getMedicationIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationKind() {
		if (medicationKindEClass == null) {
			medicationKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(465);
		}
		return medicationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationKind_Value() {
        return (EAttribute)getMedicationKind().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPackage() {
		if (medicationPackageEClass == null) {
			medicationPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(468);
		}
		return medicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Container() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPackage_Content() {
        return (EReference)getMedicationPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescription() {
		if (medicationPrescriptionEClass == null) {
			medicationPrescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(469);
		}
		return medicationPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Identifier() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_DateWritten() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Status() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Patient() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Prescriber() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Encounter() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_ReasonCodeableConcept() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_ReasonReference() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Note() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Medication() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_DosageInstruction() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Dispense() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescription_Substitution() {
        return (EReference)getMedicationPrescription().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescriptionDispense() {
		if (medicationPrescriptionDispenseEClass == null) {
			medicationPrescriptionDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(470);
		}
		return medicationPrescriptionDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDispense_Medication() {
        return (EReference)getMedicationPrescriptionDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDispense_ValidityPeriod() {
        return (EReference)getMedicationPrescriptionDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDispense_NumberOfRepeatsAllowed() {
        return (EReference)getMedicationPrescriptionDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDispense_Quantity() {
        return (EReference)getMedicationPrescriptionDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDispense_ExpectedSupplyDuration() {
        return (EReference)getMedicationPrescriptionDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescriptionDosageInstruction() {
		if (medicationPrescriptionDosageInstructionEClass == null) {
			medicationPrescriptionDosageInstructionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(471);
		}
		return medicationPrescriptionDosageInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_Text() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_AdditionalInstructions() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_ScheduledDateTime() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_ScheduledPeriod() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_ScheduledTiming() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_AsNeededBoolean() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_AsNeededCodeableConcept() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_Site() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_Route() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_Method() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_DoseRange() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_DoseQuantity() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_Rate() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionDosageInstruction_MaxDosePerPeriod() {
        return (EReference)getMedicationPrescriptionDosageInstruction().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescriptionStatus() {
		if (medicationPrescriptionStatusEClass == null) {
			medicationPrescriptionStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(472);
		}
		return medicationPrescriptionStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationPrescriptionStatus_Value() {
        return (EAttribute)getMedicationPrescriptionStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationPrescriptionSubstitution() {
		if (medicationPrescriptionSubstitutionEClass == null) {
			medicationPrescriptionSubstitutionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(475);
		}
		return medicationPrescriptionSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionSubstitution_Type() {
        return (EReference)getMedicationPrescriptionSubstitution().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationPrescriptionSubstitution_Reason() {
        return (EReference)getMedicationPrescriptionSubstitution().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationProduct() {
		if (medicationProductEClass == null) {
			medicationProductEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(476);
		}
		return medicationProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Form() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Ingredient() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationProduct_Batch() {
        return (EReference)getMedicationProduct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatement() {
		if (medicationStatementEClass == null) {
			medicationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(477);
		}
		return medicationStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Identifier() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Patient() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_InformationSource() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_DateAsserted() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Status() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_WasNotGiven() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonNotGiven() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonForUseCodeableConcept() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_ReasonForUseReference() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_EffectiveDateTime() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_EffectivePeriod() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Note() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Medication() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatement_Dosage() {
        return (EReference)getMedicationStatement().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatementDosage() {
		if (medicationStatementDosageEClass == null) {
			medicationStatementDosageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(478);
		}
		return medicationStatementDosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Text() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Schedule() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_AsNeededBoolean() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_AsNeededCodeableConcept() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Site() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Route() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Method() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Quantity() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_Rate() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicationStatementDosage_MaxDosePerPeriod() {
        return (EReference)getMedicationStatementDosage().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicationStatementStatus() {
		if (medicationStatementStatusEClass == null) {
			medicationStatementStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(479);
		}
		return medicationStatementStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicationStatementStatus_Value() {
        return (EAttribute)getMedicationStatementStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		if (messageEventEClass == null) {
			messageEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(482);
		}
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageEvent_Value() {
        return (EAttribute)getMessageEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeader() {
		if (messageHeaderEClass == null) {
			messageHeaderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(485);
		}
		return messageHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Identifier() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Timestamp() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Event() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Response() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Source() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Destination() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Enterer() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Author() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Receiver() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Responsible() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Reason() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeader_Data() {
        return (EReference)getMessageHeader().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderDestination() {
		if (messageHeaderDestinationEClass == null) {
			messageHeaderDestinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(486);
		}
		return messageHeaderDestinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderDestination_Name() {
        return (EReference)getMessageHeaderDestination().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderDestination_Target() {
        return (EReference)getMessageHeaderDestination().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderDestination_Endpoint() {
        return (EReference)getMessageHeaderDestination().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderResponse() {
		if (messageHeaderResponseEClass == null) {
			messageHeaderResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(487);
		}
		return messageHeaderResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Identifier() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Code() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderResponse_Details() {
        return (EReference)getMessageHeaderResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageHeaderSource() {
		if (messageHeaderSourceEClass == null) {
			messageHeaderSourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(488);
		}
		return messageHeaderSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderSource_Name() {
        return (EReference)getMessageHeaderSource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderSource_Software() {
        return (EReference)getMessageHeaderSource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderSource_Version() {
        return (EReference)getMessageHeaderSource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderSource_Contact() {
        return (EReference)getMessageHeaderSource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageHeaderSource_Endpoint() {
        return (EReference)getMessageHeaderSource().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSignificanceCategory() {
		if (messageSignificanceCategoryEClass == null) {
			messageSignificanceCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(489);
		}
		return messageSignificanceCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageSignificanceCategory_Value() {
        return (EAttribute)getMessageSignificanceCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeta() {
		if (metaEClass == null) {
			metaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(492);
		}
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_VersionId() {
        return (EReference)getMeta().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_LastUpdated() {
        return (EReference)getMeta().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_Profile() {
        return (EReference)getMeta().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_Security() {
        return (EReference)getMeta().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeta_Tag() {
        return (EReference)getMeta().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModality() {
		if (modalityEClass == null) {
			modalityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(493);
		}
		return modalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModality_Value() {
        return (EAttribute)getModality().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoney() {
		if (moneyEClass == null) {
			moneyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(496);
		}
		return moneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameUse() {
		if (nameUseEClass == null) {
			nameUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(497);
		}
		return nameUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameUse_Value() {
        return (EAttribute)getNameUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystem() {
		if (namingSystemEClass == null) {
			namingSystemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(500);
		}
		return namingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Type() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Name() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Date() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Status() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Country() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Category() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Responsible() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Description() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Usage() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_UniqueId() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Publisher() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_Contact() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystem_ReplacedBy() {
        return (EReference)getNamingSystem().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemContact() {
		if (namingSystemContactEClass == null) {
			namingSystemContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(501);
		}
		return namingSystemContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemContact_Name() {
        return (EReference)getNamingSystemContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemContact_Telecom() {
        return (EReference)getNamingSystemContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemIdentifierType() {
		if (namingSystemIdentifierTypeEClass == null) {
			namingSystemIdentifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(502);
		}
		return namingSystemIdentifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamingSystemIdentifierType_Value() {
        return (EAttribute)getNamingSystemIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemType() {
		if (namingSystemTypeEClass == null) {
			namingSystemTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(505);
		}
		return namingSystemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamingSystemType_Value() {
        return (EAttribute)getNamingSystemType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamingSystemUniqueId() {
		if (namingSystemUniqueIdEClass == null) {
			namingSystemUniqueIdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(508);
		}
		return namingSystemUniqueIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Type() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Value() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Preferred() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamingSystemUniqueId_Period() {
        return (EReference)getNamingSystemUniqueId().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNarrative() {
		if (narrativeEClass == null) {
			narrativeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(509);
		}
		return narrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrative_Status() {
        return (EReference)getNarrative().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrative_Div() {
        return (EReference)getNarrative().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNarrativeStatus() {
		if (narrativeStatusEClass == null) {
			narrativeStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(510);
		}
		return narrativeStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNarrativeStatus_Value() {
        return (EAttribute)getNarrativeStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		if (noteTypeEClass == null) {
			noteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(513);
		}
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Value() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrder() {
		if (nutritionOrderEClass == null) {
			nutritionOrderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(516);
		}
		return nutritionOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Patient() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Orderer() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Identifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Encounter() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_DateTime() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Status() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_AllergyIntolerance() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_FoodPreferenceModifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_ExcludeFoodModifier() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_OralDiet() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_Supplement() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrder_EnteralFormula() {
        return (EReference)getNutritionOrder().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderEnteralFormula() {
		if (nutritionOrderEnteralFormulaEClass == null) {
			nutritionOrderEnteralFormulaEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(517);
		}
		return nutritionOrderEnteralFormulaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdministrationInstructions() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_BaseFormulaType() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_BaseFormulaProductName() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_Scheduled() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdditiveType() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_AdditiveProductName() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_CaloricDensity() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_RouteofAdministration() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_Quantity() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_Rate() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_RateAdjustment() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderEnteralFormula_MaxVolumeToDeliver() {
        return (EReference)getNutritionOrderEnteralFormula().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderNutrient() {
		if (nutritionOrderNutrientEClass == null) {
			nutritionOrderNutrientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(518);
		}
		return nutritionOrderNutrientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderNutrient_Modifier() {
        return (EReference)getNutritionOrderNutrient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderNutrient_Amount() {
        return (EReference)getNutritionOrderNutrient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderOralDiet() {
		if (nutritionOrderOralDietEClass == null) {
			nutritionOrderOralDietEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(519);
		}
		return nutritionOrderOralDietEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Type() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Scheduled() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Nutrient() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Texture() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_FluidConsistencyType() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderOralDiet_Instruction() {
        return (EReference)getNutritionOrderOralDiet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderStatus() {
		if (nutritionOrderStatusEClass == null) {
			nutritionOrderStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(520);
		}
		return nutritionOrderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNutritionOrderStatus_Value() {
        return (EAttribute)getNutritionOrderStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderSupplement() {
		if (nutritionOrderSupplementEClass == null) {
			nutritionOrderSupplementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(523);
		}
		return nutritionOrderSupplementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Type() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_ProductName() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Scheduled() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Quantity() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderSupplement_Instruction() {
        return (EReference)getNutritionOrderSupplement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNutritionOrderTexture() {
		if (nutritionOrderTextureEClass == null) {
			nutritionOrderTextureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(524);
		}
		return nutritionOrderTextureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderTexture_Modifier() {
        return (EReference)getNutritionOrderTexture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNutritionOrderTexture_FoodType() {
        return (EReference)getNutritionOrderTexture().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		if (observationEClass == null) {
			observationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(525);
		}
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Code() {
        return (EReference)getObservation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueQuantity() {
        return (EReference)getObservation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueCodeableConcept() {
        return (EReference)getObservation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueString() {
        return (EReference)getObservation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueRange() {
        return (EReference)getObservation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueRatio() {
        return (EReference)getObservation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueSampledData() {
        return (EReference)getObservation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueAttachment() {
        return (EReference)getObservation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueTime() {
        return (EReference)getObservation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValueDateTime() {
        return (EReference)getObservation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ValuePeriod() {
        return (EReference)getObservation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_DataAbsentReason() {
        return (EReference)getObservation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Interpretation() {
        return (EReference)getObservation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Comments() {
        return (EReference)getObservation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_AppliesDateTime() {
        return (EReference)getObservation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_AppliesPeriod() {
        return (EReference)getObservation().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Issued() {
        return (EReference)getObservation().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Status() {
        return (EReference)getObservation().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Reliability() {
        return (EReference)getObservation().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_BodySiteCodeableConcept() {
        return (EReference)getObservation().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_BodySiteReference() {
        return (EReference)getObservation().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Method() {
        return (EReference)getObservation().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Identifier() {
        return (EReference)getObservation().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Subject() {
        return (EReference)getObservation().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Specimen() {
        return (EReference)getObservation().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Performer() {
        return (EReference)getObservation().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Device() {
        return (EReference)getObservation().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Encounter() {
        return (EReference)getObservation().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_ReferenceRange() {
        return (EReference)getObservation().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservation_Related() {
        return (EReference)getObservation().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationReferenceRange() {
		if (observationReferenceRangeEClass == null) {
			observationReferenceRangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(526);
		}
		return observationReferenceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Low() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_High() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Meaning() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Age() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationReferenceRange_Text() {
        return (EReference)getObservationReferenceRange().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationRelated() {
		if (observationRelatedEClass == null) {
			observationRelatedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(527);
		}
		return observationRelatedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Type() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObservationRelated_Target() {
        return (EReference)getObservationRelated().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationRelationshipType() {
		if (observationRelationshipTypeEClass == null) {
			observationRelationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(528);
		}
		return observationRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservationRelationshipType_Value() {
        return (EAttribute)getObservationRelationshipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationReliability() {
		if (observationReliabilityEClass == null) {
			observationReliabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(531);
		}
		return observationReliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservationReliability_Value() {
        return (EAttribute)getObservationReliability().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationStatus() {
		if (observationStatusEClass == null) {
			observationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(534);
		}
		return observationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObservationStatus_Value() {
        return (EAttribute)getObservationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOid() {
		if (oidEClass == null) {
			oidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(537);
		}
		return oidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOid_Value() {
        return (EAttribute)getOid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinition() {
		if (operationDefinitionEClass == null) {
			operationDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(539);
		}
		return operationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Url() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Version() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Name() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Publisher() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Contact() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Description() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Requirements() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Status() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Experimental() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Date() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Kind() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Idempotent() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Code() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Notes() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Base() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_System() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Type() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Instance() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinition_Parameter() {
        return (EReference)getOperationDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionContact() {
		if (operationDefinitionContactEClass == null) {
			operationDefinitionContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(540);
		}
		return operationDefinitionContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionContact_Name() {
        return (EReference)getOperationDefinitionContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionContact_Telecom() {
        return (EReference)getOperationDefinitionContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionParameter() {
		if (operationDefinitionParameterEClass == null) {
			operationDefinitionParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(541);
		}
		return operationDefinitionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Name() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Use() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Min() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Max() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Documentation() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Type() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Profile() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionParameter_Part() {
        return (EReference)getOperationDefinitionParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationDefinitionPart() {
		if (operationDefinitionPartEClass == null) {
			operationDefinitionPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(542);
		}
		return operationDefinitionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Name() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Min() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Max() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Documentation() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Type() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationDefinitionPart_Profile() {
        return (EReference)getOperationDefinitionPart().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationKind() {
		if (operationKindEClass == null) {
			operationKindEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(543);
		}
		return operationKindEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationKind_Value() {
        return (EAttribute)getOperationKind().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcome() {
		if (operationOutcomeEClass == null) {
			operationOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(546);
		}
		return operationOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcome_Issue() {
        return (EReference)getOperationOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationOutcomeIssue() {
		if (operationOutcomeIssueEClass == null) {
			operationOutcomeIssueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(547);
		}
		return operationOutcomeIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Severity() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Code() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Details() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationOutcomeIssue_Location() {
        return (EReference)getOperationOutcomeIssue().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationParameterUse() {
		if (operationParameterUseEClass == null) {
			operationParameterUseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(548);
		}
		return operationParameterUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationParameterUse_Value() {
        return (EAttribute)getOperationParameterUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		if (orderEClass == null) {
			orderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(551);
		}
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Identifier() {
        return (EReference)getOrder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Date() {
        return (EReference)getOrder().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Subject() {
        return (EReference)getOrder().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Source() {
        return (EReference)getOrder().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Target() {
        return (EReference)getOrder().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_ReasonCodeableConcept() {
        return (EReference)getOrder().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_ReasonReference() {
        return (EReference)getOrder().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Authority() {
        return (EReference)getOrder().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_When() {
        return (EReference)getOrder().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_Detail() {
        return (EReference)getOrder().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderResponse() {
		if (orderResponseEClass == null) {
			orderResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(552);
		}
		return orderResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Identifier() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Request() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Date() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Who() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_AuthorityCodeableConcept() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_AuthorityReference() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_OrderStatus() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Description() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderResponse_Fulfillment() {
        return (EReference)getOrderResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderStatus() {
		if (orderStatusEClass == null) {
			orderStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(553);
		}
		return orderStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderStatus_Value() {
        return (EAttribute)getOrderStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderWhen() {
		if (orderWhenEClass == null) {
			orderWhenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(556);
		}
		return orderWhenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderWhen_Code() {
        return (EReference)getOrderWhen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderWhen_Schedule() {
        return (EReference)getOrderWhen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		if (organizationEClass == null) {
			organizationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(557);
		}
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Identifier() {
        return (EReference)getOrganization().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Name() {
        return (EReference)getOrganization().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Type() {
        return (EReference)getOrganization().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Telecom() {
        return (EReference)getOrganization().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Address() {
        return (EReference)getOrganization().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_PartOf() {
        return (EReference)getOrganization().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Contact() {
        return (EReference)getOrganization().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Active() {
        return (EReference)getOrganization().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationContact() {
		if (organizationContactEClass == null) {
			organizationContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(558);
		}
		return organizationContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Purpose() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Name() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Telecom() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationContact_Address() {
        return (EReference)getOrganizationContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameters() {
		if (parametersEClass == null) {
			parametersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(559);
		}
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameters_Parameter() {
        return (EReference)getParameters().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersParameter() {
		if (parametersParameterEClass == null) {
			parametersParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(560);
		}
		return parametersParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Name() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueBoolean() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueInteger() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueDecimal() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueBase64Binary() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueInstant() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueString() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueUri() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueDate() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueDateTime() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueTime() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueCode() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueOid() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueUuid() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueId() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueUnsignedInt() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValuePositiveInt() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueAttachment() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueIdentifier() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueCodeableConcept() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueCoding() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueQuantity() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueRange() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValuePeriod() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueRatio() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueReference() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueSampledData() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueSignature() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueHumanName() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueAddress() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueContactPoint() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueTiming() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_ValueMeta() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Resource() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersParameter_Part() {
        return (EReference)getParametersParameter().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersPart() {
		if (parametersPartEClass == null) {
			parametersPartEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(561);
		}
		return parametersPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_Name() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueBoolean() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueInteger() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueDecimal() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueBase64Binary() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueInstant() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueString() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueUri() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueDate() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueDateTime() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueTime() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueCode() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueOid() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueUuid() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueId() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueUnsignedInt() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValuePositiveInt() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueAttachment() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueIdentifier() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueCodeableConcept() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueCoding() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueQuantity() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueRange() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValuePeriod() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueRatio() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueReference() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueSampledData() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueSignature() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueHumanName() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueAddress() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueContactPoint() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueTiming() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_ValueMeta() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersPart_Resource() {
        return (EReference)getParametersPart().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantRequired() {
		if (participantRequiredEClass == null) {
			participantRequiredEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(562);
		}
		return participantRequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantRequired_Value() {
        return (EAttribute)getParticipantRequired().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantStatus() {
		if (participantStatusEClass == null) {
			participantStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(565);
		}
		return participantStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantStatus_Value() {
        return (EAttribute)getParticipantStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipationStatus() {
		if (participationStatusEClass == null) {
			participationStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(568);
		}
		return participationStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipationStatus_Value() {
        return (EAttribute)getParticipationStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		if (patientEClass == null) {
			patientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(571);
		}
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Identifier() {
        return (EReference)getPatient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Name() {
        return (EReference)getPatient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Telecom() {
        return (EReference)getPatient().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Gender() {
        return (EReference)getPatient().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_BirthDate() {
        return (EReference)getPatient().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_DeceasedBoolean() {
        return (EReference)getPatient().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_DeceasedDateTime() {
        return (EReference)getPatient().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Address() {
        return (EReference)getPatient().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MaritalStatus() {
        return (EReference)getPatient().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MultipleBirthBoolean() {
        return (EReference)getPatient().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_MultipleBirthInteger() {
        return (EReference)getPatient().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Photo() {
        return (EReference)getPatient().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Contact() {
        return (EReference)getPatient().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Animal() {
        return (EReference)getPatient().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Communication() {
        return (EReference)getPatient().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_CareProvider() {
        return (EReference)getPatient().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_ManagingOrganization() {
        return (EReference)getPatient().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Link() {
        return (EReference)getPatient().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Active() {
        return (EReference)getPatient().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientAnimal() {
		if (patientAnimalEClass == null) {
			patientAnimalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(572);
		}
		return patientAnimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Species() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_Breed() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientAnimal_GenderStatus() {
        return (EReference)getPatientAnimal().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientCommunication() {
		if (patientCommunicationEClass == null) {
			patientCommunicationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(573);
		}
		return patientCommunicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Language() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientCommunication_Preferred() {
        return (EReference)getPatientCommunication().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientContact() {
		if (patientContactEClass == null) {
			patientContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(574);
		}
		return patientContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Relationship() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Name() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Telecom() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Address() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Gender() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Organization() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientContact_Period() {
        return (EReference)getPatientContact().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientLink() {
		if (patientLinkEClass == null) {
			patientLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(575);
		}
		return patientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Other() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientLink_Type() {
        return (EReference)getPatientLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentNotice() {
		if (paymentNoticeEClass == null) {
			paymentNoticeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(576);
		}
		return paymentNoticeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Identifier() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Ruleset() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_OriginalRuleset() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Created() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Target() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Provider() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Organization() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Request() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_Response() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentNotice_PaymentStatus() {
        return (EReference)getPaymentNotice().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliation() {
		if (paymentReconciliationEClass == null) {
			paymentReconciliationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(577);
		}
		return paymentReconciliationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Identifier() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Request() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Outcome() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Disposition() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Ruleset() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_OriginalRuleset() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Created() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Period() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Organization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestProvider() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_RequestOrganization() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Detail() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Form() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Total() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliation_Note() {
        return (EReference)getPaymentReconciliation().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationDetail() {
		if (paymentReconciliationDetailEClass == null) {
			paymentReconciliationDetailEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(578);
		}
		return paymentReconciliationDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Type() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Request() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Responce() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Submitter() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Payee() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Date() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationDetail_Amount() {
        return (EReference)getPaymentReconciliationDetail().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaymentReconciliationNote() {
		if (paymentReconciliationNoteEClass == null) {
			paymentReconciliationNoteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(579);
		}
		return paymentReconciliationNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNote_Type() {
        return (EReference)getPaymentReconciliationNote().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaymentReconciliationNote_Text() {
        return (EReference)getPaymentReconciliationNote().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPeriod() {
		if (periodEClass == null) {
			periodEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(580);
		}
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriod_Start() {
        return (EReference)getPeriod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPeriod_End() {
        return (EReference)getPeriod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		if (personEClass == null) {
			personEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(581);
		}
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Identifier() {
        return (EReference)getPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Name() {
        return (EReference)getPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Telecom() {
        return (EReference)getPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Gender() {
        return (EReference)getPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_BirthDate() {
        return (EReference)getPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Address() {
        return (EReference)getPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Photo() {
        return (EReference)getPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_ManagingOrganization() {
        return (EReference)getPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Active() {
        return (EReference)getPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_Link() {
        return (EReference)getPerson().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonLink() {
		if (personLinkEClass == null) {
			personLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(582);
		}
		return personLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Target() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonLink_Assurance() {
        return (EReference)getPersonLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveInt() {
		if (positiveIntEClass == null) {
			positiveIntEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(583);
		}
		return positiveIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveInt_Value() {
        return (EAttribute)getPositiveInt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitioner() {
		if (practitionerEClass == null) {
			practitionerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(585);
		}
		return practitionerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Identifier() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Name() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Telecom() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Address() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Gender() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_BirthDate() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Photo() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_PractitionerRole() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Qualification() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitioner_Communication() {
        return (EReference)getPractitioner().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerPractitionerRole() {
		if (practitionerPractitionerRoleEClass == null) {
			practitionerPractitionerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(586);
		}
		return practitionerPractitionerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_ManagingOrganization() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Role() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Specialty() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Period() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_Location() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerPractitionerRole_HealthcareService() {
        return (EReference)getPractitionerPractitionerRole().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPractitionerQualification() {
		if (practitionerQualificationEClass == null) {
			practitionerQualificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(587);
		}
		return practitionerQualificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Identifier() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Code() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Period() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPractitionerQualification_Issuer() {
        return (EReference)getPractitionerQualification().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedure() {
		if (procedureEClass == null) {
			procedureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(588);
		}
		return procedureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Identifier() {
        return (EReference)getProcedure().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Patient() {
        return (EReference)getProcedure().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Status() {
        return (EReference)getProcedure().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Category() {
        return (EReference)getProcedure().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Type() {
        return (EReference)getProcedure().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_BodySite() {
        return (EReference)getProcedure().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Indication() {
        return (EReference)getProcedure().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Performer() {
        return (EReference)getProcedure().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_PerformedDateTime() {
        return (EReference)getProcedure().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_PerformedPeriod() {
        return (EReference)getProcedure().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Encounter() {
        return (EReference)getProcedure().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Location() {
        return (EReference)getProcedure().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Outcome() {
        return (EReference)getProcedure().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Report() {
        return (EReference)getProcedure().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Complication() {
        return (EReference)getProcedure().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_FollowUp() {
        return (EReference)getProcedure().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_RelatedItem() {
        return (EReference)getProcedure().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Notes() {
        return (EReference)getProcedure().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Device() {
        return (EReference)getProcedure().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedure_Used() {
        return (EReference)getProcedure().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureBodySite() {
		if (procedureBodySiteEClass == null) {
			procedureBodySiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(589);
		}
		return procedureBodySiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureBodySite_SiteCodeableConcept() {
        return (EReference)getProcedureBodySite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureBodySite_SiteReference() {
        return (EReference)getProcedureBodySite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureDevice() {
		if (procedureDeviceEClass == null) {
			procedureDeviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(590);
		}
		return procedureDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureDevice_Action() {
        return (EReference)getProcedureDevice().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureDevice_Manipulated() {
        return (EReference)getProcedureDevice().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedurePerformer() {
		if (procedurePerformerEClass == null) {
			procedurePerformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(591);
		}
		return procedurePerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Person() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedurePerformer_Role() {
        return (EReference)getProcedurePerformer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRelatedItem() {
		if (procedureRelatedItemEClass == null) {
			procedureRelatedItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(592);
		}
		return procedureRelatedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRelatedItem_Type() {
        return (EReference)getProcedureRelatedItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRelatedItem_Target() {
        return (EReference)getProcedureRelatedItem().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRelationshipType() {
		if (procedureRelationshipTypeEClass == null) {
			procedureRelationshipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(593);
		}
		return procedureRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureRelationshipType_Value() {
        return (EAttribute)getProcedureRelationshipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequest() {
		if (procedureRequestEClass == null) {
			procedureRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(596);
		}
		return procedureRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Identifier() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Subject() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Type() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_BodySite() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Indication() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_TimingDateTime() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_TimingPeriod() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_TimingTiming() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Encounter() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Performer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Status() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Notes() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_AsNeededBoolean() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_AsNeededCodeableConcept() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_OrderedOn() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Orderer() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequest_Priority() {
        return (EReference)getProcedureRequest().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequestBodySite() {
		if (procedureRequestBodySiteEClass == null) {
			procedureRequestBodySiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(597);
		}
		return procedureRequestBodySiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequestBodySite_SiteCodeableConcept() {
        return (EReference)getProcedureRequestBodySite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcedureRequestBodySite_SiteReference() {
        return (EReference)getProcedureRequestBodySite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequestPriority() {
		if (procedureRequestPriorityEClass == null) {
			procedureRequestPriorityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(598);
		}
		return procedureRequestPriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureRequestPriority_Value() {
        return (EAttribute)getProcedureRequestPriority().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureRequestStatus() {
		if (procedureRequestStatusEClass == null) {
			procedureRequestStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(601);
		}
		return procedureRequestStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureRequestStatus_Value() {
        return (EAttribute)getProcedureRequestStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureStatus() {
		if (procedureStatusEClass == null) {
			procedureStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(604);
		}
		return procedureStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcedureStatus_Value() {
        return (EAttribute)getProcedureStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequest() {
		if (processRequestEClass == null) {
			processRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(607);
		}
		return processRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Action() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Identifier() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Ruleset() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_OriginalRuleset() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Created() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Target() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Provider() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Organization() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Request() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Response() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Nullify() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Reference() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Item() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Include() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Exclude() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequest_Period() {
        return (EReference)getProcessRequest().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessRequestItem() {
		if (processRequestItemEClass == null) {
			processRequestItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(608);
		}
		return processRequestItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessRequestItem_SequenceLinkId() {
        return (EReference)getProcessRequestItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponse() {
		if (processResponseEClass == null) {
			processResponseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(609);
		}
		return processResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Identifier() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Request() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Outcome() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Disposition() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Ruleset() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_OriginalRuleset() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Created() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Organization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestProvider() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_RequestOrganization() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Form() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Notes() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponse_Error() {
        return (EReference)getProcessResponse().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessResponseNotes() {
		if (processResponseNotesEClass == null) {
			processResponseNotesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(610);
		}
		return processResponseNotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNotes_Type() {
        return (EReference)getProcessResponseNotes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessResponseNotes_Text() {
        return (EReference)getProcessResponseNotes().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyRepresentation() {
		if (propertyRepresentationEClass == null) {
			propertyRepresentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(611);
		}
		return propertyRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyRepresentation_Value() {
        return (EAttribute)getPropertyRepresentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenance() {
		if (provenanceEClass == null) {
			provenanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(614);
		}
		return provenanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Target() {
        return (EReference)getProvenance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Period() {
        return (EReference)getProvenance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Recorded() {
        return (EReference)getProvenance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Reason() {
        return (EReference)getProvenance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Location() {
        return (EReference)getProvenance().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Policy() {
        return (EReference)getProvenance().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Agent() {
        return (EReference)getProvenance().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Entity() {
        return (EReference)getProvenance().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenance_Signature() {
        return (EReference)getProvenance().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceAgent() {
		if (provenanceAgentEClass == null) {
			provenanceAgentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(615);
		}
		return provenanceAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Role() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Type() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_ReferenceUri() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_ReferenceReference() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceAgent_Display() {
        return (EReference)getProvenanceAgent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceEntity() {
		if (provenanceEntityEClass == null) {
			provenanceEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(616);
		}
		return provenanceEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Role() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Type() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Reference() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Display() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenanceEntity_Agent() {
        return (EReference)getProvenanceEntity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenanceEntityRole() {
		if (provenanceEntityRoleEClass == null) {
			provenanceEntityRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(617);
		}
		return provenanceEntityRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvenanceEntityRole_Value() {
        return (EAttribute)getProvenanceEntityRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantity() {
		if (quantityEClass == null) {
			quantityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(620);
		}
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Value() {
        return (EReference)getQuantity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Comparator() {
        return (EReference)getQuantity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Units() {
        return (EReference)getQuantity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_System() {
        return (EReference)getQuantity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantity_Code() {
        return (EReference)getQuantity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityComparator() {
		if (quantityComparatorEClass == null) {
			quantityComparatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(621);
		}
		return quantityComparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuantityComparator_Value() {
        return (EAttribute)getQuantityComparator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaire() {
		if (questionnaireEClass == null) {
			questionnaireEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(624);
		}
		return questionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Identifier() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Version() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Status() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Date() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Publisher() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Telecom() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaire_Group() {
        return (EReference)getQuestionnaire().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireAnswers() {
		if (questionnaireAnswersEClass == null) {
			questionnaireAnswersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(625);
		}
		return questionnaireAnswersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Identifier() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Questionnaire() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Status() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Subject() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Author() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Authored() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Source() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Encounter() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswers_Group() {
        return (EReference)getQuestionnaireAnswers().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireAnswersAnswer() {
		if (questionnaireAnswersAnswerEClass == null) {
			questionnaireAnswersAnswerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(626);
		}
		return questionnaireAnswersAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueBoolean() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueDecimal() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueInteger() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueDate() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueDateTime() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueInstant() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueTime() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueString() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueUri() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueAttachment() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueCoding() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueQuantity() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersAnswer_ValueReference() {
        return (EReference)getQuestionnaireAnswersAnswer().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireAnswersGroup() {
		if (questionnaireAnswersGroupEClass == null) {
			questionnaireAnswersGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(627);
		}
		return questionnaireAnswersGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_LinkId() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_Title() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_Text() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_Subject() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_Group() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersGroup_Question() {
        return (EReference)getQuestionnaireAnswersGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireAnswersQuestion() {
		if (questionnaireAnswersQuestionEClass == null) {
			questionnaireAnswersQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(628);
		}
		return questionnaireAnswersQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersQuestion_LinkId() {
        return (EReference)getQuestionnaireAnswersQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersQuestion_Text() {
        return (EReference)getQuestionnaireAnswersQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersQuestion_Answer() {
        return (EReference)getQuestionnaireAnswersQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireAnswersQuestion_Group() {
        return (EReference)getQuestionnaireAnswersQuestion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireAnswersStatus() {
		if (questionnaireAnswersStatusEClass == null) {
			questionnaireAnswersStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(629);
		}
		return questionnaireAnswersStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaireAnswersStatus_Value() {
        return (EAttribute)getQuestionnaireAnswersStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireGroup() {
		if (questionnaireGroupEClass == null) {
			questionnaireGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(632);
		}
		return questionnaireGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_LinkId() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Title() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Concept() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Text() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Required() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Repeats() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Group() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireGroup_Question() {
        return (EReference)getQuestionnaireGroup().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireQuestion() {
		if (questionnaireQuestionEClass == null) {
			questionnaireQuestionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(633);
		}
		return questionnaireQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_LinkId() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Concept() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Text() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Type() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Required() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Repeats() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Options() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestionnaireQuestion_Group() {
        return (EReference)getQuestionnaireQuestion().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestionnaireStatus() {
		if (questionnaireStatusEClass == null) {
			questionnaireStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(634);
		}
		return questionnaireStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestionnaireStatus_Value() {
        return (EAttribute)getQuestionnaireStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRange() {
		if (rangeEClass == null) {
			rangeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(637);
		}
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRange_Low() {
        return (EReference)getRange().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRange_High() {
        return (EReference)getRange().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRatio() {
		if (ratioEClass == null) {
			ratioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(638);
		}
		return ratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatio_Numerator() {
        return (EReference)getRatio().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRatio_Denominator() {
        return (EReference)getRatio().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		if (referenceEClass == null) {
			referenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(639);
		}
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Reference() {
        return (EReference)getReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_Display() {
        return (EReference)getReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralRequest() {
		if (referralRequestEClass == null) {
			referralRequestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(640);
		}
		return referralRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Status() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Identifier() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Type() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Specialty() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Priority() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Patient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Requester() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Recipient() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Encounter() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_DateSent() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Reason() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_Description() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_ServiceRequested() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_SupportingInformation() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferralRequest_FulfillmentTime() {
        return (EReference)getReferralRequest().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferralStatus() {
		if (referralStatusEClass == null) {
			referralStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(641);
		}
		return referralStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferralStatus_Value() {
        return (EAttribute)getReferralStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelatedPerson() {
		if (relatedPersonEClass == null) {
			relatedPersonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(644);
		}
		return relatedPersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Identifier() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Patient() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Relationship() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Name() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Telecom() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Gender() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Address() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Photo() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelatedPerson_Period() {
        return (EReference)getRelatedPerson().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemittanceOutcome() {
		if (remittanceOutcomeEClass == null) {
			remittanceOutcomeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(645);
		}
		return remittanceOutcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemittanceOutcome_Value() {
        return (EAttribute)getRemittanceOutcome().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		if (resourceEClass == null) {
			resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(648);
		}
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Id() {
        return (EReference)getResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Meta() {
        return (EReference)getResource().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ImplicitRules() {
        return (EReference)getResource().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_Language() {
        return (EReference)getResource().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceContainer() {
		if (resourceContainerEClass == null) {
			resourceContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(649);
		}
		return resourceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_AllergyIntolerance() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Appointment() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_AppointmentResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_AuditEvent() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Basic() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Binary() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_BodySite() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Bundle() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_CarePlan() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Claim() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ClaimResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ClinicalImpression() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Communication() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_CommunicationRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Composition() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ConceptMap() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Condition() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Conformance() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Contract() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Contraindication() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Coverage() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DataElement() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Device() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DeviceComponent() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DeviceMetric() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DeviceUseRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DeviceUseStatement() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DiagnosticOrder() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DiagnosticReport() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DocumentManifest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_DocumentReference() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_EligibilityRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_EligibilityResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Encounter() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_EnrollmentRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_EnrollmentResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_EpisodeOfCare() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ExplanationOfBenefit() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_FamilyMemberHistory() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Flag() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Goal() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Group() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_HealthcareService() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ImagingObjectSelection() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ImagingStudy() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Immunization() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ImmunizationRecommendation() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_List() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Location() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Media() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Medication() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_MedicationAdministration() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_MedicationDispense() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_MedicationPrescription() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_MedicationStatement() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_MessageHeader() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_NamingSystem() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_NutritionOrder() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Observation() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_OperationDefinition() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_OperationOutcome() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Order() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_OrderResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Organization() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Patient() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_PaymentNotice() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_PaymentReconciliation() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Person() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Practitioner() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Procedure() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ProcedureRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ProcessRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ProcessResponse() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Provenance() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Questionnaire() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_QuestionnaireAnswers() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ReferralRequest() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_RelatedPerson() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_RiskAssessment() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Schedule() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_SearchParameter() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Slot() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Specimen() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_StructureDefinition() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Subscription() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Substance() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Supply() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_ValueSet() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_VisionPrescription() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceContainer_Parameters() {
        return (EReference)getResourceContainer().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceType() {
		if (resourceTypeEClass == null) {
			resourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(650);
		}
		return resourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceType_Value() {
        return (EAttribute)getResourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceVersionPolicy() {
		if (resourceVersionPolicyEClass == null) {
			resourceVersionPolicyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(653);
		}
		return resourceVersionPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceVersionPolicy_Value() {
        return (EAttribute)getResourceVersionPolicy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseType() {
		if (responseTypeEClass == null) {
			responseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(656);
		}
		return responseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseType_Value() {
        return (EAttribute)getResponseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestfulConformanceMode() {
		if (restfulConformanceModeEClass == null) {
			restfulConformanceModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(659);
		}
		return restfulConformanceModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestfulConformanceMode_Value() {
        return (EAttribute)getRestfulConformanceMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessment() {
		if (riskAssessmentEClass == null) {
			riskAssessmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(662);
		}
		return riskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Subject() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Date() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Condition() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Performer() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Identifier() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Method() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Basis() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Prediction() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessment_Mitigation() {
        return (EReference)getRiskAssessment().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRiskAssessmentPrediction() {
		if (riskAssessmentPredictionEClass == null) {
			riskAssessmentPredictionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(663);
		}
		return riskAssessmentPredictionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Outcome() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_ProbabilityDecimal() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_ProbabilityRange() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_ProbabilityCodeableConcept() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_RelativeRisk() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_WhenPeriod() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_WhenRange() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRiskAssessmentPrediction_Rationale() {
        return (EReference)getRiskAssessmentPrediction().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampledData() {
		if (sampledDataEClass == null) {
			sampledDataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(664);
		}
		return sampledDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_Origin() {
        return (EReference)getSampledData().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_Period() {
        return (EReference)getSampledData().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_Factor() {
        return (EReference)getSampledData().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_LowerLimit() {
        return (EReference)getSampledData().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_UpperLimit() {
        return (EReference)getSampledData().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_Dimensions() {
        return (EReference)getSampledData().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSampledData_Data() {
        return (EReference)getSampledData().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampledDataDataType() {
		if (sampledDataDataTypeEClass == null) {
			sampledDataDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(665);
		}
		return sampledDataDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampledDataDataType_Value() {
        return (EAttribute)getSampledDataDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchedule() {
		if (scheduleEClass == null) {
			scheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(667);
		}
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Identifier() {
        return (EReference)getSchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Type() {
        return (EReference)getSchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Actor() {
        return (EReference)getSchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_PlanningHorizon() {
        return (EReference)getSchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchedule_Comment() {
        return (EReference)getSchedule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchEntryMode() {
		if (searchEntryModeEClass == null) {
			searchEntryModeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(668);
		}
		return searchEntryModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchEntryMode_Value() {
        return (EAttribute)getSearchEntryMode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameter() {
		if (searchParameterEClass == null) {
			searchParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(671);
		}
		return searchParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Url() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Name() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Publisher() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Contact() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Requirements() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Status() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Experimental() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Date() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Base() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Type() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Description() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Xpath() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameter_Target() {
        return (EReference)getSearchParameter().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParameterContact() {
		if (searchParameterContactEClass == null) {
			searchParameterContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(672);
		}
		return searchParameterContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterContact_Name() {
        return (EReference)getSearchParameterContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchParameterContact_Telecom() {
        return (EReference)getSearchParameterContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchParamType() {
		if (searchParamTypeEClass == null) {
			searchParamTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(673);
		}
		return searchParamTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSearchParamType_Value() {
        return (EAttribute)getSearchParamType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignature() {
		if (signatureEClass == null) {
			signatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(676);
		}
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Type() {
        return (EReference)getSignature().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_When() {
        return (EReference)getSignature().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoBoolean() {
        return (EReference)getSignature().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoInteger() {
        return (EReference)getSignature().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoDecimal() {
        return (EReference)getSignature().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoBase64Binary() {
        return (EReference)getSignature().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoInstant() {
        return (EReference)getSignature().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoString() {
        return (EReference)getSignature().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoUri() {
        return (EReference)getSignature().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoDate() {
        return (EReference)getSignature().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoDateTime() {
        return (EReference)getSignature().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoTime() {
        return (EReference)getSignature().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoCode() {
        return (EReference)getSignature().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoOid() {
        return (EReference)getSignature().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoUuid() {
        return (EReference)getSignature().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoId() {
        return (EReference)getSignature().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoUnsignedInt() {
        return (EReference)getSignature().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoPositiveInt() {
        return (EReference)getSignature().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoAttachment() {
        return (EReference)getSignature().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoIdentifier() {
        return (EReference)getSignature().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoCodeableConcept() {
        return (EReference)getSignature().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoCoding() {
        return (EReference)getSignature().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoQuantity() {
        return (EReference)getSignature().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoRange() {
        return (EReference)getSignature().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoPeriod() {
        return (EReference)getSignature().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoRatio() {
        return (EReference)getSignature().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoReference() {
        return (EReference)getSignature().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoSampledData() {
        return (EReference)getSignature().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoSignature() {
        return (EReference)getSignature().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoHumanName() {
        return (EReference)getSignature().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoAddress() {
        return (EReference)getSignature().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoContactPoint() {
        return (EReference)getSignature().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoTiming() {
        return (EReference)getSignature().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_WhoMeta() {
        return (EReference)getSignature().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignature_Blob() {
        return (EReference)getSignature().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlicingRules() {
		if (slicingRulesEClass == null) {
			slicingRulesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(677);
		}
		return slicingRulesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlicingRules_Value() {
        return (EAttribute)getSlicingRules().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		if (slotEClass == null) {
			slotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(680);
		}
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Identifier() {
        return (EReference)getSlot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Type() {
        return (EReference)getSlot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Schedule() {
        return (EReference)getSlot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_FreeBusyType() {
        return (EReference)getSlot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Start() {
        return (EReference)getSlot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_End() {
        return (EReference)getSlot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Overbooked() {
        return (EReference)getSlot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Comment() {
        return (EReference)getSlot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlotStatus() {
		if (slotStatusEClass == null) {
			slotStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(681);
		}
		return slotStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlotStatus_Value() {
        return (EAttribute)getSlotStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialValues() {
		if (specialValuesEClass == null) {
			specialValuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(684);
		}
		return specialValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialValues_Value() {
        return (EAttribute)getSpecialValues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimen() {
		if (specimenEClass == null) {
			specimenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(687);
		}
		return specimenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Identifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Type() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Parent() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Subject() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_AccessionIdentifier() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_ReceivedTime() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Collection() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Treatment() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimen_Container() {
        return (EReference)getSpecimen().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenCollection() {
		if (specimenCollectionEClass == null) {
			specimenCollectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(688);
		}
		return specimenCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Collector() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Comment() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_CollectedDateTime() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_CollectedPeriod() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Quantity() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_Method() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_BodySiteCodeableConcept() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenCollection_BodySiteReference() {
        return (EReference)getSpecimenCollection().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenContainer() {
		if (specimenContainerEClass == null) {
			specimenContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(689);
		}
		return specimenContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Identifier() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Description() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Type() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_Capacity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_SpecimenQuantity() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_AdditiveCodeableConcept() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenContainer_AdditiveReference() {
        return (EReference)getSpecimenContainer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecimenTreatment() {
		if (specimenTreatmentEClass == null) {
			specimenTreatmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(690);
		}
		return specimenTreatmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Description() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Procedure() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecimenTreatment_Additive() {
        return (EReference)getSpecimenTreatment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(691);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
        return (EAttribute)getString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinition() {
		if (structureDefinitionEClass == null) {
			structureDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(693);
		}
		return structureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Url() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Identifier() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Version() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Name() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_UseContext() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Display() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Publisher() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Contact() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Description() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Requirements() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Copyright() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Code() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Status() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Experimental() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Date() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_FhirVersion() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Mapping() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Type() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Abstract() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_ContextType() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Context() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Base() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Snapshot() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinition_Differential() {
        return (EReference)getStructureDefinition().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionContact() {
		if (structureDefinitionContactEClass == null) {
			structureDefinitionContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(694);
		}
		return structureDefinitionContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionContact_Name() {
        return (EReference)getStructureDefinitionContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionContact_Telecom() {
        return (EReference)getStructureDefinitionContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionDifferential() {
		if (structureDefinitionDifferentialEClass == null) {
			structureDefinitionDifferentialEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(695);
		}
		return structureDefinitionDifferentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionDifferential_Element() {
        return (EReference)getStructureDefinitionDifferential().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionMapping() {
		if (structureDefinitionMappingEClass == null) {
			structureDefinitionMappingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(696);
		}
		return structureDefinitionMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Identity() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Uri() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Name() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionMapping_Comments() {
        return (EReference)getStructureDefinitionMapping().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionSnapshot() {
		if (structureDefinitionSnapshotEClass == null) {
			structureDefinitionSnapshotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(697);
		}
		return structureDefinitionSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureDefinitionSnapshot_Element() {
        return (EReference)getStructureDefinitionSnapshot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureDefinitionType() {
		if (structureDefinitionTypeEClass == null) {
			structureDefinitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(698);
		}
		return structureDefinitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureDefinitionType_Value() {
        return (EAttribute)getStructureDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscription() {
		if (subscriptionEClass == null) {
			subscriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(701);
		}
		return subscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Criteria() {
        return (EReference)getSubscription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Contact() {
        return (EReference)getSubscription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Reason() {
        return (EReference)getSubscription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Status() {
        return (EReference)getSubscription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Error() {
        return (EReference)getSubscription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Channel() {
        return (EReference)getSubscription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_End() {
        return (EReference)getSubscription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscription_Tag() {
        return (EReference)getSubscription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionChannel() {
		if (subscriptionChannelEClass == null) {
			subscriptionChannelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(702);
		}
		return subscriptionChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Type() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Endpoint() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Payload() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubscriptionChannel_Header() {
        return (EReference)getSubscriptionChannel().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionChannelType() {
		if (subscriptionChannelTypeEClass == null) {
			subscriptionChannelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(703);
		}
		return subscriptionChannelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionChannelType_Value() {
        return (EAttribute)getSubscriptionChannelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscriptionStatus() {
		if (subscriptionStatusEClass == null) {
			subscriptionStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(706);
		}
		return subscriptionStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscriptionStatus_Value() {
        return (EAttribute)getSubscriptionStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstance() {
		if (substanceEClass == null) {
			substanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(709);
		}
		return substanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Type() {
        return (EReference)getSubstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Description() {
        return (EReference)getSubstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Instance() {
        return (EReference)getSubstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstance_Ingredient() {
        return (EReference)getSubstance().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceIngredient() {
		if (substanceIngredientEClass == null) {
			substanceIngredientEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(710);
		}
		return substanceIngredientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Quantity() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceIngredient_Substance() {
        return (EReference)getSubstanceIngredient().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceInstance() {
		if (substanceInstanceEClass == null) {
			substanceInstanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(711);
		}
		return substanceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Identifier() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Expiry() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceInstance_Quantity() {
        return (EReference)getSubstanceInstance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupply() {
		if (supplyEClass == null) {
			supplyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(712);
		}
		return supplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_Kind() {
        return (EReference)getSupply().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_Identifier() {
        return (EReference)getSupply().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_Status() {
        return (EReference)getSupply().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_OrderedItem() {
        return (EReference)getSupply().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_Patient() {
        return (EReference)getSupply().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupply_Dispense() {
        return (EReference)getSupply().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyDispense() {
		if (supplyDispenseEClass == null) {
			supplyDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(713);
		}
		return supplyDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Identifier() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Status() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Type() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Quantity() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_SuppliedItem() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Supplier() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_WhenPrepared() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_WhenHandedOver() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Destination() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplyDispense_Receiver() {
        return (EReference)getSupplyDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyDispenseStatus() {
		if (supplyDispenseStatusEClass == null) {
			supplyDispenseStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(714);
		}
		return supplyDispenseStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplyDispenseStatus_Value() {
        return (EAttribute)getSupplyDispenseStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplyStatus() {
		if (supplyStatusEClass == null) {
			supplyStatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(717);
		}
		return supplyStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplyStatus_Value() {
        return (EAttribute)getSupplyStatus().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRestfulInteraction() {
		if (systemRestfulInteractionEClass == null) {
			systemRestfulInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(720);
		}
		return systemRestfulInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemRestfulInteraction_Value() {
        return (EAttribute)getSystemRestfulInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTime() {
		if (timeEClass == null) {
			timeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(723);
		}
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTime_Value() {
        return (EAttribute)getTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiming() {
		if (timingEClass == null) {
			timingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(725);
		}
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Event() {
        return (EReference)getTiming().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Repeat() {
        return (EReference)getTiming().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiming_Code() {
        return (EReference)getTiming().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingRepeat() {
		if (timingRepeatEClass == null) {
			timingRepeatEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(726);
		}
		return timingRepeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_Bounds() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_Count() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_Duration() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_DurationUnits() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_Frequency() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_FrequencyMax() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_Period() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_PeriodMax() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_PeriodUnits() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimingRepeat_When() {
        return (EReference)getTimingRepeat().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRestfulInteraction() {
		if (typeRestfulInteractionEClass == null) {
			typeRestfulInteractionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(727);
		}
		return typeRestfulInteractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeRestfulInteraction_Value() {
        return (EAttribute)getTypeRestfulInteraction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitsOfTime() {
		if (unitsOfTimeEClass == null) {
			unitsOfTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(730);
		}
		return unitsOfTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitsOfTime_Value() {
        return (EAttribute)getUnitsOfTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedInt() {
		if (unsignedIntEClass == null) {
			unsignedIntEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(733);
		}
		return unsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsignedInt_Value() {
        return (EAttribute)getUnsignedInt().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUri() {
		if (uriEClass == null) {
			uriEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(735);
		}
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUri_Value() {
        return (EAttribute)getUri().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUse() {
		if (useEClass == null) {
			useEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(737);
		}
		return useEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUse_Value() {
        return (EAttribute)getUse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUuid() {
		if (uuidEClass == null) {
			uuidEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(740);
		}
		return uuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUuid_Value() {
        return (EAttribute)getUuid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		if (valueSetEClass == null) {
			valueSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(742);
		}
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Url() {
        return (EReference)getValueSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Identifier() {
        return (EReference)getValueSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Version() {
        return (EReference)getValueSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Name() {
        return (EReference)getValueSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_UseContext() {
        return (EReference)getValueSet().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Immutable() {
        return (EReference)getValueSet().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Publisher() {
        return (EReference)getValueSet().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Contact() {
        return (EReference)getValueSet().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Description() {
        return (EReference)getValueSet().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Requirements() {
        return (EReference)getValueSet().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Copyright() {
        return (EReference)getValueSet().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Status() {
        return (EReference)getValueSet().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Experimental() {
        return (EReference)getValueSet().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Extensible() {
        return (EReference)getValueSet().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Date() {
        return (EReference)getValueSet().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_LockedDate() {
        return (EReference)getValueSet().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Define() {
        return (EReference)getValueSet().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Compose() {
        return (EReference)getValueSet().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSet_Expansion() {
        return (EReference)getValueSet().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetCompose() {
		if (valueSetComposeEClass == null) {
			valueSetComposeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(743);
		}
		return valueSetComposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Import() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Include() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetCompose_Exclude() {
        return (EReference)getValueSetCompose().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConcept() {
		if (valueSetConceptEClass == null) {
			valueSetConceptEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(744);
		}
		return valueSetConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Code() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Abstract() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Display() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Definition() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Designation() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept_Concept() {
        return (EReference)getValueSetConcept().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetConcept1() {
		if (valueSetConcept1EClass == null) {
			valueSetConcept1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(745);
		}
		return valueSetConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept1_Code() {
        return (EReference)getValueSetConcept1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept1_Display() {
        return (EReference)getValueSetConcept1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetConcept1_Designation() {
        return (EReference)getValueSetConcept1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetContact() {
		if (valueSetContactEClass == null) {
			valueSetContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(746);
		}
		return valueSetContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContact_Name() {
        return (EReference)getValueSetContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContact_Telecom() {
        return (EReference)getValueSetContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetContains() {
		if (valueSetContainsEClass == null) {
			valueSetContainsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(747);
		}
		return valueSetContainsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_System() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_Abstract() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_Version() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_Code() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_Display() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetContains_Contains() {
        return (EReference)getValueSetContains().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetDefine() {
		if (valueSetDefineEClass == null) {
			valueSetDefineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(748);
		}
		return valueSetDefineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDefine_System() {
        return (EReference)getValueSetDefine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDefine_Version() {
        return (EReference)getValueSetDefine().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDefine_CaseSensitive() {
        return (EReference)getValueSetDefine().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDefine_Concept() {
        return (EReference)getValueSetDefine().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetDesignation() {
		if (valueSetDesignationEClass == null) {
			valueSetDesignationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(749);
		}
		return valueSetDesignationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDesignation_Language() {
        return (EReference)getValueSetDesignation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDesignation_Use() {
        return (EReference)getValueSetDesignation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetDesignation_Value() {
        return (EReference)getValueSetDesignation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetExpansion() {
		if (valueSetExpansionEClass == null) {
			valueSetExpansionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(750);
		}
		return valueSetExpansionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Identifier() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Timestamp() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Parameter() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetExpansion_Contains() {
        return (EReference)getValueSetExpansion().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetFilter() {
		if (valueSetFilterEClass == null) {
			valueSetFilterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(751);
		}
		return valueSetFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetFilter_Property() {
        return (EReference)getValueSetFilter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetFilter_Op() {
        return (EReference)getValueSetFilter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetFilter_Value() {
        return (EReference)getValueSetFilter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetInclude() {
		if (valueSetIncludeEClass == null) {
			valueSetIncludeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(752);
		}
		return valueSetIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetInclude_System() {
        return (EReference)getValueSetInclude().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetInclude_Version() {
        return (EReference)getValueSetInclude().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetInclude_Concept() {
        return (EReference)getValueSetInclude().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetInclude_Filter() {
        return (EReference)getValueSetInclude().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSetParameter() {
		if (valueSetParameterEClass == null) {
			valueSetParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(753);
		}
		return valueSetParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_Name() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueString() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueBoolean() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueInteger() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueDecimal() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueUri() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSetParameter_ValueCode() {
        return (EReference)getValueSetParameter().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionBase() {
		if (visionBaseEClass == null) {
			visionBaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(754);
		}
		return visionBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisionBase_Value() {
        return (EAttribute)getVisionBase().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionEyes() {
		if (visionEyesEClass == null) {
			visionEyesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(757);
		}
		return visionEyesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisionEyes_Value() {
        return (EAttribute)getVisionEyes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescription() {
		if (visionPrescriptionEClass == null) {
			visionPrescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(760);
		}
		return visionPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Identifier() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_DateWritten() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Patient() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Prescriber() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Encounter() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_ReasonCodeableConcept() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_ReasonReference() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescription_Dispense() {
        return (EReference)getVisionPrescription().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisionPrescriptionDispense() {
		if (visionPrescriptionDispenseEClass == null) {
			visionPrescriptionDispenseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(761);
		}
		return visionPrescriptionDispenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Product() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Eye() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Sphere() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Cylinder() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Axis() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Prism() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Base() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Add() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Power() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_BackCurve() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Diameter() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Duration() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Color() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Brand() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisionPrescriptionDispense_Notes() {
        return (EReference)getVisionPrescriptionDispense().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionListList() {
		if (actionListListEEnum == null) {
			actionListListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(1);
		}
		return actionListListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressUseList() {
		if (addressUseListEEnum == null) {
			addressUseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(5);
		}
		return addressUseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdministrativeGenderList() {
		if (administrativeGenderListEEnum == null) {
			administrativeGenderListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(8);
		}
		return administrativeGenderListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationModeList() {
		if (aggregationModeListEEnum == null) {
			aggregationModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(12);
		}
		return aggregationModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCategoryList() {
		if (allergyIntoleranceCategoryListEEnum == null) {
			allergyIntoleranceCategoryListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(16);
		}
		return allergyIntoleranceCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCertaintyList() {
		if (allergyIntoleranceCertaintyListEEnum == null) {
			allergyIntoleranceCertaintyListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(19);
		}
		return allergyIntoleranceCertaintyListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceCriticalityList() {
		if (allergyIntoleranceCriticalityListEEnum == null) {
			allergyIntoleranceCriticalityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(22);
		}
		return allergyIntoleranceCriticalityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceSeverityList() {
		if (allergyIntoleranceSeverityListEEnum == null) {
			allergyIntoleranceSeverityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(26);
		}
		return allergyIntoleranceSeverityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceStatusList() {
		if (allergyIntoleranceStatusListEEnum == null) {
			allergyIntoleranceStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(29);
		}
		return allergyIntoleranceStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAllergyIntoleranceTypeList() {
		if (allergyIntoleranceTypeListEEnum == null) {
			allergyIntoleranceTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(32);
		}
		return allergyIntoleranceTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnswerFormatList() {
		if (answerFormatListEEnum == null) {
			answerFormatListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(35);
		}
		return answerFormatListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppointmentStatusList() {
		if (appointmentStatusListEEnum == null) {
			appointmentStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(41);
		}
		return appointmentStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventActionList() {
		if (auditEventActionListEEnum == null) {
			auditEventActionListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(46);
		}
		return auditEventActionListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectLifecycleList() {
		if (auditEventObjectLifecycleListEEnum == null) {
			auditEventObjectLifecycleListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(53);
		}
		return auditEventObjectLifecycleListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectRoleList() {
		if (auditEventObjectRoleListEEnum == null) {
			auditEventObjectRoleListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(56);
		}
		return auditEventObjectRoleListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventObjectTypeList() {
		if (auditEventObjectTypeListEEnum == null) {
			auditEventObjectTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(59);
		}
		return auditEventObjectTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventOutcomeList() {
		if (auditEventOutcomeListEEnum == null) {
			auditEventOutcomeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(62);
		}
		return auditEventOutcomeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuditEventParticipantNetworkTypeList() {
		if (auditEventParticipantNetworkTypeListEEnum == null) {
			auditEventParticipantNetworkTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(66);
		}
		return auditEventParticipantNetworkTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBindingStrengthList() {
		if (bindingStrengthListEEnum == null) {
			bindingStrengthListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(75);
		}
		return bindingStrengthListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBundleTypeList() {
		if (bundleTypeListEEnum == null) {
			bundleTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(88);
		}
		return bundleTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityCategoryList() {
		if (carePlanActivityCategoryListEEnum == null) {
			carePlanActivityCategoryListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(93);
		}
		return carePlanActivityCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanActivityStatusList() {
		if (carePlanActivityStatusListEEnum == null) {
			carePlanActivityStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(96);
		}
		return carePlanActivityStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePlanStatusList() {
		if (carePlanStatusListEEnum == null) {
			carePlanStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(101);
		}
		return carePlanStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimTypeList() {
		if (claimTypeListEEnum == null) {
			claimTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(127);
		}
		return claimTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalImpressionStatusList() {
		if (clinicalImpressionStatusListEEnum == null) {
			clinicalImpressionStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(136);
		}
		return clinicalImpressionStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationRequestStatusList() {
		if (communicationRequestStatusListEEnum == null) {
			communicationRequestStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(147);
		}
		return communicationRequestStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationStatusList() {
		if (communicationStatusListEEnum == null) {
			communicationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(150);
		}
		return communicationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionAttestationModeList() {
		if (compositionAttestationModeListEEnum == null) {
			compositionAttestationModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(154);
		}
		return compositionAttestationModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompositionStatusList() {
		if (compositionStatusListEEnum == null) {
			compositionStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(160);
		}
		return compositionStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConceptMapEquivalenceList() {
		if (conceptMapEquivalenceListEEnum == null) {
			conceptMapEquivalenceListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(167);
		}
		return conceptMapEquivalenceListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionClinicalStatusList() {
		if (conditionClinicalStatusListEEnum == null) {
			conditionClinicalStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(172);
		}
		return conditionClinicalStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceEventModeList() {
		if (conformanceEventModeListEEnum == null) {
			conformanceEventModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(185);
		}
		return conformanceEventModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConformanceResourceStatusList() {
		if (conformanceResourceStatusListEEnum == null) {
			conformanceResourceStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(194);
		}
		return conformanceResourceStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintSeverityList() {
		if (constraintSeverityListEEnum == null) {
			constraintSeverityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(203);
		}
		return constraintSeverityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointSystemList() {
		if (contactPointSystemListEEnum == null) {
			contactPointSystemListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(207);
		}
		return contactPointSystemListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContactPointUseList() {
		if (contactPointUseListEEnum == null) {
			contactPointUseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(210);
		}
		return contactPointUseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataAbsentReasonList() {
		if (dataAbsentReasonListEEnum == null) {
			dataAbsentReasonListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(227);
		}
		return dataAbsentReasonListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataElementSpecificityList() {
		if (dataElementSpecificityListEEnum == null) {
			dataElementSpecificityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(233);
		}
		return dataElementSpecificityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypeList() {
		if (dataTypeListEEnum == null) {
			dataTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(236);
		}
		return dataTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaysOfWeekList() {
		if (daysOfWeekListEEnum == null) {
			daysOfWeekListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(245);
		}
		return daysOfWeekListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationStateList() {
		if (deviceMetricCalibrationStateListEEnum == null) {
			deviceMetricCalibrationStateListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(255);
		}
		return deviceMetricCalibrationStateListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCalibrationTypeList() {
		if (deviceMetricCalibrationTypeListEEnum == null) {
			deviceMetricCalibrationTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(258);
		}
		return deviceMetricCalibrationTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricCategoryList() {
		if (deviceMetricCategoryListEEnum == null) {
			deviceMetricCategoryListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(261);
		}
		return deviceMetricCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricColorList() {
		if (deviceMetricColorListEEnum == null) {
			deviceMetricColorListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(264);
		}
		return deviceMetricColorListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceMetricOperationalStatusList() {
		if (deviceMetricOperationalStatusListEEnum == null) {
			deviceMetricOperationalStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(267);
		}
		return deviceMetricOperationalStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceStatusList() {
		if (deviceStatusListEEnum == null) {
			deviceStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(270);
		}
		return deviceStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceUseRequestPriorityList() {
		if (deviceUseRequestPriorityListEEnum == null) {
			deviceUseRequestPriorityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(274);
		}
		return deviceUseRequestPriorityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceUseRequestStatusList() {
		if (deviceUseRequestStatusListEEnum == null) {
			deviceUseRequestStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(277);
		}
		return deviceUseRequestStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticOrderPriorityList() {
		if (diagnosticOrderPriorityListEEnum == null) {
			diagnosticOrderPriorityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(284);
		}
		return diagnosticOrderPriorityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticOrderStatusList() {
		if (diagnosticOrderStatusListEEnum == null) {
			diagnosticOrderStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(287);
		}
		return diagnosticOrderStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosticReportStatusList() {
		if (diagnosticReportStatusListEEnum == null) {
			diagnosticReportStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(292);
		}
		return diagnosticReportStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDigitalMediaTypeList() {
		if (digitalMediaTypeListEEnum == null) {
			digitalMediaTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(295);
		}
		return digitalMediaTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentModeList() {
		if (documentModeListEEnum == null) {
			documentModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(302);
		}
		return documentModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentReferenceStatusList() {
		if (documentReferenceStatusListEEnum == null) {
			documentReferenceStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(309);
		}
		return documentReferenceStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentRelationshipTypeList() {
		if (documentRelationshipTypeListEEnum == null) {
			documentRelationshipTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(312);
		}
		return documentRelationshipTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterClassList() {
		if (encounterClassListEEnum == null) {
			encounterClassListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(328);
		}
		return encounterClassListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterLocationStatusList() {
		if (encounterLocationStatusListEEnum == null) {
			encounterLocationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(333);
		}
		return encounterLocationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncounterStateList() {
		if (encounterStateListEEnum == null) {
			encounterStateListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(337);
		}
		return encounterStateListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEpisodeOfCareStatusList() {
		if (episodeOfCareStatusListEEnum == null) {
			episodeOfCareStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(346);
		}
		return episodeOfCareStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventTimingList() {
		if (eventTimingListEEnum == null) {
			eventTimingListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(349);
		}
		return eventTimingListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExtensionContextList() {
		if (extensionContextListEEnum == null) {
			extensionContextListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(354);
		}
		return extensionContextListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFHIRDefinedTypeList() {
		if (fhirDefinedTypeListEEnum == null) {
			fhirDefinedTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(359);
		}
		return fhirDefinedTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterOperatorList() {
		if (filterOperatorListEEnum == null) {
			filterOperatorListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(362);
		}
		return filterOperatorListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlagStatusList() {
		if (flagStatusListEEnum == null) {
			flagStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(366);
		}
		return flagStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGoalStatusList() {
		if (goalStatusListEEnum == null) {
			goalStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(371);
		}
		return goalStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupTypeList() {
		if (groupTypeListEEnum == null) {
			groupTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(376);
		}
		return groupTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPVerbList() {
		if (httpVerbListEEnum == null) {
			httpVerbListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(383);
		}
		return httpVerbListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentifierUseList() {
		if (identifierUseListEEnum == null) {
			identifierUseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(389);
		}
		return identifierUseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIdentityAssuranceLevelList() {
		if (identityAssuranceLevelListEEnum == null) {
			identityAssuranceLevelListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(392);
		}
		return identityAssuranceLevelListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getImagingModalityList() {
		if (imagingModalityListEEnum == null) {
			imagingModalityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(396);
		}
		return imagingModalityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceAvailabilityList() {
		if (instanceAvailabilityListEEnum == null) {
			instanceAvailabilityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(415);
		}
		return instanceAvailabilityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueSeverityList() {
		if (issueSeverityListEEnum == null) {
			issueSeverityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(423);
		}
		return issueSeverityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkTypeList() {
		if (linkTypeListEEnum == null) {
			linkTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(426);
		}
		return linkTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListModeList() {
		if (listModeListEEnum == null) {
			listModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(431);
		}
		return listModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListStatusList() {
		if (listStatusListEEnum == null) {
			listStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(434);
		}
		return listStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationModeList() {
		if (locationModeListEEnum == null) {
			locationModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(438);
		}
		return locationModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocationStatusList() {
		if (locationStatusListEEnum == null) {
			locationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(442);
		}
		return locationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasmntPrincipleList() {
		if (measmntPrincipleListEEnum == null) {
			measmntPrincipleListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(447);
		}
		return measmntPrincipleListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationAdministrationStatusList() {
		if (medicationAdministrationStatusListEEnum == null) {
			medicationAdministrationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(454);
		}
		return medicationAdministrationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationDispenseStatusList() {
		if (medicationDispenseStatusListEEnum == null) {
			medicationDispenseStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(461);
		}
		return medicationDispenseStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationKindList() {
		if (medicationKindListEEnum == null) {
			medicationKindListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(466);
		}
		return medicationKindListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationPrescriptionStatusList() {
		if (medicationPrescriptionStatusListEEnum == null) {
			medicationPrescriptionStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(473);
		}
		return medicationPrescriptionStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicationStatementStatusList() {
		if (medicationStatementStatusListEEnum == null) {
			medicationStatementStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(480);
		}
		return medicationStatementStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageEventList() {
		if (messageEventListEEnum == null) {
			messageEventListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(483);
		}
		return messageEventListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSignificanceCategoryList() {
		if (messageSignificanceCategoryListEEnum == null) {
			messageSignificanceCategoryListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(490);
		}
		return messageSignificanceCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModalityList() {
		if (modalityListEEnum == null) {
			modalityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(494);
		}
		return modalityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameUseList() {
		if (nameUseListEEnum == null) {
			nameUseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(498);
		}
		return nameUseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemIdentifierTypeList() {
		if (namingSystemIdentifierTypeListEEnum == null) {
			namingSystemIdentifierTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(503);
		}
		return namingSystemIdentifierTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNamingSystemTypeList() {
		if (namingSystemTypeListEEnum == null) {
			namingSystemTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(506);
		}
		return namingSystemTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNarrativeStatusList() {
		if (narrativeStatusListEEnum == null) {
			narrativeStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(511);
		}
		return narrativeStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoteTypeList() {
		if (noteTypeListEEnum == null) {
			noteTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(514);
		}
		return noteTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNutritionOrderStatusList() {
		if (nutritionOrderStatusListEEnum == null) {
			nutritionOrderStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(521);
		}
		return nutritionOrderStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationRelationshipTypeList() {
		if (observationRelationshipTypeListEEnum == null) {
			observationRelationshipTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(529);
		}
		return observationRelationshipTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationReliabilityList() {
		if (observationReliabilityListEEnum == null) {
			observationReliabilityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(532);
		}
		return observationReliabilityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObservationStatusList() {
		if (observationStatusListEEnum == null) {
			observationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(535);
		}
		return observationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationKindList() {
		if (operationKindListEEnum == null) {
			operationKindListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(544);
		}
		return operationKindListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationParameterUseList() {
		if (operationParameterUseListEEnum == null) {
			operationParameterUseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(549);
		}
		return operationParameterUseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderStatusList() {
		if (orderStatusListEEnum == null) {
			orderStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(554);
		}
		return orderStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantRequiredList() {
		if (participantRequiredListEEnum == null) {
			participantRequiredListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(563);
		}
		return participantRequiredListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipantStatusList() {
		if (participantStatusListEEnum == null) {
			participantStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(566);
		}
		return participantStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParticipationStatusList() {
		if (participationStatusListEEnum == null) {
			participationStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(569);
		}
		return participationStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRelationshipTypeList() {
		if (procedureRelationshipTypeListEEnum == null) {
			procedureRelationshipTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(594);
		}
		return procedureRelationshipTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestPriorityList() {
		if (procedureRequestPriorityListEEnum == null) {
			procedureRequestPriorityListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(599);
		}
		return procedureRequestPriorityListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureRequestStatusList() {
		if (procedureRequestStatusListEEnum == null) {
			procedureRequestStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(602);
		}
		return procedureRequestStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcedureStatusList() {
		if (procedureStatusListEEnum == null) {
			procedureStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(605);
		}
		return procedureStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyRepresentationList() {
		if (propertyRepresentationListEEnum == null) {
			propertyRepresentationListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(612);
		}
		return propertyRepresentationListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvenanceEntityRoleList() {
		if (provenanceEntityRoleListEEnum == null) {
			provenanceEntityRoleListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(618);
		}
		return provenanceEntityRoleListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantityComparatorList() {
		if (quantityComparatorListEEnum == null) {
			quantityComparatorListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(622);
		}
		return quantityComparatorListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireAnswersStatusList() {
		if (questionnaireAnswersStatusListEEnum == null) {
			questionnaireAnswersStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(630);
		}
		return questionnaireAnswersStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuestionnaireStatusList() {
		if (questionnaireStatusListEEnum == null) {
			questionnaireStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(635);
		}
		return questionnaireStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferralStatusList() {
		if (referralStatusListEEnum == null) {
			referralStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(642);
		}
		return referralStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRemittanceOutcomeList() {
		if (remittanceOutcomeListEEnum == null) {
			remittanceOutcomeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(646);
		}
		return remittanceOutcomeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceTypeList() {
		if (resourceTypeListEEnum == null) {
			resourceTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(651);
		}
		return resourceTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceVersionPolicyList() {
		if (resourceVersionPolicyListEEnum == null) {
			resourceVersionPolicyListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(654);
		}
		return resourceVersionPolicyListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResponseTypeList() {
		if (responseTypeListEEnum == null) {
			responseTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(657);
		}
		return responseTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRestfulConformanceModeList() {
		if (restfulConformanceModeListEEnum == null) {
			restfulConformanceModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(660);
		}
		return restfulConformanceModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchEntryModeList() {
		if (searchEntryModeListEEnum == null) {
			searchEntryModeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(669);
		}
		return searchEntryModeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSearchParamTypeList() {
		if (searchParamTypeListEEnum == null) {
			searchParamTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(674);
		}
		return searchParamTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlicingRulesList() {
		if (slicingRulesListEEnum == null) {
			slicingRulesListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(678);
		}
		return slicingRulesListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSlotStatusList() {
		if (slotStatusListEEnum == null) {
			slotStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(682);
		}
		return slotStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialValuesList() {
		if (specialValuesListEEnum == null) {
			specialValuesListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(685);
		}
		return specialValuesListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStructureDefinitionTypeList() {
		if (structureDefinitionTypeListEEnum == null) {
			structureDefinitionTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(699);
		}
		return structureDefinitionTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionChannelTypeList() {
		if (subscriptionChannelTypeListEEnum == null) {
			subscriptionChannelTypeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(704);
		}
		return subscriptionChannelTypeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubscriptionStatusList() {
		if (subscriptionStatusListEEnum == null) {
			subscriptionStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(707);
		}
		return subscriptionStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyDispenseStatusList() {
		if (supplyDispenseStatusListEEnum == null) {
			supplyDispenseStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(715);
		}
		return supplyDispenseStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSupplyStatusList() {
		if (supplyStatusListEEnum == null) {
			supplyStatusListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(718);
		}
		return supplyStatusListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemRestfulInteractionList() {
		if (systemRestfulInteractionListEEnum == null) {
			systemRestfulInteractionListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(721);
		}
		return systemRestfulInteractionListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeRestfulInteractionList() {
		if (typeRestfulInteractionListEEnum == null) {
			typeRestfulInteractionListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(728);
		}
		return typeRestfulInteractionListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitsOfTimeList() {
		if (unitsOfTimeListEEnum == null) {
			unitsOfTimeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(731);
		}
		return unitsOfTimeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUseList() {
		if (useListEEnum == null) {
			useListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(738);
		}
		return useListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionBaseList() {
		if (visionBaseListEEnum == null) {
			visionBaseListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(755);
		}
		return visionBaseListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisionEyesList() {
		if (visionEyesListEEnum == null) {
			visionEyesListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(758);
		}
		return visionEyesListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionListListObject() {
		if (actionListListObjectEDataType == null) {
			actionListListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(2);
		}
		return actionListListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAddressUseListObject() {
		if (addressUseListObjectEDataType == null) {
			addressUseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(6);
		}
		return addressUseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAdministrativeGenderListObject() {
		if (administrativeGenderListObjectEDataType == null) {
			administrativeGenderListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(9);
		}
		return administrativeGenderListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAggregationModeListObject() {
		if (aggregationModeListObjectEDataType == null) {
			aggregationModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(13);
		}
		return aggregationModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceCategoryListObject() {
		if (allergyIntoleranceCategoryListObjectEDataType == null) {
			allergyIntoleranceCategoryListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(17);
		}
		return allergyIntoleranceCategoryListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceCertaintyListObject() {
		if (allergyIntoleranceCertaintyListObjectEDataType == null) {
			allergyIntoleranceCertaintyListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(20);
		}
		return allergyIntoleranceCertaintyListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceCriticalityListObject() {
		if (allergyIntoleranceCriticalityListObjectEDataType == null) {
			allergyIntoleranceCriticalityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(23);
		}
		return allergyIntoleranceCriticalityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceSeverityListObject() {
		if (allergyIntoleranceSeverityListObjectEDataType == null) {
			allergyIntoleranceSeverityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(27);
		}
		return allergyIntoleranceSeverityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceStatusListObject() {
		if (allergyIntoleranceStatusListObjectEDataType == null) {
			allergyIntoleranceStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(30);
		}
		return allergyIntoleranceStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAllergyIntoleranceTypeListObject() {
		if (allergyIntoleranceTypeListObjectEDataType == null) {
			allergyIntoleranceTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(33);
		}
		return allergyIntoleranceTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnswerFormatListObject() {
		if (answerFormatListObjectEDataType == null) {
			answerFormatListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(36);
		}
		return answerFormatListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAppointmentStatusListObject() {
		if (appointmentStatusListObjectEDataType == null) {
			appointmentStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(42);
		}
		return appointmentStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventActionListObject() {
		if (auditEventActionListObjectEDataType == null) {
			auditEventActionListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(47);
		}
		return auditEventActionListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventObjectLifecycleListObject() {
		if (auditEventObjectLifecycleListObjectEDataType == null) {
			auditEventObjectLifecycleListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(54);
		}
		return auditEventObjectLifecycleListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventObjectRoleListObject() {
		if (auditEventObjectRoleListObjectEDataType == null) {
			auditEventObjectRoleListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(57);
		}
		return auditEventObjectRoleListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventObjectTypeListObject() {
		if (auditEventObjectTypeListObjectEDataType == null) {
			auditEventObjectTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(60);
		}
		return auditEventObjectTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventOutcomeListObject() {
		if (auditEventOutcomeListObjectEDataType == null) {
			auditEventOutcomeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(63);
		}
		return auditEventOutcomeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAuditEventParticipantNetworkTypeListObject() {
		if (auditEventParticipantNetworkTypeListObjectEDataType == null) {
			auditEventParticipantNetworkTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(67);
		}
		return auditEventParticipantNetworkTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBase64BinaryPrimitive() {
		if (base64BinaryPrimitiveEDataType == null) {
			base64BinaryPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(71);
		}
		return base64BinaryPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBindingStrengthListObject() {
		if (bindingStrengthListObjectEDataType == null) {
			bindingStrengthListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(76);
		}
		return bindingStrengthListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanPrimitive() {
		if (booleanPrimitiveEDataType == null) {
			booleanPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(79);
		}
		return booleanPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBooleanPrimitiveObject() {
		if (booleanPrimitiveObjectEDataType == null) {
			booleanPrimitiveObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(80);
		}
		return booleanPrimitiveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBundleTypeListObject() {
		if (bundleTypeListObjectEDataType == null) {
			bundleTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(89);
		}
		return bundleTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCarePlanActivityCategoryListObject() {
		if (carePlanActivityCategoryListObjectEDataType == null) {
			carePlanActivityCategoryListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(94);
		}
		return carePlanActivityCategoryListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCarePlanActivityStatusListObject() {
		if (carePlanActivityStatusListObjectEDataType == null) {
			carePlanActivityStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(97);
		}
		return carePlanActivityStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCarePlanStatusListObject() {
		if (carePlanStatusListObjectEDataType == null) {
			carePlanStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(102);
		}
		return carePlanStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClaimTypeListObject() {
		if (claimTypeListObjectEDataType == null) {
			claimTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(128);
		}
		return claimTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClinicalBaseGenderList() {
		if (clinicalBaseGenderListEDataType == null) {
			clinicalBaseGenderListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(130);
		}
		return clinicalBaseGenderListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getClinicalImpressionStatusListObject() {
		if (clinicalImpressionStatusListObjectEDataType == null) {
			clinicalImpressionStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(137);
		}
		return clinicalImpressionStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodePrimitive() {
		if (codePrimitiveEDataType == null) {
			codePrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(140);
		}
		return codePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommunicationRequestStatusListObject() {
		if (communicationRequestStatusListObjectEDataType == null) {
			communicationRequestStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(148);
		}
		return communicationRequestStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommunicationStatusListObject() {
		if (communicationStatusListObjectEDataType == null) {
			communicationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(151);
		}
		return communicationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompositionAttestationModeListObject() {
		if (compositionAttestationModeListObjectEDataType == null) {
			compositionAttestationModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(155);
		}
		return compositionAttestationModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompositionStatusListObject() {
		if (compositionStatusListObjectEDataType == null) {
			compositionStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(161);
		}
		return compositionStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConceptMapEquivalenceListObject() {
		if (conceptMapEquivalenceListObjectEDataType == null) {
			conceptMapEquivalenceListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(168);
		}
		return conceptMapEquivalenceListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConditionClinicalStatusListObject() {
		if (conditionClinicalStatusListObjectEDataType == null) {
			conditionClinicalStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(173);
		}
		return conditionClinicalStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConformanceEventModeListObject() {
		if (conformanceEventModeListObjectEDataType == null) {
			conformanceEventModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(186);
		}
		return conformanceEventModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConformanceResourceStatusListObject() {
		if (conformanceResourceStatusListObjectEDataType == null) {
			conformanceResourceStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(195);
		}
		return conformanceResourceStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConformanceUseContextList() {
		if (conformanceUseContextListEDataType == null) {
			conformanceUseContextListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(201);
		}
		return conformanceUseContextListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintSeverityListObject() {
		if (constraintSeverityListObjectEDataType == null) {
			constraintSeverityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(204);
		}
		return constraintSeverityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContactPointSystemListObject() {
		if (contactPointSystemListObjectEDataType == null) {
			contactPointSystemListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(208);
		}
		return contactPointSystemListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContactPointUseListObject() {
		if (contactPointUseListObjectEDataType == null) {
			contactPointUseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(211);
		}
		return contactPointUseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataAbsentReasonListObject() {
		if (dataAbsentReasonListObjectEDataType == null) {
			dataAbsentReasonListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(228);
		}
		return dataAbsentReasonListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataElementSpecificityListObject() {
		if (dataElementSpecificityListObjectEDataType == null) {
			dataElementSpecificityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(234);
		}
		return dataElementSpecificityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataTypeListObject() {
		if (dataTypeListObjectEDataType == null) {
			dataTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(237);
		}
		return dataTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatePrimitive() {
		if (datePrimitiveEDataType == null) {
			datePrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(239);
		}
		return datePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatePrimitiveBase() {
		if (datePrimitiveBaseEDataType == null) {
			datePrimitiveBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(240);
		}
		return datePrimitiveBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimePrimitive() {
		if (dateTimePrimitiveEDataType == null) {
			dateTimePrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(242);
		}
		return dateTimePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimePrimitiveBase() {
		if (dateTimePrimitiveBaseEDataType == null) {
			dateTimePrimitiveBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(243);
		}
		return dateTimePrimitiveBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDaysOfWeekListObject() {
		if (daysOfWeekListObjectEDataType == null) {
			daysOfWeekListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(246);
		}
		return daysOfWeekListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDecimalPrimitive() {
		if (decimalPrimitiveEDataType == null) {
			decimalPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(248);
		}
		return decimalPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceMetricCalibrationStateListObject() {
		if (deviceMetricCalibrationStateListObjectEDataType == null) {
			deviceMetricCalibrationStateListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(256);
		}
		return deviceMetricCalibrationStateListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceMetricCalibrationTypeListObject() {
		if (deviceMetricCalibrationTypeListObjectEDataType == null) {
			deviceMetricCalibrationTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(259);
		}
		return deviceMetricCalibrationTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceMetricCategoryListObject() {
		if (deviceMetricCategoryListObjectEDataType == null) {
			deviceMetricCategoryListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(262);
		}
		return deviceMetricCategoryListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceMetricColorListObject() {
		if (deviceMetricColorListObjectEDataType == null) {
			deviceMetricColorListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(265);
		}
		return deviceMetricColorListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceMetricOperationalStatusListObject() {
		if (deviceMetricOperationalStatusListObjectEDataType == null) {
			deviceMetricOperationalStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(268);
		}
		return deviceMetricOperationalStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceStatusListObject() {
		if (deviceStatusListObjectEDataType == null) {
			deviceStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(271);
		}
		return deviceStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceUseRequestPriorityListObject() {
		if (deviceUseRequestPriorityListObjectEDataType == null) {
			deviceUseRequestPriorityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(275);
		}
		return deviceUseRequestPriorityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeviceUseRequestStatusListObject() {
		if (deviceUseRequestStatusListObjectEDataType == null) {
			deviceUseRequestStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(278);
		}
		return deviceUseRequestStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagnosticOrderPriorityListObject() {
		if (diagnosticOrderPriorityListObjectEDataType == null) {
			diagnosticOrderPriorityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(285);
		}
		return diagnosticOrderPriorityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagnosticOrderStatusListObject() {
		if (diagnosticOrderStatusListObjectEDataType == null) {
			diagnosticOrderStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(288);
		}
		return diagnosticOrderStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDiagnosticReportStatusListObject() {
		if (diagnosticReportStatusListObjectEDataType == null) {
			diagnosticReportStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(293);
		}
		return diagnosticReportStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDigitalMediaTypeListObject() {
		if (digitalMediaTypeListObjectEDataType == null) {
			digitalMediaTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(296);
		}
		return digitalMediaTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentModeListObject() {
		if (documentModeListObjectEDataType == null) {
			documentModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(303);
		}
		return documentModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentReferenceStatusListObject() {
		if (documentReferenceStatusListObjectEDataType == null) {
			documentReferenceStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(310);
		}
		return documentReferenceStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDocumentRelationshipTypeListObject() {
		if (documentRelationshipTypeListObjectEDataType == null) {
			documentRelationshipTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(313);
		}
		return documentRelationshipTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncounterClassListObject() {
		if (encounterClassListObjectEDataType == null) {
			encounterClassListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(329);
		}
		return encounterClassListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncounterLocationStatusListObject() {
		if (encounterLocationStatusListObjectEDataType == null) {
			encounterLocationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(334);
		}
		return encounterLocationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncounterStateListObject() {
		if (encounterStateListObjectEDataType == null) {
			encounterStateListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(338);
		}
		return encounterStateListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEpisodeOfCareStatusListObject() {
		if (episodeOfCareStatusListObjectEDataType == null) {
			episodeOfCareStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(347);
		}
		return episodeOfCareStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTimingListObject() {
		if (eventTimingListObjectEDataType == null) {
			eventTimingListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(350);
		}
		return eventTimingListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExtensionContextListObject() {
		if (extensionContextListObjectEDataType == null) {
			extensionContextListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(355);
		}
		return extensionContextListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFHIRDefinedTypeListObject() {
		if (fhirDefinedTypeListObjectEDataType == null) {
			fhirDefinedTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(360);
		}
		return fhirDefinedTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFilterOperatorListObject() {
		if (filterOperatorListObjectEDataType == null) {
			filterOperatorListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(363);
		}
		return filterOperatorListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlagStatusListObject() {
		if (flagStatusListObjectEDataType == null) {
			flagStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(367);
		}
		return flagStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGoalStatusListObject() {
		if (goalStatusListObjectEDataType == null) {
			goalStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(372);
		}
		return goalStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGroupTypeListObject() {
		if (groupTypeListObjectEDataType == null) {
			groupTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(377);
		}
		return groupTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHTTPVerbListObject() {
		if (httpVerbListObjectEDataType == null) {
			httpVerbListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(384);
		}
		return httpVerbListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifierUseListObject() {
		if (identifierUseListObjectEDataType == null) {
			identifierUseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(390);
		}
		return identifierUseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentityAssuranceLevelListObject() {
		if (identityAssuranceLevelListObjectEDataType == null) {
			identityAssuranceLevelListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(393);
		}
		return identityAssuranceLevelListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdPrimitive() {
		if (idPrimitiveEDataType == null) {
			idPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(394);
		}
		return idPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImagingModalityListObject() {
		if (imagingModalityListObjectEDataType == null) {
			imagingModalityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(397);
		}
		return imagingModalityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstanceAvailabilityListObject() {
		if (instanceAvailabilityListObjectEDataType == null) {
			instanceAvailabilityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(416);
		}
		return instanceAvailabilityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInstantPrimitive() {
		if (instantPrimitiveEDataType == null) {
			instantPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(418);
		}
		return instantPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerPrimitive() {
		if (integerPrimitiveEDataType == null) {
			integerPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(420);
		}
		return integerPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntegerPrimitiveObject() {
		if (integerPrimitiveObjectEDataType == null) {
			integerPrimitiveObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(421);
		}
		return integerPrimitiveObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIssueSeverityListObject() {
		if (issueSeverityListObjectEDataType == null) {
			issueSeverityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(424);
		}
		return issueSeverityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLinkTypeListObject() {
		if (linkTypeListObjectEDataType == null) {
			linkTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(427);
		}
		return linkTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListModeListObject() {
		if (listModeListObjectEDataType == null) {
			listModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(432);
		}
		return listModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListStatusListObject() {
		if (listStatusListObjectEDataType == null) {
			listStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(435);
		}
		return listStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocationModeListObject() {
		if (locationModeListObjectEDataType == null) {
			locationModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(439);
		}
		return locationModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocationStatusListObject() {
		if (locationStatusListObjectEDataType == null) {
			locationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(443);
		}
		return locationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaritalStatusList() {
		if (maritalStatusListEDataType == null) {
			maritalStatusListEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(445);
		}
		return maritalStatusListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMeasmntPrincipleListObject() {
		if (measmntPrincipleListObjectEDataType == null) {
			measmntPrincipleListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(448);
		}
		return measmntPrincipleListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMedicationAdministrationStatusListObject() {
		if (medicationAdministrationStatusListObjectEDataType == null) {
			medicationAdministrationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(455);
		}
		return medicationAdministrationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMedicationDispenseStatusListObject() {
		if (medicationDispenseStatusListObjectEDataType == null) {
			medicationDispenseStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(462);
		}
		return medicationDispenseStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMedicationKindListObject() {
		if (medicationKindListObjectEDataType == null) {
			medicationKindListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(467);
		}
		return medicationKindListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMedicationPrescriptionStatusListObject() {
		if (medicationPrescriptionStatusListObjectEDataType == null) {
			medicationPrescriptionStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(474);
		}
		return medicationPrescriptionStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMedicationStatementStatusListObject() {
		if (medicationStatementStatusListObjectEDataType == null) {
			medicationStatementStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(481);
		}
		return medicationStatementStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageEventListObject() {
		if (messageEventListObjectEDataType == null) {
			messageEventListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(484);
		}
		return messageEventListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMessageSignificanceCategoryListObject() {
		if (messageSignificanceCategoryListObjectEDataType == null) {
			messageSignificanceCategoryListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(491);
		}
		return messageSignificanceCategoryListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModalityListObject() {
		if (modalityListObjectEDataType == null) {
			modalityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(495);
		}
		return modalityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNameUseListObject() {
		if (nameUseListObjectEDataType == null) {
			nameUseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(499);
		}
		return nameUseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamingSystemIdentifierTypeListObject() {
		if (namingSystemIdentifierTypeListObjectEDataType == null) {
			namingSystemIdentifierTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(504);
		}
		return namingSystemIdentifierTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNamingSystemTypeListObject() {
		if (namingSystemTypeListObjectEDataType == null) {
			namingSystemTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(507);
		}
		return namingSystemTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNarrativeStatusListObject() {
		if (narrativeStatusListObjectEDataType == null) {
			narrativeStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(512);
		}
		return narrativeStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNoteTypeListObject() {
		if (noteTypeListObjectEDataType == null) {
			noteTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(515);
		}
		return noteTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNutritionOrderStatusListObject() {
		if (nutritionOrderStatusListObjectEDataType == null) {
			nutritionOrderStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(522);
		}
		return nutritionOrderStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObservationRelationshipTypeListObject() {
		if (observationRelationshipTypeListObjectEDataType == null) {
			observationRelationshipTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(530);
		}
		return observationRelationshipTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObservationReliabilityListObject() {
		if (observationReliabilityListObjectEDataType == null) {
			observationReliabilityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(533);
		}
		return observationReliabilityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObservationStatusListObject() {
		if (observationStatusListObjectEDataType == null) {
			observationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(536);
		}
		return observationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOidPrimitive() {
		if (oidPrimitiveEDataType == null) {
			oidPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(538);
		}
		return oidPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationKindListObject() {
		if (operationKindListObjectEDataType == null) {
			operationKindListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(545);
		}
		return operationKindListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOperationParameterUseListObject() {
		if (operationParameterUseListObjectEDataType == null) {
			operationParameterUseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(550);
		}
		return operationParameterUseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderStatusListObject() {
		if (orderStatusListObjectEDataType == null) {
			orderStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(555);
		}
		return orderStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParticipantRequiredListObject() {
		if (participantRequiredListObjectEDataType == null) {
			participantRequiredListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(564);
		}
		return participantRequiredListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParticipantStatusListObject() {
		if (participantStatusListObjectEDataType == null) {
			participantStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(567);
		}
		return participantStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getParticipationStatusListObject() {
		if (participationStatusListObjectEDataType == null) {
			participationStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(570);
		}
		return participationStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveIntPrimitive() {
		if (positiveIntPrimitiveEDataType == null) {
			positiveIntPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(584);
		}
		return positiveIntPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcedureRelationshipTypeListObject() {
		if (procedureRelationshipTypeListObjectEDataType == null) {
			procedureRelationshipTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(595);
		}
		return procedureRelationshipTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcedureRequestPriorityListObject() {
		if (procedureRequestPriorityListObjectEDataType == null) {
			procedureRequestPriorityListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(600);
		}
		return procedureRequestPriorityListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcedureRequestStatusListObject() {
		if (procedureRequestStatusListObjectEDataType == null) {
			procedureRequestStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(603);
		}
		return procedureRequestStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProcedureStatusListObject() {
		if (procedureStatusListObjectEDataType == null) {
			procedureStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(606);
		}
		return procedureStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyRepresentationListObject() {
		if (propertyRepresentationListObjectEDataType == null) {
			propertyRepresentationListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(613);
		}
		return propertyRepresentationListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getProvenanceEntityRoleListObject() {
		if (provenanceEntityRoleListObjectEDataType == null) {
			provenanceEntityRoleListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(619);
		}
		return provenanceEntityRoleListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQuantityComparatorListObject() {
		if (quantityComparatorListObjectEDataType == null) {
			quantityComparatorListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(623);
		}
		return quantityComparatorListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQuestionnaireAnswersStatusListObject() {
		if (questionnaireAnswersStatusListObjectEDataType == null) {
			questionnaireAnswersStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(631);
		}
		return questionnaireAnswersStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getQuestionnaireStatusListObject() {
		if (questionnaireStatusListObjectEDataType == null) {
			questionnaireStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(636);
		}
		return questionnaireStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferralStatusListObject() {
		if (referralStatusListObjectEDataType == null) {
			referralStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(643);
		}
		return referralStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRemittanceOutcomeListObject() {
		if (remittanceOutcomeListObjectEDataType == null) {
			remittanceOutcomeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(647);
		}
		return remittanceOutcomeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceTypeListObject() {
		if (resourceTypeListObjectEDataType == null) {
			resourceTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(652);
		}
		return resourceTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResourceVersionPolicyListObject() {
		if (resourceVersionPolicyListObjectEDataType == null) {
			resourceVersionPolicyListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(655);
		}
		return resourceVersionPolicyListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResponseTypeListObject() {
		if (responseTypeListObjectEDataType == null) {
			responseTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(658);
		}
		return responseTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRestfulConformanceModeListObject() {
		if (restfulConformanceModeListObjectEDataType == null) {
			restfulConformanceModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(661);
		}
		return restfulConformanceModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSampledDataDataTypePrimitive() {
		if (sampledDataDataTypePrimitiveEDataType == null) {
			sampledDataDataTypePrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(666);
		}
		return sampledDataDataTypePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSearchEntryModeListObject() {
		if (searchEntryModeListObjectEDataType == null) {
			searchEntryModeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(670);
		}
		return searchEntryModeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSearchParamTypeListObject() {
		if (searchParamTypeListObjectEDataType == null) {
			searchParamTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(675);
		}
		return searchParamTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSlicingRulesListObject() {
		if (slicingRulesListObjectEDataType == null) {
			slicingRulesListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(679);
		}
		return slicingRulesListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSlotStatusListObject() {
		if (slotStatusListObjectEDataType == null) {
			slotStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(683);
		}
		return slotStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpecialValuesListObject() {
		if (specialValuesListObjectEDataType == null) {
			specialValuesListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(686);
		}
		return specialValuesListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStringPrimitive() {
		if (stringPrimitiveEDataType == null) {
			stringPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(692);
		}
		return stringPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStructureDefinitionTypeListObject() {
		if (structureDefinitionTypeListObjectEDataType == null) {
			structureDefinitionTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(700);
		}
		return structureDefinitionTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubscriptionChannelTypeListObject() {
		if (subscriptionChannelTypeListObjectEDataType == null) {
			subscriptionChannelTypeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(705);
		}
		return subscriptionChannelTypeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubscriptionStatusListObject() {
		if (subscriptionStatusListObjectEDataType == null) {
			subscriptionStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(708);
		}
		return subscriptionStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupplyDispenseStatusListObject() {
		if (supplyDispenseStatusListObjectEDataType == null) {
			supplyDispenseStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(716);
		}
		return supplyDispenseStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSupplyStatusListObject() {
		if (supplyStatusListObjectEDataType == null) {
			supplyStatusListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(719);
		}
		return supplyStatusListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSystemRestfulInteractionListObject() {
		if (systemRestfulInteractionListObjectEDataType == null) {
			systemRestfulInteractionListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(722);
		}
		return systemRestfulInteractionListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimePrimitive() {
		if (timePrimitiveEDataType == null) {
			timePrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(724);
		}
		return timePrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeRestfulInteractionListObject() {
		if (typeRestfulInteractionListObjectEDataType == null) {
			typeRestfulInteractionListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(729);
		}
		return typeRestfulInteractionListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitsOfTimeListObject() {
		if (unitsOfTimeListObjectEDataType == null) {
			unitsOfTimeListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(732);
		}
		return unitsOfTimeListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnsignedIntPrimitive() {
		if (unsignedIntPrimitiveEDataType == null) {
			unsignedIntPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(734);
		}
		return unsignedIntPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUriPrimitive() {
		if (uriPrimitiveEDataType == null) {
			uriPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(736);
		}
		return uriPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUseListObject() {
		if (useListObjectEDataType == null) {
			useListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(739);
		}
		return useListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUuidPrimitive() {
		if (uuidPrimitiveEDataType == null) {
			uuidPrimitiveEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(741);
		}
		return uuidPrimitiveEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisionBaseListObject() {
		if (visionBaseListObjectEDataType == null) {
			visionBaseListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(756);
		}
		return visionBaseListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVisionEyesListObject() {
		if (visionEyesListObjectEDataType == null) {
			visionEyesListObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(FhirPackage.eNS_URI).getEClassifiers().get(759);
		}
		return visionEyesListObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FhirFactory getFhirFactory() {
		return (FhirFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.hl7.fhir." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //FhirPackageImpl
