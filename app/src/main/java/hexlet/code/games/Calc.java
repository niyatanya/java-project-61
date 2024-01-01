package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final int RANDOM_MIN = 1;
    private static final int RANDOM_MAX = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int OPERATOR_MIN = 0;
    private static final int OPERATOR_MAX = 2;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void playCalc() {
        String[][] roundsData = new String[Engine.ROUNDS][Engine.GAME_PARAMETERS_NUM];

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);
            char operator = OPERATORS[Utils.generateNumber(OPERATOR_MIN, OPERATOR_MAX)];
            int num2 = Utils.generateNumber(RANDOM_MIN, RANDOM_MAX);

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
