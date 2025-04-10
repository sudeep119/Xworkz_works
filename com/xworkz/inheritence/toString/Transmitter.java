public class Transmitter {
    private int volume;
    private String texture;
    private double color;

    public Transmitter(int volume, String texture, double color) {
        this.volume = volume;
        this.texture = texture;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transmitter [volume=" + volume + ", texture=" + texture + ", color=" + color + "]";
    }
}
