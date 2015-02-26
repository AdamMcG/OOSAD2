package labAssignment.Test;

import java.util.*;

public class Pilot extends Professional {

	private String aircraft;
	/**
	 *                                                                                                                                                                                                
	 */
	private String company;
	protected Collection<Rating> scoresA;

	public String getAircraft() {
		return this.aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Pilot()
	{
	 aircraft = "A big plane";
	 company = "Aerlingus";
	}

}
