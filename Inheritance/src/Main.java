
public class Main {

	public static void main(String[] args) {
		
		/*Animal[] animalMass = new Animal[10];
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
		 }*/
		
		Person[] people = new Person[10];
		people[0] = new Teacher("Oleg");
		people[1] = new Cleaner("Igor");
		people[2] = new Student("Olga");
		people[3] = new Teacher("Ira");
		people[4] = new Cleaner("Ivan");
		people[5] = new Student("Mariya");
		people[6] = new Teacher("Anna");
		people[7] = new Cleaner("Dmytro");
		people[8] = new Student("Marko");
		people[9] = new Teacher("Olena");
		for(Person p: people) {
			p.print();
			if(p instanceof Staff) {
				System.out.println(((Staff) p).salary());
			}
		}
	}

}
