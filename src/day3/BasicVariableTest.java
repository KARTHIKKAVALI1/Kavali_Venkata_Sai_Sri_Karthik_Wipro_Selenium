package day3;

public class BasicVariableTest {
	static String company = "SoftTech"; // Static variable
    String employee; // Instance variable

    public BasicVariableTest(String name) {
        employee = name;
    }

    void printDetails() {
        int id = 21; // Local variable
        System.out.println("Employee: " + employee);
        System.out.println("ID: " + id);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        BasicVariableTest v = new BasicVariableTest("Arjun");
        v.printDetails();
	    }
}
