/*
Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consists of
	three private fields: name, rate and hours; 
	static field totalSum
	properties for access to these fields;
default constructor, constructor with 2 parameters (name and rate) and constructor
with 3 parameters;
	methods:
salary - to calculate the salary of person (rate * hours)
toString - to output information about employee
changeRate - to change the rate of employee
bonuses – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them. 
Display the total salary of all workers to screen
*/

public class Employee {

	private String name;
	private int rate;
	private float hours;
		
	public static float totalSum=0;
		
	public Employee()
	{
		this.name="n/a";
		this.rate=0;
		this.hours=0;	
	}
	
	public Employee (String name, int rate){
		this.hours=0;
		this.name=name;
		this.rate=rate;
	}
	
	public Employee (String name, int rate, float hours){
		this.name=name;
		this.rate=rate;
		this.hours=hours;
		totalSum=totalSum+rate*hours;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHours(int hours) {	
		totalSum=totalSum+salary(this.rate,(hours-this.hours));
		this.hours = hours;
	}

	public void changeRate(int rate) {
		totalSum=totalSum+(salary(rate,this.hours)-salary(this.rate,this.hours));	
		this.rate = rate;
	}
	
	private float salary (int rate, float hours) {
		float salary= rate*hours;
		return salary;
	}
	
	private float bonuses () {
		float bon = salary(this.rate,this.hours)/100*10;
		return bon;
	}
		
	@Override
	public String toString() {
		String output="Name: " + this.name + " Rate: " + this.rate + 
		" Hours: " + this.hours + " Salary: " + salary(rate,hours) +
		" Bonus: " + bonuses();        	
		return output;
	};
	

	public static void main(String[] args) {
	
	Employee emp1 = new Employee();
	emp1.setName("Vasya");
	emp1.changeRate(40);
	emp1.setHours(21);
	
	Employee emp2 = new Employee("Oleg",32,7);
	
	Employee emp3 = new Employee("Ivan",20);
	emp3.setHours(17);
	
	System.out.println(emp1);
	System.out.println(emp2);
	System.out.println(emp3);
	System.out.println("Total salary: " + totalSum);		
	
	}

}