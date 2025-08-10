package day3;

public class SortCharInString {
//Write a program to sort characters of a String Alphabetically 

    public static void main(String[] args) {
    	String s = "edcba";
        char[] arr = new char[s.length()];
        for(int i=0; i<s.length();i++)
            arr[i] = s.charAt(i);
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1]) {
                    char temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        String sorted = "";
        for(int i=0; i<arr.length; i++)
            sorted += arr[i];
        System.out.println(sorted);
    }
}

