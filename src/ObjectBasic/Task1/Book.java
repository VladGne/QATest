package ObjectBasic.Task1;

public class Book {
    private String title;
    private Author author;
    private double price;

    public Book(String title, Author author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void printDetails(Book book){
        String authorFullName = String.format("%s %s", book.author.getFistName(), book.author.getLastName());
        System.out.println(String.format("Book details:\n %s\n %s\n %.2f.", book.title, authorFullName, book.price));
    }
}
