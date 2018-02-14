package homework1;

public abstract class Bird {
	private String feathers;
	private int layEggs;
	
	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	public abstract void fly();
	
	@Override
	public String toString() {
		return "I'm a " + getClass().getSimpleName() + ". My feathers are " + feathers + ". I laid " + layEggs + " eggs.";
	}

}
