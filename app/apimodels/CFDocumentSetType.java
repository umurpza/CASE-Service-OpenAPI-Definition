package apimodels;

import apimodels.CFDocumentType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for a collection of CFDocuments. There must be at least one CFDocument. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFDocumentSetType   {
  @JsonProperty("CFDocuments")
  @NotNull
@Size(min=1)
@Valid

  private List<CFDocumentType> cfDocuments = new ArrayList<>();

  public CFDocumentSetType cfDocuments(List<CFDocumentType> cfDocuments) {
    this.cfDocuments = cfDocuments;
    return this;
  }

  public CFDocumentSetType addCfDocumentsItem(CFDocumentType cfDocumentsItem) {
    cfDocuments.add(cfDocumentsItem);
    return this;
  }

   /**
   * Get cfDocuments
   * @return cfDocuments
  **/
  public List<CFDocumentType> getCfDocuments() {
    return cfDocuments;
  }

  public void setCfDocuments(List<CFDocumentType> cfDocuments) {
    this.cfDocuments = cfDocuments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFDocumentSetType cfDocumentSetType = (CFDocumentSetType) o;
    return Objects.equals(cfDocuments, cfDocumentSetType.cfDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfDocuments);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFDocumentSetType {\n");
    
    sb.append("    cfDocuments: ").append(toIndentedString(cfDocuments)).append("\n");
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

