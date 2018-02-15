
public class Eagle extends FlyingBird {
    
    public Eagle() {
        layEggs = true;
    }
    
    @Override
    public void fly() {
        System.out.println("I'm Freedom, brings you democracy!");
        super.fly();
    }
}
