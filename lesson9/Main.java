package lesson9;

public class Main {

	public static void main(String[] args) {
		Plants[] p = new Plants[5];
		try {
			p[0] = new Plants(7, "orange", "rose");
			p[1] = new Plants(12, "white", "daisy");
			p[2] = new Plants(4, "rose", "lily");
			p[3] = new Plants(15, "whiolet", "viola");
			p[4] = new Plants(10, "rose2", "rose");

		} catch (ColorException e) {
			System.out.println("You write WRONG COLOR of plant");
		} catch (TypeException e) {
			System.out.println("You write WRONG TYPE of plant");
		} finally {
			print(p);
		}
	}

	public static void print(Plants[] p) {
		for (Plants plant : p) {
			if (plant != null){
			System.out.println("You have " + plant.getSize() + " " + plant.getColor() + " " + plant.getType() + "S");
		}}

	}
}