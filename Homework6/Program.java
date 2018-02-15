
public class Program {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        
        birds[0] = new Kiwi();
        birds[1] = new Penguin();
        birds[2] = new Swallow();
        birds[3] = new Eagle();
        
        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();
            System.out.println("-------------------------------------------------");
        }
    }
}
