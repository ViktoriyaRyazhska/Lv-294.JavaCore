package lesson5;

public class Employee {
	private String name;
	private int departmentNumber;
	private double salary;

	public Employee() {
		
	}

	public Employee(String name, int departmentNumber, double salary) {

		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
//	public void findDep(Employee [] arr, int a) {
//		for(Employee h : arr) {
//			if (h.getDepartmentNumber()==a) {
//				System.out.println("This employeer of dapertment what you chose " + h.getName());
//			}
//		}
//	}
	public void findDep(int a) {
		if(this.departmentNumber==a) {
			System.out.println("This employeer of dapertment what you chose " + this.name);
		}
	}
	
	@Override
    public String toString() {	
		return this.name + " number of department "+ this.departmentNumber + " salary "+ this.salary;
	}

}

