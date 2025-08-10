package day8;
import java.util.*;

//9. Store Custom Objects in LinkedList:
//
//Create a class Book with fields: id, title, and author.
//
//Create a LinkedList of Book objects.
//
//Add 3 books and display their details using a loop.

public class LinkedListBooks {
    public static void main(String[] args) {
        LinkedList<Book> books = new LinkedList<>();
        books.add(new Book(1,"Java","J1"));
        books.add(new Book(2,"DS","J2"));
        books.add(new Book(3,"Algo","J3"));
        for(Book b: books)
            System.out.println(b.id+" "+b.title+" "+b.author);
    }
}
