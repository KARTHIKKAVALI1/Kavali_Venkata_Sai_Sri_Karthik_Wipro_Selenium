package day1_and_day2;

//4.	What is type casting? Provide an example of implicit and explicit casting in Java.
public class TypeCasting {

    public static void main(String[] args) {
    	
        int num = 600;
        double d = num;
        System.out.println("Implicit Casting (int to double): " + d);

        double pi = 3.14;
        int i = (int) pi;
        System.out.println("Explicit Casting (double to int): " + i);
    }
}

