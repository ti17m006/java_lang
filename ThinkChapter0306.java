
/** 
 * Convert temperature from Celsius to Feirenheit 
 *  f = c x (9/5) + 32
*/

import java.util.Scanner;

class ThinkChapter0306 {
    public static void main(String[] args) {

        Scanner myIn = new Scanner(System.in);

        // Do not integer division!
        final double CONST_01 = (double) 9 / (double) 5;
        final double CONST_02 = 32;

        double celsius;
        double feirenheit;

        System.out.print("Enter temperature in celsious: ");
        celsius = myIn.nextDouble();
        feirenheit = (celsius * CONST_01) + CONST_02;
        System.out.println("Given temperature in celsius is " + feirenheit + " in feirenheit");
    }
}