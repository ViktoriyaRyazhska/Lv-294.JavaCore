package Task2;

public class Program {
    public static void main(String[] args) {
        Payable[] employees = new Payable[4];

        employees[0] = new ContractEmployee("A1", "Vasya", 5, 8, "3150");
        employees[1] = new ContractEmployee("B2", "Petya", 50, 2, "007");
        employees[2] = new SalariedEmployee("C3", "Kolya", 12, "000-0002");
        employees[3] = new SalariedEmployee("CC", "Masha", 3, "XXX-1234");

        Payable tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
