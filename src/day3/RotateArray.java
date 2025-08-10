package day3;

public class RotateArray {
//12. Rotate array elements(left or right) 

    public static void main(String[] args) {
    	int[] arr={1,2,3,4};
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++)
            arr[i] = arr[i+1];
        arr[arr.length-1] = temp;
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
