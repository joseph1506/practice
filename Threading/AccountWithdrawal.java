package practice.Threading;

public class AccountWithdrawal implements Runnable{
    private Account account= new Account();

    public static void main(String args[]){
        AccountWithdrawal accountWithdrawal= new AccountWithdrawal();

        Thread one= new Thread(accountWithdrawal,"Jeane");
        Thread two= new Thread(accountWithdrawal,"John");
        one.start();
        two.start();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            makeWithDrawal(10);
            if(account.getBalance()<0){
                System.out.println("Account is overdrawn!!!!!");
            }
        }
    }

    private synchronized void makeWithDrawal(int amount) {
    /*private void makeWithDrawal(int amount) {*/
        if(account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is going to withdraw");
            try{
                Thread.sleep(500);
            }catch (InterruptedException ie){

            }
            account.withDraw(amount);
            System.out.println(Thread.currentThread().getName()+" has withdrawn the amount");
        }else {
            System.out.println(Thread.currentThread().getName()+" cant withdraw. No sufficient balance");
        }
    }
}
