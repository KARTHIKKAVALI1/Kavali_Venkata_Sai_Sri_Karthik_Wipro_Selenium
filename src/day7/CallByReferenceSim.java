package day7;

//10.	Can you simulate call by reference in Java using a wrapper class or array? Justify with a program.
public class CallByReferenceSim {

    static void modify(int[] arr) {
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int[] a = {1};
        modify(a);
        System.out.println(a[0]);
    }
}
