public class Modem {
    private int power;
    private String size;
    private double width;

    public Modem(int power, String size, double width) {
        this.power = power;
        this.size = size;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Modem [power=" + power + ", size=" + size + ", width=" + width + "]";
    }
}
