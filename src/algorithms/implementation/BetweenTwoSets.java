package algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BetweenTwoSets {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int aSize = in.nextInt();
        int bSize = in.nextInt();

        List<Integer> a = Stream.generate(() -> in.nextInt()).limit(aSize).collect(Collectors.toList());
        List<Integer> b = Stream.generate(() -> in.nextInt()).limit(bSize).collect(Collectors.toList());

        ArrayList<Integer> join = new ArrayList(a);
        join.addAll(b);

        int result = 0;

        for (int i = Collections.min(join); i <= Collections.max(join); i++) {

            final int candidate = i;

            if (a.stream().filter(n -> candidate % n == 0).count() == aSize
                    && b.stream().filter(n -> n % candidate == 0).count() == bSize) {
                result++;
            }
        }

        System.out.println(result);
    }
}
