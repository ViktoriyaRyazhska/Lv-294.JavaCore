package birds;

public class Chicken extends NonFlyingBird {
	@Override
	public void fly () {
		this.feathers =" various ";
		this.layEggs = " up to 5, middle size ";
		System.out.println(Chicken.class.getSimpleName() + " This bird flying very badly!"
	+ this.toString());
	}
}
