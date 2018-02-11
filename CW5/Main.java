package lesson05;

public class Main {
	public static void main(String[] args) {
//		int[] arr = { 15, 25, -10, -25, 56, -152, 16, 19, 26, 13 };
//		IntArr app = new IntArr(arr);
//		System.out.println(app.getBigest());
//		System.out.println(app.getSumPositiveNums());
//		System.out.println(app.amountNegNums());
//		app.whatMore();

		Employee[] arrEmpl = new Employee[7];
		arrEmpl[0] = new Employee("Petro", 10, 150000);
		arrEmpl[1] = new Employee("Ivan", 9, 23000);
		arrEmpl[2] = new Employee("Pulup", 8, 40000);
		arrEmpl[3] = new Employee("Igor", 7, 15000);
		arrEmpl[4] = new Employee("Anton", 12, 103500);
		arrEmpl[5] = new Employee("Stepan", 1, 10015);
		arrEmpl[6] = new Employee("Maruska", 10, 101200);
		
		EmployeeApp appEmpl = new EmployeeApp(arrEmpl);
//		appEmpl.getByDep();
		appEmpl.salaryDesc();
		for (Employee employee : arrEmpl) {
			System.out.println(employee);
		}
		
		
	}
}
