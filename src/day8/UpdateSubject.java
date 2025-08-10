package day8;
import java.util.*;
//6. Update an Element:
//
//Create an ArrayList of subjects.
//
//Replace one of the subjects (e.g., “Math” to “Statistics”).
//
//Print the list before and after the update.
public class UpdateSubject {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Math", "Physics", "Chemistry", "English"));
        System.out.println(subjects);
        subjects.set(subjects.indexOf("Math"), "Statistics");
        System.out.println(subjects);
    }
}
