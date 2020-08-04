package it.unibz.inf.ontouml.vp.features.constraints;

import it.unibz.inf.ontouml.vp.utils.StereotypeUtils;

public final class ActionIds {

	// Class stereotypes (ordered as in plugin.xml)
	public static final String TYPE = "it.unibz.inf.ontouml.vp.addTypeStereotype";

	public static final String HISTORICAL_ROLE = "it.unibz.inf.ontouml.vp.addHistoricalRoleStereotype";
	public static final String HISTORICAL_ROLE_MIXIN = "it.unibz.inf.ontouml.vp.addHistoricalRoleMixinStereotype";
	public static final String EVENT = "it.unibz.inf.ontouml.vp.addEventStereotype";
	
	public static final String SITUATION = "it.unibz.inf.ontouml.vp.addSituationStereotype";

	public static final String ENUMERATION = "it.unibz.inf.ontouml.vp.addEnumerationStereotype";
	public static final String DATATYPE = "it.unibz.inf.ontouml.vp.addDatatypeStereotype";

	public static final String SUBKIND = "it.unibz.inf.ontouml.vp.addSubkindStereotype";
	public static final String ROLE_MIXIN = "it.unibz.inf.ontouml.vp.addRoleMixinStereotype";
	public static final String ROLE = "it.unibz.inf.ontouml.vp.addRoleStereotype";
	public static final String RELATOR = "it.unibz.inf.ontouml.vp.addRelatorStereotype";
	public static final String QUANTITY = "it.unibz.inf.ontouml.vp.addQuantityStereotype";
	public static final String QUALITY = "it.unibz.inf.ontouml.vp.addQualityStereotype";
	public static final String PHASE_MIXIN = "it.unibz.inf.ontouml.vp.addPhaseMixinStereotype";
	public static final String PHASE = "it.unibz.inf.ontouml.vp.addPhaseStereotype";
	public static final String MODE = "it.unibz.inf.ontouml.vp.addModeStereotype";
	public static final String MIXIN = "it.unibz.inf.ontouml.vp.addMixinStereotype";
	public static final String KIND = "it.unibz.inf.ontouml.vp.addKindStereotype";
	public static final String COLLECTIVE = "it.unibz.inf.ontouml.vp.addCollectiveStereotype";
	public static final String CATEGORY = "it.unibz.inf.ontouml.vp.addCategoryStereotype";

	// Association stereotypes (ordered as in plugin.xml)
	public static final String INSTANTIATION = "it.unibz.inf.ontouml.vp.addInstantiationStereotype";

	public static final String TERMINATION = "it.unibz.inf.ontouml.vp.addTerminationStereotype";
	public static final String PARTICIPATIONAL = "it.unibz.inf.ontouml.vp.addParticipationalStereotype";
	public static final String PARTICIPATION = "it.unibz.inf.ontouml.vp.addParticipationStereotype";
	public static final String HISTORICAL_DEPENDENCE = "it.unibz.inf.ontouml.vp.addHistoricalDependenceStereotype";
	public static final String CREATION = "it.unibz.inf.ontouml.vp.addCreationStereotype";
	public static final String MANIFESTATION = "it.unibz.inf.ontouml.vp.addManifestationStereotype";
	
	public static final String BRINGS_ABOUT= "it.unibz.inf.ontouml.vp.addBringsAboutStereotype";
	public static final String TRIGGERS= "it.unibz.inf.ontouml.vp.addTriggersStereotype";

	public static final String SUB_QUANTITY_OF = "it.unibz.inf.ontouml.vp.addSubQuantityStereotype";
	public static final String SUB_COLLECTION_OF = "it.unibz.inf.ontouml.vp.addSubCollectionStereotype";
	public static final String MEMBER_OF = "it.unibz.inf.ontouml.vp.addMemberOfStereotype";
	public static final String MEDIATION = "it.unibz.inf.ontouml.vp.addMediationStereotype";
	public static final String MATERIAL = "it.unibz.inf.ontouml.vp.addMaterialStereotype";
	public static final String EXTERNAL_DEPENDENCE = "it.unibz.inf.ontouml.vp.addExternalDependenceStereotype";
	public static final String COMPONENT_OF = "it.unibz.inf.ontouml.vp.addComponentOfStereotype";
	public static final String COMPARATIVE = "it.unibz.inf.ontouml.vp.addComparativeStereotype";
	public static final String CHARACTERIZATION = "it.unibz.inf.ontouml.vp.addCharacterizationStereotype";

	// Attribute stereotypes (ordered as in plugin.xml)
	public static final String END = "it.unibz.inf.ontouml.vp.addEndStereotype";
	public static final String BEGIN = "it.unibz.inf.ontouml.vp.addBeginStereotype";
	
//	//Fixed Menu ActionIds
	public static final String TYPE_FIXED = "it.unibz.inf.ontouml.vp.addTypeStereotype.fixedMenu";

	public static final String HISTORICAL_ROLE_FIXED = "it.unibz.inf.ontouml.vp.addHistoricalRoleStereotype.fixedMenu";
	public static final String HISTORICAL_ROLE_MIXIN_FIXED = "it.unibz.inf.ontouml.vp.addHistoricalRoleMixinStereotype.fixedMenu";
	public static final String EVENT_FIXED = "it.unibz.inf.ontouml.vp.addEventStereotype.fixedMenu";
	
	public static final String SITUATION_FIXED = "it.unibz.inf.ontouml.vp.addSituationStereotype.fixedMenu";

	public static final String ENUMERATION_FIXED = "it.unibz.inf.ontouml.vp.addEnumerationStereotype.fixedMenu";
	public static final String DATATYPE_FIXED = "it.unibz.inf.ontouml.vp.addDatatypeStereotype.fixedMenu";

	public static final String SUBKIND_FIXED = "it.unibz.inf.ontouml.vp.addSubkindStereotype.fixedMenu";
	public static final String ROLE_MIXIN_FIXED = "it.unibz.inf.ontouml.vp.addRoleMixinStereotype.fixedMenu";
	public static final String ROLE_FIXED = "it.unibz.inf.ontouml.vp.addRoleStereotype.fixedMenu";
	public static final String RELATOR_FIXED = "it.unibz.inf.ontouml.vp.addRelatorStereotype.fixedMenu";
	public static final String QUANTITY_FIXED = "it.unibz.inf.ontouml.vp.addQuantityStereotype.fixedMenu";
	public static final String QUALITY_FIXED = "it.unibz.inf.ontouml.vp.addQualityStereotype.fixedMenu";
	public static final String PHASE_MIXIN_FIXED = "it.unibz.inf.ontouml.vp.addPhaseMixinStereotype.fixedMenu";
	public static final String PHASE_FIXED = "it.unibz.inf.ontouml.vp.addPhaseStereotype.fixedMenu";
	public static final String MODE_FIXED = "it.unibz.inf.ontouml.vp.addModeStereotype.fixedMenu";
	public static final String MIXIN_FIXED = "it.unibz.inf.ontouml.vp.addMixinStereotype.fixedMenu";
	public static final String KIND_FIXED = "it.unibz.inf.ontouml.vp.addKindStereotype.fixedMenu";
	public static final String COLLECTIVE_FIXED = "it.unibz.inf.ontouml.vp.addCollectiveStereotype.fixedMenu";
	public static final String CATEGORY_FIXED = "it.unibz.inf.ontouml.vp.addCategoryStereotype.fixedMenu";

	// Association stereotypes (ordered as in plugin.xml)
	public static final String INSTANTIATION_FIXED = "it.unibz.inf.ontouml.vp.addInstantiationStereotype.fixedMenu";

	public static final String TERMINATION_FIXED = "it.unibz.inf.ontouml.vp.addTerminationStereotype.fixedMenu";
	public static final String PARTICIPATIONAL_FIXED = "it.unibz.inf.ontouml.vp.addParticipationalStereotype.fixedMenu";
	public static final String PARTICIPATION_FIXED = "it.unibz.inf.ontouml.vp.addParticipationStereotype.fixedMenu";
	public static final String HISTORICAL_DEPENDENCE_FIXED = "it.unibz.inf.ontouml.vp.addHistoricalDependenceStereotype.fixedMenu";
	public static final String CREATION_FIXED = "it.unibz.inf.ontouml.vp.addCreationStereotype.fixedMenu";
	public static final String MANIFESTATION_FIXED = "it.unibz.inf.ontouml.vp.addManifestationStereotype.fixedMenu";
	
	public static final String BRINGS_ABOUT_FIXED = "it.unibz.inf.ontouml.vp.addBringsStereotype.fixedMenu";
	public static final String TRIGGERS_FIXED = "it.unibz.inf.ontouml.vp.addTriggersStereotype.fixedMenu";

	public static final String SUB_QUANTITY_OF_FIXED = "it.unibz.inf.ontouml.vp.addSubQuantityStereotype.fixedMenu";
	public static final String SUB_COLLECTION_OF_FIXED = "it.unibz.inf.ontouml.vp.addSubCollectionStereotype.fixedMenu";
	public static final String MEMBER_OF_FIXED = "it.unibz.inf.ontouml.vp.addMemberOfStereotype.fixedMenu";
	public static final String MEDIATION_FIXED = "it.unibz.inf.ontouml.vp.addMediationStereotype.fixedMenu";
	public static final String MATERIAL_FIXED = "it.unibz.inf.ontouml.vp.addMaterialStereotype.fixedMenu";
	public static final String EXTERNAL_DEPENDENCE_FIXED = "it.unibz.inf.ontouml.vp.addExternalDependenceStereotype.fixedMenu";
	public static final String COMPONENT_OF_FIXED = "it.unibz.inf.ontouml.vp.addComponentOfStereotype.fixedMenu";
	public static final String COMPARATIVE_FIXED = "it.unibz.inf.ontouml.vp.addComparativeStereotype.fixedMenu";
	public static final String CHARACTERIZATION_FIXED = "it.unibz.inf.ontouml.vp.addCharacterizationStereotype.fixedMenu";

	// Attribute stereotypes (ordered as in plugin.xml)
	public static final String END_FIXED = "it.unibz.inf.ontouml.vp.addEndStereotype.fixedMenu";
	public static final String BEGIN_FIXED = "it.unibz.inf.ontouml.vp.addBeginStereotype.fixedMenu";

	// Properties menu options IDs
	public static final String PROPERTY_SET_RESTRICTED_TO = "it.unibz.inf.ontouml.vp.ClassProperties.restrictedTo";
	public static final String PROPERTY_SET_IS_EXTENSIONAL = "it.unibz.inf.ontouml.vp.ClassProperties.isExtensional";
	public static final String PROPERTY_SET_IS_DERIVED = "it.unibz.inf.ontouml.vp.ClassProperties.isDerived";
	public static final String PROPERTY_SET_IS_ABSTRACT = "it.unibz.inf.ontouml.vp.ClassProperties.isAbstract";
	public static final String PROPERTY_SET_IS_POWERTYPE = "it.unibz.inf.ontouml.vp.ClassProperties.isPowertype";
	public static final String PROPERTY_SET_ORDER = "it.unibz.inf.ontouml.vp.ClassProperties.order";

	public static String classStereotypeToActionID(String stereotype) {
		switch(stereotype) {
			case StereotypeUtils.STR_TYPE:
				return TYPE;
			case StereotypeUtils.STR_HISTORICAL_ROLE:
				return HISTORICAL_ROLE;
			case StereotypeUtils.STR_HISTORICAL_ROLE_MIXIN:
				return HISTORICAL_ROLE_MIXIN;
			case StereotypeUtils.STR_EVENT:
				return EVENT;
			case StereotypeUtils.STR_SITUATION:
				return SITUATION;
			case StereotypeUtils.STR_CATEGORY:
				return CATEGORY;
			case StereotypeUtils.STR_MIXIN:
				return MIXIN;
			case StereotypeUtils.STR_ROLE_MIXIN:
				return ROLE_MIXIN;
			case StereotypeUtils.STR_PHASE_MIXIN:
				return PHASE_MIXIN;
			case StereotypeUtils.STR_KIND:
				return KIND;
			case StereotypeUtils.STR_COLLECTIVE:
				return COLLECTIVE;
			case StereotypeUtils.STR_QUANTITY:
				return QUANTITY;
			case StereotypeUtils.STR_RELATOR:
				return RELATOR;
			case StereotypeUtils.STR_QUALITY:
				return QUALITY;
			case StereotypeUtils.STR_MODE:
				return MODE;
			case StereotypeUtils.STR_SUBKIND:
				return SUBKIND;
			case StereotypeUtils.STR_ROLE:
				return ROLE;
			case StereotypeUtils.STR_PHASE:
				return PHASE;
			case StereotypeUtils.STR_ENUMERATION:
				return ENUMERATION;
			case StereotypeUtils.STR_DATATYPE:
				return DATATYPE;
			default:
				return  null;
		}
	}
	
	public static String associationStereotypeToActionID(String stereotype) {
		switch(stereotype) {
			case StereotypeUtils.STR_INSTANTIATION:
			    return INSTANTIATION;
			case StereotypeUtils.STR_TERMINATION:
			    return TERMINATION;
			case StereotypeUtils.STR_PARTICIPATIONAL:
			    return PARTICIPATIONAL;
			case StereotypeUtils.STR_PARTICIPATION:
			    return PARTICIPATION;
			case StereotypeUtils.STR_HISTORICAL_DEPENDENCE:
			    return HISTORICAL_DEPENDENCE;
			case StereotypeUtils.STR_CREATION:
			    return CREATION;
			case StereotypeUtils.STR_MANIFESTATION:
			    return MANIFESTATION;
			case StereotypeUtils.STR_BRINGS_ABOUT:
			    return BRINGS_ABOUT;
			case StereotypeUtils.STR_TRIGGERS:
			    return TRIGGERS;
			case StereotypeUtils.STR_SUB_QUANTITY_OF:
			    return SUB_QUANTITY_OF;
			case StereotypeUtils.STR_SUB_COLLECTION_OF:
			    return SUB_COLLECTION_OF;
			case StereotypeUtils.STR_MEMBER_OF:
			    return MEMBER_OF;
			case StereotypeUtils.STR_MEDIATION:
			    return MEDIATION;
			case StereotypeUtils.STR_MATERIAL:
			    return MATERIAL;
			case StereotypeUtils.STR_EXTERNAL_DEPENDENCE:
			    return EXTERNAL_DEPENDENCE;
			case StereotypeUtils.STR_COMPONENT_OF:
			    return COMPONENT_OF;
			case StereotypeUtils.STR_COMPARATIVE:
			    return COMPARATIVE;
			case StereotypeUtils.STR_CHARACTERIZATION:
			    return CHARACTERIZATION;
		    default:
		    	return null;
		}
	}
}