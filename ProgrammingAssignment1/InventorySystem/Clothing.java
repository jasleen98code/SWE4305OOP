package InventorySystem;

import java.util.List;

public class Clothing extends Product {
    private List<String> sizes;
    private String material;
    private List<String> colors;

    public Clothing(String name, double price, List<String> sizes, String material, List<String> colors) {
        super(name, price);
        this.sizes = sizes;
        this.material = material;
        this.colors = colors;
    }

    @Override
    public void dispaly() {
        System.out.println("Clothing: " + name + ", $" + price +
                ", Sizes: " + sizes + ", Material: " + material +", cplors: " + colors);
    }
}
