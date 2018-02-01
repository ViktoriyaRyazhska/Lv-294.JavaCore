package cw03;

public class Employee {

	private String name;
	private double rate;
	private double hours;
	private double salary;
	private boolean bonuses;
	private double bonus;

	private static double totalSum;

	public Employee() {

	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		salary();
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
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

	/* It do same sings that the changeRate() method */
	public void setRate(double rate) {
		this.rate = rate;
		salary();
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
		salary();
	}

	@Override
	public String toString() {
		String correction = "";
		if (bonuses)
			correction = " including bonus : " + bonus + " $";
		return "Employee [" + name + " ; rate: " + rate + "; hourse : " + hours
				+ " ; salary : " + salary + "$" + correction + " ]";
	}

	public double salary() {
		totalSum -= salary;
		salary = rate * hours;
		if (bonuses) {
			bonus = salary * 0.1;
			salary = bonus + salary;
		}
		totalSum += salary;
		return salary;
	}

	public void bonuses(boolean bonuses) {

		if (bonuses) {
			totalSum -= salary;
			bonus = salary * 0.1;
			salary = bonus + salary;
			totalSum += salary;
		}
		this.bonuses = bonuses;

	}

	static double getTotalSum() {
		return totalSum;
	}

}
