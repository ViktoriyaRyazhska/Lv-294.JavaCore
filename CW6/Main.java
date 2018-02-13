package lesson06;

import java.util.Random;

import lesson06.task1.Animal;
import lesson06.task1.AnimalApp;
import lesson06.task1.Cat;
import lesson06.task1.Dog;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		Random random = new Random();
		for (int i = 0; i < animals.length; i++) {
			if (random.nextBoolean()) {
				animals[i] = new Cat();
				continue;
			}
			animals[i] = new Dog();
		}
		
		AnimalApp app = new AnimalApp(animals);
		app.start();
	}
}
