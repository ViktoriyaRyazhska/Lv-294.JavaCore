package second.exercise;

public class Main {

	public static void main(String[] args) {

		/*
		 Create an interface to the method calculatePay(), the base class Employee
		 with a string variable employeeld. Create two classes SalariedEmployee and
		 ContractEmployee, which implement interface and are inherited from the base
		 class. 
			 * Describe hourly paid workers in the relevant classes (one of the
			   children), and fixed paid workers (second child).
		     * Describe the string variable socialSecurityNumber in the class SalariedEmployee. 
		     * Include a description of federalTaxIdmember in the class of contractEmployee. 
		     * The calculation formula for the "time-worker“ is: "the average monthly salary =
		       hourly rate * number of hours worked" 
		     * For employees with a fixed payment the formula is: "the average monthly salary = fixed monthly payment“ 
		     * Create an array of employees and add the employees with different form of payment.
			 * Arrange the entire sequence of workers descending the average monthly wage.
				 Output the employee ID, name, and the average monthly wage for all elements
				 of the list. */
		
		Employee em1 = new SalariedEmployee("Emma", "457-55-5462", 75.5, 40, "101-48");
		Employee em2 = new ContractEmployee("James", "9993438722", 2500.5, "45-105");
		Employee em3 = new SalariedEmployee("Michael", "325-45-5382", 60.0, 48, "102-48");
		Employee em4 = new ContractEmployee("Amelia", "9893538229", 3000.0, "50-85");
		Employee em5 = new ContractEmployee("Sofia", "4853558335", 4000.0, "51-85");
		Employee em6 = new ContractEmployee("Charlotte", "6856658336", 8000.0, "52-85");
		Employee em7 = new SalariedEmployee("Zoey", "357-35-3562", 95.5, 35, "300-50");
		Employee em8 = new SalariedEmployee("Eleanor", "297-25-3482", 150.0, 40, "305-55");
		
		Employee[] employees = new Employee[8];
		employees[0] = em1;
		employees[1] = em2;
		employees[2] = em3;
		employees[3] = em4;
		employees[4] = em5;
		employees[5] = em6;
		employees[6] = em7;
		employees[7] = em8;
		
		SortEmployees sr = new SortEmployees();
		sr.sort(employees);
		
		for (Employee employee : employees) {
			((Pay)employee).description();
		}
		
		
		
	}

}
