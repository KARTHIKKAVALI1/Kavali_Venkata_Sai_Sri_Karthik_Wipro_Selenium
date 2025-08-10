package day5;
//Extended Interface Hierarchy

// •	Define interface BaseVehicle with method void start().
// •	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
// •	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
// •	In Main, manipulate the object via both interface types.

public class Car implements AdvancedVehicle {
    private int fuelLevel;
    private boolean isRunning;
    private static final int MAX_FUEL = 100;
    public Car(int initialFuel) {
        this.fuelLevel = Math.min(initialFuel, MAX_FUEL);
        this.isRunning = false;
    }
    public void start() {
        if (fuelLevel > 0) {
            isRunning = true;
            System.out.println("Car started. Fuel level: " + fuelLevel);
        } else {
            System.out.println("Cannot start car. No fuel!");
        }
    }
    public void stop() {
        isRunning = false;
        System.out.println("Car stopped.");
    }
    public boolean refuel(int amount) {
        if (amount <= 0 || fuelLevel >= MAX_FUEL) return false;
        int oldLevel = fuelLevel;
        fuelLevel = Math.min(fuelLevel + amount, MAX_FUEL);
        System.out.println("Refueled from " + oldLevel + " to " + fuelLevel);
        return true;
    }
    public int getFuelLevel() { return fuelLevel; }
    public static void main(String[] args) {
        Car car = new Car(20);
        BaseVehicle vehicle = car;
        vehicle.start();
        AdvancedVehicle advVehicle = car;
        advVehicle.refuel(30);
        advVehicle.stop();
    }
}
