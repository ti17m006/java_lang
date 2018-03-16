/**
 * ThinkChapter0502
 * Conditional statements first example
 * Check if the number is positive
 */
public class ThinkChapter0502 {

    private static void positive03(int a) {
        System.out.println("a = " + a + " is positive value");
        if (a > 0) {
            System.out.println("a = " + a + " is positive value");
        } else if (a == 0) {
            System.out.println("a = " + a + " is zero value");
        } else {
            System.out.println("a = " + a + " is negative value");
        }
        System.out.println("This will be printed");
    }

    private static void positive02(int a) {
        System.out.println("Is number 'a' positive or negative: ");
        if (a > 0) {
            System.out.println("a = " + a + " is positive value");
        } else {
            System.out.println("a = " + a + " is negative value");
        }
        System.out.println("This will be printed");
    }

    private static void positive01(int a) {
        System.out.println("Is number 'a' positive or negative: ");
        if (a > 0) {
            System.out.println("a = " + a + " is positive value");
        }
        System.out.println("This will be printed");
    }

    public static void main(String[] args) {

    }
}