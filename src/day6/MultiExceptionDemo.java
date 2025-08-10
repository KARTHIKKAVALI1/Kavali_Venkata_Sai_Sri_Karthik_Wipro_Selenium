package day6;

//4: Multi Exception in One Try Block
//Write a class MultiExceptionDemo:
//In a single try block, perform:
//Opening a file
//Parsing its first line as integer
//Dividing 100 by that integer
//Use multiple catch blocks in this order:
//FileNotFoundException
//IOException
//NumberFormatException
//ArithmeticException
//In each catch, print a tailored message:
//File not found
//Problem reading file
//Invalid number format
//Division by zero
//Finally, print "Execution completed".

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(System.console().readLine()));
            String line = br.readLine();
            int num = Integer.parseInt(line);
            int res = 100 / num;
            System.out.println("Result: " + res);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem reading file");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } finally {
            try { if(br != null) br.close(); } catch (IOException ignored) {}
            System.out.println("Execution completed");
        }
    }
}
