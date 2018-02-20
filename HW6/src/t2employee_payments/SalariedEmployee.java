package t2employee_payments;

public class SalariedEmployee extends Employee implements Payments {
	private float monthly_payment;
	
	String socialSecurityNumber;
	
	public SalariedEmployee (String name,float monthly_payment) {
		getId();
		this.name = name;
		this.monthly_payment=monthly_payment;
	}
	
	public float calculatePay () {
		return this.monthly_payment;
	}
	
    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Monthly payment: " + calculatePay();
}

}
