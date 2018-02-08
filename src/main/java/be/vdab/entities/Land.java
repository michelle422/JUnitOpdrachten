package be.vdab.entities;

public class Land {
	private final String landCode;
	private final int oppervlakte;
	public Land(String landCode, int oppervlakte) {
		this.landCode = landCode;
		this.oppervlakte = oppervlakte;
	}
	public String getLandCode() {
		return landCode;
	}
	public int getOppervlakte() {
		return oppervlakte;
	}
}
