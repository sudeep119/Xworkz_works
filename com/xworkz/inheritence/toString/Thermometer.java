public class Thermometer {
    private int power;
    private String texture;
    private double height;

    public Thermometer(int power, String texture, double height) {
        this.power = power;
        this.texture = texture;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Thermometer [power=" + power + ", texture=" + texture + ", height=" + height + "]";
    }
}
