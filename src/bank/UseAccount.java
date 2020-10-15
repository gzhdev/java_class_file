package bank;

public class UseAccount {
    public static void main(String[] args) {
        BankAccount na=new BankAccount(1500,0.3);
        System.out.println("余额为"+na.getBalance());
        na.deposit(199);
        na.withdraw(500);
        System.out.println("余额为"+na.getBalance());
        System.out.println("利率为"+na.getInterest());
        na.setInterest(1.3);
        System.out.println("利率为"+na.getInterest());
    }
}
