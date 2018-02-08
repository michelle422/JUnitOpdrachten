package be.vdab.util;

import java.math.BigDecimal;
import java.util.Arrays;

public class Statistiek {
	public static BigDecimal getGemiddelde(BigDecimal[] getallen) {
//		throw new UnsupportedOperationException();
		if (getallen.length == 0) {
			throw new IllegalArgumentException();
		}
		return Arrays.stream(getallen).reduce(BigDecimal.ZERO, (vorigeSom, getal) -> vorigeSom.add(getal))
					.divide(BigDecimal.valueOf(getallen.length));
	}
}
