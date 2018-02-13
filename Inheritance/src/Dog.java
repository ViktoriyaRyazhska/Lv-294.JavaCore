import java.awt.Color;

public class Dog implements Animal {
	
	Color color;
	int age;
	int name;
	
	public Dog(Color color, int age, int name) {
		this.color = color;
		this.age = age;
		this.name = name;
	}

	public Dog() {
	}

	@Override
	public void feed() {
		System.out.println("Dog is eating!");
	}

	@Override
	public void voice() {
		System.out.println("Gav!");

	}

}
