package apimodels;

import apimodels.CFRubricCriterionLevelType;
import apimodels.LinkURIType;
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
 * The container for the definition of a rubric criterion which is addressed by the competency framework. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFRubricCriterionType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("category")
  
  private String category;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("CFItemURI")
  @Valid

  private LinkURIType cfItemURI;

  @JsonProperty("weight")
  
  private Float weight;

  @JsonProperty("position")
  
  private Integer position;

  @JsonProperty("rubricId")
  
  private String rubricId;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  @JsonProperty("CFRubricCriterionLevels")
  @Size(min=0)
@Valid

  private List<CFRubricCriterionLevelType> cfRubricCriterionLevels = null;

  public CFRubricCriterionType identifier(String identifier) {
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

  public CFRubricCriterionType uri(URI uri) {
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

  public CFRubricCriterionType category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return category
  **/
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CFRubricCriterionType description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Model Primitive Datatype = String
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CFRubricCriterionType cfItemURI(LinkURIType cfItemURI) {
    this.cfItemURI = cfItemURI;
    return this;
  }

   /**
   * Get cfItemURI
   * @return cfItemURI
  **/
  public LinkURIType getCfItemURI() {
    return cfItemURI;
  }

  public void setCfItemURI(LinkURIType cfItemURI) {
    this.cfItemURI = cfItemURI;
  }

  public CFRubricCriterionType weight(Float weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Model Primitive Datatype = Float
   * @return weight
  **/
  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public CFRubricCriterionType position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Model Primitive Datatype = Integer
   * @return position
  **/
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public CFRubricCriterionType rubricId(String rubricId) {
    this.rubricId = rubricId;
    return this;
  }

   /**
   * The data-type for establishing a Globally Unique Identifier (GUID). The form of the GUID is a Universally Unique Identifier (UUID) of 16 hexadecimal characters (lower case) in the format 8-4-4-4-12. All permitted versions (1-5) and variants (1-2) are supported. 
   * @return rubricId
  **/
  public String getRubricId() {
    return rubricId;
  }

  public void setRubricId(String rubricId) {
    this.rubricId = rubricId;
  }

  public CFRubricCriterionType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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

  public CFRubricCriterionType cfRubricCriterionLevels(List<CFRubricCriterionLevelType> cfRubricCriterionLevels) {
    this.cfRubricCriterionLevels = cfRubricCriterionLevels;
    return this;
  }

  public CFRubricCriterionType addCfRubricCriterionLevelsItem(CFRubricCriterionLevelType cfRubricCriterionLevelsItem) {
    if (cfRubricCriterionLevels == null) {
      cfRubricCriterionLevels = new ArrayList<>();
    }
    cfRubricCriterionLevels.add(cfRubricCriterionLevelsItem);
    return this;
  }

   /**
   * Get cfRubricCriterionLevels
   * @return cfRubricCriterionLevels
  **/
  public List<CFRubricCriterionLevelType> getCfRubricCriterionLevels() {
    return cfRubricCriterionLevels;
  }

  public void setCfRubricCriterionLevels(List<CFRubricCriterionLevelType> cfRubricCriterionLevels) {
    this.cfRubricCriterionLevels = cfRubricCriterionLevels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFRubricCriterionType cfRubricCriterionType = (CFRubricCriterionType) o;
    return Objects.equals(identifier, cfRubricCriterionType.identifier) &&
        Objects.equals(uri, cfRubricCriterionType.uri) &&
        Objects.equals(category, cfRubricCriterionType.category) &&
        Objects.equals(description, cfRubricCriterionType.description) &&
        Objects.equals(cfItemURI, cfRubricCriterionType.cfItemURI) &&
        Objects.equals(weight, cfRubricCriterionType.weight) &&
        Objects.equals(position, cfRubricCriterionType.position) &&
        Objects.equals(rubricId, cfRubricCriterionType.rubricId) &&
        Objects.equals(lastChangeDateTime, cfRubricCriterionType.lastChangeDateTime) &&
        Objects.equals(cfRubricCriterionLevels, cfRubricCriterionType.cfRubricCriterionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, category, description, cfItemURI, weight, position, rubricId, lastChangeDateTime, cfRubricCriterionLevels);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFRubricCriterionType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cfItemURI: ").append(toIndentedString(cfItemURI)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rubricId: ").append(toIndentedString(rubricId)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
    sb.append("    cfRubricCriterionLevels: ").append(toIndentedString(cfRubricCriterionLevels)).append("\n");
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

