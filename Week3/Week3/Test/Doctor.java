package Week3.Test;

public class Doctor extends Professional {

	protected Specialisation Specialisesin;
	private String hospitalResidence;
	private String department;

	public String getHospitalResidence() {
		return this.hospitalResidence;
	}

	public void setHospitalResidence(String hospitalResidence) {
		this.hospitalResidence = hospitalResidence;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Doctor() {
	setDepartment("ICU");
	setHospitalResidence("St.James'");
		
	}

}
