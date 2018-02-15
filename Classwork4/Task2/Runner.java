package Task2;

public class Runner {
	public static void main(String[] args) {
		Person[] p= new Person[3];
		p[0] =new Teacher();
		p[1] = new Cleaner();
		p[2]=new Student();
		for (int i = 0; i < p.length; i++) {
			p[i].print();
			if (p[i] instanceof Staff) {
				System.out.println(	((Staff)p[i]).salary());
			}
		}
		
	}
}
