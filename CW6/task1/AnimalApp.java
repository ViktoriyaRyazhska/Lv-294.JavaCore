package lesson06.task1;

public class AnimalApp {
	private Animal[] animals;

	public AnimalApp(Animal[] animals) {
		this.animals = animals;
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public void start() {
		for (Animal animal : animals) {
			animal.voice();
			animal.feed();
		}
	}
}
