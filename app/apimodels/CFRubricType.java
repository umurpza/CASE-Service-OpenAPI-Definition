package apimodels;

import apimodels.CFRubricCriterionType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the definition of a rubric which is addressed by the competency framework. This includes the set of associated CFRubricCriteria and CFRubricCriterionLevels. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFRubricType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  @JsonProperty("CFRubricCriteria")
  @Size(min=0)
@Valid

  private List<CFRubricCriterionType> cfRubricCriteria = null;

  public CFRubricType identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The data-type for establishing a Globally Unique Identifier (GUID). The form of the GUID is a Universally Unique Identifier (UUID) of 16 hexadecimal characters (lower case) in the format 8-4-4-4-12. All permitted versions (1-5) and variants (1-2) are supported. 
   * @return identifier
  **/
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public CFRubricType uri(URI uri) {
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

  public CFRubricType title(String title) {
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

  public CFRubricType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CFRubricType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
    return this;
  }

   /**
   * Model Primitive Datatype = DateTime
   * @return lastChangeDateTime
  **/
  public OffsetDateTime getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  public void setLastChangeDateTime(OffsetDateTime lastChangeDateTime) {
    this.lastChangeDateTime = lastChangeDateTime;
  }

  public CFRubricType cfRubricCriteria(List<CFRubricCriterionType> cfRubricCriteria) {
    this.cfRubricCriteria = cfRubricCriteria;
    return this;
  }

  public CFRubricType addCfRubricCriteriaItem(CFRubricCriterionType cfRubricCriteriaItem) {
    if (cfRubricCriteria == null) {
      cfRubricCriteria = new ArrayList<>();
    }
    cfRubricCriteria.add(cfRubricCriteriaItem);
    return this;
  }

   /**
   * Get cfRubricCriteria
   * @return cfRubricCriteria
  **/
  public List<CFRubricCriterionType> getCfRubricCriteria() {
    return cfRubricCriteria;
  }

  public void setCfRubricCriteria(List<CFRubricCriterionType> cfRubricCriteria) {
    this.cfRubricCriteria = cfRubricCriteria;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFRubricType cfRubricType = (CFRubricType) o;
    return Objects.equals(identifier, cfRubricType.identifier) &&
        Objects.equals(uri, cfRubricType.uri) &&
        Objects.equals(title, cfRubricType.title) &&
        Objects.equals(description, cfRubricType.description) &&
        Objects.equals(lastChangeDateTime, cfRubricType.lastChangeDateTime) &&
        Objects.equals(cfRubricCriteria, cfRubricType.cfRubricCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, title, description, lastChangeDateTime, cfRubricCriteria);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFRubricType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
    sb.append("    cfRubricCriteria: ").append(toIndentedString(cfRubricCriteria)).append("\n");
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

