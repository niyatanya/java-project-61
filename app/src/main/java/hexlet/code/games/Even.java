package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void playEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {

            Random random = new Random();
            int num1 = random.nextInt(100);
            System.out.println("Question: " + num1);

            String correctAnswer1;
            if (num1 % 2 == 0) {
                correctAnswer1 = "yes";
            } else {
                correctAnswer1 = "no";
            }

            String userAnswer1 = scanner.nextLine();

            if (userAnswer1.equals(correctAnswer1)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer1 + "' is wrong answer ;(. Correct answer was '" + correctAnswer1 + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
