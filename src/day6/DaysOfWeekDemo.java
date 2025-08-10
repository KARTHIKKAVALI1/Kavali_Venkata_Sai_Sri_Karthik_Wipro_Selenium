package day6;

//Enum
//1: Days of the Week
//Define an enum DaysOfWeek with seven constants. Then in main(), prompt the user to input a day name and:
//•	Print its position via ordinal().
//•	Confirm if it's a weekend day using a switch or if-statement.

public class DaysOfWeekDemo {
    enum DaysOfWeek { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; }

    public static void main(String[] args) {
        try {
            String input = System.console().readLine().toUpperCase();
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println("Day ordinal: " + day.ordinal());
            switch(day) {
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It is a weekend.");
                    break;
                default:
                    System.out.println("It is a weekday.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day input.");
        }
    }
}
