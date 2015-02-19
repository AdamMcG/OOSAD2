package labAssignment.Test;

import java.util.*;

public class Pilot extends Professional {

	private String aircraft;
	protected Collection<Rating> scoresA;
	/**
	 *                                                                                                                                                                                                
	 */
	private String company;

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

	public Pilot() {
	setAircraft("Boeing 746");
	setCompany("rocheyy's");
	}
}
