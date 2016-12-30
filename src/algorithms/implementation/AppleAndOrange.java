package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppleAndOrange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startHouse = in.nextInt();
        int endHouse = in.nextInt();
        int appleTree = in.nextInt();
        int orangeTree = in.nextInt();
        int nApples = in.nextInt();
        int nOranges = in.nextInt();
        List<Integer> applesDistances = Stream.generate(() -> in.nextInt()).limit(nApples).collect(Collectors.toList());
        List<Integer> orangesDistances = Stream.generate(() -> in.nextInt()).limit(nOranges).collect(Collectors.toList());

        long nApplesOnHouse = applesDistances.stream().filter(distance -> (appleTree + distance >= startHouse && appleTree + distance <= endHouse)).count();
        long nOrangesOnHouse = orangesDistances.stream().filter(distance -> (orangeTree + distance >= startHouse && orangeTree + distance <= endHouse)).count();

        System.out.println(nApplesOnHouse);
        System.out.println(nOrangesOnHouse);

    }

}
