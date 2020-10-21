package Text5.ques4;

public final class Boss extends Employee {
    public Boss(double fixedWage) {
        setFixedWage(fixedWage);
    }

    public void pay() {
        System.out.println("应支付给Boss " + getFixedWage() + "元工资。");
    }
}
