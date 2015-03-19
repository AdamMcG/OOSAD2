package facade.mycar;

public class CarEngine {

	private String model;
	private int bhp;

	public CarEngine() {
		this.model = "V8 engine";
		this.bhp = 300;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getBhp() {
		return this.bhp;
	}

	public void setBhp(int bhp) {
		this.bhp = bhp;
	}

	public String toString()
	{return getModel() + " With " + getBhp() + "brake horsepower";}

}
