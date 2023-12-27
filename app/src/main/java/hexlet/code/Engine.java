package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String name;
    public static int correctAnswersCount;
    public static void startGame(String gameRules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameRules);
    }

    public static void playGame(String question, String correctAnswer) {
        System.out.println("Question: " + question);

        Scanner scanner = new Scanner(System.in);
        String userAnswer = scanner.nextLine();

        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            correctAnswersCount++;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
            System.exit(0);
        }
    }
}
