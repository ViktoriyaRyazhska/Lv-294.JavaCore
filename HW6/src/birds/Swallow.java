package birds;

public class Swallow extends FlyingBird {
		
	@Override
	public void fly () {
		this.feathers =" gray ";
		this.layEggs = " up to 4, small size ";
		System.out.println(Swallow.class.getSimpleName() + " This bird can fly! "
	+ this.toString());
	}
	
}
