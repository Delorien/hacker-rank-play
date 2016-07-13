package algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		String match = "NO";

		for (int i = 0; i <= 10000; i++) {
			x1 += v1;
			x2 += v2;
			if (x1 == x2) {
				match = "YES";
			}
		}

		System.out.println(match);

	}
}
