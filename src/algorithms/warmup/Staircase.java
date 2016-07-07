package algorithms.warmup;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Staircase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		final int size = scanner.nextInt();

		IntStream.rangeClosed(1, size)
				.forEach(a -> System.out.println(String.join("",
						Stream.concat(Collections.nCopies(size - a, " ").stream(), Collections.nCopies(a, "#").stream())
								.collect(Collectors.toList()))));
	}

}