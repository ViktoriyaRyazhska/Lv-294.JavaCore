package Task2;

public class ContractEmployee extends Employee implements Payable {
    public double hourlyRate;
    public double numberOfHoursWorked;
    public String federalTaxIdNumber;

    public ContractEmployee(String id, String name, double rate, double hoursWorked, String ftin) {
        super(id, name);

        hourlyRate = rate;
        numberOfHoursWorked = hoursWorked;
        federalTaxIdNumber = ftin;
    }

    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() + ", avg. wage: " + calculatePay();
    }
}
