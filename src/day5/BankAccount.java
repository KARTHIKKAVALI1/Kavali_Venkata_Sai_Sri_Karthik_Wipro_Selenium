package day5;

import java.util.ArrayList;
import java.util.List;

//Advanced: Bank Account with Deposit/Withdraw Logic
//Transaction validation and encapsulation protection.
//•	Create a BankAccount class with private accountNumber, accountHolder, balance.
//•	Provide:
//o	deposit(double amount) — ignores or rejects negative.
//o	withdraw(double amount) — prevents overdraft and returns a boolean success.
//o	Getter for balance but no setter.
//•	Optionally override toString() to display masked account number and details.
//•	Track transaction history internally using a private list (or inner class for transaction object).
//•	Expose a method getLastTransaction() but do not expose the full internal list.

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;
    private List<Transaction> transactionHistory;

    private class Transaction {
        private String type;
        private double amount;
        private double balanceAfter;
        private String timestamp;
        public Transaction(String type, double amount, double balanceAfter) {
            this.type = type;
            this.amount = amount;
            this.balanceAfter = balanceAfter;
            this.timestamp = java.time.LocalDateTime.now().toString();
        }
        @Override
        public String toString() {
            return String.format("%s: %.2f, Balance: %.2f at %s", type, amount, balanceAfter, timestamp);
        }
    }

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = Math.max(0, initialBalance);
        this.transactionHistory = new ArrayList<>();
        if (initialBalance > 0) {
            transactionHistory.add(new Transaction("INITIAL_DEPOSIT", initialBalance, balance));
        }
    }
    public boolean deposit(double amount) {
        if (amount <= 0) return false;
        balance += amount;
        transactionHistory.add(new Transaction("DEPOSIT", amount, balance));
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        transactionHistory.add(new Transaction("WITHDRAWAL", amount, balance));
        return true;
    }
    public double getBalance() { return balance; }
    public String getLastTransaction() {
        if (transactionHistory.isEmpty()) return "No transactions";
        return transactionHistory.get(transactionHistory.size() - 1).toString();
    }
    @Override
    public String toString() {
        String maskedAccount = accountNumber.substring(0, 2) + "****" + accountNumber.substring(accountNumber.length() - 2);
        return String.format("Account: %s, Holder: %s, Balance: %.2f", maskedAccount, accountHolder, balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", "John Doe", 1000.0);
        System.out.println(account);
        System.out.println("Last Transaction: " + account.getLastTransaction());
        account.deposit(500.0);
        System.out.println("After deposit: " + account);
        System.out.println("Last Transaction: " + account.getLastTransaction());
        boolean success = account.withdraw(200.0);
        System.out.println("Withdrawal success: " + success);
        System.out.println("After withdrawal: " + account);
        boolean overdraft = account.withdraw(2000.0);
        System.out.println("Overdraft attempt: " + overdraft);
    }
}
