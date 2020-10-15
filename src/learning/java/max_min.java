package learning.java;
import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] num=new int[10];
        System.out.println("请输入10个数：");
        for (int i=0;i< num.length;i++){
            num[i]=sc.nextInt();
        }
        int max,min;
        max=num[0];
        min=num[0];
        for (int j=0;j<num.length;j+=2){
            int bw_max=num[j]>=num[j+1]?num[j]:num[j+1] ;
            int bw_min=num[j]<=num[j+1]?num[j]:num[j+1] ;
            if (bw_max>max){
                max=bw_max;
            }
            if (bw_min<min){
                min=bw_min;
            }
        }
        System.out.println("最大数为"+max+"最小数为"+min);
    }
}
