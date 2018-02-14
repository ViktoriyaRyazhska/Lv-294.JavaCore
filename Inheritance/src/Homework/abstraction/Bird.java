package Homework.abstraction;

public abstract class Bird {
	public String feathers;
	public int layEggs;
	
	
	public Bird(String feathers, int layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feathers == null) ? 0 : feathers.hashCode());
		result = prime * result + layEggs;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		if (feathers == null) {
			if (other.feathers != null)
				return false;
		} else if (!feathers.equals(other.feathers))
			return false;
		if (layEggs != other.layEggs)
			return false;
		return true;
	}


	public abstract void fly();
}
