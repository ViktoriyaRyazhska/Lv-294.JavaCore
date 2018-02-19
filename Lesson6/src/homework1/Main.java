package homework1;

public class Main {

	public static void main(String[] args) {
		
		Bird[] b = new Bird[7];
		b[0] = new Eagle("black", 3);
		b[1] = new Eagle("brown", 1);
		b[2] = new Swallow("dark blue", 5);
		b[3] = new Swallow("blue", 4);
		b[4] = new Penguin("black", 2);
		b[5] = new Chicken("red", 8);
		b[6] = new Chicken("brown", 6);
		
		for(Bird i : b) {
			i.fly();
			System.out.println(i);
		}
	}
}
