package hw04.task2;

import java.util.ArrayList;
import java.util.List;

public class DogApp {
	private Dog[] dogs;

	public DogApp(Dog... dogs) {
		this.dogs = dogs;
	}

	public int checkNames(String name) {
		int count = 0;
		for (Dog dog : dogs) {
			if (dog.getName().equals(name))
				count++;
		}
		return count;
	}

	public void sameNameDogs(String name) {
		if (checkNames(name) > 0) {
			System.out.println("Yes! There is " + checkNames(name)
					+ " dogs with this name.");
		} else {
			System.out.println("No! There is not dogs with this name.");
		}
	}

	public List<Dog> oldest() {
		int oldestAge = 0;
		List<Dog> oldestDogs = new ArrayList<Dog>();
		for (Dog dog : dogs) {
			if (dog.getAge() >= oldestAge) {
				oldestAge = dog.getAge();
				oldestDogs.add(dog);
			}
		}
		return oldestDogs;
	}

	public void displayOldestDogs() {
		for (Dog dog : oldest()) {
			System.out.println(dog.getName() + " ; "
					+ dog.getBreed().toString().replace("_", " "));
		}
	}
}
