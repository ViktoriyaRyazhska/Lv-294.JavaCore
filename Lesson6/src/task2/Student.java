package task2;

public class Student extends Person{
	
	public Student(String name) {
		super(name);
	}
	
	final String TYPE_PERSON = "STUDENT";
	
	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON);
	}
}
