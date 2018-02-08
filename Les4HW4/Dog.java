package Les4HW4;

public class Dog {

	private String name;
	private Breed breed;
	private int age;

	public Dog() {

	}

	public Dog(String name, Breed breed, int age) {

		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void sameName(String name) {
		if (this.name.equals(name)) {
			System.out.println("This dogs have the same name " + name);
		} else {
			System.out.println("Dog "+ this.name+" and dog "+ name+ " have different names");
		}

	}

	public void findOldest(Dog d, Dog d1) {
		if (this.age > d.getAge() & (this.age) > d1.getAge()) {
			System.out.println("The oldest dog is " + this.name + " and his breed is " + this.breed);
		} else if (d.getAge() > this.age & d.getAge() > d1.getAge()) {
			System.out.println("The oldest dog is " + d.getName() + " and his breed is " + d.getBreed());
		} else
			System.out.println("The oldest dog is " + d1.getName() + " and his breed is " + d1.getBreed());

	}

}
