package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void playEven() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.GAME_PARAMETERS_NUM];

        for (var i = 0; i < roundsData.length; i++) {
            int num = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
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
