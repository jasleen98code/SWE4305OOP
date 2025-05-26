package InventorySystem;

import java.time.LocalDate;

public class Grocery extends  Product {
    private double weight;
    private LocalDate expirationDate;

    public  Grocery(String name, double price, double weight, LocalDate expirationDate) {
        super(name, price);
        this.weight = weight;
        this.expirationDate = expirationDate;
    }

    @Override
    public void display() {
        System.out.println("Grocery: " + name +", $" + price +
                ", weight: " + weight + "kg, Expires: " + expirationDate);
    }
}
