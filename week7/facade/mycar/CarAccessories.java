package facade.mycar;

public class CarAccessories {

	private String Accessory;
	private double price;

	public CarAccessories() {
		this.Accessory = "Stereo System";
		this.price = 3000.56;
	}

	public String getAccessory() {
		return this.Accessory;
	}

	public void setAccessory(String Accessory) {
		this.Accessory = Accessory;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString()
	{return getAccessory() + " that cost " + getPrice();}
}
