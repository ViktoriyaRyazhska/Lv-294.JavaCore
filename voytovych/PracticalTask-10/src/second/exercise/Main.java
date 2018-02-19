package second.exercise;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a class Plants, which includes fields int size, Color color and Type
		 * type, and constructor where these fields are initialized. Color and type are
		 * Enum. Override the method toString( ). Create classes ColorException and
		 * TypeException and describe there all possible colors and types of plants. In
		 * the method main create an array of five plants. Check to work your
		 * exceptions.
		 */

		try {
			Plant[] pl = new Plant[5];
			pl[0] = new Plant("iris", "blue", 5);
			pl[1] = new Plant("anemone", "red", 6);
			pl[2] = new Plant("aster", "blue", 8);
			pl[3] = new Plant("anemone", "white", 4);
			pl[4] = new Plant("aster", "green", 2);
			
			for (Plant plant : pl) {
				System.out.println(plant);
			}
			
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}

}
