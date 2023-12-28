package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void playCalc() {
        String gameRules = "What is the result of the expression?";
        Engine.startGame(gameRules);

        final int roundsMax = 3;
        while (Engine.getCorrectAnswersCount() < roundsMax) {

            Random random = new Random();
            int randomLimit = 100;
            int num1 = random.nextInt(randomLimit);
            char operator = "+-*".charAt((new Random()).nextInt(3));
            int num2 = random.nextInt(randomLimit);

            int correctAnswerInt = 0;
            switch (operator) {
                case '+':
                    correctAnswerInt = num1 + num2;
                    break;
                case '*':
                    correctAnswerInt = num1 * num2;
                    break;
                case '-':
                    correctAnswerInt = num1 - num2;
                    break;
                default:
                    System.out.println("Incorrect operator");
            }
            String correctAnswer = String.valueOf(correctAnswerInt);
            String question = num1 + " " + operator + " " + num2;

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
}
