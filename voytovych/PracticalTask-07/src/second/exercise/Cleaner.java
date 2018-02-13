package second.exercise;

public class Cleaner extends Staff {
	final String TYPE_PERSON = "Cleaner";
	
	public Cleaner(String name) {
		super(name);
		System.out.println("Type of person: " + TYPE_PERSON);
	}
	
	@Override
	public void salary() {
		System.out.println("Salary of cleaners: 10 000");
		
	}

	@Override
	public void print() {
		System.out.println("I am a cleaner.");
		
	}

}
