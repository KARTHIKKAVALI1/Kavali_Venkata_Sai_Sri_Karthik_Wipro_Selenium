package day4;

//Q) Design an abstract class Person with fields like name, age, and abstract method getRoleInfo().
//Create subclasses:
//•	Student: has course and roll number.
//•	Professor: has subject and salary.
//•	TeachingAssistant: extends Student and implements getRoleInfo() in a hybrid way.
//•	Create and print info for all roles using overridden getRoleInfo().

abstract class Person {
    String name;
    int age;
    Person(String n, int a) {
    	name = n;
    	age = a; 
    	}
    abstract void getRoleInfo();
}

class Student extends Person {
    String course;
    int rollNo;
    Student(String n, int a, String c, int r) {
    	super(n, a);
    	course = c;
    	rollNo = r; 
    	}
    void getRoleInfo() {
        System.out.println("Student: " + name + ", Course: " + course + ", Roll No: " + rollNo);
    }
}

class Professor extends Person {
    String subject;
    double salary;
    Professor(String n, int a, String s, double sal) {
    	super(n, a);
    	subject = s;
    	salary = sal;
    	}
    void getRoleInfo() {
        System.out.println("Professor: " + name + ", Subject: " + subject + ", Salary: " + salary);
    }
}

class TeachingAssistant extends Student {
    String assistSubject;
    TeachingAssistant(String n, int a, String c, int r, String as) {
        super(n, a, c, r);
        assistSubject = as;
    }
    void getRoleInfo() {
        System.out.println("Teaching Assistant: " + name +
            ", Course: " + course + ", Assisting: " + assistSubject + ", Roll No: " + rollNo);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Alice", 20, "B.Tech", 101),
            new Professor("Bob", 40, "Math", 50000),
            new TeachingAssistant("Carol", 24, "B.Tech", 110, "Physics")
        };
        for (Person p : people) {
            p.getRoleInfo();
        }
    }
}
