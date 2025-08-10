package day7;

//Pass by value and pass by reference
//1.	Write a program where a method accepts an integer parameter and tries to change its value. Print the value before and after the method call.
//2.	Create a method that takes two integer values and swaps them. Show that the original values remain unchanged after the method call.
//3.	Write a Java program to pass primitive data types to a method and observe whether changes inside the method affect the original variables

public class PassByValueDemo {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        modify(a);
        System.out.println(a);

        int x = 5, y = 7;
        System.out.println(x + " " + y);
        swap(x, y);
        System.out.println(x + " " + y);

        int p = 12, q = 20;
        System.out.println(p + " " + q);
        modifyPrimitives(p, q);
        System.out.println(p + " " + q);
    }

    static void modify(int n) {
        n = 100;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void modifyPrimitives(int a, int b) {
        a = 0;
        b = 0;
    }
}
