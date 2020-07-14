package structural.facade.yapilandirma;

import structural.facade.DateUtil;

import java.util.Date;

public class YapilandirmaKontrolService {
	public boolean isYapilandirmaBozulmali(Date vadeTarihi) {
		Date gununTarihi = DateUtil.getGununTarihi();
		
		long gunFarki = DateUtil.gunFarkiHesapla(vadeTarihi, gununTarihi);
		
		boolean isYapilandirmaBozulmali = gunFarki > 90;
		
		if (isYapilandirmaBozulmali) 
			System.out.println("Borcun yapılandırılması bozulmalı! Tahsil edilemez.");
		
		return isYapilandirmaBozulmali;
	}
}
