package be.vdab.oefenen;

public class Woord {
	private final String woord;

	public Woord(String woord) {
		this.woord = woord;
	}
	
	public boolean isPalindroom() {
		return woord.equals(new StringBuilder(woord).reverse().toString());
	}
}
