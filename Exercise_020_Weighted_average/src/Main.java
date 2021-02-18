import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read 1 integer value N, which represents the number of test cases that
		 * follow. Each test case consists of 3 real values, each with one decimal
		 * place. Present the weighted average for each of these sets of 3 values, with
		 * the first value having weight 2, the second value having weight 3 and the
		 * third value having weight 5.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;
		double n1, n2, n3, avg;

		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();

			avg = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("Weighted average: %.1f%n", avg);
		}
		sc.close();
	}
}
