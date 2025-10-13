public class DiscountBill2 {
    private final GroceryBill bill;
    private final boolean regularCustomer;
    private int discountCount;
    private double discountAmount;

    public DiscountBill2(ua.opnu.java.inheritance.bill.Employee clerk, boolean regularCustomer) {
        this.bill = new GroceryBill(clerk);
        this.regularCustomer = regularCustomer;
        this.discountCount = 0;
        this.discountAmount = 0.0;
    }

    public ua.opnu.java.inheritance.bill.Employee getClerk() {
        return bill.getClerk();
    }

    public void add(ua.opnu.java.inheritance.bill.Item i) {
        bill.add(i);
        if (regularCustomer) {
            double d = i.getDiscount();
            if (d > 0.0) {
                discountCount++;
                discountAmount += d;
            }
        }
    }

    public double getTotal() {
        double full = bill.getTotal();
        double result = regularCustomer ? (full - discountAmount) : full;
        return Math.round(result * 100.0) / 100.0;
    }

    public int getDiscountCount() {
        return regularCustomer ? discountCount : 0;
    }

    public double getDiscountAmount() {
        return regularCustomer ? discountAmount : 0.0;
    }

    public double getDiscountPercent() {
        double full = bill.getTotal();
        if (full <= 0.0) return 0.0;
        double disc = regularCustomer ? discountAmount : 0.0;
        return (disc * 100.0) / full;
    }
}