package apimodels;

import apimodels.ImsxCodeMinorType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for the status code and associated information returned within the HTTP messages received from the Service Provider. For the CASE service this object will only be returned to provide information about a failed request i.e. it will NOT be in the payload for a successful request. See Appendix B for further information on the interpretation of the information contained within this class 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImsxStatusInfoType   {
  /**
   * Gets or Sets imsxCodeMajor
   */
  public enum ImsxCodeMajorEnum {
    SUCCESS("success"),
    
    PROCESSING("processing"),
    
    FAILURE("failure"),
    
    UNSUPPORTED("unsupported");

    private final String value;

    ImsxCodeMajorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImsxCodeMajorEnum fromValue(String value) {
      for (ImsxCodeMajorEnum b : ImsxCodeMajorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("imsx_codeMajor")
  @NotNull

  private ImsxCodeMajorEnum imsxCodeMajor;

  /**
   * Gets or Sets imsxSeverity
   */
  public enum ImsxSeverityEnum {
    STATUS("status"),
    
    WARNING("warning"),
    
    ERROR("error");

    private final String value;

    ImsxSeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImsxSeverityEnum fromValue(String value) {
      for (ImsxSeverityEnum b : ImsxSeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("imsx_severity")
  @NotNull

  private ImsxSeverityEnum imsxSeverity;

  @JsonProperty("imsx_description")
  
  private String imsxDescription;

  @JsonProperty("imsx_codeMinor")
  @Valid

  private ImsxCodeMinorType imsxCodeMinor;

  public ImsxStatusInfoType imsxCodeMajor(ImsxCodeMajorEnum imsxCodeMajor) {
    this.imsxCodeMajor = imsxCodeMajor;
    return this;
  }

   /**
   * Get imsxCodeMajor
   * @return imsxCodeMajor
  **/
  public ImsxCodeMajorEnum getImsxCodeMajor() {
    return imsxCodeMajor;
  }

  public void setImsxCodeMajor(ImsxCodeMajorEnum imsxCodeMajor) {
    this.imsxCodeMajor = imsxCodeMajor;
  }

  public ImsxStatusInfoType imsxSeverity(ImsxSeverityEnum imsxSeverity) {
    this.imsxSeverity = imsxSeverity;
    return this;
  }

   /**
   * Get imsxSeverity
   * @return imsxSeverity
  **/
  public ImsxSeverityEnum getImsxSeverity() {
    return imsxSeverity;
  }

  public void setImsxSeverity(ImsxSeverityEnum imsxSeverity) {
    this.imsxSeverity = imsxSeverity;
  }

  public ImsxStatusInfoType imsxDescription(String imsxDescription) {
    this.imsxDescription = imsxDescription;
    return this;
  }

   /**
   * Model Primitive Datatype = String
   * @return imsxDescription
  **/
  public String getImsxDescription() {
    return imsxDescription;
  }

  public void setImsxDescription(String imsxDescription) {
    this.imsxDescription = imsxDescription;
  }

  public ImsxStatusInfoType imsxCodeMinor(ImsxCodeMinorType imsxCodeMinor) {
    this.imsxCodeMinor = imsxCodeMinor;
    return this;
  }

   /**
   * Get imsxCodeMinor
   * @return imsxCodeMinor
  **/
  public ImsxCodeMinorType getImsxCodeMinor() {
    return imsxCodeMinor;
  }

  public void setImsxCodeMinor(ImsxCodeMinorType imsxCodeMinor) {
    this.imsxCodeMinor = imsxCodeMinor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImsxStatusInfoType imsxStatusInfoType = (ImsxStatusInfoType) o;
    return Objects.equals(imsxCodeMajor, imsxStatusInfoType.imsxCodeMajor) &&
        Objects.equals(imsxSeverity, imsxStatusInfoType.imsxSeverity) &&
        Objects.equals(imsxDescription, imsxStatusInfoType.imsxDescription) &&
        Objects.equals(imsxCodeMinor, imsxStatusInfoType.imsxCodeMinor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imsxCodeMajor, imsxSeverity, imsxDescription, imsxCodeMinor);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImsxStatusInfoType {\n");
    
    sb.append("    imsxCodeMajor: ").append(toIndentedString(imsxCodeMajor)).append("\n");
    sb.append("    imsxSeverity: ").append(toIndentedString(imsxSeverity)).append("\n");
    sb.append("    imsxDescription: ").append(toIndentedString(imsxDescription)).append("\n");
    sb.append("    imsxCodeMinor: ").append(toIndentedString(imsxCodeMinor)).append("\n");
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

