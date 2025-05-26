package Excercise3;

public class Audiobook extends Book {
    private int duration;
    private String narrator;

    public Audiobook(String isbn, String title, String author, double price, int duration, String narrator) {
        super(isbn, title, author, price);
        this.duration = duration;
        this.narrator = narrator;

    }

    @Override
    public void display() {
        System.out.println("Audiobook: " + title);
        System.out.println("ISBN; " + isbn + ", Author: " + author + ", price: $" + price);
        System.out.println("Duration: " + duration + " minutes, Narrator: " + narrator);
        System.out.println();

    }
}
