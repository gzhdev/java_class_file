package F.I.N.A.L.usb;

public class PrinterInter extends USB{  // 对USB类拓展的打印机接口类
    public PrinterInter(double standardNo) {
        super(standardNo);
    }
    public String giveDevName() {
        return super.giveDevName() + "HP Printer.";
    }
}
