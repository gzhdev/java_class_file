package F.I.N.A.L.Thread;

public class myThread extends Thread {
    private int ticket = 10;
    public void run() {
        for (int i=0;i<10;i++) {
            if(this.ticket>0) {
                System.out.println("卖票：ticker="+ticket--);
            }
        }
    }
}
