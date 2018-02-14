package task2;

public class Cleaner extends Staff{
	
	public Cleaner(String name) {
		super(name);
	}
	
	 final String TYPE_PERSON = "CLEANER";
	
	@Override
	 public void print() {
		System.out.println("I am a " + TYPE_PERSON + " . My salary is " + salary());
	}
	
	@Override 
	public int salary() {
		return 3500;
	}

}
