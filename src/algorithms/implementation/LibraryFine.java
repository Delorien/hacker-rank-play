package algorithms.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LibraryFine {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] actual = IntStream.generate(() -> in.nextInt()).limit(3).toArray();
        int[] expected = IntStream.generate(() -> in.nextInt()).limit(3).toArray();

        int fine = 0;

        if (actual[0] > expected[0] && actual[1] == expected[1] && actual[2] == expected[2]) {
            fine = 15 * (actual[0] - expected[0]);
        } else if (actual[1] > expected[1] && actual[2] == expected[2]) {
            fine = 500 * (actual[1] - expected[1]);
        } else if (actual[2] > expected[2]) {
            fine = 10000;
        }

        System.out.println(fine);
    }
}
