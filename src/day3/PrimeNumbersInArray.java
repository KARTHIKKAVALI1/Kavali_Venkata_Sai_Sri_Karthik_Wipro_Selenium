package day3;

public class PrimeNumbersInArray {
//10.print only prime numbers from array 

    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,8,11,13};
        for(int i=0;i<arr.length;i++) {
            int n = arr[i];
            if(n < 2) continue;
            boolean isPrime = true;
            for(int j=2;j<=n/2;j++) {
                if(n%j==0) { 
                	isPrime=false;
                	break; 
                	}
            }
            if(isPrime)
            	System.out.print(n+" ");
        }
    }
}
