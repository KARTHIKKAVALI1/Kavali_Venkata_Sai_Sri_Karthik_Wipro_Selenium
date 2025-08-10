package day1_and_day2;

import java.util.Scanner;

// check the result of the student using ternary operator
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        sc.close();
    }
}
