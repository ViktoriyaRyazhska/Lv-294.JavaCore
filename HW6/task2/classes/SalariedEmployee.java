package hw06.task2.classes;

import hw06.task2.abstracts.Employee;


public class SalariedEmployee extends Employee  {

	private String socialSecurityNumber;
	private int hourlyRate;
	private int hoursWorked;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name) {
		super(name);
	}

	public SalariedEmployee(String name, int hourlyRate, int hoursWorked) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public SalariedEmployee(String name, String socialSecurityNumber,
			int hourlyRate, int hoursWorked) {
		super(name);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}

}
