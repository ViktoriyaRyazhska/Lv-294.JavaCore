package HW5;

public class MainBird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bird[] birds = new Bird[4];
birds[0]= new Eagle("Eagle","meat");
birds[1]= new Swallow("Swallow", "fish ");
birds[2]= new Penguin("Penguin", "fish ");
birds[3]= new Kiwi("Kiwi", "insects, mollusks and earthworms ");


birds[0].setFeather("feather");birds[0].setLayEgs("layEgs");((FlyingBird) birds[0]).setAreaOfLiving("Filds, Mounting ");
birds[1].setFeather("feather");birds[1].setLayEgs("layEgs");((FlyingBird) birds[1]).setAreaOfLiving("Reservoirs and marshes ");
birds[2].setFeather("feather");birds[2].setLayEgs("layEgs");((NonflyingBird) birds[2]).setAreaOfLiving("Àntarctica ");
birds[3].setFeather("feather");birds[3].setLayEgs("layEgs");((NonflyingBird) birds[3]).setAreaOfLiving("New Zealand");


for (int i = 0; i < birds.length; i++) {
	
	birds[i].fly();
	
	birds[i].show();
}





	}

	private static void getName() {
		// TODO Auto-generated method stub
		
	}

	

	
		
	}


