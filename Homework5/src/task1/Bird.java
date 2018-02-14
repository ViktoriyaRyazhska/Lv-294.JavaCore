package task1;

public abstract class Bird {
    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public String feathers;
    public int layEggs;

    abstract boolean fly();
}
