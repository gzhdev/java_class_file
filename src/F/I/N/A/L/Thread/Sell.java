package F.I.N.A.L.Thread;

public class Sell implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        for (int i=0;i<100;i++) {
            if(this.ticket>0) {
                System.out.println("卖票：ticket="+ticket--);
            }
        }
    }
}
