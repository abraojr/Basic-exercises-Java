import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/* Make a program to read two integer values, and then show the sum of these	
		 * numbers on the screen. */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, sum;

		a = sc.nextInt();
		b = sc.nextInt();

		sum = a + b;

		System.out.println("SUM = " + sum);
		sc.close();
	}
}
