
/**
 * ThinkChapter0503
 * Flag Variables
 * Is number odd or even
 */
import java.util.Scanner;

public class ThinkChapter0503 {

    public static void printOdd(boolean isOdd) {
        if (isOdd) {
            System.out.println("Given number is odd");
        } else {
            System.out.println("Given number is even");
        }
    }

    public static void isNumberOdd(int a) {
        boolean isOdd = (a % 2 != 0);
        printOdd(isOdd);
    }

    public static void isNumberOdd02(int a) {
        boolean isOdd;
        if (a % 2 != 0) {
            isOdd = true;
        } else {
            isOdd = false;
        }
        printOdd(isOdd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.print("Enter number: ");
        number = in.nextInt();
        isNumberOdd(number);
    }
}