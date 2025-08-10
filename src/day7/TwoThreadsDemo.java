package day7;

//3  Write a program to create two threads, each printing a different message 5 times.
public class TwoThreadsDemo {
    static class MsgThread extends Thread {
        String msg;
        MsgThread(String m) { msg = m; }
        public void run() {
            for (int i = 0; i < 5; i++)
                System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MsgThread("Thread 1 message");
        Thread t2 = new MsgThread("Thread 2 message");
        t1.start();
        t2.start();
    }
}
