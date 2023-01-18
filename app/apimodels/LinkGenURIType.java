package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * A container for the information that is used to achieve the link data reference. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LinkGenURIType   {
  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  public LinkGenURIType title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public LinkGenURIType identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return identifier
  **/
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public LinkGenURIType uri(URI uri) {
    this.uri = uri;
    return this;
  }

   /**
   * Model Primitive Datatype = AnyURI
   * @return uri
  **/
  public URI getUri() {
    return uri;
  }

  public void setUri(URI uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkGenURIType linkGenURIType = (LinkGenURIType) o;
    return Objects.equals(title, linkGenURIType.title) &&
        Objects.equals(identifier, linkGenURIType.identifier) &&
        Objects.equals(uri, linkGenURIType.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, identifier, uri);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkGenURIType {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

