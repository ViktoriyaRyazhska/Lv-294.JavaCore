
public class Kiwi extends NonflyingBird {
    
    public Kiwi() {
        layEggs = true;
        feathers = true;
    }
    
    @Override
    public void fly() {
        System.out.println("I'm Batman");
        super.fly();
    }
}
