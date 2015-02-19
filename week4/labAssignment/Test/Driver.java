package labAssignment.Test;
public class Driver {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello world. ");

		Pilot p = new Pilot("Boeing 747", "Aer Lingus");	
			System.out.print("I am a pilot that flies a: " + p.getAircraft() + " in the company: " + 						p.getCompany());
			}

		}
