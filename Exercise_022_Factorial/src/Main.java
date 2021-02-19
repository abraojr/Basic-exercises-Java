import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read a N value. Calculate and write your respective factorial. Factorial of N
		 * = N * (N-1) * (N-2) * (N-3) * ... * 1. Remembering that, by definition, a
		 * factorial of 0 is 1.
		 */

		Scanner sc = new Scanner(System.in);

		int n, fact = 1;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(n + " factorial = " + fact);
		sc.close();
	}
}
