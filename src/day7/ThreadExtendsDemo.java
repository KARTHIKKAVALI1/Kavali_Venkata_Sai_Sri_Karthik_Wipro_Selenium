package day7;

//1 Write a program to create a thread by extending the Thread class and print numbers from 1 to 5.
public class ThreadExtendsDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }

    public static void main(String[] args) {
        ThreadExtendsDemo t = new ThreadExtendsDemo();
        t.start();
    }
}
