package Homework.birds;
import Homework.abstraction.*;
public class Swallow extends FlyingBird{

	public Swallow(String feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Swallow is flying!");
	}


}
