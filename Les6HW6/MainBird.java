package Les6HW6;

public class MainBird {

	public static void main(String[] args) {
		Bird[] birds = new Bird[8];
		birds[0] = new Eagle("red", 10);
		birds[1] = new Swallow("black", 2);
		birds[2] = new Eagle("black", 7);
		birds[3] = new Chiken("yellow", 15);
		birds[4] = new Penguin("black with white", 1);
		birds[5] = new Chiken("orang", 8);
		birds[6] = new Swallow("grey", 3);
		birds[7] = new Eagle("brown", 5);

		printBird(birds);

	}

	public static void printBird(Bird[] birds) {
		
		for (Bird i : birds) {
			i.fly();			
			System.out.print("I am a " + i.getClass().getSimpleName() + " "+ i.toString());
			System.out.println();

		}

	}

}
