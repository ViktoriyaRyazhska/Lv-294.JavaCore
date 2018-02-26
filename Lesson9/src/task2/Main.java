package task2;

public class Main {

	public static void main(String[] args) {
		
		try {
		Plant[] pl = new Plant[5];
		pl[0] = new Plant(2, "green", "cactus");
		pl[1] = new Plant(1, "red", "flycatcher");
		pl[2] = new Plant(3, "yellow", "daisy");
		pl[3] = new Plant(1, "white", "bluebottle");
		pl[4] = new Plant(2, "green", "bluebottle");
		for(int i = 0; i < pl.length; i++) {
			System.out.println(pl[i]);
		}
		} catch (ColorException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (TypeException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		} 
	}
}
