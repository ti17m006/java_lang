/**
 * ThinkChapter0504 
 * return keyword
 */
public class ThinkChapter0504 {

    public static void firstPrint() {
        if (3 > 4) {
            System.out.println("This is true");
            return;
        } else {
            System.out.println("This is false");
            return;
        }
        // this will show error in compilation 
        // beacuse compiler knows this will not be shown
        System.out.println("This will not be printed");
    }

    public static void main(String[] args) {
        firstPrint();
    }
}