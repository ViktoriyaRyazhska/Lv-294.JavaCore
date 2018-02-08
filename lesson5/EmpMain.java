package lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class EmpMain {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Employee e1 = new Employee("Sudorov", 25, 15580);
		Employee e2 = new Employee("Surnuk", 5, 4885.36);
		Employee e3 = new Employee("Dobriv", 8, 4582.3);
		Employee e4 = new Employee("Yanko", 25, 1222.63);
		Employee e5 = new Employee("Ivanov", 6, 66348.2);
		Employee [] emarr = {e1, e2, e3, e4, e5};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, entry number of department what are you looking for ");
		int numD = Integer.parseInt(br.readLine());
		
		for(int i=0; i<emarr.length; i++) {
			emarr[i].findDep(numD);
		}
		Employee [] salem= emarr; 
		Employee max;
		for(int i=0; i<salem.length-1; i++) {
			for(int j=i+1; j<salem.length; j++) {
				if(salem[i].getSalary()<salem[j].getSalary()) {
					max=salem[i];
					salem[i]=salem[j];
					salem[j]=max;
					
					
				}
			}
		}
		
		for(Employee h : salem) {
			System.out.println(h.toString());
		}
//		System.out.println(Arrays.toString(emarr));
//		findDep(emarr, 8);
		

	}
	
	public static void findDep(Employee [] arr, int a) {
		for(Employee h : arr) {
			if (h.getDepartmentNumber()==a) {
				System.out.println("This employeer of dapertment what you chose " + h.getName());
			}
		}
	}

}
