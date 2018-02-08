package be.vdab.oefenen;

public class Palindroom {
	private final String woord;

	public Palindroom(String woord) {
		this.woord = woord;
	}
	
	public boolean isPalindroom() {
		return woord.equals(new StringBuilder(woord).reverse().toString());
	}
}
