package algorithms.implementation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SockMerchant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numberOfSocks = in.nextInt();
        List<Integer> colorsOfSocks = Stream.generate(() -> in.nextInt()).limit(numberOfSocks).collect(Collectors.toList());

        System.out.println(colorsOfSocks.stream().distinct().mapToInt(d -> Collections.frequency(colorsOfSocks, d) / 2).sum());
    }
}
