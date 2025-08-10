package day1_and_day2;

import java.util.Scanner;

// check for the valid id using nested if 
public class NestedIfProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.print("Do you have a valid ID?: ");
            String id = input.next();

            if (id.equalsIgnoreCase("yes")) {
                System.out.println("You are allowed entry.");
            } else {
                System.out.println("Entry denied.");
            }
        } else {
            System.out.println("You are underage. Entry denied.");
        }

        input.close();
    }
}

