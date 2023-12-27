package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }

        for (int i = 2; i <= num/2; i++) {
            if ((num % i) == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void playPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {

            Random random = new Random();
            int num1 = random.nextInt(100);
            System.out.println("Question: " + num1);

            String correctAnswer = isPrime(num1);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
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
