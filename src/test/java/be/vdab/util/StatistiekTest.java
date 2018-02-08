package be.vdab.util;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class StatistiekTest {

	@Test
	public void hetGemiddeldeVan0En10Is5() {
		BigDecimal[] getallen = new BigDecimal[] {BigDecimal.ZERO, BigDecimal.TEN};
		assertEquals(0, BigDecimal.valueOf(5).compareTo(Statistiek.getGemiddelde(getallen)));
	}
	@Test
	public void hetGemiddeldeVanHetGetalIsDatGetal() {
		BigDecimal enigGetal = BigDecimal.valueOf(25);
		assertEquals(0, enigGetal.compareTo(Statistiek.getGemiddelde(new BigDecimal[] {enigGetal})));
	}
	@Test(expected = IllegalArgumentException.class)
	public void hetGemiddeldeVanEenLeegVerzamelingKanNietBerekenen() {
		Statistiek.getGemiddelde(new BigDecimal[] { });
	}
	@Test(expected = NullPointerException.class) 
	public void hetGemiddeldeVanNullKanNietBerekenen() {
		Statistiek.getGemiddelde(null);
	}
	@Test(expected = NullPointerException.class) 
	public void hetGemiddeldeVanNullInEenVerzamelingKanNietBerekenen() {
		Statistiek.getGemiddelde(new BigDecimal[] { null });
	}
}
