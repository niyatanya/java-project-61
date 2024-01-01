package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int GAME_PARAMETERS_NUM = 2;

    public static void runGame(String description, String[][] roundsData) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(description);

        int correctAnswersCount = 0;
        while (correctAnswersCount < ROUNDS) {
            String question = roundsData[correctAnswersCount][0];
            System.out.println("Question: " + question);
            String correctAnswer = roundsData[correctAnswersCount][1];
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                scanner.close();
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
