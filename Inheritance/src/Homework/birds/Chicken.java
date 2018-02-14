package Homework.birds;

import Homework.abstraction.NonFlyingBird;

public class Chicken extends NonFlyingBird {

	public Chicken(String feathers, int layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Chicken can't fly!");

	}

}
