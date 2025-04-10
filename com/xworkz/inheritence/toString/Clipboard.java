public class Clipboard {
    private int density;
    private String shape;
    private double range;

    public Clipboard(int density, String shape, double range) {
        this.density = density;
        this.shape = shape;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Clipboard [density=" + density + ", shape=" + shape + ", range=" + range + "]";
    }
}
