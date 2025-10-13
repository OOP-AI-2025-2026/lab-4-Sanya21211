public class GroceryBill {
    private final ua.opnu.java.inheritance.bill.Employee clerk;
    protected final java.util.List<ua.opnu.java.inheritance.bill.Item> items = new java.util.ArrayList<>();

    public GroceryBill(ua.opnu.java.inheritance.bill.Employee clerk) {
        this.clerk = clerk;
    }

    public ua.opnu.java.inheritance.bill.Employee getClerk() {
        return clerk;
    }

    public void add(ua.opnu.java.inheritance.bill.Item i) {
        items.add(i);
    }

    public double getTotal() {
        double sum = 0.0;
        for (ua.opnu.java.inheritance.bill.Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }
}