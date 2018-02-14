package hw06.task2.classes;

import hw06.task2.abstracts.Employee;

public class ContractEmployee extends Employee {
	private String federalTaxIdMember;

	public ContractEmployee() {
		super();
	}

	public ContractEmployee(String name) {
		super(name);
	}

	public ContractEmployee(String name, String federalTaxIdMember) {
		super(name);
		this.federalTaxIdMember = federalTaxIdMember;
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

	public void setFederalTaxIdMember(String federalTaxIdMember) {
		this.federalTaxIdMember = federalTaxIdMember;
	}

	@Override
	public double calculatePay() {
		return FIXED_PAY;
	}

}
