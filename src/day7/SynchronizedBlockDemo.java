package day7;

//12  Write a Java program using synchronized block to ensure mutual exclusion.
public class SynchronizedBlockDemo {
    static class Counter {
        int count = 0;
        void increment() {
            synchronized(this) {
                count++;
            }
        }
    }

    static class MyThread extends Thread {
        Counter c;
        MyThread(Counter c) { this.c = c; }
        public void run() {
            for (int i=0;i<1000;i++) c.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Count: " + c.count);
    }
}
