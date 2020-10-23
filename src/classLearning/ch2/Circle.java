package classLearning.ch2;

public class Circle {
    private double radius;
    public Circle(){
        radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double findArea(){
        return 3.1415*Math.pow(radius,2);
    }
    public String toString(){
        return "圆的面积是："+findArea()+"半径为："+radius;
    }
}
