package lesson06.task1;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("Woof-woof-woof! I am a Dog!");
	}

	@Override
	public void feed() {
		System.out.println("Dog is eating!");
		System.out.println("Omn-omn-omn-om!");
		
	}

}
