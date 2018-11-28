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

    public String getTitle() {
        return title;
    }

    public String getAuthorFulName(){
        return author.getFistName() + " " + author.getLastName();
    }
    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void printDetails(){
        String authorFullName = String.format("%s %s", this.author.getFistName(), this.author.getLastName());
        System.out.println(String.format("Book details:\n %s\n %s\n %.2f.", this.title, authorFullName, this.price));
    }
}
