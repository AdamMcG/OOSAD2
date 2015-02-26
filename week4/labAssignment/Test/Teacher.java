package labAssignment.Test;

import java.util.*;

public class Teacher extends Professional {

	private String position;
	protected Collection<Modue> teacheson;
	protected Collection<Degree> Earnsa;

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Teacher() {
		position = "yearhead";
	}

}
