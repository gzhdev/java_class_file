package Text4;

public class Employee extends Person {
    private String ID;
    private double wage;
    private int workAge;
    public Employee(){}
    public Employee(String name, String address,String ID,double wage,int workAge){
        super(name,address);
        this.ID = ID;
        this.wage =wage;
        this.workAge = workAge;
    }

    public String getID() {
        return ID;
    }

    public double getWage() {
        return wage;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
    public String toString() {
        return "姓名："+getName()+"\n地址："+getAddress()+"\nID："+getID()+"\n工资："+getWage()+"\n工龄："+getWorkAge();
    }
}
