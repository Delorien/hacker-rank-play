package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor_Java7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		while (numberOfTestCases > 0) {

			int numberOfStudents = scanner.nextInt();
			int minimumOfStudentsToClass = scanner.nextInt();
			scanner.nextLine();
			String[] split = scanner.nextLine().split(" ");
			int hasArrived = 0;

			while (numberOfStudents > 0) {
				if (Integer.parseInt(split[numberOfStudents - 1]) <= 0) {
					hasArrived++;
				}
				numberOfStudents--;
			}

			if (hasArrived >= minimumOfStudentsToClass) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

			numberOfTestCases--;
		}
	}
}
