package HW5;

public class ContractEmployee extends Employee implements Pay {
    int id;
    String name;
	int 	fixedPaid;
String federalTaxIdmember ;
public int calculatePay() {return fixedPaid;}
public ContractEmployee(int id, String name, int fixedPaid, String federalTaxIdmember) {
	super();
	this.id = id;
	this.name = name;
	this.fixedPaid = fixedPaid;
	this.federalTaxIdmember = federalTaxIdmember;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getFixedPaid() {
	return fixedPaid;
}
public void setFixedPaid(int fixedPaid) {
	this.fixedPaid = fixedPaid;
}
public String getFederalTaxIdmember() {
	return federalTaxIdmember;
}
public void setFederalTaxIdmember(String federalTaxIdmember) {
	this.federalTaxIdmember = federalTaxIdmember;
}
public void show() {
	System.out.println(getId()+" "+getName()+" "+calculatePay());
	
}

}
