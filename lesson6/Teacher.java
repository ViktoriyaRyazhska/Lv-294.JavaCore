package lesson6;

public class Teacher extends Staff{

	static final String TYPE_PERSON = "Teacher";
	public Teacher() {
		System.out.println(TYPE_PERSON);
		
	}
	@Override
	public int salary() {
		return 1000;
	}

	@Override
	public void print() {
		System.out.println("I`m a teacher");
		
	}

}
