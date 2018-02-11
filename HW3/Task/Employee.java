package Employee;

public class Employee {
	private String name;
	private double rate;
	private int hours;

	private static double totalSum;

	public Employee() {}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, double rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += rate * hours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		totalSum -= this.rate * this.hours;
		this.rate = rate;
		totalSum += rate * hours;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		totalSum -= this.rate * this.hours;
		this.hours = hours;
		totalSum += rate * hours;
	}

	double salary() {
		double salary = rate * hours;
		return salary;
	}

	double bonusses() {
		double bonusses = salary() * 0.1;
		totalSum += bonusses;
		return bonusses;
	}
	
	public static double getTotalSum() {
		return totalSum;
	}
	
//	public static void setTotalSum(double totalSum) {
//		Employee.totalSum = totalSum;
//	}

	@Override
	public String toString() {
		return "Employee " + name + ", rate = " + rate + ", hours = " + hours + ", salary = " + salary()
				+ ", bonusses = " + bonusses();
	}
	
	public void changeRate(double rate) {
		totalSum -= this.rate * this.hours;
		this.rate = rate;
		totalSum += rate * hours;
	}

}
