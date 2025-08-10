package day7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

//20  Create a thread that performs a simple task (like multiplication) and returns result using Callable and Future.
public class CallableDemo {

    static class Multiplier implements Callable<Integer> {
        int a, b;
        Multiplier(int a, int b) { this.a = a; this.b = b; }
        public Integer call() { return a * b; }
    }

    public static void main(String[] args) throws Exception {
        FutureTask<Integer> task = new FutureTask<>(new Multiplier(5, 10));
        Thread t = new Thread(task);
        t.start();
        System.out.println(task.get());
    }
}
