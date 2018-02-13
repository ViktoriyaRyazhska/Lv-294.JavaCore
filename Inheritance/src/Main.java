
public class Main {

	public static void main(String[] args) {
		Animal[] animalMass = new Animal[10];
		 animalMass[0] = new Dog();
		 animalMass[1] = new Cat();
		 animalMass[2] = new Dog();
		 animalMass[3] = new Cat();
		 animalMass[4] = new Dog();
		 animalMass[5] = new Cat();
		 animalMass[6] = new Dog();
		 animalMass[7] = new Cat();
		 animalMass[8] = new Dog();
		 animalMass[9] = new Cat();
		 
		 for(Animal a: animalMass) {
			 a.voice();
			 a.feed();
		 }
	}

}
