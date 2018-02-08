package fourth.exercise;

public enum Breed {
	Beagle("Beagle"), Bolognese("Bolognese"), Bulldog("Bulldog"), Collie("Collie"), Dalmatian("Dalmatian"), Dachshund("Dachshund");
	
	private String description;

	private Breed(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
