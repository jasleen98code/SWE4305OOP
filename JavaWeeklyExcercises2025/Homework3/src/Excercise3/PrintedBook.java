package Excercise3;

public class PrintedBook extends Book {
    private boolean hardcover;
    private int pages;
    private String publisher;
    private int availableCopies;

    public PrintedBook(String isbn, String title, String author, double price,
                       boolean hardcover, int pages, String publisher, int availableCopies) {
        super(isbn, title, author, price);
        this.hardcover = hardcover;
        this.pages = pages;
        this.publisher = publisher;
        this.availableCopies = availableCopies;
    }

    @Override
    public void display() {
        System.out.println("Printed Book: " + title);
        System.out.println("ISBN: " + isbn + ", Author: " + author +", Price: $" + price);
        System.out.println("Type: " + (hardcover ? "Hardcover" : "Paperback") +
                ", Pages: " + pages + ", Publisher: " + publisher +
                ", Copies: " + availableCopies);
        System.out.println();

    }

}


