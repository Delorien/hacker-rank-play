package algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDigits {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();

        List<Integer> values = Stream.generate(() -> in.nextInt()).limit(numberOfTestCases).collect(Collectors.toList());

        values.stream().forEach(n -> {

            List<Integer> digits = new ArrayList();
            int i = n;
            while (i > 0) {
                digits.add(i % 10);
                i /= 10;
            }

            System.out.println(digits.stream().filter(d -> d != 0 ? n % d == 0 : false).count());
        });
    }
}
