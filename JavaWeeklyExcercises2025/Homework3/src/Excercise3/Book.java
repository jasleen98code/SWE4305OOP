package Excercise3;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public abstract void display();
}

