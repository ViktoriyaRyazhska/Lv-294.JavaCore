
public class NonflyingBird extends Bird {
    
    public NonflyingBird() {
        feathers = false;
    }
    
    @Override
    public void fly() {
        System.out.println("Cannot fly, nonflying bird, feathers " + feathers + ", lay eggs " + layEggs);
    }
}
