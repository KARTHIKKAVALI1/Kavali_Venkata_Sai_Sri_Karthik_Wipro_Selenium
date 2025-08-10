package day4;

// Q) Design an interface Bank with methods deposit(), withdraw(), and getBalance().
//Implement this in SavingsAccount and CurrentAccount classes.
//•	Use inheritance to create a base Account class.
//•	Demonstrate method overriding with customized logic for withdrawal (e.g., minimum balance in SavingsAccount).

interface BankInterface {
    void deposit(double amt);
    void withdraw(double amt);
    double getBalance();
}

class Account {
    protected double balance;
    public Account(double initialBalance) {
    	this.balance = initialBalance;
    	}
}

class SavingsAccount extends Account implements BankInterface {
    final double MIN_BALANCE = 500.0;
    public SavingsAccount(double balance) {
    	super(balance);
    	}
    public void deposit(double amt) { 
    	balance += amt;
    	}
    public void withdraw(double amt) {
        if (balance - amt >= MIN_BALANCE) balance -= amt;
        else System.out.println("Insufficient balance: minimum balance required.");
    }
    public double getBalance() { 
    	return balance; 
    	}
}

class CurrentAccount extends Account implements BankInterface {
    public CurrentAccount(double balance) { 
    	super(balance);
    	}
    public void deposit(double amt) { 
    	balance += amt;
    	}
    public void withdraw(double amt) { 
    	balance -= amt; 
    	}
    public double getBalance() { 
    	return balance; 
    	}
}

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(2000);
        sa.deposit(1000);
        sa.withdraw(1200);
        System.out.println("Savings Account Balance: " + sa.getBalance());

        CurrentAccount ca = new CurrentAccount(5000);
        ca.deposit(2000);
        ca.withdraw(3000);
        System.out.println("Current Account Balance: " + ca.getBalance());
    }
}
