package algorithms.implementation;

import java.util.Scanner;
import java.util.stream.IntStream;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int firstDay = in.nextInt();
        int lastDay = in.nextInt();
        int divider = in.nextInt();


        System.out.println(IntStream.rangeClosed(firstDay, lastDay).filter(day ->
                ((day - Integer.parseInt(new StringBuilder().append(day).reverse().toString())) % divider) == 0
        ).count());
    }
}
