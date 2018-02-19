package HW5;

public class SalariedEmployee extends Employee implements Pay {
    int id;
    String name;
	int	hours;
int hourlyRate ;
String socialSecurityNumber;
public int calculatePay() {return hours*hourlyRate;}
public SalariedEmployee(int id, String name, int hours, int hourlyRate, String socialSecurityNumber) {
	super();
	this.id = id;
	this.name = name;
	this.hours = hours;
	this.hourlyRate = hourlyRate;
	this.socialSecurityNumber = socialSecurityNumber;
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
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public int getHourlyRate() {
	return hourlyRate;
}
public void setHourlyRate(int hourlyRate) {
	this.hourlyRate = hourlyRate;
}
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}
public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.socialSecurityNumber = socialSecurityNumber;
}

public void show() {
	System.out.println(getId()+" "+getName()+" "+calculatePay());
	
}

}
