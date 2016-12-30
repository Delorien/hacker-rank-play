package algorithms.implementation;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DesignerPDFViewer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long[] heights = Pattern.compile("\\D+").splitAsStream(in.nextLine()).mapToLong(Long::parseLong).toArray();
        String word = in.next();

        List<Character> chars = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        long higher = heights[chars.indexOf(word.charAt(0))];
        long aux;

        for (int i = 0; i < word.length(); i++) {

            aux = heights[chars.indexOf(word.charAt(i))];

            if (aux > higher) {
                higher = aux;
            }
        }

        System.out.println(higher * word.length());
    }
}
