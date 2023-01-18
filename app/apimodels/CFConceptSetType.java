package apimodels;

import apimodels.CFConceptType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the set of CFConcepts supplied in the response payload. The relationship between the CFConcepts is determined by the &#39;hierarchyCode&#39;. The first CFConcept is that which has been specified in the call. The other CFConcepts are the set of children as determined by their place in the &#39;hierarchyCode&#39; of the CFConcept. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFConceptSetType   {
  @JsonProperty("CFConcepts")
  @NotNull
@Size(min=1)
@Valid

  private List<CFConceptType> cfConcepts = new ArrayList<>();

  public CFConceptSetType cfConcepts(List<CFConceptType> cfConcepts) {
    this.cfConcepts = cfConcepts;
    return this;
  }

  public CFConceptSetType addCfConceptsItem(CFConceptType cfConceptsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFConceptSetType cfConceptSetType = (CFConceptSetType) o;
    return Objects.equals(cfConcepts, cfConceptSetType.cfConcepts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfConcepts);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFConceptSetType {\n");
    
    sb.append("    cfConcepts: ").append(toIndentedString(cfConcepts)).append("\n");
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

