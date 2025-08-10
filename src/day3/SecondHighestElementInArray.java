package day3;

public class SecondHighestElementInArray {
//4.write a program to find out second highest element from an array 

    public static void main(String[] args) {
    	int[] arr={3,8,1,4,8};
        int first=Integer.MIN_VALUE, second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>first) first=arr[i];
        for(int i=0;i<arr.length;i++)
            if(arr[i]>second && arr[i]<first) second=arr[i];
        System.out.println("Second Highest:"+second);
    }
}
