package algorithms.implementation;

import java.util.Scanner;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String initialText = in.nextLine();
        String desiredText = in.nextLine();
        int numberOfOperations = in.nextInt();

        int lastMatchIndex = 0;

        for (int i = 0; i < Math.min(initialText.length(), desiredText.length()) && initialText.charAt(i) == desiredText.charAt(i); i++) {
            lastMatchIndex = i;
        }

        lastMatchIndex = 2 * (++lastMatchIndex);
        int sumOfLengths = initialText.length() + desiredText.length();

        if ((sumOfLengths - lastMatchIndex) > numberOfOperations) {
            System.out.println("No");
        }
        else if ((sumOfLengths - lastMatchIndex) % 2 == numberOfOperations % 2) {
            System.out.println("Yes");
        }
        else if ((sumOfLengths - numberOfOperations) < 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
