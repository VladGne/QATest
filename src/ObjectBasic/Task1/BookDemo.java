package ObjectBasic.Task1;

import java.util.Scanner;

public class BookDemo{

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        String fistName = "Russel";
        String lastName = "Winderand";

        System.out.println(String.format("Author name is: %s %s.", fistName, lastName));
        Author Winderand = new Author(fistName, lastName);

        String bookTitle = "Developing Java Software";
        double price = 79.75;

        System.out.println("Book name is: " + bookTitle);

        Book DevJavaSoft = new Book(bookTitle, Winderand, price);
        Book.printDetails(DevJavaSoft);

        try{
            System.out.println(String.format("Enter author fist name: "));
            fistName = scanner.nextLine();

            System.out.println(String.format("Enter author last name: "));
            lastName = scanner.nextLine();

            System.out.println(String.format("Enter book title: "));
            bookTitle = scanner.nextLine();

            System.out.println(String.format("Enter book price: "));
            price = scanner.nextDouble();

            Author newAuthor = new Author(fistName, lastName);
            Book newBook = new Book(bookTitle, newAuthor, price);
            Book.printDetails(newBook);
        }
        catch (Exception e){
            System.out.println("Incorrect input: " + e.toString());
        }


    }
}