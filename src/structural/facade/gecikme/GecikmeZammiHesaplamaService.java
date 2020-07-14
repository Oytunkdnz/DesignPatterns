package structural.facade.gecikme;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

import structural.facade.DateUtil;

public class GecikmeZammiHesaplamaService {
	
	private GecikmeZammiOraniEntityService gecikmeZammiOraniEntityService;
	
	public GecikmeZammiHesaplamaService() {
		gecikmeZammiOraniEntityService = new GecikmeZammiOraniEntityService();
	}
	
	public BigDecimal gecikmeZammiHesapla(BigDecimal tutar, Date vadeTarihi) {
		
		BigDecimal gecikmeZammi = BigDecimal.ZERO;
		
		if (vadeTarihi.compareTo(new Date()) > 0)
			return gecikmeZammi;
		
		
		gecikmeZammi = gecikmeZamminiHesapla(tutar, vadeTarihi);
		
		return gecikmeZammi;
	}
	
	private BigDecimal gecikmeZamminiHesapla(BigDecimal tutar, Date vadeTarihi) {
		BigDecimal gecikmeZammiOrani = gecikmeZammiOraniEntityService.getGecikmeZammiOran();
		
		Date gununTarihi = DateUtil.getGununTarihi();
		
		long gunFarkiL = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);
		
		BigDecimal gunFarki = BigDecimal.valueOf(gunFarkiL);
		
		BigDecimal gecikmeZammi = gecikmeZammiOrani.multiply(gunFarki).multiply(tutar);
		
		gecikmeZammi = gecikmeZammi.setScale(2, RoundingMode.HALF_DOWN);
		
		if (gecikmeZammi.compareTo(BigDecimal.ZERO) > 0)
			System.out.println("Bilgi: Gecikme Zammı Hesaplandı. Gecikme zammı tutarı: " + gecikmeZammi);
		
		return gecikmeZammi;
		
	}
}
