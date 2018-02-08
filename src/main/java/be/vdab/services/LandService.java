package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.entities.Land;
import be.vdab.repositories.LandRepository;

public class LandService {
	private final LandRepository landRepository;
	
	public LandService(LandRepository landRepository) {
		this.landRepository = landRepository;
	}

	public BigDecimal findVerhoudingOppervlakteLandTovOppervlakteAlleLanden(String landCode) {
		Land land = landRepository.read(landCode);
		int oppervlakteAlleLanden = landRepository.findOppervlakteAlleLanden();
		return BigDecimal.valueOf(land.getOppervlakte())
			.divide(BigDecimal.valueOf(oppervlakteAlleLanden));
	}
}
