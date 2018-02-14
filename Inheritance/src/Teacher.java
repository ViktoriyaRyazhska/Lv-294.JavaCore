

public class Teacher extends Staff {
	public static final String TYPE_PERSON = "TEACHER";

	public Teacher(String name) {
		super(name);
	}

	@Override
	public int salary() {
		
		return 3000;
	}

	@Override
	public void print() {
		System.out.println("I am a teacher!");

	}

}
