import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read a number N. Then read N pairs of numbers and show the
		 * division of the first by the second. If the denominator is equal to zero,
		 * show the message "Impossible division".
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, a, b;
		double result;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (b == 0) {
				System.out.println("Impossible division");
			} 
			else {
				result = (double) a / b;
				System.out.printf("%.1f%n", result);
			}
		}
		sc.close();
	}
}
