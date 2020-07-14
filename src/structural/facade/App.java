package structural.facade;

import java.math.BigDecimal;
import java.util.Date;

import structural.facade.borc.Borc;
import structural.facade.borc.EnumBorcTuru;
import structural.facade.borc.OdemeBilgileriDto;

public class App {
	
	public static void main (String [] args) {
		TahsilatFacade tahsilatFacade = new TahsilatFacade();
		
		Date vadeTarihi = DateUtil.tarihOlustur("01.01.2020");
		
		Borc borc = new Borc(10L, EnumBorcTuru.NORMAL, new BigDecimal(10), vadeTarihi);
		
		OdemeBilgileriDto odemeBilgileriDto = new OdemeBilgileriDto("Serhat Oytun Akdeniz", "123456", 01L, 2023L, 123);
		
		boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileriDto);
		
		if (isSuccess)
			System.out.println("tahsilat yapıldı.");
		else
			System.out.println("tahsilat yapılamadı.");
	}
			
}
