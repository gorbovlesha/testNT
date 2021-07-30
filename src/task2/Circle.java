package task2;

public class Circle {
    private float xc;
    private float yc;
    private float r;

    public Circle(float xc, float yc, float r) {
        this.xc = xc;
        this.yc = yc;
        this.r = r;
    }

    public Circle() {
    }

    public float getXc() {
        return xc;
    }

    public void setXc(float xc) {
        this.xc = xc;
    }

    public float getYc() {
        return yc;
    }

    public void setYc(float yc) {
        this.yc = yc;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
