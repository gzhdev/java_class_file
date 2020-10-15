package classLearning;
import java.util.Scanner;

public class Operator {
    Student[] students=new Student[100];
    private int index;
    public void add(){
        Scanner sc=new Scanner(System.in);
        if (index<100){
            String no=sc.next();
            String name=sc.next();
            students[index]=new Student();
            index+=1;
        }
    }
    public void update(){

    }
    public void delect(){

    }
    public void search(){

    }

}
