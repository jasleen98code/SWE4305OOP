package Excercise4;

import java.io.*;
import java.util.*;

public class CSVOrderRepository implements OrderRepository {
    private final String filepath = "orders.csv";

    @Override
    public void addOrder(Order order) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true))) {
            writer.write(order.toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Order> getOrdersByDate(String date) {
        List<Order> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[2].equals(date)) {
                    result.add(new Order(parts[0], Double.parseDouble(parts[1]), parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public double getTotalAmountByCustomer(String customerName) {
        double total = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase(customerName)) {
                    total += Double.parseDouble(parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return total;

}

}
