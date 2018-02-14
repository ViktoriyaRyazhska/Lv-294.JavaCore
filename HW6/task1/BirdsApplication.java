package hw06.task1;

import java.util.Random;

import hw06.task1.abstracts.Bird;
import hw06.task1.classes.Chiken;
import hw06.task1.classes.Eagle;
import hw06.task1.classes.Penguin;
import hw06.task1.classes.Swallow;

public class BirdsApplication {
	private Bird[] birds;

	public BirdsApplication() {

	}

	public BirdsApplication(Bird[] birds) {
		this.birds = birds;
	}

	public Bird[] getBirds() {
		return birds;
	}

	public void setBirds(Bird[] birds) {
		this.birds = birds;
	}

	public void fillArray(int number) {
		this.birds = new Bird[number];
		Random random = new Random();
		for (int i = 0; i < birds.length; i++) {
			switch (random.nextInt(4)) {
			case 0:
				birds[i] = new Eagle();
				break;
			case 1:
				birds[i] = new Swallow();
				break;
			case 2:
				birds[i] = new Chiken();
				break;
			case 3:
				birds[i] = new Penguin();
				break;
			}
		}
	}

	public void birdsFly() {
		for (Bird bird : birds) {
			bird.fly();
		}
	}
}
