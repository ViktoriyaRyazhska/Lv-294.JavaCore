package first.exercise;

public class Cat implements Animal {

	@Override
	public void voice() {
		System.out.println("Cat: meaou, neaou, mew-mew");

	}

	@Override
	public void feed() {
		System.out.println("Cat: feed");

	}

}
