package learning.java;
import java.util.Scanner;

public class Perfect_Num {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc=new Scanner(System.in);
        int testNum,sum;
        testNum=sc.nextInt();
        sum=0;
        for (int i=1;i<testNum;i++){
            if (testNum%i==0){
                sum+=i;
            }
        }
        if (sum==testNum){
            System.out.println("该数是完数。");
        }
        else {
            System.out.println("该数不是完数。");
        }
    }
}
