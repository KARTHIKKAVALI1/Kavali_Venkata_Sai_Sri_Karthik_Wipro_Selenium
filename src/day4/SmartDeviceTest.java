package day4;
// poly 5. Combined question
//Create an abstract class SmartDevice with methods like turnOn(), turnOff(), and performFunction().
//Create child classes:
//•	SmartPhone: performs calling and browsing.
//•	SmartWatch: tracks fitness and time.
//•	SmartSpeaker: plays music and responds to voice commands
//•	Write code to store all objects in an array and use polymorphism to invoke their performFunction().
abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void performFunction();
}
class SmartPhone extends SmartDevice {
    void turnOn() {
    	System.out.println("SmartPhone On"); 
    	}
    void turnOff() { 
    	System.out.println("SmartPhone Off"); 
    	}
    void performFunction() { 
    	System.out.println("Calling and Browsing Internet");
    	}
}
class SmartWatch extends SmartDevice {
    void turnOn() { 
    	System.out.println("SmartWatch On");
    	}
    void turnOff() {
    	System.out.println("SmartWatch Off");
    	}
    void performFunction() { 
    	System.out.println("Tracking Fitness and Time");
    	}
}
class SmartSpeaker extends SmartDevice {
    void turnOn() {
    	System.out.println("SmartSpeaker On");
    	}
    void turnOff() {
    	System.out.println("SmartSpeaker Off"); 
    	}
    void performFunction() { 
    	System.out.println("Playing Music and Responding to Voice");
    	}
}

public class SmartDeviceTest {
    public static void main(String[] args) {
        SmartDevice[] devices = {new SmartPhone(), new SmartWatch(), new SmartSpeaker()};
        for (SmartDevice d : devices) {
            d.turnOn();
            d.performFunction();
            d.turnOff();
            System.out.println();
        }
    }
}
