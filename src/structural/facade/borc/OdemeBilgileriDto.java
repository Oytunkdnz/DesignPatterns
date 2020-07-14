package structural.facade.borc;

public class OdemeBilgileriDto {
	private String kartUzerindekiIsim;
	private String kartNumarasi;
	private long sonKullanmaAy;
	private long sonKullanmaYil;
	private long cvvNo;
	public OdemeBilgileriDto(String kartUzerindekiIsim, String kartNumarasi, long sonKullanmaAy, long sonKullanmaYil,
			long cvvNo) {
		this.kartUzerindekiIsim = kartUzerindekiIsim;
		this.kartNumarasi = kartNumarasi;
		this.sonKullanmaAy = sonKullanmaAy;
		this.sonKullanmaYil = sonKullanmaYil;
		this.cvvNo = cvvNo;
	}
	public String getKartUzerindekiIsim() {
		return kartUzerindekiIsim;
	}
	
	public String getKartNumarasi() {
		return kartNumarasi;
	}
	
	public long getSonKullanmaAy() {
		return sonKullanmaAy;
	}
	
	public long getSonKullanmaYil() {
		return sonKullanmaYil;
	}
	
	public long getCvvNo() {
		return cvvNo;
	}
	
	
	
	
}
