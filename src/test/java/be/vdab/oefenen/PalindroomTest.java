package be.vdab.oefenen;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindroomTest {

	@Test
	public void lepelIsEenPalindroom() {
		assertTrue(new Palindroom("lepel").isPalindroom());
	}
	@Test
	public void vorkIsEenPalindrrom() {
		assertFalse(new Palindroom("vork").isPalindroom());
	}
	@Test
	public void eenLegeStringIsEenPalindrrom() {
		assertTrue(new Palindroom("").isPalindroom());
	}
}
