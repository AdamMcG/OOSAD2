package labAssignment.Test;

public class Modue {

	private String moduleTitle;
	private String timeSlot;

	public String getModuleTitle() {
		return this.moduleTitle;
	}

	public void setModuleTitle(String moduleTitle) {
		this.moduleTitle = moduleTitle;
	}

	public String getTimeSlot() {
		return this.timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public Modue() {
		moduleTitle = "sample modules";
		timeSlot = "2.00p.m.";
	}

}
