package homework2;

public class ContractEmployee extends Employee implements CalculatePay{
	
	private String federalTaxIdMember;
	private int fixedSalary;
	
	public ContractEmployee(String name, String employeeId, String federalTaxIdMember, int fixedSalary) {
		super(name, employeeId);
		this.federalTaxIdMember = federalTaxIdMember;
		this.fixedSalary = fixedSalary;
	}
	
	public String getFederalTaxIdMember() {
		return this.federalTaxIdMember;
	}
	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}
	
	public int getFixedSalary() {
		return this.fixedSalary;
	}
	public void setFixedSalary(int fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public int calculatePay() {
		return fixedSalary;
	}
}
