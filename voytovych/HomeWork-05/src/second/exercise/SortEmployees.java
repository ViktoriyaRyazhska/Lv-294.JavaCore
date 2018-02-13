package second.exercise;

public class SortEmployees {
	public void sort(Employee [] emp) {
		Employee tmp;
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (((Pay)emp[i]).calculatePay() < ((Pay)emp[j]).calculatePay()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}

	}
}
