package F.I.N.A.L.usb;

public class USB {  // 可对外拓展的USB类
    private double standardNo;  // USB接口标准号
    public USB(double standardNo) {
        super();
        this.standardNo = standardNo;
    }

    public double getStandardNo() {
        return standardNo;
    }

    public void setStandardNo(double standardNo) {
        this.standardNo = standardNo;
    }

    public String giveDevName() {
        return " to connect computer peripherals";
    }
}
