package structural.adapter;

public class Utu implements ElektrikliEvAletleri {
	private int volt;
	
	public Utu() {
		this.volt = 220;
	}
	
	public int prizeTakVeCalistir() {
		System.out.println("Ütü çalışıyor.");
		return volt;
	}
}
