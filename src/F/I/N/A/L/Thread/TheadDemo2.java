package F.I.N.A.L.Thread;

public class TheadDemo2 {
    public static void main(String[] args) {
        Thread mt1 = new Thread(new Sell(), "1");
        Thread mt2 = new Thread(new Sell(), "2");
        Thread mt3 = new Thread(new Sell(), "3");
        Thread mt4 = new Thread(new Sell(), "4");
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
