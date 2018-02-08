package be.vdab.valueObjects;

public class Jaar {
	private final int jaar;

	public Jaar(int jaar) {
		this.jaar = jaar;
	}
	public boolean isSchrikkeljaar() {
//		if (jaar % 400 == 0) {
//			return true;
//		}
//		if (jaar % 100 == 0) {
//			return false;
//		}
//		return jaar % 4 == 0;
		return jaar % 4 == 0 && jaar % 100 != 0 || jaar % 400 == 0;
	}
	
	@Override
	public int hashCode() {
		return jaar;
	}
	@Override
	public boolean equals(Object object) {
		if ( ! (object instanceof Jaar)) {
			return false;
		}
		Jaar anderJaar = (Jaar) object;
		return jaar == anderJaar.jaar;
	}
}
