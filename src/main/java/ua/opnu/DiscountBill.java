public class DiscountBill extends GroceryBill {
    private final boolean regularCustomer;
    private int discountCount;
    private double discountAmount;

    public DiscountBill(ua.opnu.java.inheritance.bill.Employee clerk, boolean regularCustomer) {
        super(clerk);
        this.regularCustomer = regularCustomer;
        this.discountCount = 0;
        this.discountAmount = 0.0;
    }

    @Override
    public void add(ua.opnu.java.inheritance.bill.Item i) {
        super.add(i);
        if (regularCustomer) {
            double d = i.getDiscount();
            if (d > 0.0) {
                discountCount++;
                discountAmount += d;
            }
        }
    }

    @Override
    public double getTotal() {
        double base = super.getTotal();
        double result = regularCustomer ? (base - discountAmount) : base;
        return Math.round(result * 100.0) / 100.0;
    }

    public int getDiscountCount() {
        return regularCustomer ? discountCount : 0;
    }

    public double getDiscountAmount() {
        return regularCustomer ? discountAmount : 0.0;
    }

    public double getDiscountPercent() {
        double full = super.getTotal();
        if (full <= 0.0) return 0.0;
        double disc = regularCustomer ? discountAmount : 0.0;
        return (disc * 100.0) / full;
    }
}