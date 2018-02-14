package Homework;

public class ContractEmployee extends Employee {
	private String socialSecurityNumber;
	private int hourlyRate;
	private int hoursWorked;

	public ContractEmployee() {
	}

	public ContractEmployee(String name, String employeeId) {
		super(name, employeeId);
	}

	public ContractEmployee(String name, String employeeId,String socialSecurityNumber, int hourlyRate, int hoursWorked) {
		super(name, employeeId);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
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
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + hourlyRate;
		result = prime * result + hoursWorked;
		result = prime * result + ((socialSecurityNumber == null) ? 0 : socialSecurityNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContractEmployee other = (ContractEmployee) obj;
		if (hourlyRate != other.hourlyRate)
			return false;
		if (hoursWorked != other.hoursWorked)
			return false;
		if (socialSecurityNumber == null) {
			if (other.socialSecurityNumber != null)
				return false;
		} else if (!socialSecurityNumber.equals(other.socialSecurityNumber))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[ContractEmployee:" + name + " ;ID:" +  employeeId + " ;Salary:" + calculatePay() + "]";
	}

	@Override
	public int calculatePay() {
		return hourlyRate * hoursWorked;
	}

}
