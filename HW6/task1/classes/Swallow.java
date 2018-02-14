package hw06.task1.classes;

import hw06.task1.abstracts.FlyingBird;

public class Swallow extends FlyingBird {

	public Swallow() {
		super();
		}

	public Swallow(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("I'm a Swallow, and I fly like a Swallows!");
	}

}
