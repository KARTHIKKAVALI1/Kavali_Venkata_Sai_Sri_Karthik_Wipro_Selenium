package day7;

//15  Create a program where one thread prints A-Z and another prints 1-26 alternately.
public class AlternatePrintDemo {
    private static final Object lock = new Object();
    private static boolean charTurn = true;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                synchronized (lock) {
                    while (!charTurn) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    System.out.print(c);
                    charTurn = false;
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    while (charTurn) {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                    System.out.print(i);
                    charTurn = true;
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();
    }
}

