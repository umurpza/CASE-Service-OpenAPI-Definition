package apimodels;

import apimodels.CFItemTypeType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the set of CFItemTypes supplied in the response payload. The relationship between the CFItemTypes is determined by the &#39;hierarchyCode&#39;. The first CFItemType is that which has been specified in the call. The other CFItemTypes are the set of children as determined by their place in the &#39;hierarchyCode&#39; of the CFItemType. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFItemTypeSetType   {
  @JsonProperty("CFItemTypes")
  @NotNull
@Size(min=1)
@Valid

  private List<CFItemTypeType> cfItemTypes = new ArrayList<>();

  public CFItemTypeSetType cfItemTypes(List<CFItemTypeType> cfItemTypes) {
    this.cfItemTypes = cfItemTypes;
    return this;
  }

  public CFItemTypeSetType addCfItemTypesItem(CFItemTypeType cfItemTypesItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFItemTypeSetType cfItemTypeSetType = (CFItemTypeSetType) o;
    return Objects.equals(cfItemTypes, cfItemTypeSetType.cfItemTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfItemTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFItemTypeSetType {\n");
    
    sb.append("    cfItemTypes: ").append(toIndentedString(cfItemTypes)).append("\n");
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

