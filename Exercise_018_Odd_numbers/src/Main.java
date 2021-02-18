import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read an integer value X (1 <= X <= 1000). Then show the odd numbers from 1 to
		 * X, one value per line, including the X, if applicable.
		 */

		Scanner sc = new Scanner(System.in);

		int X;

		X = sc.nextInt();

		for (int i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
