package task2;

public class Teacher extends Staff{
	
	public Teacher(String name) {
		super(name);
	}
	
	final String TYPE_PERSON = "TEACHER";
	
	@Override
	public void print() {
		System.out.println("I am a " + TYPE_PERSON + " . My salary is " + salary());
	}
	
	@Override
	public int salary() {
		return 5000;
	}
}

