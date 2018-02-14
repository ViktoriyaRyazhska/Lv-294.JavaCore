package Homework;

public class EmployeeManager {
	Employee[] array;

	public EmployeeManager(Employee[] array) {
		this.array = array;
	}

	public Employee[] getArray() {
		return array;
	}

	public void setArray(Employee[] array) {
		this.array = array;
	}
	
	public void sortBySalary() {
		Employee temp;
		for(int i = 0; i < array.length -1;i++) {
			for(int j = i + 1; j < array.length;j++) {
				if(array[i].calculatePay() < array[j].calculatePay()) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public void print() {
		for(Employee obj : array) {
			System.out.println(obj);
		}
	}
	
}
