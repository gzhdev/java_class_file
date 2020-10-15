package bank;

public class BankAccount {
    private double balance; //成员：余额
    private double interest; //成员：利率
    //构造方法
    public BankAccount(){
        balance=0;
        interest=0;
    }
    public BankAccount(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    //成员方法

    public double getBalance() { //查询余额
        return balance;
    }
/*
    public void setBalance(double balance) { //
        this.balance = balance;
    }

 */
    public double getInterest() { //查询利率
        return interest;
    }

    public void setInterest(double interest) { //设置利率
        this.interest = interest;
    }

    public void deposit(double money){ //存款
        this.balance+=money;
    }
    public void withdraw(double money){ //取款
        this.balance-=money;
    }
}
