package task1;

public class Main {

	public static void main(String[] args) {
		
		Animal [] animals = new Animal[5];
		animals[0] = new Cat();
		animals[1] = new Cat();
		animals[2] = new Cat();
		animals[3] = new Dog();
		animals[4] = new Dog();
		
		for(Animal i : animals) {
			i.voice();
			i.feed();
		}
	}
}
