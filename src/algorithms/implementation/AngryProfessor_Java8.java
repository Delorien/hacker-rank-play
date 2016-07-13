package algorithms.implementation;

import java.util.Scanner;
import java.util.stream.Stream;

public class AngryProfessor_Java8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases = scanner.nextInt();

		while (numberOfTestCases > 0) {

			int numberOfStudents = scanner.nextInt();
			int minimumOfStudentsToClass = scanner.nextInt();

			long hasArrived = Stream.generate(() -> scanner.nextInt()).limit(numberOfStudents)
					.filter(studant -> studant <= 0).count();

			if (hasArrived >= minimumOfStudentsToClass) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

			numberOfTestCases--;
		}
	}
}
