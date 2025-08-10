package day8;
import java.util.*;
//Queue 2. Task Manager:
//
//Queue of tasks (String values).
//
//Add tasks, peek at the next task, and poll completed tasks.
public class TaskManager {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();
        tasks.add("t1"); tasks.add("t2"); tasks.add("t3");
        System.out.println(tasks.peek());
        tasks.poll();
        System.out.println(tasks);
    }
}
