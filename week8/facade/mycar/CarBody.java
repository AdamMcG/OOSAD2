package facade.mycar;

public class CarBody {

	private String CarType;
	private boolean customkit;

	public CarBody() {
		this.CarType = "Muscle";
		this.customkit = true;
	}

	public String getCarType() {
		return this.CarType;
	}

	public void setCarType(String CarType) {
		this.CarType = CarType;
	}

	public boolean isCustomkit() {
		return this.customkit;
	}

	public void setCustomkit(boolean customkit) {
		this.customkit = customkit;
	}

	public String toString()
	{ String a = " has a body kit";
	if(isCustomkit() != true)
	a = "does not have a body kit";
	return getCarType() + " that" + a;}

}
