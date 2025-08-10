package day7;

//6  Implement a program where two threads print even and odd numbers respectively.
public class EvenOddThreads {
    static class EvenThread extends Thread {
        public void run() {
            for (int i = 2; i <= 10; i += 2)
                System.out.println("Even: " + i);
        }
    }

    static class OddThread extends Thread {
        public void run() {
            for (int i = 1; i < 10; i += 2)
                System.out.println("Odd: " + i);
        }
    }

    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
