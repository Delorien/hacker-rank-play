package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus_Java7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		float positives = 0;
		float negatives = 0;
		float zeroes = 0;

		for (int i = 0; i < size; i++) {
			int nextInt = scanner.nextInt();
			if (nextInt > 0) {
				positives++;
			} else if (nextInt < 0) {
				negatives++;
			} else {
				zeroes++;
			}
		}
		System.out.println(String.format("%.6f", (positives / size)));
		System.out.println(String.format("%.6f", (negatives / size)));
		System.out.println(String.format("%.6f", (zeroes / size)));
	}

}
