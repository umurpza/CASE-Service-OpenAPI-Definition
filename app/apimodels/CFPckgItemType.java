package apimodels;

import apimodels.LinkURIType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for the CFItem data within the context of a CFPackage. This is the content that either describes a specific competency (learning objective) or describes a grouping of competencies within the taxonomy of a Competency Framework Document.  
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFPckgItemType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("fullStatement")
  @NotNull

  private String fullStatement;

  @JsonProperty("alternativeLabel")
  
  private String alternativeLabel;

  @JsonProperty("CFItemType")
  
  private String cfItemType;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("humanCodingScheme")
  
  private String humanCodingScheme;

  @JsonProperty("listEnumeration")
  
  private String listEnumeration;

  @JsonProperty("abbreviatedStatement")
  
  private String abbreviatedStatement;

  @JsonProperty("conceptKeywords")
  @Size(min=0)

  private List<String> conceptKeywords = null;

  @JsonProperty("conceptKeywordsURI")
  @Valid

  private LinkURIType conceptKeywordsURI;

  @JsonProperty("notes")
  
  private String notes;

  @JsonProperty("language")
  
  private String language;

  @JsonProperty("educationLevel")
  @Size(min=0)

  private List<String> educationLevel = null;

  @JsonProperty("CFItemTypeURI")
  @Valid

  private LinkURIType cfItemTypeURI;

  @JsonProperty("licenseURI")
  @Valid

  private LinkURIType licenseURI;

  @JsonProperty("statusStartDate")
  @Valid

  private LocalDate statusStartDate;

  @JsonProperty("statusEndDate")
  @Valid

  private LocalDate statusEndDate;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  public CFPckgItemType identifier(String identifier) {
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

  public CFPckgItemType fullStatement(String fullStatement) {
    this.fullStatement = fullStatement;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return fullStatement
  **/
  public String getFullStatement() {
    return fullStatement;
  }

  public void setFullStatement(String fullStatement) {
    this.fullStatement = fullStatement;
  }

  public CFPckgItemType alternativeLabel(String alternativeLabel) {
    this.alternativeLabel = alternativeLabel;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return alternativeLabel
  **/
  public String getAlternativeLabel() {
    return alternativeLabel;
  }

  public void setAlternativeLabel(String alternativeLabel) {
    this.alternativeLabel = alternativeLabel;
  }

  public CFPckgItemType cfItemType(String cfItemType) {
    this.cfItemType = cfItemType;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return cfItemType
  **/
  public String getCfItemType() {
    return cfItemType;
  }

  public void setCfItemType(String cfItemType) {
    this.cfItemType = cfItemType;
  }

  public CFPckgItemType uri(URI uri) {
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

  public CFPckgItemType humanCodingScheme(String humanCodingScheme) {
    this.humanCodingScheme = humanCodingScheme;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return humanCodingScheme
  **/
  public String getHumanCodingScheme() {
    return humanCodingScheme;
  }

  public void setHumanCodingScheme(String humanCodingScheme) {
    this.humanCodingScheme = humanCodingScheme;
  }

  public CFPckgItemType listEnumeration(String listEnumeration) {
    this.listEnumeration = listEnumeration;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return listEnumeration
  **/
  public String getListEnumeration() {
    return listEnumeration;
  }

  public void setListEnumeration(String listEnumeration) {
    this.listEnumeration = listEnumeration;
  }

  public CFPckgItemType abbreviatedStatement(String abbreviatedStatement) {
    this.abbreviatedStatement = abbreviatedStatement;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return abbreviatedStatement
  **/
  public String getAbbreviatedStatement() {
    return abbreviatedStatement;
  }

  public void setAbbreviatedStatement(String abbreviatedStatement) {
    this.abbreviatedStatement = abbreviatedStatement;
  }

  public CFPckgItemType conceptKeywords(List<String> conceptKeywords) {
    this.conceptKeywords = conceptKeywords;
    return this;
  }

  public CFPckgItemType addConceptKeywordsItem(String conceptKeywordsItem) {
    if (conceptKeywords == null) {
      conceptKeywords = new ArrayList<>();
    }
    conceptKeywords.add(conceptKeywordsItem);
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return conceptKeywords
  **/
  public List<String> getConceptKeywords() {
    return conceptKeywords;
  }

  public void setConceptKeywords(List<String> conceptKeywords) {
    this.conceptKeywords = conceptKeywords;
  }

  public CFPckgItemType conceptKeywordsURI(LinkURIType conceptKeywordsURI) {
    this.conceptKeywordsURI = conceptKeywordsURI;
    return this;
  }

   /**
   * Get conceptKeywordsURI
   * @return conceptKeywordsURI
  **/
  public LinkURIType getConceptKeywordsURI() {
    return conceptKeywordsURI;
  }

  public void setConceptKeywordsURI(LinkURIType conceptKeywordsURI) {
    this.conceptKeywordsURI = conceptKeywordsURI;
  }

  public CFPckgItemType notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Model Primitive Datatype = String
   * @return notes
  **/
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public CFPckgItemType language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Model Primitive Datatype = Language
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public CFPckgItemType educationLevel(List<String> educationLevel) {
    this.educationLevel = educationLevel;
    return this;
  }

  public CFPckgItemType addEducationLevelItem(String educationLevelItem) {
    if (educationLevel == null) {
      educationLevel = new ArrayList<>();
    }
    educationLevel.add(educationLevelItem);
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return educationLevel
  **/
  public List<String> getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(List<String> educationLevel) {
    this.educationLevel = educationLevel;
  }

  public CFPckgItemType cfItemTypeURI(LinkURIType cfItemTypeURI) {
    this.cfItemTypeURI = cfItemTypeURI;
    return this;
  }

   /**
   * Get cfItemTypeURI
   * @return cfItemTypeURI
  **/
  public LinkURIType getCfItemTypeURI() {
    return cfItemTypeURI;
  }

  public void setCfItemTypeURI(LinkURIType cfItemTypeURI) {
    this.cfItemTypeURI = cfItemTypeURI;
  }

  public CFPckgItemType licenseURI(LinkURIType licenseURI) {
    this.licenseURI = licenseURI;
    return this;
  }

   /**
   * Get licenseURI
   * @return licenseURI
  **/
  public LinkURIType getLicenseURI() {
    return licenseURI;
  }

  public void setLicenseURI(LinkURIType licenseURI) {
    this.licenseURI = licenseURI;
  }

  public CFPckgItemType statusStartDate(LocalDate statusStartDate) {
    this.statusStartDate = statusStartDate;
    return this;
  }

   /**
   * Model Primitive Datatype = Date
   * @return statusStartDate
  **/
  public LocalDate getStatusStartDate() {
    return statusStartDate;
  }

  public void setStatusStartDate(LocalDate statusStartDate) {
    this.statusStartDate = statusStartDate;
  }

  public CFPckgItemType statusEndDate(LocalDate statusEndDate) {
    this.statusEndDate = statusEndDate;
    return this;
  }

   /**
   * Model Primitive Datatype = Date
   * @return statusEndDate
  **/
  public LocalDate getStatusEndDate() {
    return statusEndDate;
  }

  public void setStatusEndDate(LocalDate statusEndDate) {
    this.statusEndDate = statusEndDate;
  }

  public CFPckgItemType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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
    CFPckgItemType cfPckgItemType = (CFPckgItemType) o;
    return Objects.equals(identifier, cfPckgItemType.identifier) &&
        Objects.equals(fullStatement, cfPckgItemType.fullStatement) &&
        Objects.equals(alternativeLabel, cfPckgItemType.alternativeLabel) &&
        Objects.equals(cfItemType, cfPckgItemType.cfItemType) &&
        Objects.equals(uri, cfPckgItemType.uri) &&
        Objects.equals(humanCodingScheme, cfPckgItemType.humanCodingScheme) &&
        Objects.equals(listEnumeration, cfPckgItemType.listEnumeration) &&
        Objects.equals(abbreviatedStatement, cfPckgItemType.abbreviatedStatement) &&
        Objects.equals(conceptKeywords, cfPckgItemType.conceptKeywords) &&
        Objects.equals(conceptKeywordsURI, cfPckgItemType.conceptKeywordsURI) &&
        Objects.equals(notes, cfPckgItemType.notes) &&
        Objects.equals(language, cfPckgItemType.language) &&
        Objects.equals(educationLevel, cfPckgItemType.educationLevel) &&
        Objects.equals(cfItemTypeURI, cfPckgItemType.cfItemTypeURI) &&
        Objects.equals(licenseURI, cfPckgItemType.licenseURI) &&
        Objects.equals(statusStartDate, cfPckgItemType.statusStartDate) &&
        Objects.equals(statusEndDate, cfPckgItemType.statusEndDate) &&
        Objects.equals(lastChangeDateTime, cfPckgItemType.lastChangeDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, fullStatement, alternativeLabel, cfItemType, uri, humanCodingScheme, listEnumeration, abbreviatedStatement, conceptKeywords, conceptKeywordsURI, notes, language, educationLevel, cfItemTypeURI, licenseURI, statusStartDate, statusEndDate, lastChangeDateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFPckgItemType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    fullStatement: ").append(toIndentedString(fullStatement)).append("\n");
    sb.append("    alternativeLabel: ").append(toIndentedString(alternativeLabel)).append("\n");
    sb.append("    cfItemType: ").append(toIndentedString(cfItemType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    humanCodingScheme: ").append(toIndentedString(humanCodingScheme)).append("\n");
    sb.append("    listEnumeration: ").append(toIndentedString(listEnumeration)).append("\n");
    sb.append("    abbreviatedStatement: ").append(toIndentedString(abbreviatedStatement)).append("\n");
    sb.append("    conceptKeywords: ").append(toIndentedString(conceptKeywords)).append("\n");
    sb.append("    conceptKeywordsURI: ").append(toIndentedString(conceptKeywordsURI)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    cfItemTypeURI: ").append(toIndentedString(cfItemTypeURI)).append("\n");
    sb.append("    licenseURI: ").append(toIndentedString(licenseURI)).append("\n");
    sb.append("    statusStartDate: ").append(toIndentedString(statusStartDate)).append("\n");
    sb.append("    statusEndDate: ").append(toIndentedString(statusEndDate)).append("\n");
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

