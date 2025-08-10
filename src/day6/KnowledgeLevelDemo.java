package day6;

//10: Knowledge Level from Score Range
//Define enum KnowledgeLevel with constants BEGINNER, ADVANCED, PROFESSIONAL, MASTER.
//Use a static method fromScore(int score) to return the appropriate enum:
//•	0–3 → BEGINNER, 4–6 → ADVANCED, 7–9 → PROFESSIONAL, 10 → MASTER.
//Then print the level and test boundary conditions.

public class KnowledgeLevelDemo {
    enum KnowledgeLevel {
        BEGINNER, ADVANCED, PROFESSIONAL, MASTER;

        static KnowledgeLevel fromScore(int score) {
            if (score >= 0 && score <= 3) return BEGINNER;
            if (score >= 4 && score <= 6) return ADVANCED;
            if (score >= 7 && score <= 9) return PROFESSIONAL;
            if (score == 10) return MASTER;
            throw new IllegalArgumentException("Score out of range");
        }
    }

    public static void main(String[] args) {
        int[] testScores = {0, 3, 4, 6, 7, 9, 10};
        for (int score : testScores)
            System.out.println("Score: " + score + ", Level: " + KnowledgeLevel.fromScore(score));
    }
}
