package Text5.ques3;

public class MyCircle implements Area {
    private  double radius;
    public MyCircle() {}
    public MyCircle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calsulateArea() {
        return 3.14 * Math.pow(getRadius(),2);
    }
}
