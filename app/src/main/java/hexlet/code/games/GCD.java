package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void playGCD() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.GAME_PARAMETERS_NUM];

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
            int num2 = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
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
