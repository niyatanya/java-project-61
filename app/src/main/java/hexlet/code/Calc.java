package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void playCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {

            Random random = new Random();
            int num1 = random.nextInt(100);
            char operator = "+-*".charAt((new Random()).nextInt(3));
            int num2 = random.nextInt(100);
            System.out.println("Question: " + num1 + " " + operator + " " + num2);

            int correctAnswer = 0;
            switch (operator) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                default:
                    System.out.println("Incorrect operator");
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
