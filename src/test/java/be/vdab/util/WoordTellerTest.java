package be.vdab.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WoordTellerTest {
	private WoordTeller woordTeller;
	@Before
	public void before() {
		woordTeller = new WoordTeller();
	}
	@Test(expected = NullPointerException.class)
	public void eenNullZin() {
		woordTeller.telWoorden(null);
	}
	@Test
	public void eenZinMetEnkelEenSpatie() {
		assertEquals(0, woordTeller.telWoorden(" "));
	}
	@Test
	public void eenZinMetEnkelSpaties() {
		assertEquals(0, woordTeller.telWoorden("     "));
	}
	@Test
	public void eenZinMetEenSpatieTussenWoorden() {
		assertEquals(2, woordTeller.telWoorden("The quick"));
	}
	@Test
	public void eenZinMetEnkelSpatiesTussenWoorden() {
		assertEquals(2, woordTeller.telWoorden("The     quick"));
	}
	@Test
	public void eenZinMetEenKommaTussenWoorden() {
		assertEquals(2, woordTeller.telWoorden("The,quick"));
	}
	@Test
	public void eenZinMetEenKommaEnEenSpatieTussenWoorden() {
		assertEquals(2, woordTeller.telWoorden("The, quick"));
	}
	@Test
	public void eenZinMetEnkelEenWoord() {
		assertEquals(1, woordTeller.telWoorden("The"));
	}
	@Test
	public void eenZinMetEnkelSpatiesEnKommas() {
		assertEquals(0, woordTeller.telWoorden(",,  , , "));
	}
}
