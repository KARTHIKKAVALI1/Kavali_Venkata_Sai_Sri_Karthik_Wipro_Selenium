package day1_and_day2;
import java.util.Scanner;

//Write a Java program to demonstrate the use of if-else and switch-case statements.
public class controlStatments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Use Of If-else With An Example
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        // Use Of Switch-case With An Example
        System.out.print("Enter a day number (1-7): ");
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
        input.close();
    }
}
