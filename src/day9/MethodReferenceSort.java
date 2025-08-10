package day9;
import java.util.*;
//Q14. Use Comparator.comparing() with method references to sort objects in Java 8+.


public class MethodReferenceSort {
    static class Person {
        String name; int age;
        public Person(String name,int age) { this.name = name; this.age = age; }
        public String getName() { return name; }
        public int getAge() { return age; }
        public String toString() { return name+" "+age; }
    }
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("C",30),
            new Person("A",20),
            new Person("B",25)
        );
        list.sort(Comparator.comparing(Person::getAge));
        for(Person p:list) System.out.println(p);
    }
}
