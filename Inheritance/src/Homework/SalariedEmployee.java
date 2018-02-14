package Homework;

public class SalariedEmployee extends Employee{

	private String federalTaxIdMember;
	
	public SalariedEmployee() {
	}

	public SalariedEmployee(String name, String employeeId) {
		super(name, employeeId);
	}
	

	public SalariedEmployee(String name, String employeeId,String federalTaxIdMember) {
		super(name, employeeId);
		this.federalTaxIdMember = federalTaxIdMember;
	}

	
	
	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((federalTaxIdMember == null) ? 0 : federalTaxIdMember.hashCode());
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
		SalariedEmployee other = (SalariedEmployee) obj;
		if (federalTaxIdMember == null) {
			if (other.federalTaxIdMember != null)
				return false;
		} else if (!federalTaxIdMember.equals(other.federalTaxIdMember))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "[SalariaedEmployee:" + name + " ;ID:" +  employeeId + " ;Salary:" + calculatePay() + "]";
	}
	
	@Override
	public int calculatePay() {
		return 1000;
	}
	
}
