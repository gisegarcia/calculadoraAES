package io.swagger.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculatorUtil {

	public static Double roundDouble(Double d, Integer sc) {
		return BigDecimal.valueOf(d).setScale(sc, RoundingMode.HALF_UP).doubleValue();
	}

}
