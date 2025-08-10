package day3;

public class ArrayIsPalendrome {
//14. check if array is palindrome or not 

    public static void main(String[] args) {
    	int[] arr = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is not Palindrome");
    }
}
