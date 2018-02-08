package be.vdab.oefenen;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	private Veiling veiling;
	@Before
	public void before() {
		veiling  = new Veiling();
	}
	@Test
	public void NulIsHetHoogsteBodAlsErNogGeenBodIs() {
//		Veiling veiling = new Veiling();
		assertEquals(0, veiling.getHoogsteBod());
	}
	@Test
	public void hetEersteBodIsHetHoogsteBod() {
//		Veiling veiling = new Veiling();
		veiling.doeBod(1000);
		assertEquals(1000, veiling.getHoogsteBod());
	}
	@Test
	public void hetHoogsteBodVanMeerdereBodIsHetHoogsteBod() {
//		Veiling veiling = new Veiling();
		veiling.doeBod(2000);
		veiling.doeBod(2500);
		assertEquals(2500, veiling.getHoogsteBod());
	}
}
