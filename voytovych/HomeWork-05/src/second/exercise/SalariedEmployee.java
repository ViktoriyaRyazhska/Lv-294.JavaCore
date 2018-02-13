package second.exercise;

public class SalariedEmployee extends Employee implements Pay {
	private String name;
	private String socialSecurityNumber;
	private double hourlyRate;
	private int hours;

	public SalariedEmployee(String name, String socialSecurityNumber, double hourlyRate, int hours, String employeeId) {
		super(employeeId);
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hours = hours;

	}

	@Override
	public double calculatePay() {
		return hourlyRate * hours;

	}

	public void description() {
		System.out.println(name + " [salaried employee]" + "\nID: " + super.getEmployeeId()
				+ "\nSocial security number: " + socialSecurityNumber + "\nThe average monthly salary: " + calculatePay() + "\n");
	}

	public String getName() {
		return name;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public int getHours() {
		return hours;
	}

}
