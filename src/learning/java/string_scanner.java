package learning.java;
import java.util.Scanner;

public class string_scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一串字符：");
        String str1=sc.nextLine();
        int charCount,numCount,otherCount;
        charCount=0;
        numCount=0;
        otherCount=0;
        char ec;
        for (int i=0;i<str1.length();i++){
            ec=str1.charAt(i);
            if (Character.isLetter(ec)==true){
                charCount++;
            }
            else if (Character.isDigit(ec)==true){
                numCount++;
            }
            else{
                otherCount++;
            }
        }
        System.out.println("字母个数为"+charCount+"个，数字个数为"+numCount+"个，其他字符个数为"+otherCount+"个。");
    }
}
