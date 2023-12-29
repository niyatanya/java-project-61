package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {

    private static final int GAME_PARAMETERS_NUM = 2;
    private static final int RANDOM_LIMIT = 100;

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void playPrime() {
        String[][] roundsData = new String[Engine.ROUNDS][GAME_PARAMETERS_NUM];
        Random random = new Random();

        for (var i = 0; i < roundsData.length; i++) {
            int num = random.nextInt(RANDOM_LIMIT);
            String correctAnswer = isPrime(num) ? "yes" : "no";
            roundsData[i][1] = correctAnswer;
            String question = String.valueOf(num);
            roundsData[i][0] = question;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
