package apimodels;

import apimodels.CFDefinitionType;
import apimodels.CFPckgAssociationType;
import apimodels.CFPckgDocumentType;
import apimodels.CFPckgItemType;
import apimodels.CFRubricType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for all of the data for a Competency Framework Package i.e. the root CFDocument and ALL of the corresponding components i.e. the CFItems, CFAssociations and CFDefinitions. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFPackageType   {
  @JsonProperty("CFDocument")
  @NotNull
@Valid

  private CFPckgDocumentType cfDocument;

  @JsonProperty("CFItems")
  @Size(min=0)
@Valid

  private List<CFPckgItemType> cfItems = null;

  @JsonProperty("CFAssociations")
  @Size(min=0)
@Valid

  private List<CFPckgAssociationType> cfAssociations = null;

  @JsonProperty("CFDefinitions")
  @Valid

  private CFDefinitionType cfDefinitions;

  @JsonProperty("CFRubrics")
  @Size(min=0)
@Valid

  private List<CFRubricType> cfRubrics = null;

  public CFPackageType cfDocument(CFPckgDocumentType cfDocument) {
    this.cfDocument = cfDocument;
    return this;
  }

   /**
   * Get cfDocument
   * @return cfDocument
  **/
  public CFPckgDocumentType getCfDocument() {
    return cfDocument;
  }

  public void setCfDocument(CFPckgDocumentType cfDocument) {
    this.cfDocument = cfDocument;
  }

  public CFPackageType cfItems(List<CFPckgItemType> cfItems) {
    this.cfItems = cfItems;
    return this;
  }

  public CFPackageType addCfItemsItem(CFPckgItemType cfItemsItem) {
    if (cfItems == null) {
      cfItems = new ArrayList<>();
    }
    cfItems.add(cfItemsItem);
    return this;
  }

   /**
   * Get cfItems
   * @return cfItems
  **/
  public List<CFPckgItemType> getCfItems() {
    return cfItems;
  }

  public void setCfItems(List<CFPckgItemType> cfItems) {
    this.cfItems = cfItems;
  }

  public CFPackageType cfAssociations(List<CFPckgAssociationType> cfAssociations) {
    this.cfAssociations = cfAssociations;
    return this;
  }

  public CFPackageType addCfAssociationsItem(CFPckgAssociationType cfAssociationsItem) {
    if (cfAssociations == null) {
      cfAssociations = new ArrayList<>();
    }
    cfAssociations.add(cfAssociationsItem);
    return this;
  }

   /**
   * Get cfAssociations
   * @return cfAssociations
  **/
  public List<CFPckgAssociationType> getCfAssociations() {
    return cfAssociations;
  }

  public void setCfAssociations(List<CFPckgAssociationType> cfAssociations) {
    this.cfAssociations = cfAssociations;
  }

  public CFPackageType cfDefinitions(CFDefinitionType cfDefinitions) {
    this.cfDefinitions = cfDefinitions;
    return this;
  }

   /**
   * Get cfDefinitions
   * @return cfDefinitions
  **/
  public CFDefinitionType getCfDefinitions() {
    return cfDefinitions;
  }

  public void setCfDefinitions(CFDefinitionType cfDefinitions) {
    this.cfDefinitions = cfDefinitions;
  }

  public CFPackageType cfRubrics(List<CFRubricType> cfRubrics) {
    this.cfRubrics = cfRubrics;
    return this;
  }

  public CFPackageType addCfRubricsItem(CFRubricType cfRubricsItem) {
    if (cfRubrics == null) {
      cfRubrics = new ArrayList<>();
    }
    cfRubrics.add(cfRubricsItem);
    return this;
  }

   /**
   * Get cfRubrics
   * @return cfRubrics
  **/
  public List<CFRubricType> getCfRubrics() {
    return cfRubrics;
  }

  public void setCfRubrics(List<CFRubricType> cfRubrics) {
    this.cfRubrics = cfRubrics;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFPackageType cfPackageType = (CFPackageType) o;
    return Objects.equals(cfDocument, cfPackageType.cfDocument) &&
        Objects.equals(cfItems, cfPackageType.cfItems) &&
        Objects.equals(cfAssociations, cfPackageType.cfAssociations) &&
        Objects.equals(cfDefinitions, cfPackageType.cfDefinitions) &&
        Objects.equals(cfRubrics, cfPackageType.cfRubrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfDocument, cfItems, cfAssociations, cfDefinitions, cfRubrics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFPackageType {\n");
    
    sb.append("    cfDocument: ").append(toIndentedString(cfDocument)).append("\n");
    sb.append("    cfItems: ").append(toIndentedString(cfItems)).append("\n");
    sb.append("    cfAssociations: ").append(toIndentedString(cfAssociations)).append("\n");
    sb.append("    cfDefinitions: ").append(toIndentedString(cfDefinitions)).append("\n");
    sb.append("    cfRubrics: ").append(toIndentedString(cfRubrics)).append("\n");
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

