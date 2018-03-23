
/**
 * ThinkChapter1002
 * 
 * String.format, StringBuilder
 */

import java.util.Scanner;

class ThinkChapter1002 {

    public static String takeFive() {
        String[] strings = new String[] { "one", "two", "three", "four", "five" };

        String result = new String();
        for (String string : strings) {
            result = new StringBuilder(result).append(string).toString();
        }
        return result;
    }

    public static String fullName(String firstName, String lastName) {
        String format = "%s %s";
        return String.format(format, firstName, lastName);
    }

    public static void run() {
        Scanner in = new Scanner(System.in);
        String firstName;
        String lastName;
        String fName = new String();

        System.out.print("Enter first name: ");
        firstName = in.nextLine();
        System.out.print("Enter last name: ");
        lastName = in.nextLine();

        fName = new StringBuilder(fName).append(fullName(firstName, lastName)).toString();

        System.out.println(fName);

        System.out.println(takeFive());
    }

    public static void main(String[] args) {
        run();
    }
}