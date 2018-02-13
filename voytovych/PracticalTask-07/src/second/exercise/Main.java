package second.exercise;

public class Main {

	public static void main(String[] args) {

		/*
		 * Create next structure. In abstract class Person with property name, declare
		 * abstract method print(). In other classes in body of method print() output
		 * text “I am a …”. In class Staff declare abstract method salary(). In each
		 * concrete class create constant TYPE_PERSON. Output type of person in each
		 * constructors. Create array of Person and add some Teachers, Cleaners and
		 * Students to it. Call method print() for all of it. Call method salary() for
		 * all Teachers and Cleaner
		 */

		Person[] per = new Person[4];
		per[0] = new Student("Oleksand");
		per[1] = new Teacher("Igor");
		per[2] = new Cleaner("Roman");
		per[3] = new Teacher("Ivan");

		for (int i = 0; i < per.length; i++) {
			per[i].print();
		}
		for (int i = 0; i < per.length; i++) {
			if (per[i] instanceof Staff) {
				Staff st = (Staff) per[i];
				st.salary();
			}
		}
	}

}
