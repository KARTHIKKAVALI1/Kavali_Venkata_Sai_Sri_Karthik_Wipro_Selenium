package day7;

//7  Create a program that starts three threads and sets different priorities for them.
public class MultipleThreadsPriority {
    static class SampleThread extends Thread {
        String name;
        SampleThread(String n) { name = n; }
        public void run() { for (int i = 0; i < 5; i++) System.out.println(name); }
    }

    public static void main(String[] args) {
        SampleThread t1 = new SampleThread("Low Priority");
        SampleThread t2 = new SampleThread("Normal Priority");
        SampleThread t3 = new SampleThread("High Priority");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
