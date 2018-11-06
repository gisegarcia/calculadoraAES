package io.swagger.service;

import io.swagger.model.Calculator;
import io.swagger.model.Result;

/**
 * Available operations
 * 
 * @author garciar-g
 *
 */
public interface CalculatorService {

	Result add(io.swagger.model.Calculator calculator);

	Result subtract(Calculator calculator);

	Result multiply(Calculator calculator);

	Result divide(Calculator calculator);

}
