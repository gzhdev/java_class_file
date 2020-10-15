package classLearning;
import java.util.Scanner;

public class max_min_sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<=9;i++){
            System.out.println("请输入"+(i+1)+"次数据：");
            a[i] = sc.nextInt();
        }
        int max=a[0],min=a[0];
        for (int i=1;i<10;i++){
            if (a[i]>=max){
                max = a[i];
            }
            if (a[i]<=min){
                min=a[i];
            }
        }
        System.out.println("最大数为"+max+"最小数为"+min);
    }
}
