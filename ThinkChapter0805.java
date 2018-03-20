/**
 * ThinkChapter0805
 * Method overloading
 */

/**
 * Static method(s) cannot invoke regular methods,
 * unless in static method isn't an instance of
 * regular method.
 */
class Box {
    public int length;
    public int width;
    public int height;

    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static void test() {
        System.out.println("This is empty method");
    }

    public static void test(int a) {
        System.out.println("This is int method");
    }

    public static void test(double a) {
        System.out.println("This is double method");
    }
}

class ThinkChapter0805 {

    public static void run() {
        //ERROR in main class
        // something();
        double a = 4.3;
        int b = 7;
        Box.test();
        Box.test(a);
        Box.test(b);
    }

    public void something() {
    }

    public static void main(String[] args) {
        run();
        //ERROR
        //something(); OR
        //this.something();

    }
}