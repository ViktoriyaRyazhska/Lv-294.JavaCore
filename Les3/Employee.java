package Les3;

public class Employee {
	private String name;
	private int rate;
	private double hours;
	
	public static double totalSum=0;	
	
	
	public Employee(String name, int rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum=totalSum+salary();

	}

	public Employee(String name, int rate) {

		this.name = name;
		this.rate = rate;
	}

	public Employee() {

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

	public void setRate(int rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		totalSum=totalSum-salary();
		this.hours = hours;
		totalSum=totalSum+salary();
	}
	

	public double salary() {
		return rate*hours;

	}
	
	public int changeRate(int rate) {
		totalSum=totalSum-salary();
		totalSum=totalSum-bonuses();
		this.rate=rate;
		
		totalSum=totalSum+salary();
		return this.rate;
	}
	
	public double bonuses() {
		double bonuses =salary()*0.1;
		totalSum=totalSum+bonuses;
		return bonuses;
	}
	
	@Override
	public String toString() {
		return "Name "+ name + " rate "+ rate + " hours "+hours + " salary "+ salary() + " bonuses "+ bonuses();
	}

}
