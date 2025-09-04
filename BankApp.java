public class BankApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("Lesego", "Bele", "Gaborone");

        SavingsAccount sAcc = new SavingsAccount("S001", "Main Branch", c1);
        sAcc.deposit(1000);
        sAcc.applyInterest();

        InvestmentAccount iAcc = new InvestmentAccount("I001", "Main Branch", c1, 700);
        iAcc.applyInterest();
        iAcc.withdraw(200);

        ChequeAccount chAcc = new ChequeAccount("C001", "Main Branch", c1, "ABC Ltd", "Gaborone");
        chAcc.deposit(5000);
        chAcc.withdraw(1000);
    }
}
