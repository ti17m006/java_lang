
/**
 *   Program that converts a total number 
 *   of seconds to hours, minutes, and seconds.
*/

import java.util.Scanner;

class ThinkChapter0307 {
    public static void main(String[] args) {

        Scanner myIn = new Scanner(System.in);

        int inSeconds;
        int hour, minute, second;

        System.out.print("Enter seconds: ");
        inSeconds = myIn.nextInt();

        hour = (inSeconds / 60) / 60;
        minute = (inSeconds / 60) % 60;
        second = (inSeconds % 60);

        System.out.println("hours: " + hour + " minutes: " + minute + " seconds: " + second);
    }
}