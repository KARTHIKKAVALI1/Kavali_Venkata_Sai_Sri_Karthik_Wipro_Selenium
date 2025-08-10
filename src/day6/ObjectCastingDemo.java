package day6;

//Object Casting with Inheritance 
//1.	Define an Animal class with a method makeSound().
//2.	Define subclass Dog:
//o	Override makeSound() (e.g. "Woof!").
//o	Add method fetch().
//3.	In main:
//Dog d = new Dog();
//Animal a = d;          // upcasting
//a.makeSound();

public class ObjectCastingDemo {
    static class Animal {
        void makeSound() {
            System.out.println("Animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof!");
        }
        void fetch() {
            System.out.println("Dog fetches the ball");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = d;
        a.makeSound();
    }
}
