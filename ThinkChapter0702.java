/**
 * ThinkChapter0702
 */
import java.math.*;

class ThinkChapter0702 {

    public static void log2() {
        final double LOG2 = Math.log(2);
        int n = 6;
        int i = 1;
        while(i < 100) {
            double x = (double) i;
            System.out.println(x + "\t" + Math.log(x) / LOG2);
            i = i * 2;
        }
    }

    public static void logTable() {
        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + "\t" + Math.log(x));
            i = i + 1;
        }
    }

    public static void sequence(int n) {
        while (n != 0) {
            System.out.println("current value: " + n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
        }
    }

    public static void main(String[] args) {
    }
}