package lab6.ex10ComShop;

public class Monitor {
    private float diagonal;
    private String resolution;
    private int Hz;

    public Monitor(float diagonal, String resolution, int Hz) {
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.Hz = Hz;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public int getHz() {
        return Hz;
    }
}
