package be.vdab.oefenen;

public class Isbn {
	private static final long KLEINSTE_ISBN_GETAL = 1_000_000_000_000L;
	private static final long GROOTSTE_ISBN_GETAL = 9_999_999_999_999L;
	private final long nummer;

	public Isbn(long nummer) {
//		throw new UnsupportedOperationException();
		if (nummer < KLEINSTE_ISBN_GETAL || nummer > GROOTSTE_ISBN_GETAL) {
			throw new IllegalArgumentException("Bevat geen 13 cijfers");
		}
		short eerste3Cijfers = (short) (nummer / 10_000_000_000L);
		if (eerste3Cijfers != 978 && eerste3Cijfers != 979) {
			throw new IllegalArgumentException("Begint niet met 978 of 979");
		}
		long teVerwerkenCijfers = nummer / 10;
		long laatsteCijfer = nummer % 10;
		long somEvenCijfers = 0;
		long somOnevenCijfers = 0;
		for (int teller = 0; teller != 6; teller++) {
			somEvenCijfers += teVerwerkenCijfers % 10;
			teVerwerkenCijfers /= 10;
			somOnevenCijfers += teVerwerkenCijfers % 10;
			teVerwerkenCijfers /= 10;
		}
		long controleSom = somOnevenCijfers + somEvenCijfers * 3;
		long naastGelegenHoger10Tal = controleSom - controleSom % 10 + 10;
		long controleVerschil = naastGelegenHoger10Tal - controleSom;
		if (controleVerschil % 10 != laatsteCijfer) {
			throw new IllegalArgumentException("Verkeerd controlegetal");
		}
		this.nummer = nummer;
	}

	@Override
	public String toString() {
//		throw new UnsupportedOperationException();
		return String.valueOf(nummer);
	}
	
}
