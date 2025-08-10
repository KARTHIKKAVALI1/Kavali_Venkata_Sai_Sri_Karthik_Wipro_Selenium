package day8;
import java.util.*;
//LinkedHashSet 2. Create a LinkedHashSet of custom objects (e.g., Student with id and name):
//
//Override hashCode() and equals() properly.
//
//Add at least 3 Student objects.
//
//Try adding a duplicate student and check if it gets added.
public class StudentLHS {
    int id; String name;
    public StudentLHS(int id, String name) { this.id=id; this.name=name; }
    public boolean equals(Object o) {
        if(this==o) return true;
        if(!(o instanceof StudentLHS)) return false;
        StudentLHS s=(StudentLHS)o;
        return id==s.id && name.equals(s.name);
    }
    public int hashCode() {
        return Objects.hash(id,name);
    }
    public String toString() { return id+" "+name; }
}
