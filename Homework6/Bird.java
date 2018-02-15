
public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;
    
    public boolean hasFeathers() {
        return feathers;
    }

    public boolean doesLayEggs() {
        return layEggs;
    }

    public abstract void fly();
}
