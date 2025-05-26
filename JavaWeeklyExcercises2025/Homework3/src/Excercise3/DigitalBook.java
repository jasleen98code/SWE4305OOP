package Excercise3;

public class DigitalBook extends Book {
    private int sizeKB;

    public DigitalBook(String isbn, String title, String author, double price, int sizeKB) {
        super(isbn, title, author, price);
        this.sizeKB = sizeKB;
    }

    @Override
    public void display() {
        System.out.println("Digital Book: " + title);
        System.out.println("ISBN: " + isbn + ", Author: " + author +", Price: $" + price);
        System.out.println("File Size: " + sizeKB + " KB");
        System.out.println();
    }

}
