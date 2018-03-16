/**
 * 
*/

import java.util.Scanner;

// sqrt, sin, cos, tan
import java.lang.Math;

class ThinkChapter0401 {
	
	public static void newLine() {
		System.out.println();
	}
	
	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void printTime(int hour, int minute) {
		System.out.print(hour);
		System.out.print(":");
		System.out.print(minute);
		newLine();
	}

	public static void add(int a) {
		int b = 5;
		int c = a + b;
		System.out.print("c = " + c);
		newLine();
	}

	public static void baffle() {
		System.out.print("wug");
		ping();
	}
	
	public static void ping() {
		System.out.println(".");
		// baffle();
	}

	public static void main(String [] args) {
		System.out.println("First line.");
		newLine();
		System.out.println("Second line.");
		printTime(11, 22);
		printTime(11 + 1, 10 + 12);

		int a = 2;
		int b = 9;
		add(3);
		add(a);
		add(b);
		baffle();
	}
}