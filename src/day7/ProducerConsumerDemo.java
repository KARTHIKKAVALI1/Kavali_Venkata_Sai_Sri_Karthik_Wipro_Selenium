package day7;

//Create a Producer-Consumer problem using wait() and notify().
public class ProducerConsumerDemo {
    static class Q {
        int n;
        boolean valueSet = false;
        synchronized int get() {
            while(!valueSet) try { wait(); } catch (InterruptedException ignored) {}
            valueSet=false;
            notify();
            return n;
        }
        synchronized void put(int n) {
            while(valueSet) try { wait(); } catch (InterruptedException ignored) {}
            this.n = n;
            valueSet=true;
            notify();
        }
    }
    static class Producer extends Thread {
        Q q;
        Producer(Q q) { this.q = q; }
        public void run() {
            for (int i=0;i<5;i++) q.put(i);
        }
    }
    static class Consumer extends Thread {
        Q q;
        Consumer(Q q) { this.q = q; }
        public void run() {
            for (int i=0;i<5;i++) System.out.println(q.get());
        }
    }
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q).start();
        new Consumer(q).start();
    }
}
