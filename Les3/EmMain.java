package Les3;

public class EmMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("Andriy", 2,5);
		Employee e2 = new Employee("Maria", 10,8);
		Employee e3 = new Employee("Oleg", 5,9);
		System.out.println(e1.toString());

		System.out.println(e2.toString());
		System.out.println(e3.toString());
		System.out.println(Employee.totalSum);;
		e2.changeRate(1);
		System.out.println(e2.toString());
		System.out.println(Employee.totalSum);;
	}

}
