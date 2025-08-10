package day3;

public class EvenOddInArray {
	//2. Write a program to count even and odd numbers from an array 

    public static void main(String[] args) {
    	int[] arr = {1, 2, 5, 7, 8};
        int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: "+even+", Odd: "+odd);
    }
}

