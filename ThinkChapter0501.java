
/**
 * ThinkChapter0501
 */
public class ThinkChapter0501 {

    public static void basicLogicOperators() {

        int a = 5;
        int b = 3;
        int c = 2;
        int d = 3;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("b > d: " + (b < d));
        System.out.println("b >= d: " + (b <= d));
    }

    // depends on Java implementation
    public static void howNotToCompareStrings() {
        String apple = "Apple";
        String orange = "Apple";

        System.out.println("Do not compare strings with == ");
        System.out.println("apple == orange: " + (apple == orange));
    }

    public static void howToCompareStrings() {
        String apple = "Apple";
        String orange = "Orange";

        System.out.println("Do not compare strings with == ");
        System.out.println("apple.equals(orange): " + apple.equals(orange));
    }

    public static void main(String[] args) {

        howNotToCompareStrings();
    }
}