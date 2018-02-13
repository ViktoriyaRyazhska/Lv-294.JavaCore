package lesson6;

public abstract class Staff extends Person{
	
	static final String TYPE_PERSON = "Staff";
	public abstract int salary();
	

	public Staff() {
		System.out.println(TYPE_PERSON);
		
	}
}
