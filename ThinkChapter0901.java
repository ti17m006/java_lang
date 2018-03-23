/**
 * ThinkChapter0901
 * Arrays
 */

class ThinkChapter0901 {

    public static void main(String[] args) {
        final int SIZE = 6;

        int[] intArray = new int[4];
        double[] doubleArray = new double[SIZE];

        intArray[0] = 5;
        intArray[1] = 9;
        intArray[2] = 1;
        intArray[3] = 7;

        // int i = 0;
        // while (i < 4) { //  while (i <= 3)
        //     System.out.println("Element of array: " + intArray[i]);
        //     i = i + 1;
        // }

        for (int i = 0; i < 4; i = i + 1) {
            System.out.println("Element of array: " + intArray[i]);
        }

        int[] predefinedArray = { 9, 5, 2, 0 };
    }
}