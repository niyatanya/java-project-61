package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 10;
    private static final int PROGRESSION_LENGTH = 10;
    private static final int PROGRESSION_MIN = 0;
    private static final int PROGRESSION_MAX = 9;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void playProgression() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.GAME_PARAMETERS_NUM];

        for (var i = 0; i < roundsData.length; i++) {
            int first = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
            int step = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            int hiddenMemberIndex = Utils.generateNumber(PROGRESSION_MIN, PROGRESSION_MAX);
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
