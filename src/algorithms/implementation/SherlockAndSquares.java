package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        List<List<Integer>> testCases = Stream.generate(() ->
                Stream.generate(() -> in.nextInt()).limit(2).collect(Collectors.toList())
        ).limit(t).collect(Collectors.toList());

        testCases.forEach(c -> {
            double firstSqrt = Math.sqrt(c.get(0));
            double lastSqrt = Math.sqrt(c.get(1));

            int highestSqrtInRange = (int) Math.floor(lastSqrt);
            int lowerSqrtInRange = (int) Math.ceil(firstSqrt);

            int numberOfSquareRoots = (highestSqrtInRange - lowerSqrtInRange) + 1;

            System.out.println(numberOfSquareRoots);
        });
    }
}
