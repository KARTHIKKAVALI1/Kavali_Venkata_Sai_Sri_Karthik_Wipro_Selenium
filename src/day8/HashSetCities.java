package day8;
import java.util.*;
//HashSet 1. Create a HashSet of Strings:
//
//Add 5 different city names.
//
//Try adding a duplicate city and observe the output.
//
//Iterate using an Iterator and print each city.
public class HashSetCities {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi"); hs.add("Mumbai"); hs.add("Chennai"); hs.add("Kolkata"); hs.add("Pune");
        hs.add("Delhi");
        Iterator<String> it = hs.iterator();
        while(it.hasNext()) System.out.println(it.next());
    }
}
