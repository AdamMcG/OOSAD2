package labAssignment.Test;

public class Rating extends Qualification {

	private String AircraftType;
	private String country;

	public String getAircraftType() {
		return this.AircraftType;
	}

	public void setAircraftType(String AircraftType) {
		this.AircraftType = AircraftType;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Rating() {
		String AircraftType = "Boeing 747";
		country = "Yemen";
	}

}
