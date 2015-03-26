package facade.mycar;
import java.util.ArrayList;
public class CarFacade {

	public CarFacade() {
		this.engine = new CarEngine();
		this.bodyType = new CarBody();
		this.Accessories = new ArrayList<CarAccessories>();
		CarAccessories a = new CarAccessories();
		this.Accessories.add(a);
	}
	private String name = "Adam's car";
	private CarEngine engine;
	private ArrayList<CarAccessories> Accessories;
	private CarBody bodyType;

	public String toString()
	{
	 String a = engine.toString();
	 String b = bodyType.toString();
	 return name + "\n Body Type \n" + b + "\n engine \n" + a;
	}

}
