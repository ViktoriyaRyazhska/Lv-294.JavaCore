package task2;

public class Main {

	public static void main(String[] args) {
		Person[] per = new Person[5];
		per[0] = new Student("Artem");
		per[1] = new Student("Zlata");
		per[2] = new Teacher("Volodymyr");
		per[3] = new Cleaner("Bogdan");
		per[4] = new Cleaner("Oleg");
		
		for(Person a : per) {
			a.print();
		}
	}
}
