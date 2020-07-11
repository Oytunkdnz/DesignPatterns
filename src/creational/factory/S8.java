package creational.factory;

public class S8 implements Telefon{
	private String model;
	private String batarya;
	private int en;
	private int boy;
	
	public S8(String model, String batarya, int en, int boy) {
		super();
		this.model = model;
		this.batarya = batarya;
		this.en = en;
		this.boy = boy;
	}

	public String getModel() {
		return model;
	}
	
	public String getBatarya() {
		return batarya;
	}
	
	public int getEn() {
		return en;
	}
	
	public int getBoy() {
		return boy;
	}

	@Override
	public String toString() {
		return "S8 [model=" + model + ", batarya=" + batarya + ", en=" + en + ", boy=" + boy + "]";
	}
	
	
	
	
}
