package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) {

            Random random = new Random();

            final int PROGRESSION_LENGTH = 10;
            int first = random.nextInt(10);
            int step = random.nextInt(10);
            int hiddenMemberIndex = random.nextInt(10);
            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);
            String correctAnswer = progression[hiddenMemberIndex];

            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);

            System.out.println("Question: " + question);

            String userAnswer = scanner.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
