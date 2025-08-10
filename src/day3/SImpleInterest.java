package day3;
//Calculate simple interest 

public class SImpleInterest {
	
	public static void main(String[] args) {
		
		double principal = 5000, rate = 5, time = 2;
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + si);
	}
}
