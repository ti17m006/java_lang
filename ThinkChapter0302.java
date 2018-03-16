
/**
 *  Convert inches to centimeters
 */

import java.util.Scanner;

class ThinkChapter0302 {
    public static void main(String[] args) {

        int inch;
        double cm;
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter inches: ");
        inch = myInput.nextInt();
        cm = inch * 2.54;
        System.out.println(inch + " inches = " + cm + " centimeters");
    }
}