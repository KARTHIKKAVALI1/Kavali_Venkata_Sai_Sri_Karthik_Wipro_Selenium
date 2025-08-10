package day7;

//18 Demonstrate the use of Thread.isAlive() to check thread status.
public class ThreadIsAliveDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i=0; i<3; i++) System.out.println("Running");
        });
        System.out.println(t.isAlive());
        t.start();
        Thread.sleep(100);
        System.out.println(t.isAlive());
        t.join();
        System.out.println(t.isAlive());
    }
}
