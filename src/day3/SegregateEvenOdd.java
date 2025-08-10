package day3;

import java.util.Arrays;
import java.util.Scanner;

public class SegregateEvenOdd {
	//15 segregate even and odd numbers  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0, right = size - 1;

        // Segregate even and odd using two-pointer approach
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation: " + Arrays.toString(arr));
        sc.close();
    }
}

