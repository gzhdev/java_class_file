package Text6;
import java.util.Scanner;

public class triangle {
    static void sanjiao(int a,int b,int c) throws IllegalArgumentException{
        if (a+b<=c || a+c<=b || c+b<=a){
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入三角形的三遍长：");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sanjiao(a,b,c);
            System.out.println("可以构成三角形的三边长为"+a+"，"+b+"，"+c);
        }
        catch (IllegalArgumentException e){
            System.out.println("不能构成三角形！");
        }
    }
}
