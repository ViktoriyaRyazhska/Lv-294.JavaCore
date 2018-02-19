package HW5;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee [] w = new Employee[4];
int a []= {0,1,2,3};
w[0]= new SalariedEmployee(3, "Ivan", 176, 12, "1524523451");
w[1]= new SalariedEmployee(2, "Petro", 168, 10, "5624562456");
w[2]= new ContractEmployee(15, "Alla", 1500, "66757634675");
w[3]= new ContractEmployee(13, "Maria", 1600, "78587457847");


int tmp;
for (int i = 0; i < w.length - 1; i++) {
	for (int j = i + 1; j < w.length; j++) {
		if (w[i].calculatePay() < w[j].calculatePay()) {
			tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
	}
}

for (int i = 0; i < a.length; i++) {
	
w[i].show();
}

	}

}
