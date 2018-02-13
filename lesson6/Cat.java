package lesson6;

public class Cat implements Animal{

	@Override
	public void voice() {
		System.out.println("I`m a cat - miay, miay");
		
	}

	@Override
	public void feed() {
		System.out.println("I like fish");
		
	}

}
