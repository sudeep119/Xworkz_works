public class Drill {
    private int material;
    private String intensity;
    private double brightness;

    public Drill(int material, String intensity, double brightness) {
        this.material = material;
        this.intensity = intensity;
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Drill [material=" + material + ", intensity=" + intensity + ", brightness=" + brightness + "]";
    }
}
