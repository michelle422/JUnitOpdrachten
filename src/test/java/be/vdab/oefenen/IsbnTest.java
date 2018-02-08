package be.vdab.oefenen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsbnTest {

	@Test
	public void nummerMet13CijfersMetCorrectControleGetalIsOK() {
		new Isbn(9786541237853L);
	}
	@Test
	public void nummerVeranderenNaarToString() {
		long nummer = 9786541237853L;
		assertEquals(nummer, Long.parseLong(new Isbn(nummer).toString()));
	}
	@Test(expected = IllegalArgumentException.class)
	public void nummerMetNulIsVerkeerd() {
		new Isbn(0L);
	}
	@Test(expected = IllegalArgumentException.class)
	public void eenNegatiefNummerIsVerkeerd() {
		new Isbn(-9786541237853L);
	}
	@Test(expected = IllegalArgumentException.class)
	public void nummerMet12CijfersIsVerkeerd() {
		new Isbn(978654123785L);
	}
	@Test(expected = IllegalArgumentException.class)
	public void nummerMet14CijfersIsVerkeerd() {
		new Isbn(97865412378532L);
	}
	@Test(expected = IllegalArgumentException.class)
	public void nummerMoetMet978Of979Beginnen() {
		new Isbn(9776541237853L);
	}
	@Test(expected = IllegalArgumentException.class)
	public void nummerMet13CijfersMetVerkeerdeControleIsVerkeerd() {
		new Isbn(9786541237856L);
	}
}
