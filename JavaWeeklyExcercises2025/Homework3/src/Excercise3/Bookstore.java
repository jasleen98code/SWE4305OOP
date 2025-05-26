package Excercise3;

public class Bookstore {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new PrintedBook("9781472147103", "The Self-Taught Programmer", "Cory Althoff", 22.50, true, 368, "Liitle,Brown Book Group", 6);
        books[1] = new DigitalBook("978013781070", "Core Java", "Cay Horstmann", 59.61, 1024);
        books[2] = new Audiobook("97853452346879", "Ghost Stories", "Stefen Fry",45.90, 100, "Stefen Fry");
        books[3] = new PrintedBook("978098104030", "Python for Data Analysis", "Wes Mckinney", 43.99, false, 579, "O'Reilly Media", 5);
        books[4] = new DigitalBook("978907541455", "Machine Learning", "Herbert Jones", 17.80, 1390);

        System.out.println("Welcome to the Book store!\n");
        for (Book book : books) {
            book.display();
        }
    }
}
