package homework2;

public class Main {

	public static void main(String[] args) {
		
		Employee[] em = new Employee[5];
		em[0] = new SalariedEmployee("Anna Goldman", "06", "503", 53, 160);
		em[1] = new SalariedEmployee("Ada Abergel", "72", "128", 48, 170);
		em[2] = new SalariedEmployee("Daniel Ben Haim", "84", "783", 50, 160);
		em[3] = new ContractEmployee("Nathaniel Braverman", "27", "1", 7500);
		em[4] = new ContractEmployee("Rebecca Simmel", "44", "3", 7800);
		
		Employee tmp;
		for(int i = 0; i < em.length - 1; i++) {
			for(int j = i + 1; j < em.length; j++) {
				if(((CalculatePay)em[i]).calculatePay() < ((CalculatePay)em[j]).calculatePay()) {
				tmp = em[i];
				em[i] = em[j];
				em[j] = tmp;
				}
 			}
		}
		for(int i = 0; i < em.length; i++) {
			System.out.println("Employee ID = " + em[i].getEmployeeId() + " [name = " + em[i].getName()
					+ ", salary = " + ((CalculatePay)em[i]).calculatePay() + "]");
		}
	}

}
