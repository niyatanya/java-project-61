package hexlet.code;

import java.util.Scanner;
class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");

        Scanner scanner1 = new Scanner(System.in);
        int userChoice = scanner1.nextInt();

        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case 1:
                Cli.greeting();
                break;
            case 0:
                break;
            default:
                System.out.println("Sorry! No such choice. Please start again.");
                break;
        }
        scanner1.close();
    }
}
