package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void playGCD() {
        String gameRules = "Find the greatest common divisor of given numbers.";
        Engine.startGame(gameRules);

        final int roundsMax = 3;
        while (Engine.getCorrectAnswersCount() < roundsMax) {
            Random random = new Random();
            int randomLimit = 100;
            int num1 = random.nextInt(randomLimit);
            int num2 = random.nextInt(randomLimit);

            int correctAnswerInt = 0;
            for (int i = 1; i <= num1 && i <= num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    correctAnswerInt = i;
                }
            }
            String correctAnswer = String.valueOf(correctAnswerInt);
            String question = num1 + " " + num2;

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
}
