package Text5.ques3;

public class MyRectangle implements Area {
    private double x;
    private double y;
    public MyRectangle(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calsulateArea() {
        return getX() * getY();
    }
}
