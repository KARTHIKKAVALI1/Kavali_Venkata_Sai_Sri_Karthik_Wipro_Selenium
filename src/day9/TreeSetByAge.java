package day9;
import java.util.*;
//Q15. Use TreeSet with a custom comparator to sort a list of persons by age.

public class TreeSetByAge {
    static class Person {
        String name; int age;
        public Person(String name,int age) { this.name=name; this.age=age; }
        public String toString() { return name+" "+age; }
    }
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>(Comparator.comparingInt(p->p.age));
        set.add(new Person("P1",25));
        set.add(new Person("P2",20));
        set.add(new Person("P3",30));
        for(Person p:set) System.out.println(p);
    }
}
