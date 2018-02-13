package lesson06.task2;

public class Cleaner extends Staff{

	public Cleaner() {
		super();
		
	}

	public Cleaner(PersonType type) {
		super(type);
		
	}

	public Cleaner(String name, PersonType type) {
		super(name, type);
		
	}

	@Override
	public double salary() {
	
		return 2500.0;
	}

	@Override
	public void print() {
		System.out.println(" I am a Cleaner" + super.getName() + "!");
		
	}

}
