package second.exercise;

public class Teacher extends Staff{
	final String TYPE_PERSON = "Teacher";
	
	public Teacher(String name) {
		super(name);
		System.out.println("Type of person: " + TYPE_PERSON);
	}
	
	@Override
	void salary() {
		System.out.println("Salary of teachers: 20 000");
	}

	@Override
	void print() {
		System.out.println("I am a teacher.");
	}

}
