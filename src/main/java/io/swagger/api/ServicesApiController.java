package io.swagger.api;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.Calculator;
import io.swagger.model.Result;
import io.swagger.service.CalculatorService;

@Controller
public class ServicesApiController implements ServicesApi {

	private final HttpServletRequest request;
	private CalculatorService calculatorService;

	public ServicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.request = request;
	}

	public ResponseEntity<Result> calculationPOST(
			@ApiParam(value = "Calculadora", required = true) @Valid @RequestBody Calculator calculator) {

		Result response;
	
		switch (calculator.getTypeOperation()) {
		case ADD:
			response = calculatorService.add(calculator);
			break;
		case SUBTRACT:
			response = calculatorService.subtract(calculator);
			break;
		case MULTIPLY:
			response = calculatorService.multiply(calculator);
			break;
		case DIVIDE:
			response = calculatorService.divide(calculator);
			break;
		default:
			response = new Result();
			response.setMensaje("Operator invalid!, use (ADD, SUBTRACT, MULTIPLY, DIVIDE)");
			break;
		}

		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/xml")) {
			return new ResponseEntity<Result>(response, HttpStatus.NOT_IMPLEMENTED);
		}

		if (accept != null && accept.contains("application/json")) {
			return new ResponseEntity<Result>(response, HttpStatus.NOT_IMPLEMENTED);
		}

		return new ResponseEntity<Result>(HttpStatus.NOT_IMPLEMENTED);
	}

}
