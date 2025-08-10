package day3;

public class RemoveDuplicatesInArray {
//7. remove duplicate elements from an array 

    public static void main(String[] args) {
    	int[] arr = {1,2,2,4,4,3};
        int n = arr.length;
        for(int i=0; i<n; i++) {
            boolean isDuplicate = false;
            for(int j=0; j<i; j++) {
                if(arr[i]==arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
                System.out.print(arr[i]+" ");
        }
    }
}
