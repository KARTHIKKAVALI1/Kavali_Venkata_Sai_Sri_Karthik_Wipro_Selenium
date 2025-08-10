package day7;

import java.time.LocalTime;

//17  Create a daemon thread that runs in background and prints time every second.
public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while(true) {
                System.out.println(LocalTime.now());
                try { Thread.sleep(1000); } catch(Exception ignored) {}
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.sleep(5000);
    }
}
