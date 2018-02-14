package hw06.task1.abstracts;

public abstract class FlyingBird extends Bird {

	public FlyingBird() {
		super();
	}

	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);

	}

	@Override
	public abstract void fly();

}
