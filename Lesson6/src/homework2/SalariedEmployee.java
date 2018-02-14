package homework2;

public class SalariedEmployee extends Employee implements CalculatePay{
	
	private String socialSecurityNumber;
	private int rate;
	private int hours;
	
	public SalariedEmployee(String name, String employeeId, 
			String socialSecurityNumber, int rate, int hours) {
		super(name, employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.rate = rate;
		this.hours = hours;
	}
	
	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}
	public void setSocialSecurityNumbers(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	public int getRate() {
		return this.rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	public int getHours() {
		return this.hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public int calculatePay() {
		return hours * rate;
	}
}
