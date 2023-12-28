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
        String gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.startGame(gameRules);

        final int roundsMax = 3;
        while (Engine.getCorrectAnswersCount() < roundsMax) {
            Random random = new Random();
            int randomLimit = 100;
            int num = random.nextInt(randomLimit);
            String correctAnswer = isPrime(num);
            String question = String.valueOf(num);

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
}
