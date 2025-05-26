package Excercise4;

public class CoffeeShopApp {
    public static void main(String[] args) {
        OrderRepository repo = new CSVOrderRepository();
        OrderManger manger = new OrderManger(repo);
        manger.displayMenu();
    }
}
