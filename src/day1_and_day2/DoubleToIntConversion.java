package day1_and_day2;

public class DoubleToIntConversion {
    public static void main(String[] args) {
        double d = 45.0;

        // Check if double has no fractional part
        if (d % 1 == 0) {
            int i = (int) d;
            System.out.println("Converted int value: " + i);
        } else {
            System.out.println("Data loss may occur. Conversion not performed.");
        }
    }
}
