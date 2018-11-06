package io.swagger.model;

import org.springframework.validation.annotation.Validated;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * Result
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-05T22:53:10.614Z")

public class Result {

	@JsonProperty("mensaje")
	private String mensaje = null;

	@JsonProperty("valueResult")
	private Double valueResult = null;

	/**
	 * Get mensaje
	 * 
	 * @return mensaje
	 **/
	@ApiModelProperty(value = "")
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * Get valueResult
	 * 
	 * @return valueResult
	 **/
	@ApiModelProperty(value = "")
	public Double getValueResult() {
		return valueResult;
	}

	public void setValueResult(Double valueResult) {
		this.valueResult = valueResult;
	}

}
