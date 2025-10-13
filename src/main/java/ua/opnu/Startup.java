package ua.opnu.java.inheritance.account;

public class Startup {
    private final int initialBalance; // in cents

    public Startup(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int getInitialBalance() {
        return initialBalance;
    }
}