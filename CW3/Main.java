package cw03;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Yura");
		e1.setRate(9);
		e1.setHours(60);
		e1.bonuses(true);
		Employee e2 = new Employee("Ivan", 10);
		e2.setHours(60);
		Employee e3 = new Employee("Anton", 11, 50);
		e3.bonuses(true);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(Employee.getTotalSum());
		
		e1.setHours(50);
		e1.setRate(15);
		e3.setHours(30);
		e3.bonuses(false);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(Employee.getTotalSum());

	}
}
