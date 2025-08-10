package day4;

//Create a superclass Animal with a constructor and an eat() method. Make a subclass Dog that calls the superclass constructor, overrides eat() to call super.eat() and add its own message. In main(), create a Dog object and call eat().


class Animal {
    Animal() {
        System.out.println("Animal constructed");
    }
    void eat() {
        System.out.println("Animal eats food");
    }
}

public class Dog extends Animal {
    Dog() {
        super(); // Calls parent constructor
        System.out.println("Dog constructed");
    }
    void eat() {
        super.eat(); // Calls parent method
        System.out.println("Dog eats bones");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
