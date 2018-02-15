
public class FlyingBird extends Bird {
    
    public FlyingBird() {
        feathers = true;
    }
    
    @Override
    public void fly() {
        System.out.println("Flying, flying bird, feathers " + feathers + ", lay eggs " + layEggs);
    }
}
