package apimodels;

import apimodels.CFAssociationGroupingType;
import apimodels.CFConceptType;
import apimodels.CFItemTypeType;
import apimodels.CFLicenseType;
import apimodels.CFSubjectType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the set of definitions used for the competency framework i.e. the set of CFSubjects, CFConcepts, CFItemTypes, CFAssociationGroupings and CFLicenses. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFDefinitionType   {
  @JsonProperty("CFConcepts")
  @Size(min=0)
@Valid

  private List<CFConceptType> cfConcepts = null;

  @JsonProperty("CFSubjects")
  @Size(min=0)
@Valid

  private List<CFSubjectType> cfSubjects = null;

  @JsonProperty("CFLicenses")
  @Size(min=0)
@Valid

  private List<CFLicenseType> cfLicenses = null;

  @JsonProperty("CFItemTypes")
  @Size(min=0)
@Valid

  private List<CFItemTypeType> cfItemTypes = null;

  @JsonProperty("CFAssociationGroupings")
  @Size(min=0)
@Valid

  private List<CFAssociationGroupingType> cfAssociationGroupings = null;

  public CFDefinitionType cfConcepts(List<CFConceptType> cfConcepts) {
    this.cfConcepts = cfConcepts;
    return this;
  }

  public CFDefinitionType addCfConceptsItem(CFConceptType cfConceptsItem) {
    if (cfConcepts == null) {
      cfConcepts = new ArrayList<>();
    }
    cfConcepts.add(cfConceptsItem);
    return this;
  }

   /**
   * Get cfConcepts
   * @return cfConcepts
  **/
  public List<CFConceptType> getCfConcepts() {
    return cfConcepts;
  }

  public void setCfConcepts(List<CFConceptType> cfConcepts) {
    this.cfConcepts = cfConcepts;
  }

  public CFDefinitionType cfSubjects(List<CFSubjectType> cfSubjects) {
    this.cfSubjects = cfSubjects;
    return this;
  }

  public CFDefinitionType addCfSubjectsItem(CFSubjectType cfSubjectsItem) {
    if (cfSubjects == null) {
      cfSubjects = new ArrayList<>();
    }
    cfSubjects.add(cfSubjectsItem);
    return this;
  }

   /**
   * Get cfSubjects
   * @return cfSubjects
  **/
  public List<CFSubjectType> getCfSubjects() {
    return cfSubjects;
  }

  public void setCfSubjects(List<CFSubjectType> cfSubjects) {
    this.cfSubjects = cfSubjects;
  }

  public CFDefinitionType cfLicenses(List<CFLicenseType> cfLicenses) {
    this.cfLicenses = cfLicenses;
    return this;
  }

  public CFDefinitionType addCfLicensesItem(CFLicenseType cfLicensesItem) {
    if (cfLicenses == null) {
      cfLicenses = new ArrayList<>();
    }
    cfLicenses.add(cfLicensesItem);
    return this;
  }

   /**
   * Get cfLicenses
   * @return cfLicenses
  **/
  public List<CFLicenseType> getCfLicenses() {
    return cfLicenses;
  }

  public void setCfLicenses(List<CFLicenseType> cfLicenses) {
    this.cfLicenses = cfLicenses;
  }

  public CFDefinitionType cfItemTypes(List<CFItemTypeType> cfItemTypes) {
    this.cfItemTypes = cfItemTypes;
    return this;
  }

  public CFDefinitionType addCfItemTypesItem(CFItemTypeType cfItemTypesItem) {
    if (cfItemTypes == null) {
      cfItemTypes = new ArrayList<>();
    }
    cfItemTypes.add(cfItemTypesItem);
    return this;
  }

   /**
   * Get cfItemTypes
   * @return cfItemTypes
  **/
  public List<CFItemTypeType> getCfItemTypes() {
    return cfItemTypes;
  }

  public void setCfItemTypes(List<CFItemTypeType> cfItemTypes) {
    this.cfItemTypes = cfItemTypes;
  }

  public CFDefinitionType cfAssociationGroupings(List<CFAssociationGroupingType> cfAssociationGroupings) {
    this.cfAssociationGroupings = cfAssociationGroupings;
    return this;
  }

  public CFDefinitionType addCfAssociationGroupingsItem(CFAssociationGroupingType cfAssociationGroupingsItem) {
    if (cfAssociationGroupings == null) {
      cfAssociationGroupings = new ArrayList<>();
    }
    cfAssociationGroupings.add(cfAssociationGroupingsItem);
    return this;
  }

   /**
   * Get cfAssociationGroupings
   * @return cfAssociationGroupings
  **/
  public List<CFAssociationGroupingType> getCfAssociationGroupings() {
    return cfAssociationGroupings;
  }

  public void setCfAssociationGroupings(List<CFAssociationGroupingType> cfAssociationGroupings) {
    this.cfAssociationGroupings = cfAssociationGroupings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFDefinitionType cfDefinitionType = (CFDefinitionType) o;
    return Objects.equals(cfConcepts, cfDefinitionType.cfConcepts) &&
        Objects.equals(cfSubjects, cfDefinitionType.cfSubjects) &&
        Objects.equals(cfLicenses, cfDefinitionType.cfLicenses) &&
        Objects.equals(cfItemTypes, cfDefinitionType.cfItemTypes) &&
        Objects.equals(cfAssociationGroupings, cfDefinitionType.cfAssociationGroupings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfConcepts, cfSubjects, cfLicenses, cfItemTypes, cfAssociationGroupings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFDefinitionType {\n");
    
    sb.append("    cfConcepts: ").append(toIndentedString(cfConcepts)).append("\n");
    sb.append("    cfSubjects: ").append(toIndentedString(cfSubjects)).append("\n");
    sb.append("    cfLicenses: ").append(toIndentedString(cfLicenses)).append("\n");
    sb.append("    cfItemTypes: ").append(toIndentedString(cfItemTypes)).append("\n");
    sb.append("    cfAssociationGroupings: ").append(toIndentedString(cfAssociationGroupings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

