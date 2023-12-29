package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {

    private static final int GAME_PARAMETERS_NUM = 2;
    private static final int RANDOM_LIMIT = 100;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        String[][] roundsData = new String[Engine.ROUNDS][GAME_PARAMETERS_NUM];
        Random random = new Random();

        for (var i = 0; i < roundsData.length; i++) {
            int num = random.nextInt(RANDOM_LIMIT);
            String correctAnswer = isEven(num) ? "yes" : "no";
            roundsData[i][1] = correctAnswer;

            String question = String.valueOf(num);
            roundsData[i][0] = question;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
