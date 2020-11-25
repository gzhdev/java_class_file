package F.I.N.A.L.usb;

public class PerDevice {  // 对修改关闭的外设类
    USB inter;
    public void useUSB(USB inter) {
        this.inter = inter;
    }
    public String toString() {
        return "Use USB" + inter.getStandardNo() + inter.giveDevName();
    }
}
