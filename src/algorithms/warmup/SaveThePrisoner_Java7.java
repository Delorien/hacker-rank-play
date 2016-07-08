package algorithms.warmup;

import java.util.Scanner;

public class SaveThePrisoner_Java7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {
			int prisioners = scanner.nextInt();
			int sweets = scanner.nextInt();
			int initialPrisioner = scanner.nextInt();
			int deadPreisioner = ((sweets + initialPrisioner - 2) % prisioners) + 1;
			System.out.println(deadPreisioner);
		}
	}
}