package io.swagger.service.impl;

import java.text.MessageFormat;

import org.springframework.stereotype.Service;

import io.swagger.model.Calculator;
import io.swagger.model.Result;
import io.swagger.service.CalculatorService;
import io.swagger.util.CalculatorUtil;

/**
 * Calculator Service
 * 
 * @author garciar-g
 *
 */
@Service
public class CalculatorServiceImpl implements CalculatorService {

	public Result add(Calculator calculator) {
		Result response = new Result();
		response.setMensaje(MessageFormat.format("Success!", calculator.getValue1(),
				calculator.getValue2(), Calculator.TypeOperationEnum.ADD));

		Double value = calculator.getValue1() + calculator.getValue2();
		response.setValueResult(CalculatorUtil.roundDouble(value, 2));
		return response;
	}

	public Result subtract(Calculator calculator) {
		Result response = new Result();
		response.setMensaje(MessageFormat.format("Success!", calculator.getValue1(),
				calculator.getValue2(), Calculator.TypeOperationEnum.SUBTRACT));

		Double value = calculator.getValue1() - calculator.getValue2();
		response.setValueResult(CalculatorUtil.roundDouble(value, 2));
		return response;
	}

	public Result multiply(Calculator calculator) {
		Result response = new Result();
		response.setMensaje(MessageFormat.format("Success!", calculator.getValue1(),
				calculator.getValue2(), Calculator.TypeOperationEnum.MULTIPLY));

		Double value = calculator.getValue1() * calculator.getValue2();
		response.setValueResult(CalculatorUtil.roundDouble(value, 2));
		return response;
	}

	public Result divide(Calculator calculator) {
		Result response = new Result();
		response.setMensaje(MessageFormat.format("Success!", calculator.getValue1(),
				calculator.getValue2(), Calculator.TypeOperationEnum.DIVIDE));

		Double value = 0.0;
		if (calculator.getValue2() == 0) {
			response.setValueResult(0.0);
		} else {
			value = calculator.getValue1() / calculator.getValue2();
			response.setValueResult(CalculatorUtil.roundDouble(value, 2));
		}
		return response;
	}

}
