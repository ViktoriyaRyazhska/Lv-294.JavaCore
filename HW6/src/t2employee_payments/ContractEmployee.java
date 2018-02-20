package t2employee_payments;

public class ContractEmployee extends Employee{
	
private float hourly_rate;	
private float hours;

String federalTaxIDmember;

public ContractEmployee (String name,float hourly_rate,float hours) {
	getId();
	this.name = name;
	this.hourly_rate = hourly_rate;
	this.hours = hours;
}

public float calculatePay () {
	float payment=hours*hourly_rate;
	return payment;
}

@Override
public String toString() {
    return "ID: " + id + " Name: " + name + " Monthly payment: " + calculatePay();
}

}
