
public class Example {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Olena");
		emp1.setHours(10);
		emp1.changeRate(10);
		Employee emp2 = new Employee("Igor",5);
		
		Employee emp3 = new Employee("Oleg",5,100);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println();
		System.out.println("Emp1 total Salary:" + emp1.Salary_and_Bonus());
		System.out.println("Emp2 total Salary:" + emp2.Salary_and_Bonus());
		System.out.println("Emp3 total Salary:"+ emp3.Salary_and_Bonus());
		

	}

}
