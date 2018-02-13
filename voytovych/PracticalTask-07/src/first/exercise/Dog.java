package first.exercise;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("Dog: bow-vow, bow-vow, arf-arf");

	}

	@Override
	public void feed() {
		System.out.println("Dog: feed");

	}

}
