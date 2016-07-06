package algorithms.warmup;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlusMinus_Java8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();

		Map<Integer, Double> result = Stream.generate(() -> scanner.nextInt()).limit(size)
				.collect(Collectors.groupingBy(i -> i.compareTo(0))).entrySet().stream()
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().size() / new Double(size)));

		System.out.println(String.format("%.6f", result.getOrDefault(1, 0.0)));
		System.out.println(String.format("%.6f", result.getOrDefault(-1, 0.0)));
		System.out.println(String.format("%.6f", result.getOrDefault(0, 0.0)));
	}

}
