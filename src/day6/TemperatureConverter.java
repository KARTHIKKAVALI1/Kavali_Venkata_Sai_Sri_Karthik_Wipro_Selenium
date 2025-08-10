package day6;

//Mini Project – Temperature Converter 
//1.	Prompt user for a temperature in Celsius (double).
//2.	Convert it to Fahrenheit:
//double fahrenheit = celsius * 9/5 + 32;
//3.	Then cast that fahrenheit to int for display.
//4.	Print both the precise (double) and truncated (int) values, and comment on precision loss.

public class TemperatureConverter {
    public static void main(String[] args) {
        try {
            double celsius = Double.parseDouble(System.console().readLine());
            double fahrenheit = celsius * 9 / 5 + 32;
            int truncFahrenheit = (int) fahrenheit;
            System.out.println("Temperature in Celsius: " + celsius);
            System.out.println("Temperature in Fahrenheit (double): " + fahrenheit);
            System.out.println("Temperature in Fahrenheit (int): " + truncFahrenheit);
        } catch (Exception e) {
            System.out.println("Invalid temperature input.");
        }
    }
}
