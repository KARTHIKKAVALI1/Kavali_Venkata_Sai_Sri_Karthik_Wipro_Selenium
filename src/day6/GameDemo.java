package day6;

//Difficulty Level & Game Setup
//Define enum Difficulty with EASY, MEDIUM, HARD.
//Write a Game class that takes a Difficulty and prints logic like:
//•	EASY → 3000 bullets, MEDIUM → 2000, HARD → 1000.
//Use a switch(diff) inside constructor or method.

public class GameDemo {
    enum Difficulty { EASY, MEDIUM, HARD; }

    static class Game {
        Game(Difficulty diff) {
            int bullets;
            switch(diff) {
                case EASY: bullets = 3000; break;
                case MEDIUM: bullets = 2000; break;
                case HARD: bullets = 1000; break;
                default: bullets = 0;
            }
            System.out.println(diff + " difficulty has " + bullets + " bullets.");
        }
    }

    public static void main(String[] args) {
        new Game(Difficulty.EASY);
        new Game(Difficulty.MEDIUM);
        new Game(Difficulty.HARD);
    }
}
