package hw03;

public class ConsoleApp {
	private Person person;
	private MyScaner input = new MyScaner();
	private String name;
	private int birthYear;

	public ConsoleApp(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void start() {
		boolean swch;
		int choice = 0;
		do {
			swch = true;

			System.out.println(" -------The Person Console Application Menu ------- :");
			System.out.println(" 1) Calculate the age of Person :");
			System.out.println(" 2) Input information about person :");
			System.out.println(" 3) Output information about person :");
			System.out.println(" 4) Change the name of person :");
			System.out.println(" 0) Exit :");
			System.out.println(" -------------------------------------------------- :");
			System.out.println(" ----------------- Please make your choice -------- :");
			System.out.println(" -------------------------------------------------- :");
			choice = input.menuChoice(0, 4);
			switch (choice) {
			case 1:

				System.out.println(" 1) Calculate the age of Person :");
				System.out.println(" -------------------------------------------------- :");
				System.out.println("The Person is " + person.age()
						+ " years old.");
				System.out.println(" -------------------------------------------------- :");
				break;
			case 2:
				System.out.println(" 2) Input information about person :");
				System.out.println(" -------------------------------------------------- :");
				name = input.inputName();
				birthYear = input.inputYear(1900, 2018);
				person.input(name, birthYear);
				System.out.println(" -------------------------------------------------- :");
				break;
			case 3:
				System.out.println(" 3) Output information about person :");
				System.out.println(" -------------------------------------------------- :");
				person.output();
				System.out.println(" -------------------------------------------------- :");
				break;
			case 4:
				System.out.println(" 4) Change the name of person :");
				System.out.println(" -------------------------------------------------- :");
				name = input.inputName();
				person.changeName(name);
				System.out.println(" -------------------------------------------------- :");
				break;
			case 0:
				input.close();
				swch = false;
				System.out.println(" 0) Exit :");
				System.out
						.println(" -------------------------------------------------- :");
			}

		} while (swch);
	}
}