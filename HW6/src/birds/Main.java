package birds;

public class Main {

public static void main(String[] args) {
		
		Bird [] birds = new Bird[5];
		
		 birds[0] = new Penguin();
		 birds[1] = new Swallow();
		 birds[2] = new Chicken();
		 birds[3] = new Penguin();
		 birds[4] = new Eagle();
		
		for (int i=0;i<5;i++) { //try
		 birds[i].fly();
		}
	}	

}
