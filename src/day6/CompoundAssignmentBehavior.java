package day6;

//Compound Assignment Behaviour 
//1.	Initialize int x = 5;.
//2.	Write two operations:
//x = x + 4.5;    // Does this compile? Why or why not?
//x += 4.5;       // What happens here?
// Compound assignment (+=) allows implicit narrowing conversion.


public class CompoundAssignmentBehavior {
    public static void main(String[] args) {
        int x = 5;
        x += 4.5;
        System.out.println("Result of x after x += 4.5: " + x);
    }
}
