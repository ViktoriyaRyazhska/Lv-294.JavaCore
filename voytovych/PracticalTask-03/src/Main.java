
public class Main {

	public static void main(String[] args) {
		
		
		/*
			Create Console Application project in Java.
			Add class Employee to the project.
			Class Employee should consists of
				three private fields: name, rate and hours; 
				static field totalSum
				properties for access to these fields;
				default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
				methods:
			salary - to calculate the salary of person (rate * hours)
			toString - to output information about employee
			changeRate - to change the rate of employee
			bonuses – to calculate 10% from salary
			In the method main() create 3 objects of Employee type. Input information about them. 
			Display the total salary of all workers to screen
		*/
		
		Employee e1 = new Employee("Roman", 250, 48);
		Employee e2 = new Employee("Oleksandr", 330, 24);
		Employee e3 = new Employee("Ivan", 575, 35);
		
		e1.calculateTotalSum();
		System.out.println(e1.toString());
		
		e2.calculateTotalSum();
		System.out.println(e2.toString());
		
		e3.calculateTotalSum();
		System.out.println(e3.toString());
		
		System.out.println("Total salary of all workers: " + Employee.totalSum);
		
		System.out.println("It have been chenged rate of emploee " + e1.getName() + ": from - " + "(" + e1.getRate() + ")" + " to - " + "(650)");
		e1.changeRate(650);
		System.out.println("Total salary of all workers after change rate: " + Employee.totalSum);

	}

}
