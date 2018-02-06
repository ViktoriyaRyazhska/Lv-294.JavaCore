
public class Employee {

	private String name;
	private double rate;
	private double hours;
	public static double totalSum = 0;

	private double percentageOfSalaryIncrement = 10;

	public Employee() {

	}

	public Employee(String name, int rate) {

		this.name = name;
		this.rate = rate;
	}

	public Employee(String name, int rate, int hours) {
		this(name, rate);
		this.hours = hours;
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
		this.rate = rate;
	}
	
	public double getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}


	public double salary() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}

	public void changeRate(int rate) {
		double salary = salary();
		double bonuse = bonuses(salary);
		totalSum = ( totalSum - (salary + bonuse) );
		setRate(rate);
		salary = salary();
		bonuse = bonuses(salary);
		totalSum += (salary + bonuse);
	}

	public double bonuses(double salary) {
		return (salary / 100) * percentageOfSalaryIncrement;
	}

	public void calculateTotalSum() {
		double salary = salary();
		double bonuse = bonuses(salary);
		totalSum += (salary + bonuse);
	}
}
