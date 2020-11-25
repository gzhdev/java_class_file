package F.I.N.A.L.usb;

public class TestUSB {
    public static void main(String[] args) {
        PerDevice pDev = new PerDevice();
        USB usb = new PrinterInter(1.1);
        pDev.useUSB(usb);
        System.out.println(pDev);
        usb = new ScannnerInter(2.0);
        pDev.useUSB(usb);
        System.out.println(pDev);
    }
}
