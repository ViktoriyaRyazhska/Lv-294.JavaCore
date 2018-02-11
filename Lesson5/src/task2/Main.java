package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		Employee[] employees =  new Employee[5];
		employees[0] = new Employee("Bogdan", 1, 50);
		employees[1] = new Employee("Marta", 2, 65);
		employees[2] = new Employee("Oleg", 2, 35);
		employees[3] = new Employee("Artem", 1, 45);
		employees[4] = new Employee("Zlata", 3, 50);
		
			System.out.println("Enter number of department");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			for(int i = 0; i < employees.length; i++) {
				if(employees[i].getDepartmentNumber() == num)
					System.out.println(employees[i].getName());
				break;
			}
			if (num >= 4) {
				System.out.println("Choose department from 1 to 3");
				
			}
			
			
			for (int i = 0; i < employees.length - 1; i++) {
				for (int j = i + 1; j < employees.length; j++) {
					if (employees[i].getSalary() < employees[j].getSalary()) {
						Employee tmp = employees[i];
						employees[i]= employees[j];
						employees[j]= tmp;
					}
				}
			}
			for (int i = 0; i < employees.length; i++) {
				System.out.println(employees[i]);
			}

		
		
	
			
		}
}