package lesson6;

public class MainAnimal {

	public static void main(String[] args) {
		Animal [] an = new Animal [5];
		an[0]= new Cat();
		an[1]= new Dog();
		an[2]= new Cat();
		an[3]= new Dog();
		an[4]= new Cat();
		
		
		for(Animal a: an) {
			a.feed();
			a.voice();
		}
		

	}

}
