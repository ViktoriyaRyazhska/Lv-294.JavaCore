package second.exercise;

public class ContractEmployee extends Employee implements Pay {
	private String name;
	private String federalTaxIdMember;
	private double fixedMonthlyPayment;

	public ContractEmployee(String name, String federalTaxIdMember, double fixedMonthlyPayment, String employeeId) {
		super(employeeId);
		this.name = name;
		this.federalTaxIdMember = federalTaxIdMember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {
		return fixedMonthlyPayment;
	}

	public void description() {
		System.out.println(name + " [contract employee]" + "\nID: " + super.getEmployeeId()
				+ "\nFederal tax ID member: " + federalTaxIdMember + "\nFixed monthly payment: " + calculatePay() + "\n");
	}

	public String getName() {
		return name;
	}

	public String getFederalTaxIdMember() {
		return federalTaxIdMember;
	}

}
