package day7;

//13  Implement a BankAccount class accessed by multiple threads to deposit and withdraw money. Use synchronization.
public class BankAccountDemo {
    static class BankAccount {
        private int balance;
        BankAccount(int balance) { this.balance = balance; }
        synchronized void deposit(int amt) { balance += amt; }
        synchronized void withdraw(int amt) { balance -= amt; }
        int getBalance() { return balance; }
    }

    static class DepositThread extends Thread {
        BankAccount acc;
        DepositThread(BankAccount a) { acc = a; }
        public void run() { for (int i=0;i<1000;i++) acc.deposit(1); }
    }
    static class WithdrawThread extends Thread {
        BankAccount acc;
        WithdrawThread(BankAccount a) { acc = a; }
        public void run() { for (int i=0;i<1000;i++) acc.withdraw(1); }
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount acc = new BankAccount(1000);
        DepositThread d = new DepositThread(acc);
        WithdrawThread w = new WithdrawThread(acc);
        d.start(); w.start();
        d.join(); w.join();
        System.out.println("Balance: " + acc.getBalance());
    }
}
