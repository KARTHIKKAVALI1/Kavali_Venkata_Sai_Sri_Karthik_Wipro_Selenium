package day9;
import java.util.*;
//Q9. Write a program that sorts a list of cities by population using Comparator.


public class CitySortByPopulation {
    static class City {
        String name; int pop;
        public City(String name, int pop) { this.name = name; this.pop = pop; }
        public String toString() { return name + " " + pop; }
    }
    public static void main(String[] args) {
        List<City> list = Arrays.asList(
            new City("X", 2000),
            new City("Y", 1500),
            new City("Z", 1800)
        );
        list.sort(Comparator.comparingInt(c -> c.pop));
        for (City c : list) System.out.println(c);
    }
}
