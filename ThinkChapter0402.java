
/*
*    1. Write a method called printAmerican that takes the day, date, 
*    month and year as parameters and that displays them in American format.
*
*    2. Test your method by invoking it from main and passing appropriate
*    arguments. The output should look something like this (except that 
*    the date might be different):
*        Saturday, July 22, 2015
*    
*    3. Once you have debugged printAmerican,
*    write another method called printEuropean that 
*    displays the date in European format.
*/

import java.util.Scanner;

class ThinkChapter0402 {

    public static void printAmerican(String day, int date, String month, int year) {
        String format = day + " " + month + " " + day + " " + year;
        System.out.println(format);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        String format = day + " " + date + " " + month + " " + year;
        System.out.println(format);
    }

    public static void main(String[] args) {
        printAmerican("Saturday", 22, "July", 2015);
        printEuropean("Saturday", 22, "July", 2015);
    }
}