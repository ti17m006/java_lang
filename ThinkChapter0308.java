/*
    Guess my number
*/

import java.util.Random;
import java.util.Scanner;

class ThinkChapter0308 {
    public static void main(String[] args) {
        
        Scanner myIn = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;

        System.out.print("Guess the number: ");
        guess = myIn.nextInt();
        System.out.println("Chosen number is: " + number);
    }
}