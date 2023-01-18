package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for a single code minor status code. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImsxCodeMinorFieldType   {
  @JsonProperty("imsx_codeMinorFieldName")
  @NotNull

  private String imsxCodeMinorFieldName;

  /**
   * Gets or Sets imsxCodeMinorFieldValue
   */
  public enum ImsxCodeMinorFieldValueEnum {
    FULLSUCCESS("fullsuccess"),
    
    INVALID_SORT_FIELD("invalid_sort_field"),
    
    INVALID_SELECTION_FIELD("invalid_selection_field"),
    
    FORBIDDEN("forbidden"),
    
    UNAUTHORISEDREQUEST("unauthorisedrequest"),
    
    INTERNAL_SERVER_ERROR("internal_server_error"),
    
    UNKNOWNOBJECT("unknownobject"),
    
    SERVER_BUSY("server_busy"),
    
    INVALIDUUID("invaliduuid");

    private final String value;

    ImsxCodeMinorFieldValueEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ImsxCodeMinorFieldValueEnum fromValue(String value) {
      for (ImsxCodeMinorFieldValueEnum b : ImsxCodeMinorFieldValueEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("imsx_codeMinorFieldValue")
  @NotNull

  private ImsxCodeMinorFieldValueEnum imsxCodeMinorFieldValue;

  public ImsxCodeMinorFieldType imsxCodeMinorFieldName(String imsxCodeMinorFieldName) {
    this.imsxCodeMinorFieldName = imsxCodeMinorFieldName;
    return this;
  }

   /**
   * Model Primitive Datatype = NormalizedString
   * @return imsxCodeMinorFieldName
  **/
  public String getImsxCodeMinorFieldName() {
    return imsxCodeMinorFieldName;
  }

  public void setImsxCodeMinorFieldName(String imsxCodeMinorFieldName) {
    this.imsxCodeMinorFieldName = imsxCodeMinorFieldName;
  }

  public ImsxCodeMinorFieldType imsxCodeMinorFieldValue(ImsxCodeMinorFieldValueEnum imsxCodeMinorFieldValue) {
    this.imsxCodeMinorFieldValue = imsxCodeMinorFieldValue;
    return this;
  }

   /**
   * Get imsxCodeMinorFieldValue
   * @return imsxCodeMinorFieldValue
  **/
  public ImsxCodeMinorFieldValueEnum getImsxCodeMinorFieldValue() {
    return imsxCodeMinorFieldValue;
  }

  public void setImsxCodeMinorFieldValue(ImsxCodeMinorFieldValueEnum imsxCodeMinorFieldValue) {
    this.imsxCodeMinorFieldValue = imsxCodeMinorFieldValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImsxCodeMinorFieldType imsxCodeMinorFieldType = (ImsxCodeMinorFieldType) o;
    return Objects.equals(imsxCodeMinorFieldName, imsxCodeMinorFieldType.imsxCodeMinorFieldName) &&
        Objects.equals(imsxCodeMinorFieldValue, imsxCodeMinorFieldType.imsxCodeMinorFieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imsxCodeMinorFieldName, imsxCodeMinorFieldValue);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImsxCodeMinorFieldType {\n");
    
    sb.append("    imsxCodeMinorFieldName: ").append(toIndentedString(imsxCodeMinorFieldName)).append("\n");
    sb.append("    imsxCodeMinorFieldValue: ").append(toIndentedString(imsxCodeMinorFieldValue)).append("\n");
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

