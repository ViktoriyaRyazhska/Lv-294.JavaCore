import java.awt.Color;

public class Cat implements Animal {
	
	Color color;
	int age;
	int name;
	
	public Cat(Color color, int age, int name) {
		this.color = color;
		this.age = age;
		this.name = name;
	}
	
	
	public Cat() {
	}


	public Color getColor() {
		return color;
	}



	public void setColor(Color color) {
		this.color = color;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getName() {
		return name;
	}



	public void setName(int name) {
		this.name = name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + name;
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
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name != other.name)
			return false;
		return true;
	}


	public void feed() {
		System.out.println("Cat is eating!");
	}
	
	
	public void voice() {
		System.out.println("Meow");
	}

}
