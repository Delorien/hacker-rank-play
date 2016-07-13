package algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		scanner.nextLine();
		String[] split = scanner.nextLine().split("\\D+");

		int numberOfPairs = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sumOfPair = Integer.parseInt(split[i]) + Integer.parseInt(split[j]);
				if (sumOfPair % k == 0) {
					numberOfPairs++;
				}
			}
		}
		System.out.println(numberOfPairs);
	}
}
