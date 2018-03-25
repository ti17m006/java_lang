
/**
 * ThinkChapter1103
 */

import java.util.Random;

class IntArray {
    int[] array;

    public IntArray(int size) {
        array = new int[size];
    }

    public void fillRandom() {
        Random rand = new Random();
        for (int i = 0; i < array.length ; i = i + 1) {
            array[i] = rand.nextInt(10);
        }
    }

    public String showArray() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length ; i = i + 1) {
            sb.append(array[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}

class Matrix {
    IntArray[] matrix;

    public Matrix(int size) {        
        matrix = new IntArray[size];        
        /* 
            Do not use foreach with array!!!!
        for (IntArray e : matrix) {            
            e = new IntArray(size);
        }
        */
        for (int i = 0; i < size; i = i + 1) {
            matrix[i] = new IntArray(size);
        }
    }

    public void fillRandom() {
        for (int i = 0; i < matrix.length; i = i + 1) {
            matrix[i].fillRandom();
        }
    }

    public String showMatrix() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i = i + 1) {
            sb.append(matrix[i].showArray());
            sb.append("\n");
        }
        return sb.toString();
    }
}

class ThinkChapter1103 {
    public static void run() {
        Matrix m = new Matrix(8);
        m.fillRandom();
        System.out.println(m.showMatrix());
    }

    public static void main(String[] args) {
        run();
    }
}