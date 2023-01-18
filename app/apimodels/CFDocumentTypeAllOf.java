package apimodels;

import apimodels.LinkURIType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * CFDocumentTypeAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFDocumentTypeAllOf   {
  @JsonProperty("CFPackageURI")
  @NotNull
@Valid

  private LinkURIType cfPackageURI;

  public CFDocumentTypeAllOf cfPackageURI(LinkURIType cfPackageURI) {
    this.cfPackageURI = cfPackageURI;
    return this;
  }

   /**
   * Get cfPackageURI
   * @return cfPackageURI
  **/
  public LinkURIType getCfPackageURI() {
    return cfPackageURI;
  }

  public void setCfPackageURI(LinkURIType cfPackageURI) {
    this.cfPackageURI = cfPackageURI;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFDocumentTypeAllOf cfDocumentTypeAllOf = (CFDocumentTypeAllOf) o;
    return Objects.equals(cfPackageURI, cfDocumentTypeAllOf.cfPackageURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cfPackageURI);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFDocumentTypeAllOf {\n");
    
    sb.append("    cfPackageURI: ").append(toIndentedString(cfPackageURI)).append("\n");
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

