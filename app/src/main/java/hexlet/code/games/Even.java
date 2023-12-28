package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void playEven() {
        String gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.startGame(gameRules);

        final int roundsMax = 3;
        while (Engine.getCorrectAnswersCount() < roundsMax) {

            Random random = new Random();
            int randomLimit = 100;
            int num = random.nextInt(randomLimit);

            String correctAnswer;
            if (num % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            String question = String.valueOf(num);

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
}
