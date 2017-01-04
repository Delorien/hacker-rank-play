package algorithms.implementation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CutTheSticks {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberofSticks = in.nextInt();

        List<Integer> stickers = Stream.generate(() -> in.nextInt()).limit(numberofSticks).map(Integer::intValue).collect(Collectors.toList());

        while (stickers.size() > 0) {
            System.out.println(stickers.size());
            final int smallest = getSmallest(stickers);
            stickers.replaceAll(v -> v - smallest);
            stickers = stickers.stream().filter(v -> v > 0).collect(Collectors.toList());
        }
    }

    private static int getSmallest(List<Integer> stickers) {
        return Collections.min(stickers);

    }
}
