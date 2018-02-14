package Homework.birds;

import Homework.abstraction.*;

public class Eagle extends FlyingBird {

	public Eagle(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Eagle is flying!");
	}

}
