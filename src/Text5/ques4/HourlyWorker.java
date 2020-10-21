package Text5.ques4;

public final class HourlyWorker extends Employee {
    public HourlyWorker(double workTime) {
        setWorkTime(workTime);
    }

    public void pay() {
        System.out.println("应支付给HourlyWorker " + (getWorkTime()*60) + "元工资。");
    }
}
