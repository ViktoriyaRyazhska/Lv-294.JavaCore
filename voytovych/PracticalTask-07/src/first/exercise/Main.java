package first.exercise;

public class Main {

	public static void main(String[] args) {

		/*
		 * Create interface Animal with methods voice() and feed(). Create two classes
		 * Cat and Dog, which implement this interface. Create array of Animal and add
		 * some Cats and Dogs to it. Call voice() and feed() method for all of it
		 */
		
		Animal [] arr = new Animal[4];
		arr[0] = new Cat();
		arr[1] = new Dog();
		arr[2] = new Cat();
		arr[3] = new Dog();
		
		for (Animal animal : arr) {
			animal.voice();
			animal.feed();
		}

	}

}
