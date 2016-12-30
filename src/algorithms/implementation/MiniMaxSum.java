package algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long[] inputs = Pattern.compile("\\D+").splitAsStream(in.nextLine()).mapToLong(Long::parseLong).toArray();
        long min = Arrays.stream(inputs).sum();
        long max = 0;

        long aux = 0;

        for (int i = 0; i < inputs.length; i++) {

            for (int j = 0; j < inputs.length; j++) {

                if (i != j) {
                    aux += inputs[j];
                }
            }
            if (aux < min) {
                min = aux;
            }
            if (aux > max) {
                max = aux;
            }

            aux = 0;
        }

        System.out.println(min + " " + max);
    }
}
