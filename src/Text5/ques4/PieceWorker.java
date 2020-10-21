package Text5.ques4;

public final class PieceWorker extends Employee {
    public PieceWorker(double production) {
        setProduction(production);
    }

    public void pay() {
        System.out.println("应支付给PieceWorker " + (getProduction()*3) + "元工资。");
    }
}
