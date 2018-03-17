/**
 * ThinkChapter0704
 */

class ThinkChapter0704 {

    public static void doWileExample() {
        int n = 6;
        int i = 1;
        do {
            System.out.println(i + ". " + i);
            i = i + 1;
        } while (i <= n);
        System.out.println("End of loop");
    }

    public static void forExample() {
        int n = 6;
        for (int i = 0; i < n; i = i + 1) {
            System.out.println(i + ". " + i);
        }
        System.out.println("End of loop");
    }

    public static void run() {
        doWileExample();
    }

    public static void main(String[] args) {
        run();
    }
}