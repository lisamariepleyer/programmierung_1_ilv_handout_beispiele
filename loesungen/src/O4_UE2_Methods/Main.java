package O4_UE2_Methods;

public class Main {
    public static void main(String[] args) {
        printUntilNumber(5);

        System.out.println();
        System.out.println(sumOfNumbers(2, 4));
    }

    public static void printUntilNumber(int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static int sumOfNumbers(int min, int max) {
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
