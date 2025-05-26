package InventorySystem;

public class Electronics extends Product{
    private String brandName;
    private int warrantyPeriod;

    public Electronics(String name, double price, String brandname, int warrantyPeriod) {
        super(name, price);
        this.brandName = brandName;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void display() {
        System.out.println("Electronics: " + name + ", $" + price +
                ", Brand: " + brandName + ", Warranty: " + warrantyPeriod + " months");

    }
}
