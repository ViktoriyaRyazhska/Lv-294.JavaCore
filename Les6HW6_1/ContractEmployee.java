package Les6HW6_1;

public class ContractEmployee extends Employee implements Pay{

	private String federalTaxIdmember;
	private final int MONTHLY_PAYMENT;
	
	public ContractEmployee(String federalTaxIdmember, int mONTHLY_PAYMENT) {
		super();
		this.federalTaxIdmember = federalTaxIdmember;
		MONTHLY_PAYMENT = mONTHLY_PAYMENT;
	}

	@Override
	public int calculatePay() {
		return MONTHLY_PAYMENT;
	}

}
