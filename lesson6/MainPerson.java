package lesson6;

public class MainPerson {

	public static void main(String[] args) {
		Person [] p = new Person [4];
		p[0] = new Student();
		p[1] = new Teacher();
		p[2] = new Cleaner();
		p[3] = new Student();
		
		for(Person i : p) {
			if(i instanceof Staff) {
				((Staff) i).salary();
				i.print();
		}
			else {
				i.print();
			}
		
	}
}
}
