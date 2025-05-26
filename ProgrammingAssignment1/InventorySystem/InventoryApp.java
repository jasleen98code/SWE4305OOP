package InventorySystem;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Menu:\n1. Add\n2. Search\n3. Modify Price\n4. Display All\n5. Exit");
            System.out.println("Select: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Category: 1.Electronics, 2.Clothing, 3.Grocery");
                    int cat = sc.nextInt(); sc.nextLine();
                    System.out.print("Name; ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    switch (cat) {
                        case 1: {
                            System.out.print("Brand: ");
                            String brand = sc.nextLine();
                            System.out.print("Warranty (months): ");
                            int warranty = sc.nextInt();
                            sc.nextLine();
                            manager.addProduct(new Electronics(name, price, brand, warranty));

                        }
                        case 2: {
                            System.out.print("Sizes (comma): ");
                            List<String> sizes = Arrays.asList(sc.nextLine().split(", "));
                            System.out.print("Material: ");
                            String mat = sc.nextLine();
                            System.out.print("Colors ( comma): ");
                            List<String> colors = Arrays.asList(sc.nextLine().split(", "));
                            manager.addProduct((new Clothing(name, price, sizes, mat, colors);

                        }
                        case 3: {
                            System.out.print("Weight (kg): ");
                            double wt = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Expiration Date (YY-MM-DD): ");
                            LocalDate date = LocalDate.parse(sc.nextLine());
                            manager.addProduct(new Grocery(name, price, wt, date));
                       }
                        default:
                            System.out.println("Invaild cateogry.");
                    }
                }
                       case 2: {
                           System.out.println("Search product name: ");
                           manager.searchProduct((sc.nextLine()));
                       }

                    case 3: {
                        System.out.println("Product name: ");
                        String pname = sc.nextLine();
                        System.out.println("New price: ");
                        double newPrice = sc.nextDouble();
                        sc.nextLine();
                        manager.modifyPrice((pname, newPrice)),
                    }
                    case 4: manager.displayAll();
                    case 5: {
                        System.out.println("Exiting...");
                        return;
                    }
                    default:
                        System.out.println("Invalid option.");
            }
        }
    }
}