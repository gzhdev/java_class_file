package Text4;

public class Manager extends Employee {
    private String level;
    public Manager() {}
    public Manager(String name, String address,String ID,double wage,int workAge,String level){
        super(name,address,ID,wage,workAge);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    public String toString() {
        return "姓名："+getName()+"\n地址："+getAddress()+"\nID："+getID()+"\n工资："+getWage()+"\n工龄："+getWorkAge()+"\n等级："+getLevel();
    }
}
