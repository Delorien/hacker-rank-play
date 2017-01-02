package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UtopianTree {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfTestCases = in.nextInt();
        List<Integer> numberOfCycles = Stream.generate(() -> in.nextInt()).limit(numberOfTestCases).collect(Collectors.toList());


        numberOfCycles.stream().forEach(tc -> {

            int size = 1;

            for (int i = 0; i < tc; i++) {
                if (i % 2 == 0) {
                    size = size * 2;
                } else {
                    size += 1;
                }
            }

            System.out.println(size);
        });
    }
}
