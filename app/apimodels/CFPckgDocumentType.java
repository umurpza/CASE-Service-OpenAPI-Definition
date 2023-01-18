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
 * The container for the data about a competency framework document (CFDocument) within a CFPackage. A CFDocument is the root for the creation of a learning standard/competency. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFPckgDocumentType   {
  @JsonProperty("identifier")
  @NotNull

  private String identifier;

  @JsonProperty("uri")
  @NotNull
@Valid

  private URI uri;

  @JsonProperty("creator")
  @NotNull

  private String creator;

  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("lastChangeDateTime")
  @NotNull
@Valid

  private OffsetDateTime lastChangeDateTime;

  @JsonProperty("officialSourceURL")
  @Valid

  private URI officialSourceURL;

  @JsonProperty("publisher")
  
  private String publisher;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("subject")
  @Size(min=0)

  private List<String> subject = null;

  @JsonProperty("subjectURI")
  @Size(min=0)
@Valid

  private List<LinkURIType> subjectURI = null;

  @JsonProperty("language")
  
  private String language;

  @JsonProperty("version")
  
  private String version;

  @JsonProperty("adoptionStatus")
  
  private String adoptionStatus;

  @JsonProperty("statusStartDate")
  @Valid

  private LocalDate statusStartDate;

  @JsonProperty("statusEndDate")
  @Valid

  private LocalDate statusEndDate;

  @JsonProperty("licenseURI")
  @Valid

  private LinkURIType licenseURI;

  @JsonProperty("notes")
  
  private String notes;

  public CFPckgDocumentType identifier(String identifier) {
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

  public CFPckgDocumentType uri(URI uri) {
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

  public CFPckgDocumentType creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return creator
  **/
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public CFPckgDocumentType title(String title) {
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

  public CFPckgDocumentType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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

  public CFPckgDocumentType officialSourceURL(URI officialSourceURL) {
    this.officialSourceURL = officialSourceURL;
    return this;
  }

   /**
   * The data-type for establishing a Uniform Resource Locator (URL) as defined by W3C. 
   * @return officialSourceURL
  **/
  public URI getOfficialSourceURL() {
    return officialSourceURL;
  }

  public void setOfficialSourceURL(URI officialSourceURL) {
    this.officialSourceURL = officialSourceURL;
  }

  public CFPckgDocumentType publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return publisher
  **/
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public CFPckgDocumentType description(String description) {
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

  public CFPckgDocumentType subject(List<String> subject) {
    this.subject = subject;
    return this;
  }

  public CFPckgDocumentType addSubjectItem(String subjectItem) {
    if (subject == null) {
      subject = new ArrayList<>();
    }
    subject.add(subjectItem);
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return subject
  **/
  public List<String> getSubject() {
    return subject;
  }

  public void setSubject(List<String> subject) {
    this.subject = subject;
  }

  public CFPckgDocumentType subjectURI(List<LinkURIType> subjectURI) {
    this.subjectURI = subjectURI;
    return this;
  }

  public CFPckgDocumentType addSubjectURIItem(LinkURIType subjectURIItem) {
    if (subjectURI == null) {
      subjectURI = new ArrayList<>();
    }
    subjectURI.add(subjectURIItem);
    return this;
  }

   /**
   * Get subjectURI
   * @return subjectURI
  **/
  public List<LinkURIType> getSubjectURI() {
    return subjectURI;
  }

  public void setSubjectURI(List<LinkURIType> subjectURI) {
    this.subjectURI = subjectURI;
  }

  public CFPckgDocumentType language(String language) {
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

  public CFPckgDocumentType version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CFPckgDocumentType adoptionStatus(String adoptionStatus) {
    this.adoptionStatus = adoptionStatus;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return adoptionStatus
  **/
  public String getAdoptionStatus() {
    return adoptionStatus;
  }

  public void setAdoptionStatus(String adoptionStatus) {
    this.adoptionStatus = adoptionStatus;
  }

  public CFPckgDocumentType statusStartDate(LocalDate statusStartDate) {
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

  public CFPckgDocumentType statusEndDate(LocalDate statusEndDate) {
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

  public CFPckgDocumentType licenseURI(LinkURIType licenseURI) {
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

  public CFPckgDocumentType notes(String notes) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CFPckgDocumentType cfPckgDocumentType = (CFPckgDocumentType) o;
    return Objects.equals(identifier, cfPckgDocumentType.identifier) &&
        Objects.equals(uri, cfPckgDocumentType.uri) &&
        Objects.equals(creator, cfPckgDocumentType.creator) &&
        Objects.equals(title, cfPckgDocumentType.title) &&
        Objects.equals(lastChangeDateTime, cfPckgDocumentType.lastChangeDateTime) &&
        Objects.equals(officialSourceURL, cfPckgDocumentType.officialSourceURL) &&
        Objects.equals(publisher, cfPckgDocumentType.publisher) &&
        Objects.equals(description, cfPckgDocumentType.description) &&
        Objects.equals(subject, cfPckgDocumentType.subject) &&
        Objects.equals(subjectURI, cfPckgDocumentType.subjectURI) &&
        Objects.equals(language, cfPckgDocumentType.language) &&
        Objects.equals(version, cfPckgDocumentType.version) &&
        Objects.equals(adoptionStatus, cfPckgDocumentType.adoptionStatus) &&
        Objects.equals(statusStartDate, cfPckgDocumentType.statusStartDate) &&
        Objects.equals(statusEndDate, cfPckgDocumentType.statusEndDate) &&
        Objects.equals(licenseURI, cfPckgDocumentType.licenseURI) &&
        Objects.equals(notes, cfPckgDocumentType.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, creator, title, lastChangeDateTime, officialSourceURL, publisher, description, subject, subjectURI, language, version, adoptionStatus, statusStartDate, statusEndDate, licenseURI, notes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFPckgDocumentType {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    lastChangeDateTime: ").append(toIndentedString(lastChangeDateTime)).append("\n");
    sb.append("    officialSourceURL: ").append(toIndentedString(officialSourceURL)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    subjectURI: ").append(toIndentedString(subjectURI)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    adoptionStatus: ").append(toIndentedString(adoptionStatus)).append("\n");
    sb.append("    statusStartDate: ").append(toIndentedString(statusStartDate)).append("\n");
    sb.append("    statusEndDate: ").append(toIndentedString(statusEndDate)).append("\n");
    sb.append("    licenseURI: ").append(toIndentedString(licenseURI)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

