package InventorySystem;

public abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void display();
    public String getName() { return name; }
    public void setPrice (double price) { this.price = price; }
 }
