package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {

    private static final int GAME_PARAMETERS_NUM = 2;
    private static final int RANDOM_LIMIT = 100;
    private static final int OPERATOR_LIMIT = 3;

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void playCalc() {
        String[][] roundsData = new String[Engine.ROUNDS][GAME_PARAMETERS_NUM];
        Random random = new Random();

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = random.nextInt(RANDOM_LIMIT);
            char operator = "+-*".charAt((new Random()).nextInt(OPERATOR_LIMIT));
            int num2 = random.nextInt(RANDOM_LIMIT);

            String correctAnswer = String.valueOf(calculate(num1, num2, operator));
            roundsData[i][1] = correctAnswer;

            String question = num1 + " " + operator + " " + num2;
            roundsData[i][0] = question;
        }
        Engine.runGame(DESCRIPTION, roundsData);
    }

    public static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '*':
                return num1 * num2;
            case '-':
                return num1 - num2;
            default:
                System.out.println("Incorrect operator");
                return 0;
        }
    }
}
