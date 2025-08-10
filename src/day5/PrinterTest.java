package day5;

public class PrinterTest {
    public static void main(String[] args) {
        Printer p;
        p = new LaserPrinter();
        p.print("Report.pdf");
        System.out.println();
        p = new InkjetPrinter();
        p.print("Photo.jpg");
    }
}
