package hw06.task1.abstracts;

public abstract class Bird {

	public String feathers;
	public int layEggs;

	public Bird() {
	}

	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	public String getFeathers() {
		return feathers;

	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	public abstract void fly();
}
