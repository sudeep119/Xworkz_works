public class GlassesCase {
    private int range;
    private String intensity;
    private double size;

    public GlassesCase(int range, String intensity, double size) {
        this.range = range;
        this.intensity = intensity;
        this.size = size;
    }

    @Override
    public String toString() {
        return "GlassesCase [range=" + range + ", intensity=" + intensity + ", size=" + size + "]";
    }
}
