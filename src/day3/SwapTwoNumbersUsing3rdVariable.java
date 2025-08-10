package day3;
// Swap two numbers using third variable 

public class SwapTwoNumbersUsing3rdVariable {
		public static void main(String[] args) {
			int a = 5, b = 8, temp;
	        temp = a;
	        a = b;
	        b = temp;
	        System.out.println("a = " + a + ", b = " + b);
		}
}
