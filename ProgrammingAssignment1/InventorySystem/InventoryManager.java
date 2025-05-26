package InventorySystem;

import java.util.*;

public class InventoryManager {
    private List<Product> inventory = new ArrayList<>();

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println("Product added.");
    }

    public void searchProduct(String name) {
        for (Product product : inventory) {
            product.display();
            return;

    }
        System.out.println("Product not found.");

}

public void modifyPrice(String name, double newPrice) {
    for (Product product : inventory){
    if (product.getName().equalsIgnoreCase(name)) {
            product.setPrice(newPrice);
            System.out.println("Price upload.");
        }
    }
    System.out.println("Product not found.");

    }

    public void displayAll() {
    for (Product product : inventory) {
        product.display();
    }
    }
}

