package day5;

//. Contract Programming: Printer Switch
// •	Declare an interface Printer with method void print(String document).
// •	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
// •	In the client code, declare Printer p;, switch implementations at runtime, and test printing.

public class LaserPrinter implements Printer {
    public void print(String document) {
        System.out.println("LaserPrinter: High-quality printing of '" + document + "'");
        System.out.println("Using toner cartridge...");
    }
}
