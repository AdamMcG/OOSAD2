package labAssignment.Test;

public class Professional {

	private String Name;
	private int age;
	private int salary;

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Professional(){
		this.salary = 123222;
		this.age = 27;
		Name = "Joe McGrath";
	}

}
