package Text4;

public class Student {
    private String name;
    private String id;
    private double sub0;
    private double sub1;
    private double sub2;
    public Student(){}
    public Student(String name,String id,double sub0,double sub1,double sub2){
        this.name = name;
        this.id = id;
        this.sub0 = sub0;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSub0() {
        return sub0;
    }

    public void setSub0(double sub0) {
        this.sub0 = sub0;
    }

    public double getSub1() {
        return sub1;
    }

    public void setSub1(double sub1) {
        this.sub1 = sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public void setSub2(double sub2) {
        this.sub2 = sub2;
    }

    public String toString(){
        return "姓名：" + getName()+"\n学号：" + getId()+"\n第一科成绩：" + getSub0()+"\n第二科成绩：" + getSub1()+"\n第三科成绩："
                + getSub2();
    }
}
