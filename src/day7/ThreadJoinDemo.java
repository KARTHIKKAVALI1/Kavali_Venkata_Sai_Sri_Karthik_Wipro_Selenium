package day7;

//8  Write a program to demonstrate Thread.join() – wait for a thread to finish before proceeding.
public class ThreadJoinDemo {
    static class JoinThread extends Thread {
        public void run() {
            for (int i=1;i<=3;i++) {
                System.out.println(i);
                try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinThread t = new JoinThread();
        t.start();
        t.join();
        System.out.println("Thread joined, proceed.");
    }
}
