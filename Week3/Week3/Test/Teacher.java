package Week3.Test;

import java.util.*;

public class Teacher extends Professional {

	protected Collection<Modue> teacheson;
	protected Collection<Degree> Earnsa;
	private String position;

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Teacher() {
		setPosition("yearhead");
		setTimeslots("2:30");
	}

}
