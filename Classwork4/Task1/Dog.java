package Task1;

public class Dog implements Animal {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void voice() {
		System.out.println("√‡‚");
	}

	@Override
	public void feed() {
		System.out.println("Eat, eat!");
	}
}