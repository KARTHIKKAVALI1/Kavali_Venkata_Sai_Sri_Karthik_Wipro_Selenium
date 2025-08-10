package day7;

//16  Write a program that demonstrates inter-thread communication using wait() and notifyAll().
public class WaitNotifyDemo {
    static class Data {
        boolean available = false;
        synchronized void produce() {
            while(available) try { wait(); } catch(Exception ignored) {}
            System.out.println("Producing");
            available = true;
            notifyAll();
        }
        synchronized void consume() {
            while(!available) try { wait(); } catch(Exception ignored) {}
            System.out.println("Consuming");
            available = false;
            notifyAll();
        }
    }

    static class Producer extends Thread {
        Data d;
        Producer(Data d) { this.d = d; }
        public void run() {
            for (int i=0;i<5;i++) d.produce();
        }
    }

    static class Consumer extends Thread {
        Data d;
        Consumer(Data d) { this.d = d; }
        public void run() {
            for (int i=0;i<5;i++) d.consume();
        }
    }

    public static void main(String[] args) {
        Data d = new Data();
        new Producer(d).start();
        new Consumer(d).start();
    }
}
