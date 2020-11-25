package F.I.N.A.L.Thread;

public class ThreadDemo {
    public static void main(String[] args) {
        myThread mt1 = new myThread();
        myThread mt2 = new myThread();
        myThread mt3 = new myThread();
        myThread mt4 = new myThread();
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
