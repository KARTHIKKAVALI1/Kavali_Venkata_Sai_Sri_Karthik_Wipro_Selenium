package day4;
//Q) Create a base class Vehicle with method start().
//Derive Car, Bike, and Truck from it and override the start() method.
//•	Create a static method that accepts Vehicle type and calls start().
//•	Pass different vehicle objects to test polymorphism.


class Vehicle3 {
    void start() {
    	System.out.println("Vehicle starts");
    	}
}
class Car extends Vehicle3 {
    void start() { 
    	System.out.println("Car starts");
    	}
}
class Bike3 extends Vehicle3 {
    void start() {
    	System.out.println("Bike starts");
    	}
}
class Truck extends Vehicle3 {
    void start() {
    	System.out.println("Truck starts"); 
    	}
}

public class VehicleTester {
	
    public static void testStart(Vehicle3 v) {
        v.start();
    }

    public static void main(String[] args) {
        testStart(new Car());
        testStart(new Bike3());
        testStart(new Truck());
    }
}
