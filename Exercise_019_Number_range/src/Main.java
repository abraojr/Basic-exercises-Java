import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read an integer N. This value will be the amount of integer X values that
		 * will be read next. Show how many of these X values are in the range [10,20]
		 * and how many are out of the range, showing this information as an example
		 * (use the word "in" for inside the range, and "out" for outside the range).
		 */

		Scanner sc = new Scanner(System.in);

		int x, n, inRange = 0, outOfRange = 0;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			if (10 <= x && x <= 20)
				inRange++;
			else
				outOfRange++;
		}
		System.out.println(inRange + " in");
		System.out.println(outOfRange + " out");
		sc.close();
	}
}
