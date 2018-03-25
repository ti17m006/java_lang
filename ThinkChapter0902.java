/**
 * ThinkChapter0902
 */

/**
 * IntArray
 */
import java.math.*;
import java.util.Random;
import java.util.Scanner;

class IntArray {

    public int[] intArray;

    public IntArray(int size) {
        intArray = new int[size];
    }

    public void fillWithRandomValues() {
        Random rand = new Random();
        for (int i = 0; i < intArray.length; i = i + 1) {
            intArray[i] = rand.nextInt(100);
        }
    }

    public void showArray() {
        System.out.println("Elements of array: ");
        for (int i = 0; i < intArray.length; i = i + 1) {
            System.out.println("i[" + i + "]: " + intArray[i]);
        }
    }
}

class ThinkChapter0902 {

    public static void run() {
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array: ");
        size = in.nextInt();
        IntArray myArray = new IntArray(size);
        myArray.fillWithRandomValues();
        myArray.showArray();
    }

    public static void main(String[] args) {
        run();
    }
}