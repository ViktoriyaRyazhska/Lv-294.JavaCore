package lesson6;

public class Dog implements Animal{

	@Override
	public void voice() {
		System.out.println("I`m a dog - bark, bark");
	}

	@Override
	public void feed() {
		System.out.println("Nice dog meal");
		
	}

}
