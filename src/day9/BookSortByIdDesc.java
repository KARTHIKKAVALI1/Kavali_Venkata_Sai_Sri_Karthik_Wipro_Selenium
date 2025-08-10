package day9;
import java.util.*;
//Q4. Sort a list of Book objects by bookId in descending order using Comparable.

public class BookSortByIdDesc {
    static class Book implements Comparable<Book> {
        int bookId; String title;
        public Book(int bookId, String title) {
            this.bookId = bookId; this.title = title;
        }
        public int compareTo(Book b) {
            return Integer.compare(b.bookId, this.bookId);
        }
        public String toString() { return bookId + " " + title; }
    }
    public static void main(String[] args) {
        List<Book> list = Arrays.asList(
            new Book(10, "B"),
            new Book(30, "C"),
            new Book(20, "A")
        );
        Collections.sort(list);
        for (Book b : list) System.out.println(b);
    }
}
