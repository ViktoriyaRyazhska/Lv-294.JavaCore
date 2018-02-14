package Homework.birds;

import Homework.abstraction.NonFlyingBird;

public class Penguin extends NonFlyingBird {

	public Penguin(String feathers, int layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Penguin can't fly!");

	}

}
