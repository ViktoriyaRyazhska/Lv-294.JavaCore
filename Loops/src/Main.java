import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[10];
		System.out.println("Enter the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		System.out.println("Maximum in the array " + FirstTask.Maximum(array));
		System.out.println("Sum of positive in the array " + FirstTask.sumOfPositive(array));
		FirstTask.PosOrNeg(array);
		Employee[] emp_arr = {new Employee("Mark" ,	123, 1000.0),new Employee("John" ,	123, 1640.0),new Employee("Jhonny",50, 1025.0),new Employee("Eric" ,	25, 1026.0),new Employee("Anthony" ,10, 903.0)};
		System.out.println("Enter dep Number");
		int dep = Integer.parseInt(reader.readLine());
		for(Employee var :emp_arr) {
			if(var.getDepartment_number() == dep) {System.out.println(var.getName());}
		}
		
		for(int i = 0; i < emp_arr.length-1;i++) {
			for(int j = 1; j < emp_arr.length; i++) {
				if(emp_arr[i].getSalary()<emp_arr[i].getSalary()) {
					//switch ... TO DO
				}
			}
		}

	}

}
