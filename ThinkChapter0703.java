/**
 * ThinkChapter0703
 * Print table
 */
import java.util.Scanner;

class ThinkChapter0703 {

    public static void tmp(int start, int i, int n) {
        while (i <= n) {
            System.out.print(i + " ");
            i = start + i;
        } 
    }

    public static void printRow(int n, int m) {
        int i = n / m;
        int start = i;
        if (i % 2 != 0) {
            tmp(start, i, n);  
        } else {
            tmp(start, i, n);
        }
        System.out.println();
    }

    public static void printTable(int n) {
        int i = 1;
        while (i <= n) {
            printRow(i * n, n);
            i = i + 1;
        }
        System.out.println();
    }

    public static void run() {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: " );
        number = in.nextInt();
        printTable(number);
    }

    public static void main(String[] args) {
        run();
    }
}