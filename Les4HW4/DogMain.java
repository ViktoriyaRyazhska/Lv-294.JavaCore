package Les4HW4;

public class DogMain {

	public static void main(String[] args) {
		Dog d = new Dog("Ginger", Breed.BARBET, 7);
		Dog d1 = new Dog("Rem", Breed.AKITA, 4);
		Dog d2 = new Dog("Arkan", Breed.CHOWCHOW, 2);
		Dog d3 = new Dog("Ginger", Breed.YORKSHIRETERRIER, 1);
		d.sameName(d1.getName());
		d.sameName(d3.getName());
		d.findOldest(d2, d3);
	}
}
