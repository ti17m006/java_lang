
/**
 * Page 26
 * Write a program ThinkChapter0202 that creates variables 
 * named day , date , month , and year. 
 * The variable day will contain the day 
 * of the week (like Friday), and date 
 * will contain the day of the month (like the 13th). 
 * What type is each variable? Assign values 
 * to those variables that represent today’s date.
 */

class ThinkChapter0202 {

	public static void main(String[] args) {

		String day = "Tuesday";
		String date = "27th";
		String month = "February";
		int year = 2018;

		//separator
		String sep = ", ";

		System.out.print("Today's date is ");
		System.out.print(day);
		System.out.print(sep);
		System.out.print(date);
		System.out.print(" ");
		System.out.print(month);
		System.out.print(sep);
		System.out.print(year);
		System.out.println();
	}
}
