public class Wrench {
    private int intensity;
    private String intensity;
    private double duration;

    public Wrench(int intensity, String intensity, double duration) {
        this.intensity = intensity;
        this.intensity = intensity;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Wrench [intensity=" + intensity + ", intensity=" + intensity + ", duration=" + duration + "]";
    }
}
