package Les6HW6_1;

public class SalariedEmployee extends Employee implements Pay{

	
	private String socialSecurityNumber;
	private int hoursNumbers;
	private int hourlyRate;
	
	@Override
	public int calculatePay() {
		return hourlyRate*hoursNumbers;
		 
	}
	
	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String socialSecurityNumber, int hoursNumbers, int hourlyRate) {
		super();
		this.socialSecurityNumber = socialSecurityNumber;
		this.hoursNumbers = hoursNumbers;
		this.hourlyRate = hourlyRate;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getHoursNumbers() {
		return hoursNumbers;
	}
	public void setHoursNumbers(int hoursNumbers) {
		this.hoursNumbers = hoursNumbers;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	

}
