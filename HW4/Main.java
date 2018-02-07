package hw04;

import hw04.task2.Breed;
import hw04.task2.Dog;
import hw04.task2.DogApp;

//import hw04.task1.HTTPErrorEnum;
//import hw04.task1.Task;

public class Main {

	public static void main(String[] args) {
		// Task task = new Task();
		// task.startA(3, -5, 5);
		// task.startB(-3,-15,-1);
		// System.out.println(task.startC(400));

		Dog dog1 = new Dog("Sparky", Breed.ALASKAN_MALAMUTE, 15);
		Dog dog2 = new Dog("Tuzik", Breed.BEAGLE, 10);
		Dog dog3 = new Dog("Hatiko", Breed.GERMAN_SHEPHERD_DOG, 15);
		Dog dog4 = new Dog("Hatiko", Breed.CANE_CORSO, 8);

		DogApp app = new DogApp(dog1, dog2, dog3, dog4);
		app.sameNameDogs("Hatiko");
		app.displayOldestDogs();
	}

}
