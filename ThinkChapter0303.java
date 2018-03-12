/*
    Convert inches to centimetes using constant
    
*/
import java.util.Scanner;

class ThinkChapter0303 {
    public static void main(String[] args) {
        
        final double CM_PER_INCH = 2.54;

        int inch;
        double cm;
        Scanner myInput = new Scanner(System.in);

        System.out.print("Enter inches: ");
        inch = myInput.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.println(inch + " inches is " + cm + " centimeters");
    }
}