package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return "no";
            }
        }
        return "yes";
    }
    public static void playPrime() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int gameParametersNum = 2;
        String[][] roundsData = new String[Engine.ROUNDS][gameParametersNum];
        Random random = new Random();
        final int randomLimit = 100;

        for (var i = 0; i < roundsData.length; i++) {
            int num = random.nextInt(randomLimit);
            String correctAnswer = isPrime(num);
            roundsData[i][1] = correctAnswer;
            String question = String.valueOf(num);
            roundsData[i][0] = question;
        }
        Engine.runGame(description, roundsData);
    }
}
