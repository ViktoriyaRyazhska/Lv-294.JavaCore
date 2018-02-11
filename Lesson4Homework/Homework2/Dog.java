package homework2;


public class Dog {
	private String name;
	private breed breed;
	private int age;
	
	public Dog() {
		
	}
	
	public Dog (String name, breed breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public breed getBreed () {
		return this.breed;
	}
	public void setBreed (breed breed) {
		this.breed = breed;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
}