/**
 *   
 * Scanner bug
 * Scanner doesn’t  see input as multiple lines. 
 * Instead, it gets a “stream of characters”.
*/

import java.util.Scanner;

class ThinkChapter0305 {
    public static void main(String[] args) {
        
        Scanner myIn = new Scanner(System.in);
        int number;
        String text;

        /* This works
        System.out.println("Type text: ");
        text = myIn.nextLine();
        System.out.println("Type number: ");
        number = myIn.nextInt();
        */

        /* This is the bug 
        System.out.println("Type number: ");
        number = myIn.nextInt();
        System.out.println("Type text: ");
        text = myIn.nextLine();
        */        

        /* This is the solution to the bug */
        System.out.println("Type number: ");
        number = myIn.nextInt();
        myIn.nextLine();
        System.out.println("Type text: ");
        text = myIn.nextLine();
        
        System.out.println("Text: " + text + " Number: " + number);
    }
}