package apimodels;

import apimodels.ImsxCodeMinorFieldType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * This is the container for the set of code minor status codes reported in the responses from the Service Provider. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2023-01-17T15:38:33.621950-06:00[America/Chicago]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImsxCodeMinorType   {
  @JsonProperty("imsx_codeMinorField")
  @NotNull
@Size(min=1)
@Valid

  private List<ImsxCodeMinorFieldType> imsxCodeMinorField = new ArrayList<>();

  public ImsxCodeMinorType imsxCodeMinorField(List<ImsxCodeMinorFieldType> imsxCodeMinorField) {
    this.imsxCodeMinorField = imsxCodeMinorField;
    return this;
  }

  public ImsxCodeMinorType addImsxCodeMinorFieldItem(ImsxCodeMinorFieldType imsxCodeMinorFieldItem) {
    imsxCodeMinorField.add(imsxCodeMinorFieldItem);
    return this;
  }

   /**
   * Get imsxCodeMinorField
   * @return imsxCodeMinorField
  **/
  public List<ImsxCodeMinorFieldType> getImsxCodeMinorField() {
    return imsxCodeMinorField;
  }

  public void setImsxCodeMinorField(List<ImsxCodeMinorFieldType> imsxCodeMinorField) {
    this.imsxCodeMinorField = imsxCodeMinorField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImsxCodeMinorType imsxCodeMinorType = (ImsxCodeMinorType) o;
    return Objects.equals(imsxCodeMinorField, imsxCodeMinorType.imsxCodeMinorField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imsxCodeMinorField);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImsxCodeMinorType {\n");
    
    sb.append("    imsxCodeMinorField: ").append(toIndentedString(imsxCodeMinorField)).append("\n");
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

