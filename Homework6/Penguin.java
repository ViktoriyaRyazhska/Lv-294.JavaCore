
public class Penguin extends NonflyingBird {
    
    public Penguin() {
        layEggs = true;
    }
    
    @Override
    public void fly() {
        System.out.println("I'm Penguin");
        super.fly();
    }
}
