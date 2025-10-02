package O3_UE1_ControlStructuresLoops;

import java.util.Scanner;

public class LoopExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Countdown
        System.out.print("Countdown Number: ");
        int countdown = scanner.nextInt();
        for (int i = countdown; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Factorial Calculator
        System.out.print("Factorial Number: ");
        int factorial = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }
        System.out.println(factorial + "! is " + result);

        // Password Retry
        String correctPassword = "1234";
        boolean hasGuessedPassword = false;
        for (int i = 0; i < 3; i++) {
            System.out.print("Password: ");
            String guessedPassword = scanner.next();

            if (guessedPassword.equals(correctPassword)) {
                hasGuessedPassword = true;
                break;
            }
        }
        if (hasGuessedPassword) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        // Reversed Stairs
        System.out.print("Stair height: ");
        int stairHeight = scanner.nextInt();
        for (int row = 0; row < stairHeight; row++) {
            for (int i = 0; i < stairHeight - row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Count Digits
        System.out.print("Count digits: ");
        int input = scanner.nextInt();

        int count = 0;
        for (int n = input; n > 0; n /= 10) {
            count++;
        }
        System.out.println(input + " has " + count + " digits.");

        System.out.println(input + " has " + String.valueOf(input).length() + " digits.");
    }
}
