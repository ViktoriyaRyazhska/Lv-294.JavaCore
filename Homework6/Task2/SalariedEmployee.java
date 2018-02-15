package Task2;

public class SalariedEmployee extends Employee implements Payable {
    public double salary;
    public String socialSecurityNumber;

    public SalariedEmployee(String id, String name, double salary, String ssn) {
        super(id, name);

        this.salary = salary;
        this.socialSecurityNumber = ssn;
    }

    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", avg. wage: " + calculatePay();
    }
}
