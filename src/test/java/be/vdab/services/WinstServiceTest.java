package be.vdab.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.repositories.KostRepository;
//import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
//import be.vdab.repositories.OpbrengstRepositoryStub;

public class WinstServiceTest {
	OpbrengstRepository opbrengstRepository;
	KostRepository kostRepository;
	WinstService winstService;
	@Before
	public void before() {
//		opbrengstRepository = new OpbrengstRepositoryStub();
//		kostRepository = new KostRepositoryStub();
		opbrengstRepository = mock(OpbrengstRepository.class);
		kostRepository = mock(KostRepository.class);
		when(opbrengstRepository.findTotaleOpbrengst()).thenReturn(BigDecimal.valueOf(1500));
		when(kostRepository.findTotaleKost()).thenReturn(BigDecimal.valueOf(500));
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}
	@Test
	public void getWinst() {
		assertEquals(0, BigDecimal.valueOf(1000)
			.compareTo(winstService.getWinst()));
		verify(opbrengstRepository).findTotaleOpbrengst();
		verify(kostRepository).findTotaleKost();
	}

}
