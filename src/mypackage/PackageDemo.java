package mypackage;
import java.util.Scanner;

public class PackageDemo {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        while (true) {
            System.out.println("请选择计算模式：");
            System.out.println("[1] 加法");
            System.out.println("[2] 减法");
            System.out.println("[3] 乘法");
            System.out.println("[4] 除法");
            System.out.println("[5] 立方体体积");
            System.out.println("[0] 退出");
            Scanner sc=new Scanner(System.in);
            int key=sc.nextInt();
            switch (key){
                case 1:
                    cal.add();
                    break;
                case 2:
                    cal.less();
                    break;
                case 3:
                    cal.mutiply();
                    break;
                case 4:
                    cal.except();
                    break;
                case 5:
                    cal.cube_sum();
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }
}
