package day6;

//8: Calculator Operations Enum
//Create enum Operation (PLUS, MINUS, TIMES, DIVIDE) with an eval(double a, double b) method.
//Implement two versions:
//•	One using a switch(this) inside eval.
//•	Another using constant-specific method overrides for eval.
//Compare both designs.

public class CalculatorOperationDemo {
    enum OperationSwitch {
        PLUS, MINUS, TIMES, DIVIDE;

        double eval(double a, double b) {
            switch(this) {
                case PLUS: return a + b;
                case MINUS: return a - b;
                case TIMES: return a * b;
                case DIVIDE: return a / b;
                default: return 0;
            }
        }
    }

    enum OperationOverride {
        PLUS {
            double eval(double a, double b) { return a + b; }
        },
        MINUS {
            double eval(double a, double b) { return a - b; }
        },
        TIMES {
            double eval(double a, double b) { return a * b; }
        },
        DIVIDE {
            double eval(double a, double b) { return a / b; }
        };

        abstract double eval(double a, double b);
    }

    public static void main(String[] args) {
        double a = 10.0, b = 5.0;
        for (OperationSwitch op : OperationSwitch.values())
            System.out.println("Switch eval: " + op + " = " + op.eval(a,b));
        for (OperationOverride op : OperationOverride.values())
            System.out.println("Override eval: " + op + " = " + op.eval(a,b));
    }
}
