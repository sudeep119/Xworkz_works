public class BrushPen {
    private int flexibility;
    private String height;
    private double speed;

    public BrushPen(int flexibility, String height, double speed) {
        this.flexibility = flexibility;
        this.height = height;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "BrushPen [flexibility=" + flexibility + ", height=" + height + ", speed=" + speed + "]";
    }
}
