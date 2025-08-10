package day9;
import java.util.*;
//Q12. Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).

public class BookSortByIdAndTitleAuthor {
    static class Book implements Comparable<Book> {
        int id; String title, author;
        public Book(int id,String title,String author) {
            this.id=id;this.title=title;this.author=author;
        }
        public int compareTo(Book b) { return Integer.compare(this.id, b.id); }
        public String toString() { return id+" "+title+" "+author; }
    }
    public static void main(String[] args) {
        List<Book> list = Arrays.asList(
            new Book(3,"TitleB","AuthA"),
            new Book(1,"TitleA","AuthB"),
            new Book(2,"TitleA","AuthA")
        );
        Collections.sort(list);
        for (Book b : list) System.out.println(b);
        System.out.println("Sort by title then author:");
        list.sort(Comparator.comparing((Book b) -> b.title).thenComparing(b->b.author));
        for (Book b : list) System.out.println(b);
    }
}
