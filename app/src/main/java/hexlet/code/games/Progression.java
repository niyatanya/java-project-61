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
        String gameRules = "What number is missing in the progression?";
        Engine.startGame(gameRules);

        final int roundsMax = 3;
        while (Engine.getCorrectAnswersCount() < roundsMax) {

            final int progressionLength = 10;
            Random random = new Random();
            int randomLimit = 10;
            int first = random.nextInt(randomLimit);
            int step = random.nextInt(randomLimit);
            String[] progression = makeProgression(first, step, progressionLength);

            int hiddenMemberIndex = random.nextInt(randomLimit);
            String correctAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.getName() + "!");
    }
}
