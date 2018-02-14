
public class Student extends Person {
	public static final String TYPE_PERSON = "STUDENT";
	
	public Student(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println("I am a student!");
	}

	
}
