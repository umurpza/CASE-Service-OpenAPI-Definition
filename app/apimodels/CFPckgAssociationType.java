package apimodels;

import apimodels.LinkGenURIType;
import apimodels.LinkURIType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for the data about the relationship between two CFDocuments or between two CFItems within the context of a CFPackage. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFPckgAssociationType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  /**
   * Gets or Sets associationType
   */
  public enum AssociationTypeEnum {
    ISCHILDOF("isChildOf"),
    
    ISPEEROF("isPeerOf"),
    
    ISPARTOF("isPartOf"),
    
    EXACTMATCHOF("exactMatchOf"),
    
    PRECEDES("precedes"),
    
    ISRELATEDTO("isRelatedTo"),
    
    REPLACEDBY("replacedBy"),
    
    EXEMPLAR("exemplar"),
    
    HASSKILLLEVEL("hasSkillLevel");

    private final String value;

    AssociationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AssociationTypeEnum fromValue(String value) {
      for (AssociationTypeEnum b : AssociationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("associationType")
  @NotNull

  private AssociationTypeEnum associationType;

  @JsonProperty("sequenceNumber")
  
  private Integer sequenceNumber;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("originNodeURI")
  @NotNull
@Valid

  private LinkGenURIType originNodeURI;

  @JsonProperty("destinationNodeURI")
  @NotNull
@Valid

  private LinkGenURIType destinationNodeURI;

  @JsonProperty("CFAssociationGroupingURI")
  @Valid

  private LinkURIType cfAssociationGroupingURI;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  public CFPckgAssociationType identifier(String identifier) {
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

  public CFPckgAssociationType associationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
    return this;
  }

   /**
   * Get associationType
   * @return associationType
  **/
  public AssociationTypeEnum getAssociationType() {
    return associationType;
  }

  public void setAssociationType(AssociationTypeEnum associationType) {
    this.associationType = associationType;
  }

  public CFPckgAssociationType sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * Model Primitive Datatype = Integer
   * @return sequenceNumber
  **/
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public CFPckgAssociationType uri(URI uri) {
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

  public CFPckgAssociationType originNodeURI(LinkGenURIType originNodeURI) {
    this.originNodeURI = originNodeURI;
    return this;
  }

   /**
   * Get originNodeURI
   * @return originNodeURI
  **/
  public LinkGenURIType getOriginNodeURI() {
    return originNodeURI;
  }

  public void setOriginNodeURI(LinkGenURIType originNodeURI) {
    this.originNodeURI = originNodeURI;
  }

  public CFPckgAssociationType destinationNodeURI(LinkGenURIType destinationNodeURI) {
    this.destinationNodeURI = destinationNodeURI;
    return this;
  }

   /**
   * Get destinationNodeURI
   * @return destinationNodeURI
  **/
  public LinkGenURIType getDestinationNodeURI() {
    return destinationNodeURI;
  }

  public void setDestinationNodeURI(LinkGenURIType destinationNodeURI) {
    this.destinationNodeURI = destinationNodeURI;
  }

  public CFPckgAssociationType cfAssociationGroupingURI(LinkURIType cfAssociationGroupingURI) {
    this.cfAssociationGroupingURI = cfAssociationGroupingURI;
    return this;
  }

   /**
   * Get cfAssociationGroupingURI
   * @return cfAssociationGroupingURI
  **/
  public LinkURIType getCfAssociationGroupingURI() {
    return cfAssociationGroupingURI;
  }

  public void setCfAssociationGroupingURI(LinkURIType cfAssociationGroupingURI) {
    this.cfAssociationGroupingURI = cfAssociationGroupingURI;
  }

  public CFPckgAssociationType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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
    CFPckgAssociationType cfPckgAssociationType = (CFPckgAssociationType) o;
    return Objects.equals(identifier, cfPckgAssociationType.identifier) &&
        Objects.equals(associationType, cfPckgAssociationType.associationType) &&
        Objects.equals(sequenceNumber, cfPckgAssociationType.sequenceNumber) &&
        Objects.equals(uri, cfPckgAssociationType.uri) &&
        Objects.equals(originNodeURI, cfPckgAssociationType.originNodeURI) &&
        Objects.equals(destinationNodeURI, cfPckgAssociationType.destinationNodeURI) &&
        Objects.equals(cfAssociationGroupingURI, cfPckgAssociationType.cfAssociationGroupingURI) &&
        Objects.equals(lastChangeDateTime, cfPckgAssociationType.lastChangeDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, associationType, sequenceNumber, uri, originNodeURI, destinationNodeURI, cfAssociationGroupingURI, lastChangeDateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFPckgAssociationType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    originNodeURI: ").append(toIndentedString(originNodeURI)).append("\n");
    sb.append("    destinationNodeURI: ").append(toIndentedString(destinationNodeURI)).append("\n");
    sb.append("    cfAssociationGroupingURI: ").append(toIndentedString(cfAssociationGroupingURI)).append("\n");
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

