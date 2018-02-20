package t2employee_payments;

/*
Create an interface to the method calculatePay(), 
the base class Employee with a string variable employeeld. 
Create two classes SalariedEmployee and ContractEmployee, 
which implement interface and are inherited from the base class. 
Describe hourly paid workers in the relevant classes (one of the children), 
and fixed paid workers (second child). 

Describe the string variable socialSecurityNumber in the class SalariedEmployee.
Include a description of federalTaxIdmember in the class of contractEmployee.

The calculation formula for the "time-worker“ is: 
"the average monthly salary = hourly rate * number of hours worked"

For employees with a fixed payment the formula is: 
"the average monthly salary = fixed monthly payment“

Create an array of employees and add the employees with different form of payment.

Arrange the entire sequence of workers descending the average monthly wage. 

Output the employee ID, name, and the average monthly wage for all elements of the list.
*/

public class Main {

	public static void main(String[] args) {

		Employee [] employees = new Employee[5];
		
		employees[0] = new ContractEmployee("Pavlo",11,160);
		employees[1] = new SalariedEmployee("Zakhar",1500);
		employees[2] = new SalariedEmployee("Marta",1550);
		employees[3] = new SalariedEmployee("Fedir",1200);
		employees[4] = new ContractEmployee("Olya",15,100);
		
		Employee tmp;
	        for (int i = 0; i < employees.length - 1; i++) {
	            for (int j = i + 1; j < employees.length; j++) {
	                if ((employees[i]).calculatePay() < employees[j].calculatePay()) {
	                    tmp = employees[i];
	                    employees[i] = employees[j];
	                    employees[j] = tmp;
	                }
	            }
	        }
	        
	            for (int i = 0; i < employees.length; i++) {
	            	System.out.println(employees[i]);
	            }
	            
	}
		 
	}
