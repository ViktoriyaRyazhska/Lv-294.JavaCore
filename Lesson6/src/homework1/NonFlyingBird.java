package homework1;

public abstract class NonFlyingBird extends Bird{
	
	public NonFlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
