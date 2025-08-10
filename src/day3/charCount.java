package day3;


public class charCount {

    public static int[] countElements(String s) {
        int digitsCount = 0;
        int lettersCount = 0;
        int spacesCount = 0;
        int specialsCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {               // Digit check
                digitsCount++;
            } else if ((ch >= 'A' && ch <= 'Z') || 
                       (ch >= 'a' && ch <= 'z')) {      // Letter check
                lettersCount++;
            } else if (ch == ' ') {                     // Space check
                spacesCount++;
            } else {                                    // Special character
                specialsCount++;
            }
        }
        return new int[]{digitsCount, lettersCount, spacesCount, specialsCount};
    }

    public static void main(String[] args) {
        String input = "Hello World! 123 #Java";
        
        int[] result = countElements(input);
        
        System.out.println("Digits: " + result[0]);
        System.out.println("Letters: " + result[1]);
        System.out.println("Spaces: " + result[2]);
        System.out.println("Special characters: " + result[3]);
    }
}
