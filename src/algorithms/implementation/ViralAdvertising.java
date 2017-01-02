package algorithms.implementation;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int days = in.nextInt();

        int peoples = 5;
        int newLikers;
        int totalLikers = 0;

        for (int i = 0; i < days; i++) {

            newLikers = peoples / 2;
            totalLikers += newLikers;
            peoples = newLikers * 3;

        }

        System.out.println(totalLikers);
    }
}
