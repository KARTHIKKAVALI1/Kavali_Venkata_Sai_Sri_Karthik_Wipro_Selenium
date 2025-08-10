package day8;
import java.util.*;

//3.	Browser History Simulation:
// o	Implement browser back and forward navigation using two deques.

public class BrowserHistorySimulation {
    public static void main(String[] args) {
        Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        String currentPage = "Home";
        System.out.println("Current page: " + currentPage);

        while (true) {
            System.out.println("\nOptions: 1.Visit new page  2.Back  3.Forward  4.Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Visit new page
                    System.out.print("Enter new page URL: ");
                    String newPage = sc.nextLine();
                    backStack.push(currentPage);
                    currentPage = newPage;
                    forwardStack.clear();
                    System.out.println("Visited: " + currentPage);
                    break;

                case 2: // Back
                    if (backStack.isEmpty()) {
                        System.out.println("No pages in back history.");
                    } else {
                        forwardStack.push(currentPage);
                        currentPage = backStack.pop();
                        System.out.println("Back to: " + currentPage);
                    }
                    break;

                case 3: // Forward
                    if (forwardStack.isEmpty()) {
                        System.out.println("No pages in forward history.");
                    } else {
                        backStack.push(currentPage);
                        currentPage = forwardStack.pop();
                        System.out.println("Forward to: " + currentPage);
                    }
                    break;

                case 4:
                    System.out.println("Exiting browser simulation.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
