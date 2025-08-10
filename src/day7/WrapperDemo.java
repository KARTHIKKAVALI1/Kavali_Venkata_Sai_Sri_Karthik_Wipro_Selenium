package day7;

//Wrapper classes
//1.	Check if character is a Digit
//2.	Compare two Strings
//3.	Convert using valueof method
//4.	Create Boolean Wrapper usage
//5.	Convert null to wrapper classes

public class WrapperDemo {
    public static void main(String[] args) {
        char ch = '7';
        System.out.println(Character.isDigit(ch));

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.equals(s2));

        int num = 50;
        String str = String.valueOf(num);
        System.out.println(str);

        Boolean boolObj = Boolean.valueOf(true);
        System.out.println(boolObj);

        Integer intObj = null;
        Double dblObj = null;
        Boolean boolNull = null;
        System.out.println(intObj);
        System.out.println(dblObj);
        System.out.println(boolNull);
    }
}
