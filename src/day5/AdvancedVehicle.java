package day5;

//4. Extended Interface Hierarchy

//•	Define interface BaseVehicle with method void start().
//•	Define interface AdvancedVehicle that extends BaseVehicle, adding method void stop() and boolean refuel(int amount).
//•	Implement Car to satisfy both interfaces; include a constructor initializing fuel level.
//•	In Main, manipulate the object via both interface types.

public interface AdvancedVehicle extends BaseVehicle {
    void stop();
    boolean refuel(int amount);
}
