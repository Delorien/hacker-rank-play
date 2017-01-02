package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BonAppetit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int itensOrdered = in.nextInt();
        int indexOutForAnna = in.nextInt();
        List<Integer> itensCosts = Stream.generate(() -> in.nextInt()).limit(itensOrdered).collect(Collectors.toList());
        int brianChargedAnna = in.nextInt();

        int rightCharge = 0;

        for (int i = 0; i < itensOrdered; i++) {
            if (i != indexOutForAnna) {
                rightCharge += itensCosts.get(i);
            }
        }

        rightCharge = rightCharge / 2;

        if (rightCharge == brianChargedAnna) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(brianChargedAnna - rightCharge);
        }

    }
}
