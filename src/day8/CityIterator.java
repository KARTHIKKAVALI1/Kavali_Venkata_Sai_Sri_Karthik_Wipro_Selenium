package day8;
import java.util.*;
//8. Iterate using Iterator
//
//Create an ArrayList of cities.
//
//Use Iterator to display each city.
public class CityIterator {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Delhi", "Bangalore", "Chennai", "Mumbai"));
        Iterator<String> it = cities.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
