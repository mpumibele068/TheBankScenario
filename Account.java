abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer customer;

    public Account(String accountNumber, String branch, Customer customer) {
        this.accountNumber = accountNumber;
        this.branch = branch;
        this.customer = customer;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " New Balance: " + balance);
    }

    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account " + accountNumber + " Balance: " + balance;
    }
}
