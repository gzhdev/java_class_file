package learning.java;
import java.util.Scanner;

public class Narcissistic_Num {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数：");
        Scanner sc=new Scanner(System.in);
        int testNum,units,tens,hundreds;
        testNum= sc.nextInt();
        hundreds=testNum/100;
        tens=testNum/10%10;
        units=testNum%10;
        if (testNum==Math.pow(hundreds,3)+Math.pow(tens,3)+Math.pow(units,3)){
            System.out.println("该数为水仙花数。");
        }
        else{
            System.out.println("该数不是水仙花数。");
        }
    }
}
