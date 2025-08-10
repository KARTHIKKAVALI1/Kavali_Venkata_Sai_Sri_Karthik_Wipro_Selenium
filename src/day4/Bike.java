package day4;

//Create a superclass Vehicle1 with a constructor and a start() method. Extend it with a subclass Bike that calls the superclass constructor, overrides start() to call super.start(), and adds its own message. In main(), create a Bike object and call start().
class Vehicle1 {
    Vehicle1() {
        System.out.println("Vehicle Created");
    }
    void start() {
        System.out.println("Vehicle starting...");
    }
}

public class Bike extends Vehicle1 {
    Bike() {
        super();
        System.out.println("Bike Created");
    }
    void start() {
        super.start();
        System.out.println("Bike starting...");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
