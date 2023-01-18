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
 * The container for the data about a competency framework document (CFDocument) when exchanged outside of the context of a CFPackage. A CFDocument is the root for the creation of a learning standard/competency. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CFDocumentType   {
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

  @JsonProperty("CFPackageURI")
  @NotNull
@Valid

  private LinkURIType cfPackageURI;

  public CFDocumentType identifier(String identifier) {
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

  public CFDocumentType uri(URI uri) {
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

  public CFDocumentType creator(String creator) {
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

  public CFDocumentType title(String title) {
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

  public CFDocumentType lastChangeDateTime(OffsetDateTime lastChangeDateTime) {
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

  public CFDocumentType officialSourceURL(URI officialSourceURL) {
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

  public CFDocumentType publisher(String publisher) {
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

  public CFDocumentType description(String description) {
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

  public CFDocumentType subject(List<String> subject) {
    this.subject = subject;
    return this;
  }

  public CFDocumentType addSubjectItem(String subjectItem) {
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

  public CFDocumentType subjectURI(List<LinkURIType> subjectURI) {
    this.subjectURI = subjectURI;
    return this;
  }

  public CFDocumentType addSubjectURIItem(LinkURIType subjectURIItem) {
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

  public CFDocumentType language(String language) {
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

  public CFDocumentType version(String version) {
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

  public CFDocumentType adoptionStatus(String adoptionStatus) {
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

  public CFDocumentType statusStartDate(LocalDate statusStartDate) {
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

  public CFDocumentType statusEndDate(LocalDate statusEndDate) {
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

  public CFDocumentType licenseURI(LinkURIType licenseURI) {
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

  public CFDocumentType notes(String notes) {
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

  public CFDocumentType cfPackageURI(LinkURIType cfPackageURI) {
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
    CFDocumentType cfDocumentType = (CFDocumentType) o;
    return Objects.equals(identifier, cfDocumentType.identifier) &&
        Objects.equals(uri, cfDocumentType.uri) &&
        Objects.equals(creator, cfDocumentType.creator) &&
        Objects.equals(title, cfDocumentType.title) &&
        Objects.equals(lastChangeDateTime, cfDocumentType.lastChangeDateTime) &&
        Objects.equals(officialSourceURL, cfDocumentType.officialSourceURL) &&
        Objects.equals(publisher, cfDocumentType.publisher) &&
        Objects.equals(description, cfDocumentType.description) &&
        Objects.equals(subject, cfDocumentType.subject) &&
        Objects.equals(subjectURI, cfDocumentType.subjectURI) &&
        Objects.equals(language, cfDocumentType.language) &&
        Objects.equals(version, cfDocumentType.version) &&
        Objects.equals(adoptionStatus, cfDocumentType.adoptionStatus) &&
        Objects.equals(statusStartDate, cfDocumentType.statusStartDate) &&
        Objects.equals(statusEndDate, cfDocumentType.statusEndDate) &&
        Objects.equals(licenseURI, cfDocumentType.licenseURI) &&
        Objects.equals(notes, cfDocumentType.notes) &&
        Objects.equals(cfPackageURI, cfDocumentType.cfPackageURI);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, uri, creator, title, lastChangeDateTime, officialSourceURL, publisher, description, subject, subjectURI, language, version, adoptionStatus, statusStartDate, statusEndDate, licenseURI, notes, cfPackageURI);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CFDocumentType {\n");
    
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

