package be.vdab.oefenen;

import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {

	@Test
	public void lepelIsEenPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}
	@Test
	public void vorkIsEenPalindrrom() {
		assertFalse(new Woord("vork").isPalindroom());
	}
	@Test
	public void eenLegeStringIsEenPalindrrom() {
		assertTrue(new Woord("").isPalindroom());
	}
}
