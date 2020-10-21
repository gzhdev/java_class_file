package Text5.ques4;

public class Test {
    public static void main(String[] args){
        Employee nb=new Boss(35000);
        Employee nc=new CommissionWorker(2000,30000);
        Employee np=new PieceWorker(3000);
        Employee nh=new HourlyWorker(240);
        nb.pay();
        nc.pay();
        np.pay();
        nh.pay();
    }
}
