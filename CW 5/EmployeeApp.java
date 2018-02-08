package lesson05;

import java.util.Scanner;

public class EmployeeApp {
	private Employee[] arr;

	public EmployeeApp(Employee[] arr) {
		this.arr = arr;
	}

	public Employee[] getArr() {
		return arr;
	}

	public void setArr(Employee[] arr) {
		this.arr = arr;
	}

	public void getByDep() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter department number:");
			int num = sc.nextInt();
			for (Employee employee : arr) {
				if (employee.getNumOfDepartment() == num) {
					System.out.println(employee);
				}
			}
			System.out.println("---------------------------------------------");
		}
	}

	public void salaryDesc() {
		Employee tempEmpl = new Employee();
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].getSalary() < arr[i + 1].getSalary()) {
					tempEmpl = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tempEmpl;
					flag = true;
				}
			}

		}
	}
}