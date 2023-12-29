package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Progression {

    private static final int GAME_PARAMETERS_NUM = 2;
    private static final int RANDOM_LIMIT = 100;
    private static final int PROGRESSION_LENGTH = 10;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void playProgression() {
        String[][] roundsData = new String[Engine.ROUNDS][GAME_PARAMETERS_NUM];
        Random random = new Random();

        for (var i = 0; i < roundsData.length; i++) {
            int first = random.nextInt(RANDOM_LIMIT);
            int step = random.nextInt(RANDOM_LIMIT);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            int hiddenMemberIndex = random.nextInt(PROGRESSION_LENGTH);
            String correctAnswer = progression[hiddenMemberIndex];
            roundsData[i][1] = correctAnswer;

            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);
            roundsData[i][0] = question;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    public static String[] makeProgression(int first, int step, int progressionLength) {
        String[] progression = new String[progressionLength];

        for (int i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(first + i * step);
        }
        return progression;
    }
}
