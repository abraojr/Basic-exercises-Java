import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read a positive integer N. The program should then show on
		 * the screen N lines, starting from 1 to N. For each line, show the line
		 * number, then the square and the value cube.
		 */

		Scanner sc = new Scanner(System.in);

		int n, sqr, cub;

		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			sqr = (int) Math.pow(i, 2.0);
			cub = (int) Math.pow(i, 3.0);
			System.out.println(i + " " + sqr + " " + cub);
		}
		sc.close();
	}
}
