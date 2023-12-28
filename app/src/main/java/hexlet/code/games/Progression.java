package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Progression {
    public static String[] makeProgression(int first, int step, int progressionLength) {

        int[] workingArr = new int[progressionLength];
        workingArr[0] = first;
        int sum = first;

        for (var i = 1; i < progressionLength; i++) {
            workingArr[i] = sum + step;
            sum += step;
        }
        String[] resultArr = new String[workingArr.length];

        for (var j = 0; j < resultArr.length; j++) {
            resultArr[j] = Integer.toString(workingArr[j]);
        }
        return resultArr;
    }
    public static void playProgression() {
        String description = "What number is missing in the progression?";
        final int gameParametersNum = 2;
        String[][] roundsData = new String[Engine.ROUNDS][gameParametersNum];
        Random random = new Random();
        final int progressionLength = 10;
        final int randomLimit = 10;

        for (var i = 0; i < roundsData.length; i++) {
            int first = random.nextInt(randomLimit);
            int step = random.nextInt(randomLimit);
            String[] progression = makeProgression(first, step, progressionLength);
            int hiddenMemberIndex = random.nextInt(randomLimit);
            String correctAnswer = progression[hiddenMemberIndex];
            roundsData[i][1] = correctAnswer;

            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);
            roundsData[i][0] = question;
        }
        Engine.runGame(description, roundsData);
    }
}
