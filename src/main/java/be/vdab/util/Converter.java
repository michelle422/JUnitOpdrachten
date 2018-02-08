package be.vdab.util;

import java.math.BigDecimal;

public class Converter {
	private final static BigDecimal AANTAL_CENTIMETER_IN_EEN_INCH
		= BigDecimal.valueOf(2.54);
	public BigDecimal inchesNaarCentimeters(BigDecimal inches) {
		return inches.multiply(AANTAL_CENTIMETER_IN_EEN_INCH);
	}
}
