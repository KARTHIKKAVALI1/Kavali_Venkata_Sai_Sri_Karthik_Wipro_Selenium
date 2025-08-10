package day3;

public class CopyArray {
	//8.copy all elements from one array to another 

    public static void main(String[] args) {
    	int[] src = {3, 5, 7, 1};
        int[] dest = new int[src.length];
        for (int i = 0; i < src.length; i++)
            dest[i] = src[i];
        System.out.print("Copied Array: ");
        for (int i = 0; i < dest.length; i++)
            System.out.print(dest[i] + " ");
    }
}
