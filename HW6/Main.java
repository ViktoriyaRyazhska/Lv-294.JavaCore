package hw06;

import hw06.task2.EmployeesApplication;
import hw06.task2.abstracts.Employee;
import hw06.task2.classes.ContractEmployee;
import hw06.task2.classes.SalariedEmployee;

//import hw06.task1.BirdsApplication;

public class Main {
	public static void main(String[] args) {

		// BirdsApplication application = new BirdsApplication();
		// application.fillArray(15);
		// application.birdsFly();

		Employee[] employees = new Employee[10];
		
		employees[0] = new SalariedEmployee("Anton", 150, 150);
		employees[1] = new ContractEmployee("Bogdan");
		employees[2] = new SalariedEmployee("Yurii", 200, 150);
		employees[3] = new SalariedEmployee("Stepan", 90, 200);
		employees[4] = new ContractEmployee("Yurii");
		employees[5] = new SalariedEmployee("Igor", 20, 200);
		employees[6] = new SalariedEmployee("Valera", 25, 200);
		employees[7] = new SalariedEmployee("Stepan", 35, 200);
		employees[8] = new ContractEmployee("Anton");
		employees[9] = new ContractEmployee("Bogdan");
		
		EmployeesApplication application = new EmployeesApplication(employees);
		application.outputEmployees();
		System.out.println("-------------------------------------------------");
		application.sortDesc();
		System.out.println("-------------------------------------------------");
		application.outputEmployees();
	}
}
