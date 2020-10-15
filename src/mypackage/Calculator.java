package mypackage;
import java.util.Scanner;

public class Calculator { //计算器类
    public void add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入相加的两个值：");
        double var0=sc.nextInt();
        double var1=sc.nextInt();
        System.out.println("结果为："+(var0+var1));
    }
    public void less(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入相减的两个值：");
        double var0=sc.nextInt();
        double var1=sc.nextInt();
        System.out.println("结果为："+(var0-var1));
    }
    public void mutiply(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入相乘的两个值：");
        double var0=sc.nextInt();
        double var1=sc.nextInt();
        System.out.println("结果为："+(var0*var1));
    }
    public void except(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入相除的两个值：");
        double var0=sc.nextInt();
        double var1=sc.nextInt();
        System.out.println("结果为："+(var0/var1));
    }
    public void cube_sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入立方体的棱长：");
        double var0=sc.nextInt();
        System.out.println("结果为："+Math.pow(var0,3));
    }
}
