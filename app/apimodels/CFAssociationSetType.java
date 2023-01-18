package apimodels;

import apimodels.CFItemType;
import apimodels.CFPckgAssociationType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for a collection of CFAssociations. There must be at least one CFAssociation. Note that the association can be between CFDocuments or between CFItems. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFAssociationSetType   {
  @JsonProperty("CFItem")
  @NotNull
@Valid

  private CFItemType cfItem;

  @JsonProperty("CFAssociations")
  @NotNull
@Size(min=1)
@Valid

  private List<CFPckgAssociationType> cfAssociations = new ArrayList<>();

  public CFAssociationSetType cfItem(CFItemType cfItem) {
    this.cfItem = cfItem;
    return this;
  }

   /**
   * Get cfItem
   * @return cfItem
  **/
  public CFItemType getCfItem() {
    return cfItem;
  }

  public void setCfItem(CFItemType cfItem) {
    this.cfItem = cfItem;
  }

  public CFAssociationSetType cfAssociations(List<CFPckgAssociationType> cfAssociations) {
    this.cfAssociations = cfAssociations;
    return this;
  }

  public CFAssociationSetType addCfAssociationsItem(CFPckgAssociationType cfAssociationsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFAssociationSetType cfAssociationSetType = (CFAssociationSetType) o;
    return Objects.equals(cfItem, cfAssociationSetType.cfItem) &&
        Objects.equals(cfAssociations, cfAssociationSetType.cfAssociations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfItem, cfAssociations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFAssociationSetType {\n");
    
    sb.append("    cfItem: ").append(toIndentedString(cfItem)).append("\n");
    sb.append("    cfAssociations: ").append(toIndentedString(cfAssociations)).append("\n");
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

