package homework2;

public abstract class Employee {

	private String name;
	private String employeeId;

	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
}
