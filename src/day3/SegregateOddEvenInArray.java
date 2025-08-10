package day3;

public class SegregateOddEvenInArray {

    public static void main(String[] args) {
    	 int[] arr = {1,2,3,4,5,6};
         // Even first
         for(int i=0;i<arr.length;i++)
             if(arr[i]%2==0)
                 System.out.print(arr[i]+" ");
         // Odd next
         for(int i=0;i<arr.length;i++)
             if(arr[i]%2!=0)
                 System.out.print(arr[i]+" ");
    }
}
