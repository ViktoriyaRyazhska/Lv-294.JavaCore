/**Develop abstract class Bird with attributes feathers 
 * and layEggs and an abstract method fly().  
 * Develop classes FlyingBird and NonFlyingBird. 
 * Create class Eagle, Swallow, Penguin and Chicken. 

Create array Bird and add different birds to it. 
Call fly() method for all
of it. Output the 
information about 
each type of 
created bird.
 */

package birds;

public abstract class Bird {
		
	public String feathers;
	public String layEggs;
	
	public abstract void fly ();
	
	@Override
	public String toString() {
		String output = "Feathers: " + this.feathers + " Eggs: " + this.layEggs;  	
		return output;
	};
	

	public static void main(String[] args) {
		
		Bird [] birds = new Bird[5];
		
		 birds[0] = new Penguin();
		 birds[1] = new Swallow();
		 birds[2] = new Chicken();
		 birds[3] = new Penguin();
		 birds[4] = new Eagle();
		
		for (int i=0;i==5;i++) {
		 birds[i].fly();
	}	
}
	
}

