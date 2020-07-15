package behavioral.observer;

public class Gozlemci {
	public static void main (String [] args) {
		System.out.println("Fiil >");
		
		final Fail failNesne = new Fail();
		
		final Meful mefulNesne = new Meful();
		
		failNesne.addObserver(mefulNesne);
		
		Thread thread = new Thread(failNesne);
		thread.start();
	}
}
