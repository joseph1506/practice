package practice.Threading;

public class Account {
    private int balance=50;

    public int getBalance(){
        return this.balance;
    }

    public void withDraw(int amount){
        balance=balance-amount;
    }
}
