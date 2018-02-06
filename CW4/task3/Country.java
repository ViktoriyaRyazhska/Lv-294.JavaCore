package cw04.task3;

public class Country {
	private String name;
	private Continents continent;

	public Country(String name, Continents continent) {
		this.name = name;
		this.continent = continent;
	}

	public Country() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Continents getContinent() {
		return continent;
	}

	public void setContinent(Continents continent) {
		this.continent = continent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Country other = (Country) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", continent=" + continent + "]";
	}
}
