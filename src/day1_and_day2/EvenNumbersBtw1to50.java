package day1_and_day2;

//Write a Java program to print even numbers between 1 to 50 using a for loop
public class EvenNumbersBtw1to50 {
    public static void main(String[] args) {
    	
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) { // checks for the even number condition
                System.out.print(i+" ");
            }
        }
    }
}

