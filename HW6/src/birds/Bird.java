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
	

	

	
}

