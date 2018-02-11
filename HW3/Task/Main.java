package Employee;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Bogdan");
		employee1.setRate(40);
		employee1.setHours(8);
		employee1.changeRate(45);

		Employee employee2 = new Employee("Marta", 45);
		employee2.setHours(6);

		Employee employee3 = new Employee("Artem", 30, 8);

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		System.out.println("Salary of all workers = " + Employee.getTotalSum());
		
	}

}