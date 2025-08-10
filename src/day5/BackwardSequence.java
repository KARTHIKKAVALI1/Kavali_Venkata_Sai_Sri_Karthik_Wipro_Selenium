package day5;
//. Reverse CharSequence: Custom BackwardSequence
//•	Create a class BackwardSequence that implements java.lang.CharSequence.
//•	Internally store a String and implement all required methods: length(), charAt(), subSequence(), and toString().
//•	The sequence should be the reverse of the stored string (e.g., new BackwardSequence("hello") yields "olleh").
//•	Write a main() method to test each method.

public class BackwardSequence implements CharSequence {
    private final String original;
    private final String reversed;
    public BackwardSequence(String original) {
        this.original = original != null ? original : "";
        this.reversed = reverseString(this.original);
    }
    private String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left]; chars[left] = chars[right];
            chars[right] = temp; left++; right--;
        }
        return new String(chars);
    }
    public int length() { return reversed.length(); }
    public char charAt(int index) {
        if (index < 0 || index >= reversed.length()) throw new IndexOutOfBoundsException("Index: " + index);
        return reversed.charAt(index);
    }
    public CharSequence subSequence(int start, int end) {
        if (start < 0 || end > reversed.length() || start > end) throw new IndexOutOfBoundsException("Invalid range");
        return reversed.substring(start, end);
    }
    public String toString() { return reversed; }
    public static void main(String[] args) {
        BackwardSequence bs = new BackwardSequence("hello");
        System.out.println("Original: hello");
        System.out.println("Reversed: " + bs.toString());
        System.out.println("Length: " + bs.length());
        System.out.println("Char at index 1: " + bs.charAt(1));
        System.out.println("Subsequence (1,4): " + bs.subSequence(1, 4));
    }
}
