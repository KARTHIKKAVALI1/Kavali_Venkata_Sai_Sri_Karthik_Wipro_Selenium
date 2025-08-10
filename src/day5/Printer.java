package day5;

public interface Printer {
    void print(String document);
}
//Contract Programming: Printer Switch
//•	Declare an interface Printer with method void print(String document).
//•	Implement two classes: LaserPrinter and InkjetPrinter, each providing unique behavior.
//•	In the client code, declare Printer p;, switch implementations at runtime, and test printing.
