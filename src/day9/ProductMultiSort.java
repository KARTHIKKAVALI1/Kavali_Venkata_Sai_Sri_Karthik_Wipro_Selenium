package day9;
import java.util.*;
//Q7. Create multiple sorting strategies for a Product class.
//
//Implement comparators to sort by:
//
//Price ascending
//
//Price descending
//
//Name alphabetically
public class ProductMultiSort {
    static class Product {
        String name; double price;
        public Product(String name, double price) { this.name = name; this.price = price; }
        public String toString() { return name + " " + price; }
    }
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("X", 50),
            new Product("Y", 30),
            new Product("A", 40)
        );
        list.sort(Comparator.comparingDouble(p -> p.price));
        for (Product p : list) System.out.print(p + " ");
        System.out.println();
        list.sort((a, b) -> Double.compare(b.price, a.price));
        for (Product p : list) System.out.print(p + " ");
        System.out.println();
        list.sort(Comparator.comparing(p -> p.name));
        for (Product p : list) System.out.print(p + " ");
    }
}
