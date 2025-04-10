public class Broom {
    private int color;
    private String density;
    private double shape;

    public Broom(int color, String density, double shape) {
        this.color = color;
        this.density = density;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Broom [color=" + color + ", density=" + density + ", shape=" + shape + "]";
    }
}
