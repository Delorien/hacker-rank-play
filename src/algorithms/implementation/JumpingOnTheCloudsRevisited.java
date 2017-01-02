package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {

        final int THUNDER_CLOUD = 1;

        Scanner in = new Scanner(System.in);
        int numberOfClouds = in.nextInt();
        int jumpDistance = in.nextInt();
        List<Integer> valuesOfClouds = Stream.generate(() -> in.nextInt()).limit(numberOfClouds).collect(Collectors.toList());

        int energy = 100;


        for (int i = 0; i < numberOfClouds; i += jumpDistance) {
            energy--;

            if (valuesOfClouds.get(i) == THUNDER_CLOUD) {
                energy -= 2;
            }
        }

        System.out.println(energy);
    }
}
