package algorithms.warmup;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SaveThePrisoner_Java8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		Stream.generate(() -> Stream.generate(() -> scanner.nextInt()).limit(3).collect(Collectors.toList()))
				.limit(numberOfTestCases).forEach(a -> System.out.println(((a.get(1) + a.get(2) - 2) % a.get(0)) + 1));

	}
}