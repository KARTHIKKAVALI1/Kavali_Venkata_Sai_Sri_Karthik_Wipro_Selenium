package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//File Handling with Multiple Catches
//Create a class FileReadDemo:
//1.	In main, call a method readFile(String filename) that declares throws FileNotFoundException, IOException.
//2.	In readFile, use FileReader (or BufferedReader) to open and read the first line of the file.
//3.	Handle exceptions in main using separate catch blocks:
//o	catch (FileNotFoundException e) → print "File not found: " + filename
//o	catch (IOException e) → print "Error reading file: " + e.getMessage()"
//4.	Include a finally block that prints "Cleanup done." regardless of outcome.
//________________________________________
//4: Multi Exception in One Try Block
//Write a class MultiExceptionDemo:
//•	In a single try block, perform:
//o	Opening a file
//o	Parsing its first line as integer
//o	Dividing 100 by that integer
//•	Use multiple catch blocks in this order:
//1.	FileNotFoundException
//2.	IOException
//3.	NumberFormatException
//4.	ArithmeticException
//•	In each catch, print a tailored message:
//o	File not found
//o	Problem reading file
//o	Invalid number format
//o	Division by zero
//•	Finally, print "Execution completed".

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            String filename = System.console().readLine();
            readFile(filename);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            System.out.println("Cleanup done.");
        }
    }

    static void readFile(String filename) throws java.io.FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        System.out.println("First line: " + line);
        br.close();
    }
}
