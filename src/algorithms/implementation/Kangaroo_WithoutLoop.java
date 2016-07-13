package algorithms.implementation;

import java.util.Scanner;

public class Kangaroo_WithoutLoop {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		String match = "NO";

		if (v1 > v2) {
			int deltaS = x2 - x1;
			int deltaV = v1 - v2;

			if (deltaS % deltaV == 0) {
				match = "YES";
			}
		}

		System.out.println(match);
	}
}
