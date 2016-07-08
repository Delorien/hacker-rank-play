package algorithms.warmup;

import java.util.Scanner;

public class TimeConversion {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(convertTo24HourFormat(scanner.nextLine()));
	}

	public static String convertTo24HourFormat(String hourIn12ClockFormat) {

		int hour = Integer.parseInt(hourIn12ClockFormat.substring(0, 2));
		int modifier = 0;

		if ((hourIn12ClockFormat.contains("AM") && hour == 12) || (hourIn12ClockFormat.contains("PM") && hour != 12)) {
			modifier = 12;
		}
		String hourFormated = String.format("%02d", (hour + modifier) % 24);

		return hourIn12ClockFormat.replaceFirst("(\\d\\d)?", hourFormated).substring(0,
				hourIn12ClockFormat.length() - 2);
	}
}