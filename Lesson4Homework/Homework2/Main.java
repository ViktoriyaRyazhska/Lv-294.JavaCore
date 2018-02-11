package homework2;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog ("Rex", breed.GERMAN_SHEPHERD, 4);
		Dog dog2 = new Dog ("Leopold-Wilheim-Teodor-August von Ekkehardiner", breed.POODLE, 8);
		Dog dog3 = new Dog ("Kitty", breed.LABRADOR, 6);
		
		if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog2.getAge()) {
			System.out.println(dog1.getName() + " is " + dog1.getBreed());
		} if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
			System.out.println(dog2.getName() + " is " + dog2.getBreed());
		} else {
			System.out.println(dog3.getName() + " is " + dog3.getBreed());
		}
		
		
	}

}
