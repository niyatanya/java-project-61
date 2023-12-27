package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Engine;

public class Progression {
    public static String[] makeProgression(int first, int step, int PROGRESSION_LENGTH) {

        int[] workingArr = new int[PROGRESSION_LENGTH];
        workingArr[0] = first;
        int sum = first;

        for (var i = 1; i < PROGRESSION_LENGTH; i++) {
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

        Engine.correctAnswersCount = 0;
        while (Engine.correctAnswersCount < 3) {

            final int PROGRESSION_LENGTH = 10;
            Random random = new Random();
            int first = random.nextInt(10);
            int step = random.nextInt(10);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);

            int hiddenMemberIndex = random.nextInt(10);
            String correctAnswer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            Engine.playGame(question, correctAnswer);
        }
        System.out.println("Congratulations, " + Engine.name + "!");
    }
}
