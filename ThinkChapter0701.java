
/**
 * ThinkChapter0701
 */
import java.math.*;

class ThinkChapter0701 {

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static void printOdd(int n) {

        while (n > 0) {
            System.out.println("current value: " + n);
            if (isOdd(n)) {
                System.out.println("Odd: \t" + n);
            }
            n = n - 1;
        }
        System.out.println("End of loop");
    }

    public static void printEven(int n) {
        while (n > 0) {
            System.out.println("current value: " + n);
            if (!isOdd(n)) {
                System.out.println("Even: \t" + n);
            }
            n = n - 1;
        }
        System.out.println("End of loop");
    }

    public static void countdown(int n) {

        while (n > 0) {
            System.out.println("current value: " + n);
            n = n - 1;
        }
        System.out.println("End of loop");
    }

    public static void main(String[] args) {
        printEven(10);
        System.out.println();
        printOdd(10);
    }
}