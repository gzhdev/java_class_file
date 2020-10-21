package Text4;

public class Undergraduate extends Student {
    private boolean pass;
    public Undergraduate(){}
    public Undergraduate(String name,String id,double sub0,double sub1,double sub2){
        super(name,id,sub0,sub1,sub2);
        if((sub0+sub1+sub2)/3 > 60){
            this.pass = true;
        }
    }

    public boolean isPass() {
        return pass;
    }
    public String toString() {
        return super.toString() + "\n是否合格：" + isPass();
    }
}
