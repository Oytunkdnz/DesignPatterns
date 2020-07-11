package creational.factory;

public class TelefonBayi {
	public static void main (String [] args) {
		Telefon s8 = TelefonFabrikasi.getTelefon("S8", "2600", 4, 7);
		Telefon note8 = TelefonFabrikasi.getTelefon("Note8", "3000", 5, 8);
		
		System.out.println("S8 için telefon özellikleri: ");
		System.out.println(s8);
		System.out.println("Note8 için telefon özellikleri: ");
		System.out.println(note8);
	}
}
