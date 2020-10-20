package Text4;

public class TestPerson {
    public static void main(String[] args) {
        Employee ne=new Employee("张三","221B","01",2500,5);
        Manager nm=new Manager("李四","221B","00",3000,15,"manager");
        double newEmployeeWage,newManagerWage;
        ne.setWage(ne.getWage()*(1+0.1));
        nm.setWage(nm.getWage()*(1+0.2));
        System.out.println(ne);
        System.out.println(nm);
    }
}
