public class Account{
    private int accountNumber;
    private double balance;

    public Account(double initialBalance){
        balance = initialBalance;
        accountNumber = (int) (Math.random() * 9000000) + 1000000;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double inAmount){
         balance += inAmount;
    }

    public void withdraw(double amountOut){
        balance -= amountOut;
    }

    public String toString(){
        return "[" + accountNumber + "] - R" + getBalance();
    }
}