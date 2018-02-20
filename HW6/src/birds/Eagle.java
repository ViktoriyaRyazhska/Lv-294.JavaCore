package birds;

public class Eagle extends FlyingBird {
	
	@Override
	public void fly () {
		this.feathers =" dark gray ";
		this.layEggs = " up to 3, middle size ";
		System.out.println(Eagle.class.getSimpleName() + " This bird can fly!" + super.toString());
	}
	
}
