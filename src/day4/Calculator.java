package day4;
// Polymorphism 1. 1.	Create a class Calculator with the following overloaded add()
//1. add (int a, int b)
//2. add (int a, int b, int c)
//3. add (double a, double b)

public class Calculator {
    int add(int a, int b) {
    	return a + b; 
    	}
    int add(int a, int b, int c) {
    	return a + b + c; 
    	}
    double add(double a, double b) {
    	return a + b; 
    	}

    public static void main(String[] args) {
    	
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(1, 2, 3));
        System.out.println(calc.add(2.1, 3.5));
    }
}
