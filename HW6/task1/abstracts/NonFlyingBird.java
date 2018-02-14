package hw06.task1.abstracts;

public abstract class NonFlyingBird extends Bird {

	public NonFlyingBird() {
		super();
	}

	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);

	}

	@Override
	public void fly() {
		System.out.println("I can't fly I am a not flying bird! I am a "
				+ this.getClass().getSimpleName());

	}

}
