package Excercise4;

public class Order {
    private String customerName;
    private double amount;
    private String date;

    public Order(String customerName, double amount, String date) {
        this.customerName = customerName;
        this.amount = amount;
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return customerName + "," + amount + "," + date;
    }
}
