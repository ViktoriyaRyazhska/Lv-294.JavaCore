package homework1;

public abstract class FlyingBird extends Bird{
	
	public FlyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly!");
	}

}
