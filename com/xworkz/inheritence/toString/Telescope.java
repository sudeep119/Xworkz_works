public class Telescope {
    private int width;
    private String material;
    private double intensity;

    public Telescope(int width, String material, double intensity) {
        this.width = width;
        this.material = material;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Telescope [width=" + width + ", material=" + material + ", intensity=" + intensity + "]";
    }
}
