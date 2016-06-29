package algorithms.warmup;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DiagonalDifference {

	@SuppressWarnings("resource")
	public static void maina(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size = Integer.parseInt(scanner.nextLine());

		int result = 0;
		for (int i = 1; i <= size; i++) {
			int[] row = Pattern.compile("[^-&\\d]").splitAsStream(scanner.nextLine()).mapToInt(Integer::parseInt)
					.toArray();
			result = result + row[i - 1] - row[size - i];
		}
		System.out.println(Math.abs(result));
	}
}