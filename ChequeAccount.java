class InvestmentAccount extends Account implements InterestBearing {
    private static final double MIN_OPEN_BALANCE = 500.0;

    public InvestmentAccount(String accNo, String branch, Customer cust, double initialDeposit) {
        super(accNo, branch, cust);
        if (initialDeposit >= MIN_OPEN_BALANCE) {
            deposit(initialDeposit);
        } else {
            System.out.println("Minimum BWP 500 required to open Investment Account.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void applyInterest() {
        double interest = balance * 0.05; // 5%
        balance += interest;
        System.out.println("Investment interest added: " + interest);
    }
}
