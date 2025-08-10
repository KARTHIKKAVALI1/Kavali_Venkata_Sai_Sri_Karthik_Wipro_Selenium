package day7;

//4  Demonstrate the use of Thread.sleep() by pausing execution between numbers from 1 to 3.
public class SleepDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }

    public static void main(String[] args) {
        SleepDemo t = new SleepDemo();
        t.start();
    }
}
