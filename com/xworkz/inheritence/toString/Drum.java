public class Drum {
    private int weight;
    private String capacity;
    private double thickness;

    public Drum(int weight, String capacity, double thickness) {
        this.weight = weight;
        this.capacity = capacity;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Drum [weight=" + weight + ", capacity=" + capacity + ", thickness=" + thickness + "]";
    }
}
