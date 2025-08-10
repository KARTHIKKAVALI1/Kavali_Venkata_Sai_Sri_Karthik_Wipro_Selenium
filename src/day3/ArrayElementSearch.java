package day3;
import java.util.Scanner;

public class ArrayElementSearch {
//5.write a program to search for a number entered by the user in an array 

    public static void main(String[] args) {
    	int[] arr = {2, 4, 6, 8, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
