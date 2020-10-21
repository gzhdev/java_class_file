package Text5.ques4;

public final class CommissionWorker extends Employee{
    public CommissionWorker(double fixedWage,double saleVolume) {
        setFixedWage(fixedWage);
        setSaleVolume(saleVolume);
    }

    public void pay() {
        System.out.println("应支付给CommissionWorker " + (getFixedWage()+getSaleVolume()*0.1) + "元工资。");
    }
}
