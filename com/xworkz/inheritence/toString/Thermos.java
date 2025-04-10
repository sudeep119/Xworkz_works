public class Thermos {
    private int speed;
    private String volume;
    private double shape;

    public Thermos(int speed, String volume, double shape) {
        this.speed = speed;
        this.volume = volume;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Thermos [speed=" + speed + ", volume=" + volume + ", shape=" + shape + "]";
    }
}
