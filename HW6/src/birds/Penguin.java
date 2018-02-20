package birds;

public class Penguin extends NonFlyingBird {
	public void fly () {
		this.feathers =" black & white ";
		this.layEggs = " 2, large size ";
		System.out.println(Penguin.class.getSimpleName() + " This bird can't fly! "
	+ this.toString());
	}
}
