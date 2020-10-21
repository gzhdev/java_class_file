package Text5.ques3;

public class TestArea {
    public static void main(String[] args){
        MyCircle nc = new Circle(3);
        MyRectangle nr = new MyRectangle(2,3);
        System.out.println("圆的面积为：" + nc.calsulateArea());
        nc.setRadius(2);
        System.out.println("圆的面积为：" + nc.calsulateArea());
        System.out.println("矩形的面积为：" + nr.calsulateArea());
    }
}
