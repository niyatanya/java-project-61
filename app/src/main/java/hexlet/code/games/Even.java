package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void playEven() {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int gameParametersNum = 2;
        String[][] roundsData = new String[Engine.ROUNDS][gameParametersNum];
        Random random = new Random();
        final int randomLimit = 100;

        for (var i = 0; i < roundsData.length; i++) {
            int num = random.nextInt(randomLimit);
            String correctAnswer;
            if (num % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            roundsData[i][1] = correctAnswer;
            String question = String.valueOf(num);
            roundsData[i][0] = question;
        }
        Engine.runGame(description, roundsData);
    }
}
