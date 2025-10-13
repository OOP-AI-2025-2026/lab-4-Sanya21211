package ua.opnu.java.inheritance.account;

public class Credit {
    private final int amount; // in cents

    public Credit(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}