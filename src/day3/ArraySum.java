package day3;
//1.Write a program to find the sum of all elements in an integer array 

public class ArraySum {
    public static void main(String[] args) {
    	 int[] arr = {3, 7, 2, 5};
         int sum = 0;
         for (int i = 0; i < arr.length; i++)
             sum += arr[i];
         System.out.println("Sum = " + sum);
    }
}
