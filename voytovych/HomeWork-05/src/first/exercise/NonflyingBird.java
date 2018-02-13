package first.exercise;

public class NonflyingBird extends Bird {

	public NonflyingBird(String feathers, int layEggs) {
		super(feathers, layEggs);
	}
	
	@Override
	public void fly() {
		System.out.println("This bird can't fly.");
	}

}
