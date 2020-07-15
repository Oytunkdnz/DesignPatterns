package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class Meful implements Observer {
	private String mesaj;
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			mesaj = (String) arg;
			System.out.println("\nFiil Cevabı: "+mesaj);
		}
	}
}
