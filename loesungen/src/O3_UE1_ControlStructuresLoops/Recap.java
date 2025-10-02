package O3_UE1_ControlStructuresLoops;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        // 1. Write a welcome message
        System.out.println("Welcome!");

        // 2. Ask the user to enter their name and exam points (integer between 0 and 40)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        int examPoints = -1;

        do {
            System.out.print("Enter your exam results: ");
            int input = scanner.nextInt();
            if (input < 0 || input > 40) {
                System.out.println("Your exam points must be an int between 0 and 40.");
            } else {
                examPoints = input;
            }
        } while (examPoints == -1);

        // 3. Check if the points are even or odd.
        if (examPoints % 2 == 0) {
            System.out.println("Your exam points are even.");
        } else {
            System.out.println("The exam points are odd.");
        }

        // 4. Calculate the percentage of points achieved (max. 40).
        float percExamPoints = ((float) examPoints/40) * 100;
        System.out.println("You reached " + percExamPoints + "%.");

        // 5. Print a message based on the grade:
        if (percExamPoints < 60) {
            System.out.println("Needs improvement");
        } else if (percExamPoints < 75){
            System.out.println("Passed");
        } else if (percExamPoints < 90){
                System.out.println("Good job");
        } else {
            System.out.println("Excellent");
        }
    }
}
