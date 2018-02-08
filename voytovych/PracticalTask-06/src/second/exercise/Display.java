package second.exercise;

public class Display {

	private Employee[] emp;
	private int depNum;

	public Display() {

	}

	public Display(Employee[] emp, int depNum) {
		this.emp = emp;
		this.depNum = depNum;
	}
	
	public void employeesOfCertainDepartment() {
		System.out.println("\nAll employees of the department number " + depNum);
		for(int i = 0; i < emp.length; i++) {
			if(depNum == emp[i].getDepartmentNumber()) {
				System.out.println("\nName: " + emp[i].getName() + "\nSalary: " + emp[i].getSalary());
			}
		}
	}
	
	public void arrangeWorkers() {
		Employee tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getSalary() < emp[j].getSalary()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}
		System.out.println("\nList of employee after sorting:");
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}

	}

}
