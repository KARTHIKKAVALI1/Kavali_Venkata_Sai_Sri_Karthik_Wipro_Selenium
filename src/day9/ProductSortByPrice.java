package day9;
import java.util.*;
//Q2. Create a Product class and sort products by price using Comparable.


public class ProductSortByPrice {
    static class Product implements Comparable<Product> {
        String name; double price;
        public Product(String name, double price) {
            this.name = name; this.price = price;
        }
        public int compareTo(Product p) {
            return Double.compare(this.price, p.price);
        }
        public String toString() { return name + " " + price; }
    }
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
            new Product("A", 10.5),
            new Product("B", 5.25),
            new Product("C", 12.0)
        );
        Collections.sort(list);
        for (Product p : list) System.out.println(p);
    }
}
