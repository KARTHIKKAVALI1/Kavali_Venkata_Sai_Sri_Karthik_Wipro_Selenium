package day7;

//5  Create a thread and use Thread.yield() to pause and give chance to another thread.
public class YieldDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread 1: " + i);
                Thread.yield();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; i++)
                System.out.println("Thread 2: " + i);
        });
        t1.start();
        t2.start();
    }
}
