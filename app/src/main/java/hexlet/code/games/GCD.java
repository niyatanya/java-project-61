package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class GCD {

    private static final int GAME_PARAMETERS_NUM = 2;
    private static final int RANDOM_LIMIT = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGCD() {
        String[][] roundsData = new String[Engine.ROUNDS][GAME_PARAMETERS_NUM];
        Random random = new Random();

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = random.nextInt(RANDOM_LIMIT);
            int num2 = random.nextInt(RANDOM_LIMIT);
            String correctAnswer = String.valueOf(calculateGCD(num1, num2));
            roundsData[i][1] = correctAnswer;

            String question = num1 + " " + num2;
            roundsData[i][0] = question;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    public static int calculateGCD(int num1, int num2) {
        int gcd = 1;
        for (int j = 1; j <= num1 && j <= num2; j++) {
            if (num1 % j == 0 && num2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }
}
