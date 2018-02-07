package third.exercise;

public enum Continents {
	
	Asia("Asia"), Africa("Africa"), NorthAmerica("North America"), SouthAmerica("South America"), 
	Antarctica("Antarctica"), Europe("Europe"), Australia("Australia");
	
	private String nameOfContinent;
	
	private Continents(String continent) {
		nameOfContinent = continent;
	}

	public String getNameOfContinent() {
		return nameOfContinent;
	}
	
	
	
}
