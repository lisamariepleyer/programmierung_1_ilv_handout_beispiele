package O5_UE3_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exerciseOne();
        // exerciseTwo();
    }

    public static void exerciseOne() {
        int[] myArray = getArray(getNumber());

        for (int a : myArray) {
            System.out.println(a);
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Provide an int: ");
            int input = scanner.nextInt();

            if (input <= 0) {
                continue;
            }

            return input;
        }
    }

    public static int[] getArray(int maxNumber) {
        int[] a = new int[maxNumber + 1];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        return a;
    }

    public static void exerciseTwo(){
        int[] myArray = getNumbersFromUser(5);

        for (int a : myArray) {
            System.out.print(a + " ");
        }
    }

    public static int[] getNumbersFromUser(int length) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter Number " + (i+1) + ": ");
            a[i] = scanner.nextInt();
        }

        return a;
    }
}
