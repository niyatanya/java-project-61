package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static void playCalc() {
        String description = "What is the result of the expression?";
        final int gameParametersNum = 2;
        String[][] roundsData = new String[Engine.ROUNDS][gameParametersNum];
        Random random = new Random();
        final int randomLimit = 100;

        for (var i = 0; i < roundsData.length; i++) {
            int num1 = random.nextInt(randomLimit);
            final int operatorLimit = 3;
            char operator = "+-*".charAt((new Random()).nextInt(operatorLimit));
            int num2 = random.nextInt(randomLimit);

            int correctAnswerInt = 0;
            switch (operator) {
                case '+':
                    correctAnswerInt = num1 + num2;
                    break;
                case '*':
                    correctAnswerInt = num1 * num2;
                    break;
                case '-':
                    correctAnswerInt = num1 - num2;
                    break;
                default:
                    System.out.println("Incorrect operator");
            }
            String correctAnswer = String.valueOf(correctAnswerInt);
            roundsData[i][1] = correctAnswer;

            String question = num1 + " " + operator + " " + num2;
            roundsData[i][0] = question;
        }
        Engine.runGame(description, roundsData);
    }
}
