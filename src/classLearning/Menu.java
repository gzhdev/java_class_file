package classLearning;
import java.util.Scanner;

public class Menu {
    public Menu(){
        Scanner sc=new Scanner(System.in);
        int key;
        key = sc.nextInt();
        Operator opt=new Operator();
        while (true){
            System.out.println("===========学生管理系统===========");
            System.out.println("===========[1] 添加学生===========");
            System.out.println("===========[2] 修改学生===========");
            System.out.println("===========[3] 删除学生===========");
            System.out.println("===========[4] 查找学生===========");
            System.out.println("===========[0] 退出系统===========");

        switch (key){
            case 1:
                opt.add();
                break;
            case 2:
                opt.delect();
                break;
            case 3:
                opt.search();
                break;
            case 4:
                opt.update();
            case 0:
                System.exit(0);
        }
        }
    }
}
