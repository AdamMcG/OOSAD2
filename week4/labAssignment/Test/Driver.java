package labAssignment.Test;
import java.util.*;
public class Driver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world. ");

		Pilot p = new Pilot();	
			p.setName("Adam");
			System.out.println(p.getName() +" I am a pilot that flies a: " + p.getAircraft() + " in the company: " + 						p.getCompany());
			

		Modue b = new Modue();
		ArrayList<Pilot> pilotArrayList = new ArrayList<Pilot>();
		pilotArrayList.add(p);
		System.out.println(pilotArrayList.get(0).getName());
		Teacher a = new Teacher();
		a.setPosition("Head Teacher.");
		System.out.println("This is my position: " + a.getPosition());
		}
}
