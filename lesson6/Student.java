package lesson6;

public class Student extends Person{
	static final String TYPE_PERSON = "sTUDENT";
	

	public Student() {
		System.out.println(TYPE_PERSON);
		
	}
	@Override
	public void print() {
		System.out.println("I`m a student");
		
	}
	

}
