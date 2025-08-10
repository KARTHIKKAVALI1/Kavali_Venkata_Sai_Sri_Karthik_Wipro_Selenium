package day7;

//19  Write a program to demonstrate thread group creation and management.
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");
        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(group, r, "T1");
        Thread t2 = new Thread(group, r, "T2");
        t1.start(); t2.start();
        System.out.println("Active count: " + group.activeCount());
        group.list();
    }
}
