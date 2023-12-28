package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.playCalc();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            case "0":
                break;
            default:
                System.out.println("Sorry! No such choice. Please start again.");
                break;
        }
        scanner.close();
    }
}
