package hw06.task2;

import hw06.task2.abstracts.Employee;

public class EmployeesApplication {
	private Employee[] employees;

	public EmployeesApplication(Employee[] employees) {
		this.employees = employees;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public void sortDesc() {
		Employee tempEmployee;
		boolean swch = true;
		while (swch) {
			swch = false;
			for (int i = 0; i < employees.length - 1; i++) {
				if (employees[i].calculatePay() < employees[i + 1]
						.calculatePay()) {
					tempEmployee = employees[i];
					employees[i] = employees[i + 1];
					employees[i + 1] = tempEmployee;
					swch = true;
				}
			}
		}
	}

	public void outputEmployees() {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

}
