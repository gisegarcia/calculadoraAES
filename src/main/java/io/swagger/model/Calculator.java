package io.swagger.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Calculator
 */
@Validated
public class Calculator   {
	
  /**
   * Tipo de operacion a realizar
   */
  public enum TypeOperationEnum {
	 ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/");

    private String value;

    TypeOperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeOperationEnum fromValue(String text) {
      for (TypeOperationEnum b : TypeOperationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("typeOperation")
  private TypeOperationEnum typeOperation = null;

  @JsonProperty("value1")
  private Double value1 = null;

  @JsonProperty("value2")
  private Double value2 = null;

  /**
   * Tipo de operacion a realizar
   * @return typeOperation
  **/
  @ApiModelProperty(value = "Tipo de operacion a realizar")
  public TypeOperationEnum getTypeOperation() {
    return typeOperation;
  }

  public void setTypeOperation(TypeOperationEnum typeOperation) {
    this.typeOperation = typeOperation;
  }

  /**
   * Get value1
   * @return value1
  **/
  @ApiModelProperty(value = "Primer Valor")
  public Double getValue1() {
    return value1;
  }

  public void setValue1(Double value1) {
    this.value1 = value1;
  }

  /**
   * Get value2
   * @return value2
  **/
  @ApiModelProperty(value = "Segundo Valor")
  public Double getValue2() {
    return value2;
  }

  public void setValue2(Double value2) {
    this.value2 = value2;
  }
  
}

