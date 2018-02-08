package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*		Create a class Employee with fields name, department number, salary. 
			     * Create five objects of class Employee. 
			     * Display all employees of a certain department (enter department number in the console);
				 * arrange workers by the field salary in descending order.
		*/
		
		Employee employee1 = new Employee("Igor", 1, 2500);
		Employee employee2 = new Employee("Roman", 2, 3500);
		Employee employee3 = new Employee("Ivan", 1, 3500);
		Employee employee4 = new Employee("Oleksandr", 3, 5000);
		Employee employee5 = new Employee("Oleksandr", 2, 200);
		
		Employee [] emp = new Employee[5];
		emp[0] = employee1;
		emp[1] = employee2;
		emp[2] = employee3;
		emp[3] = employee4;
		emp[4] = employee5;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of department: ");
		
		int depNum = Integer.parseInt(br.readLine());
		
		Display d = new Display(emp, depNum);
		d.employeesOfCertainDepartment();
		d.arrangeWorkers();
		
	}

}
