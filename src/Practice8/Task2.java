package Practice8;

import ObjectBasic.Task1.Author;
import ObjectBasic.Task1.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String args[]){

        List<Book> books = new ArrayList<>();
        Author winderand = new Author("Russel", "Winderand");
        Author king = new Author("Stephen", "King");

        books.add(new Book("Developing Java Software", winderand, 79.75));
        books.add(new Book("The dark tower: part 1 - shooter.", king, 60.25));
        books.add(new Book("The dark tower: part 2 - three doors.", king, 67.5));
        books.add(new Book("The stand.", king, 77.5));

        Book book = books.stream().max(Comparator.comparing(Book::getPrice)).get();
        System.out.println("Book with highest price:");
        book.printDetails();

        List<Book> sortedList = books.stream().sorted(Comparator.comparing(Book::getAuthorFulName)).collect(Collectors.toList());
        System.out.println("\nSorted book list:");
        sortedList.forEach(Book::printDetails);

        double totalPrice = books.stream().mapToDouble(Book::getPrice).sum();
        System.out.println("\nsum of all books prices in the list: " + totalPrice);

        System.out.println("\n"+king.getAuthorFulName() + "books:");
        String kingsBooks = books.stream().
                filter(book1 -> book1.getAuthorFulName().equals(king.getAuthorFulName()))
                .map(Book::getTitle).collect(Collectors.joining(" "));
        System.out.println(kingsBooks);
    }
}
