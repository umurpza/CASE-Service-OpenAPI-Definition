package apimodels;

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
 * The container for the set of CFSubjects supplied in the response payload. The relationship between the CFSubjects is determined by the &#39;hierarchyCode&#39;. The first CFSubject is that which has been specified in the call. The other CFSubjects are the set of children as determined by their place in the &#39;hierarchyCode&#39; of the CFSubject. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFSubjectSetType   {
  @JsonProperty("CFSubjects")
  @NotNull
@Size(min=1)
@Valid

  private List<CFSubjectType> cfSubjects = new ArrayList<>();

  public CFSubjectSetType cfSubjects(List<CFSubjectType> cfSubjects) {
    this.cfSubjects = cfSubjects;
    return this;
  }

  public CFSubjectSetType addCfSubjectsItem(CFSubjectType cfSubjectsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFSubjectSetType cfSubjectSetType = (CFSubjectSetType) o;
    return Objects.equals(cfSubjects, cfSubjectSetType.cfSubjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfSubjects);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFSubjectSetType {\n");
    
    sb.append("    cfSubjects: ").append(toIndentedString(cfSubjects)).append("\n");
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

