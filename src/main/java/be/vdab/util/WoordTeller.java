package be.vdab.util;

public class WoordTeller {
	public int telWoorden(String zin) {
//		throw new UnsupportedOperationException();
		int letterTeller = 0;
		int aantalWoorden = 0;
		for (int index = 0; index != zin.length(); index++) {
//			if (zin.toLowerCase().charAt(index) >= 'a' && zin.toLowerCase().charAt(index) <= 'z') {
			if (zin.charAt(index) != ' ' && zin.charAt(index) != ',') {
				letterTeller++;
			}
			if ((zin.charAt(index) == ' ' || zin.charAt(index) == ',') && letterTeller > 0) {
				aantalWoorden++;
				letterTeller = 0;
			}
			if (index == zin.length()-1 && letterTeller > 0) {
				aantalWoorden++;
			}
		}
		return aantalWoorden;
	}
}
