
/**
 * ThinkChapter0703
 * Print table
 */
import java.util.Scanner;

class ThinkChapter0703 {

    public static void print(int offset, int i, int n) {
        while (i <= n) {
            System.out.print(i + " ");
            i = offset + i;
        }
    }

    public static void printRow(int m, int n) {
        int i = m / n;
        int offset = i;
        print(offset, i, m);
        System.out.println();
    }

    public static void printRowUp(int m, int n) {
        int i = m / n;
        int offset = i;
        if (i % 2 == 0) {
            print(offset, i, m - (i * i) + i);
        } else {
            print(offset, i, m - (i * i) + i);
        }
        System.out.println();
    }

    public static void printRowDown(int m, int n) {
        int i = m / n;
        // int offset = i;
        printRow(i * i, i);
        // print(offset, i, i * i); System.out.println();
    }

    public static void printTable(int n) {
        int i = 1;
        while (i <= n) {
            printRowUp(i * n, n);
            i = i + 1;
        }
        System.out.println();
    }

    public static void run() {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = in.nextInt();
        printTable(number);
    }

    public static void main(String[] args) {
        run();
    }
}