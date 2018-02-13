package lesson6;


public abstract class Person {
	public Person() {
		System.out.println(TYPE_PERSON);
		
	}
	static final String TYPE_PERSON = "Person";
	String name;
	public abstract void print();

}
