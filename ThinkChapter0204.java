
/**
 * Create a new program called ThinkChapter0204.java. 
 * 
 * Create variables named hour, minute, 
 * and second. Assign values that are roughly the 
 * current time. Use a 24-hour clock so that at 2pm 
 * the value of hour is 14.
 * 
 * Make the program calculate and display the number 
 * of seconds since midnight.
 * 
 * Calculate and display the number of seconds remaining in the day.
 * 
 * Calculate and display the percentage of the day that has 
 * passed. You might run into problems when computing percentages with
 * integers, so consider using floating-point.
 * 
 * Change the values of hour , minute , and second to reflect 
 * the current time. Then write code to compute the elapsed 
 * time since you started working on this exercise.
 * 
 */

class ThinkChapter0204 {

	public static void main(String[] args) {

		int hours = 9;
		int minutes = 14;
		int seconds = 45;

		int secSinceMidnight = hours * 60 * 60 + minutes * 60 + seconds;
		System.out.print("Number of seconds after midnight: ");
		System.out.println(secSinceMidnight);

		int secDay = 24 * 60 * 60;
		int secRemaining = secDay - secSinceMidnight;
		System.out.print("Remaining seconds: ");
		System.out.println(secRemaining);

		float percentRemaining = ((float) secRemaining / (float) secDay) * 100;
		System.out.print("Remaining seconds (%): ");
		System.out.println(percentRemaining);

		int endHours = 9;
		int endMinutes = 20;
		int endSeconds = 8;

		// Convert start time and end time into seconds
		// in this case startTime has secSinceMidnight
		int startTime = secSinceMidnight;
		int endTime = endHours * 60 * 60 + endMinutes * 60 + endSeconds;
		int elapsedTime = endTime - startTime;

		// Convert elapsedTime into hours, minutes and seconds
		int elapsedHours = elapsedTime / (60 * 60);
		int elapsedMinutes = (elapsedTime / 60) % 60;
		int elapsedSeconds = elapsedTime % 60;

		System.out.print("Elapsed time: ");
		System.out.print(elapsedHours);
		System.out.print(":");
		System.out.print(elapsedMinutes);
		System.out.print(":");
		System.out.print(elapsedSeconds);
		System.out.println();

	}
}
