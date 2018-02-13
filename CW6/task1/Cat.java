package lesson06.task1;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("Meu-meu-meu! I am a Cat!");

	}

	@Override
	public void feed() {
		System.out.println("Cat is eating!");
		System.out.println("Omn-Omn-Omn!");

	}

}
