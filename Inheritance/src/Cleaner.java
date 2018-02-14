
public class Cleaner extends Staff {
	
	public static final String TYPE_PERSON = "CLEANER";
	
	public Cleaner(String name) {
		super(name);
	}

	@Override
	public int salary() {
		return 2000;
	}

	@Override
	public void print() {
		System.out.println("I am a cleaner!");

	}

}
