package fourth.exercise;

public class Main {

	public static void main(String[] args) {
		
		/* 1) Ñreate class Dog with fields name, breed, age. 
				a) Declare enum for field breed. 
				b) Create 3 instances of type Dog. 
				c) Check if there is no two dogs with the same name. 
				d) Display the name and the kind of the oldest dog. 
			2) Add Unit Tests to each task, publish code on GitHub
		*/

		Dog dog1 = new Dog("Elvis", Breed.Beagle, 5);
		Dog dog2 = new Dog("Elvis", Breed.Collie, 3);
		Dog dog3 = new Dog("Jackson", Breed.Dalmatian, 7);
		
		CheckDog check = new CheckDog(dog1, dog2, dog3);
		Dog oldestDog = check.oldestDog();
		
		System.out.println("We " + (check.checkName()?" have":" don't have") + " dogs with the same names ");
		System.out.println("The oldest dog \nName: " + oldestDog.getName() + "\nBreed: " + oldestDog.getBreed().getDescription());
		
	}

}
