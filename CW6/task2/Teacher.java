package lesson06.task2;

public class Teacher extends Staff{

	
	public Teacher() {
		super();
		
	}

	public Teacher(PersonType type) {
		super(type);
		
	}

	public Teacher(String name, PersonType type) {
		super(name, type);
		
	}

	@Override
	public double salary() {
		
		return 5500.0;
	}

	@Override
	public void print() {
		System.out.println(" I am a Teacher" + super.getName() + "!");	
		
	}

}
