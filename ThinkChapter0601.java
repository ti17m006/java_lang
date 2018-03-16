
/**
 * ThinkChapter0601
 * 
 */
import java.util.Scanner;

public class ThinkChapter0601 {

    public static boolean isNumberOdd(int a) {
        return a % 2 != 0;
    }

    public static String stringIsNumberOdd(int a) {
        return isNumberOdd(a) ? "The number is odd" : "The number is even";
    }

    public static int input() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int number;

        number = input();
        print(stringIsNumberOdd(number));
    }
}