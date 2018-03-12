/* 
    System belongs to the java.lang package, 
    which is imported automatically. According to the
    documentation, java.lang “provides classes 
    that are fundamental to the design of the
    Java programming language.” The String class 
    is also part of the java.lang package.
*/

import java.util.Scanner;

class ThinkChapter0301 {
    public static void main(String [] args) {
        System.out.println(System.out);
        
        Scanner myInput = new Scanner(System.in);
        String line;

        System.out.print("Type something: ");
        line = myInput.nextLine();
        
        System.out.println("Input value: " + line);

        System.out.println("Type something else: ");
        line = myInput.nextLine();
        
        System.out.println("Another input value: " + line);

    }
}