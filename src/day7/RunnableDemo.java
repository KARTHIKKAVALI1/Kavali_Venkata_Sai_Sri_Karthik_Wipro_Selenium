package day7;

//2 Create a thread by implementing the Runnable interface that prints the current thread name.
public class RunnableDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableDemo());
        t.start();
    }
}
