package day3;

public class ReverseArray {
	//6. write a program to print an array in reverse order 

    public static void main(String[] args) {
    	int[] arr = {1,2,3,4};
        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i] + " ");
    }
}

