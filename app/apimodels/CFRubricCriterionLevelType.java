package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * The container for the definition of a criterion level which is addressed by the competency framework. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFRubricCriterionLevelType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("quality")
  
  private String quality;

  @JsonProperty("score")
  
  private Float score;

  @JsonProperty("feedback")
  
  private String feedback;

  @JsonProperty("position")
  
  private Integer position;

  @JsonProperty("rubricCriterionId")
  
  private String rubricCriterionId;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  public CFRubricCriterionLevelType identifier(String identifier) {
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

  public CFRubricCriterionLevelType uri(URI uri) {
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

  public CFRubricCriterionLevelType description(String description) {
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

  public CFRubricCriterionLevelType quality(String quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return quality
  **/
  public String getQuality() {
    return quality;
  }

  public void setQuality(String quality) {
    this.quality = quality;
  }

  public CFRubricCriterionLevelType score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * Model Primitive Datatype = Float
   * @return score
  **/
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }

  public CFRubricCriterionLevelType feedback(String feedback) {
    this.feedback = feedback;
    return this;
  }

   /**
   * Model Primitive Datatype = String
   * @return feedback
  **/
  public String getFeedback() {
    return feedback;
  }

  public void setFeedback(String feedback) {
    this.feedback = feedback;
  }

  public CFRubricCriterionLevelType position(Integer position) {
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

  public CFRubricCriterionLevelType rubricCriterionId(String rubricCriterionId) {
    this.rubricCriterionId = rubricCriterionId;
    return this;
  }

   /**
   * The data-type for establishing a Globally Unique Identifier (GUID). The form of the GUID is a Universally Unique Identifier (UUID) of 16 hexadecimal characters (lower case) in the format 8-4-4-4-12. All permitted versions (1-5) and variants (1-2) are supported. 
   * @return rubricCriterionId
  **/
  public String getRubricCriterionId() {
    return rubricCriterionId;
  }

  public void setRubricCriterionId(String rubricCriterionId) {
    this.rubricCriterionId = rubricCriterionId;
  }

  public CFRubricCriterionLevelType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFRubricCriterionLevelType cfRubricCriterionLevelType = (CFRubricCriterionLevelType) o;
    return Objects.equals(identifier, cfRubricCriterionLevelType.identifier) &&
        Objects.equals(uri, cfRubricCriterionLevelType.uri) &&
        Objects.equals(description, cfRubricCriterionLevelType.description) &&
        Objects.equals(quality, cfRubricCriterionLevelType.quality) &&
        Objects.equals(score, cfRubricCriterionLevelType.score) &&
        Objects.equals(feedback, cfRubricCriterionLevelType.feedback) &&
        Objects.equals(position, cfRubricCriterionLevelType.position) &&
        Objects.equals(rubricCriterionId, cfRubricCriterionLevelType.rubricCriterionId) &&
        Objects.equals(lastChangeDateTime, cfRubricCriterionLevelType.lastChangeDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, description, quality, score, feedback, position, rubricCriterionId, lastChangeDateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFRubricCriterionLevelType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    rubricCriterionId: ").append(toIndentedString(rubricCriterionId)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
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

