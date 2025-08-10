package day4;

//Write a Java program to demonstrate hierarchical inheritance where class Animal2 is the superclass and Cat, Dog2, and Cow are subclasses overriding the makeSound() method. In main(), create objects of each subclass using superclass references and call their makeSound() methods.


class Animal2 {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal2 {
    void makeSound() { System.out.println("Meow"); }
}

class Dog2 extends Animal2 {
    void makeSound() { System.out.println("Bark"); }
}

class Cow extends Animal2 {
    void makeSound() { System.out.println("Moo"); }
}

public class HierarchicalTest {
    public static void main(String[] args) {
        Animal2 cat = new Cat();
        Animal2 dog = new Dog2();
        Animal2 cow = new Cow();

        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}
