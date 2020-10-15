package learning.java;
import java.util.Scanner;

public class string_option {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str1= sc.next();
        StringBuffer strB1=new StringBuffer(str1);
        System.out.println("请输入一串包含在上一段字符串中的字符");
        String str2= sc.next();
        int starNum=strB1.indexOf(str2);
        System.out.println(strB1.delete(starNum,starNum+str2.length()));
    }
}
