package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class GCD {
    public static void playGCD() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {

            Random random = new Random();
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            System.out.println("Question: " + num1 + " " + num2);

            int correctAnswer = 0;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    correctAnswer = i;
                }
            }

            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
