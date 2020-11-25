package F.I.N.A.L.usb;

public class ScannnerInter extends USB {

    public ScannnerInter(double standardNo) {
        super(standardNo);
    }
    public String giveDevName() {
        return super.giveDevName() + "EPSON scanner.";
    }
}
