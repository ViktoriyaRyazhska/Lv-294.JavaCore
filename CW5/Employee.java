package lesson05;

public class Employee {
	private String name;
	private int numOfDepartment;
	private double salary;

	public Employee() {

	}

	public Employee(String name, int numOfDepartment, double salary) {

		this.name = name;
		this.numOfDepartment = numOfDepartment;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfDepartment() {
		return numOfDepartment;
	}

	public void setNumOfDepartment(int numOfDepartment) {
		this.numOfDepartment = numOfDepartment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfDepartment;
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfDepartment != other.numOfDepartment)
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [ " + name + " - Salary: " + salary + "; Department ¹ " + numOfDepartment;
		
	} 
}
