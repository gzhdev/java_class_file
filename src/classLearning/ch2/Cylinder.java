package classLearning.ch2;

import java.util.Set;

public class Cylinder extends Circle {
    private double length;
    public Cylinder(){
        length = 1;
    }
    public Cylinder(double radius,double length){
        super(radius);
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double  findArea(){
        return super.findArea()*2 + 2*3.1415*getRadius()*length;
    }

    public double findVolume(){
        return super.findArea()*length;
    }

    public String toString(){
        return super.toString()+"圆柱的高为"+length;
    }
}
