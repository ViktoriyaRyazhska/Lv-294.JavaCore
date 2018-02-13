package lesson6;

public class Cleaner extends Staff {

	static final String TYPE_PERSON = "Cleaner";
	public Cleaner() {
		System.out.println(TYPE_PERSON);
		
	}
	@Override
	public int salary() {
		return 500;
	}

	@Override
	public void print() {
		System.out.println("I`m a cleaner");
		
	}
	

}
