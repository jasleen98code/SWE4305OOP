package Excercise4;

import java.util.List;
import java.util.Scanner;

public class OrderManger {
    private final OrderRepository repository;

    public OrderManger(OrderRepository repository) {
        this.repository = repository;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCoffee Shop Order System");
            System.out.println("1. Add New Order");
            System.out.println("2.View Orders For a Given Date");
            System.out.println("3. View Total Amount spent by a Customer");
            System.out.println("0. Exit");
            System.out.println("Enter Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter amount paid: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter date (yy//mm/dd): ");
                    String date = scanner.nextLine();
                    repository.addOrder(new Order(name, amount, date));
                    break;
                case 2:
                    System.out.println("Enter date (yy/mm/dd): ");
                    String d = scanner.nextLine();
                    List<Order> orders = repository.getOrdersByDate(d);
                    if (orders.isEmpty()) {
                        System.out.println("No orders found");
                    } else {
                        orders.forEach(order -> System.out.println(order.getCustomerName() + " paid $" + order.getAmount()));
                    }
                    break;

                case 3:
                    System.out.println("Enter customer name: ");
                    String customer = scanner.nextLine();
                    double total = repository.getTotalAmountByCustomer(customer);
                    System.out.println("Total amount by " + customer + ": $" + total);
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;
            }
        }while (choice != 0);

        scanner.close();
    }
}
