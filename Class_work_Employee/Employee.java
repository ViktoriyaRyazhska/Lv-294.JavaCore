
public class Employee {
	private String name;
	private int rate;
	private int hours;
	private int salary;
	private static int totalSum;
	
	public Employee() {}
	
	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
		totalSum+=rate;
		salary = hours*rate;
	}
	
	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum+=rate;
		salary = hours*rate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void changeRate(int rate) {
		totalSum-=this.rate;
		this.rate = rate;
		totalSum+=rate;
		salary = hours*rate;
		
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
		salary = hours*rate;
	}
	
	public int getSalary() {
		return this.salary;
	}
	public static int getTotalSum() {
		return totalSum;
	}
	
	@Override
	public String toString() {
		return "Employee:" + name +".Rate:" + rate + ".Hours:" + hours;
	}
	
	public double bounus() {
		return (double)salary*0.1d;
	}
	public double Salary_and_Bonus() {
		return (double)salary*1.1d;
	}
}
