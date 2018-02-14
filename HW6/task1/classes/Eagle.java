package hw06.task1.classes;

import hw06.task1.abstracts.FlyingBird;

public class Eagle extends FlyingBird {
	public Eagle() {
		super();
	}

	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);

	}

	@Override
	public void fly() {
		System.out.println("I'm an Eagle, and I fly like an Eagles!");
	}

}
