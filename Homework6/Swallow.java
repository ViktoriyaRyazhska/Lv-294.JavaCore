
public class Swallow extends FlyingBird {
    
    public Swallow() {
        layEggs = false;
    }
    
    @Override
    public void fly() {
        System.out.println("I'm Swallow");
        super.fly();
    }
}
