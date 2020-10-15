package learning.java;
import java.util.Scanner;

public class Incoming {
    public static void main(String[] args) {
        boolean flag=true;
        double balance=10000;
        String details="收支\t账户金额\t收支金额\t说明\n";
        while (flag) {
            System.out.println("---------------家庭记账软件----------------");
            System.out.println("               1、收支明细                 ");
            System.out.println("               2、登记收入                 ");
            System.out.println("               3、登记支出                 ");
            System.out.println("               4、退出                    ");
            System.out.println("               请选择（1 - 4）             ");
            Scanner sc=new Scanner(System.in);
            int key=sc.nextInt();
            switch (key){
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    System.out.println("请输入收入金额：");
                    double saveBalance=sc.nextDouble();
                    balance=balance+saveBalance;
                    System.out.println("请输入收入说明：");
                    String saveNote=sc.next();
                    details=details+"收入\t"+balance+"\t"+saveBalance+"\t"+saveNote+"\n";
                    break;
                case 3:
                    System.out.println("请输入支出金额：");
                    double outBalance=sc.nextDouble();
                    if (outBalance>balance){
                        System.out.println("账户余额不足");
                        break;
                    }
                    balance-=outBalance;
                    System.out.println("请输入支出说明：");
                    String outNote=sc.next();
                    details=details+"支出\t"+balance+"\t"+outBalance+"\t"+outNote+"\n";
                    break;
                case 4:
                    System.out.println("确认是否退出（Y/N）？");
                    char choiceEnd=sc.next().charAt(0);
                    if (choiceEnd=='Y' || choiceEnd=='y'){
                        System.exit(0);
                    }
                    else{
                        break;
                    }
                    break;
                default:
                    System.out.println("输入的值不正确！请重新选择！");
                    break;
            }
        }
    }
}
