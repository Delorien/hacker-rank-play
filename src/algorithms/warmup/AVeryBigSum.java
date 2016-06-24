package algorithms.warmup;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AVeryBigSum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		System.out.println(Pattern.compile("\\D+").splitAsStream(scanner.nextLine()).mapToLong(Long::parseLong).sum());
	}
}