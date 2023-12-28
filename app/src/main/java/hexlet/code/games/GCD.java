package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {
    public static void playGCD() {
        String description = "Find the greatest common divisor of given numbers.";
        final int gameParametersNum = 2;
        String[][] roundsData = new String[Engine.ROUNDS][gameParametersNum];
        Random random = new Random();
        final int randomLimit = 100;

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = random.nextInt(randomLimit);
            int num2 = random.nextInt(randomLimit);
            int correctAnswerInt = 0;
            for (int j = 1; j <= num1 && j <= num2; j++) {
                if (num1 % j == 0 && num2 % j == 0) {
                    correctAnswerInt = j;
                }
            }
            String correctAnswer = String.valueOf(correctAnswerInt);
            roundsData[i][1] = correctAnswer;

            String question = num1 + " " + num2;
            roundsData[i][0] = question;
        }
        Engine.runGame(description, roundsData);
    }
}
