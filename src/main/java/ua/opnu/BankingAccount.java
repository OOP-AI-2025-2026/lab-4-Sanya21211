public class BankingAccount {
    protected int balance;

    public BankingAccount(ua.opnu.java.inheritance.account.Startup s) {
        this.balance = s.getInitialBalance();
    }

    public int getBalance() {
        return balance;
    }

    public void credit(ua.opnu.java.inheritance.account.Credit c) {
        this.balance += c.getAmount();
    }

    public void debit(ua.opnu.java.inheritance.account.Debit d) {
        this.balance += d.getAmount();
    }
}