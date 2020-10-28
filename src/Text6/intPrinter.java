package Text6;
import java.util.Scanner;

public class intPrinter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入5个数：");
            String[] str = sc.nextLine().split(" ");
            int[] a = new int[5];
            for (int i=0;i<str.length;i++){
                a[i] = Integer.parseInt(str[i]);
            }
            if (str.length < 5){
                throw new ArrayIndexOutOfBoundsException();
            }
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }

        }
        catch(NumberFormatException e){
            System.out.println("请输入整数！");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("请输入至少5个整数");

        }
    }
}
