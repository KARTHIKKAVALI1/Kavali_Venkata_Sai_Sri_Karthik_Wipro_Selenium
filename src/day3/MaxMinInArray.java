package day3;

public class MaxMinInArray {
//3. find maximum and minimum elements from an array. 

    public static void main(String[] args) {
    	 int[] arr={3,9,1,7};
         int min=arr[0], max=arr[0];
         for(int i=1;i<arr.length;i++) {
             if(arr[i]>max) max=arr[i];
             if(arr[i]<min) min=arr[i];
         }
         System.out.println("Max:"+max+" Min:"+min); 
    }
}

