package apimodels;

import apimodels.LinkURIType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CFAssociationTypeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFAssociationTypeAllOf   {
  @JsonProperty("CFDocumentURI")
  @Valid

  private LinkURIType cfDocumentURI;

  public CFAssociationTypeAllOf cfDocumentURI(LinkURIType cfDocumentURI) {
    this.cfDocumentURI = cfDocumentURI;
    return this;
  }

   /**
   * Get cfDocumentURI
   * @return cfDocumentURI
  **/
  public LinkURIType getCfDocumentURI() {
    return cfDocumentURI;
  }

  public void setCfDocumentURI(LinkURIType cfDocumentURI) {
    this.cfDocumentURI = cfDocumentURI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFAssociationTypeAllOf cfAssociationTypeAllOf = (CFAssociationTypeAllOf) o;
    return Objects.equals(cfDocumentURI, cfAssociationTypeAllOf.cfDocumentURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfDocumentURI);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFAssociationTypeAllOf {\n");
    
    sb.append("    cfDocumentURI: ").append(toIndentedString(cfDocumentURI)).append("\n");
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

