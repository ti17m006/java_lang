
/**
 * Convert centimetes to inches using type cast
 */

import java.util.Scanner;

class ThinkChapter0304 {
    public static void main(String[] args) {

        final double CM_PER_INCH = 2.54;

        int cm;
        double inch;
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter centimeters: ");
        cm = myInput.nextInt();
        inch = (double) (cm) / CM_PER_INCH;
        System.out.println(cm + " centimeters are " + inch + " inches");
    }
}