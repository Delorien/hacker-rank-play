package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigInteger f = BigInteger.valueOf(n);

        for (int i = n - 1; i > 0; i--) {
            f = f.multiply(BigInteger.valueOf(i));
        }

        System.out.println(f);

    }
}
