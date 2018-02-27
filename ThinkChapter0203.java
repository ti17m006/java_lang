

/* 
 * Page 26
 * 
 * Write a program ThinkChapter0203 so that 
 * it displays the date in standard American 
 * format, for example: Thursday, July 16, 2015.
 * Program also displays the date in European format. 
 * The final output should be:
 * American format:
 * 	Thursday, July 16, 2015
 * European format:
 * 	Thursday 16 July 2015
 * 
 */


class ThinkChapter0203 {
	
	public static void main(String [] args) {
		
		String day = "Tuesday";
		String date = "27th";
		String month = "February";
		int year = 2018;
		
		//separator
		String sep = ", ";
		String sp = " ";
		
		System.out.println("American format:");
		System.out.print(day);
		System.out.print(sep);
		System.out.print(month);
		System.out.print(sp);
		System.out.print(date);
		System.out.print(sep);
		System.out.print(year);
		System.out.println();
		
		System.out.println("European format:");
		System.out.print(day);
		System.out.print(sp);
		System.out.print(date);
		System.out.print(sp);
		System.out.print(month);
		System.out.print(sp);
		System.out.print(year);
		System.out.println();
	}
}
