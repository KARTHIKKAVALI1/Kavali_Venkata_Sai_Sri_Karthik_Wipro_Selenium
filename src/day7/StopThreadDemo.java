package day7;

//9  Show how to stop a thread using a boolean flag.
public class StopThreadDemo {
    static class MyThread extends Thread {
        volatile boolean running = true;
        public void run() {
            while (running) {
                System.out.println("Running...");
                try { Thread.sleep(300); } catch (InterruptedException ignored) {}
            }
            System.out.println("Stopped.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(1000);
        t.running = false;
    }
}
