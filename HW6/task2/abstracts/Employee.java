package hw06.task2.abstracts;

import hw06.task2.interfaces.Salary;

//import java.util.UUID;

public abstract class Employee implements Salary {
	private String name;
	private String employeeId;
//	private static UUID uuId;
	private static long id;

	public Employee() {
		id++;
		this.employeeId =""+id;
//		uuId = UUID.randomUUID();
//		this.employeeId = uuId.toString();
	}

	public Employee(String name) {
		id++;
		this.employeeId =""+id;
//		uuId = UUID.randomUUID();
//		this.employeeId = uuId.toString();
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public abstract double calculatePay();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [" + name + ", id :" + employeeId + " - Salary :"
				+ calculatePay() + "]";
	}

}
