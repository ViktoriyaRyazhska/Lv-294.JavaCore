package first.exercise;

public class Manin {

	public static void main(String[] args) {

		/*
		 1) Develop abstract class Bird with attributes feathers and layEggs and an
		 abstarct method fly().  Develop classes FlyingBird and NonFlyingBird. Create
		 class Eagle, Swallow, Penguin and Chicken. Create array Bird and add
		 different birds to it. Call fly() method for all of it. Output the
		 information about each type of created bird.
		 */

		Bird [] br = new Bird [4];
		
		br[0] = new Eagle("Has white and black feathers", 4);
		br[1] = new Swallow("Has white and black feathers", 3);
		br[2] = new Penguin("Has white, yellow and black feathers", 2);
		br[3] = new Chicken("Has multicolored feathers", 10);
		
		for (Bird bird : br) {
			if (bird instanceof Eagle) {
				System.out.println("Eagle: \n" + bird.getFeathers() + "\nCan lay " + bird.getLayEggs() + " eggs.");
				bird.fly();
			}else if(bird instanceof Swallow) {
				System.out.println("\nSwallow: \n" + bird.getFeathers() + "\nCan lay " + bird.getLayEggs() + " eggs.");
				bird.fly();
			}else if(bird instanceof Penguin) {
				System.out.println("\nPenguin: \n" + bird.getFeathers() + "\nCan lay " + bird.getLayEggs() + " eggs.");
				bird.fly();
			}else if(bird instanceof Chicken) {
				System.out.println("\nChicken: \n" + bird.getFeathers() + "\nCan lay " + bird.getLayEggs() + " eggs.");
				bird.fly();
			}
		}
	}

}
