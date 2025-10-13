public class MinMaxAccount extends BankingAccount {
    private int min;
    private int max;

    public MinMaxAccount(ua.opnu.java.inheritance.account.Startup s) {
        super(s);
        this.min = balance;
        this.max = balance;
    }

    private void updateMinMax() {
        if (balance < min) min = balance;
        if (balance > max) max = balance;
    }

    @Override
    public void credit(ua.opnu.java.inheritance.account.Credit c) {
        super.credit(c);
        updateMinMax();
    }

    @Override
    public void debit(ua.opnu.java.inheritance.account.Debit d) {
        super.debit(d);
        updateMinMax();
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}