package day6;
//1.	Write a program to:
//o	Read an int value from user input.
//o	Assign it to a double (implicit widening) and print both.
//o	Read a double, explicitly cast it to int, then to short, and print results—demonstrate truncation or overflow.
//2.	Convert an int to String using String.valueOf(...), then back with Integer.parseInt(...). Handle NumberFormatException.

public class typecastingDemo {
    public static void main(String[] args) {
        typeCastingDemo();
        intStringConversion();
    }

    static void typeCastingDemo() {
        try {
            int intValue = Integer.parseInt(System.console().readLine());
            double doubleValue = intValue;
            System.out.println("Int value: " + intValue + ", Double value: " + doubleValue);
            double dblInput = Double.parseDouble(System.console().readLine());
            int castedInt = (int) dblInput;
            short castedShort = (short) castedInt;
            System.out.println("Double input: " + dblInput + ", Cast to int: " + castedInt + ", Cast to short: " + castedShort);
        } catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }

    static void intStringConversion() {
        try {
            int num = Integer.parseInt(System.console().readLine());
            String str = String.valueOf(num);
            int parsedNum = Integer.parseInt(str);
            System.out.println("Original int: " + num + ", String: " + str + ", Parsed int: " + parsedNum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for integer conversion.");
        }
    }
}
