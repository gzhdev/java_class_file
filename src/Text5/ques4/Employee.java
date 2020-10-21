package Text5.ques4;

public abstract class Employee {
    private double fixedWage;
    private double saleVolume;
    private double production;
    private double workTime;

    public Employee() {}

    public Employee(double fixedWage, double saleVolume, double production, double workTime) {
        this.fixedWage = fixedWage;
        this.saleVolume = saleVolume;
        this.production = production;
        this.workTime = workTime;
    }

    public double getFixedWage() {
        return fixedWage;
    }

    public void setFixedWage(double fixedWage) {
        this.fixedWage = fixedWage;
    }

    public double getSaleVolume() {
        return saleVolume;
    }

    public void setSaleVolume(double saleVolume) {
        this.saleVolume = saleVolume;
    }

    public double getProduction() {
        return production;
    }

    public void setProduction(double production) {
        this.production = production;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public abstract void pay();
}
