import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read four integer values A, B, C and D. Then calculate and
		 * show the product difference of A and B by the product of C and D according to
		 * the formula: DIFFERENCE = (A * B - C * D).
		 */

		Scanner sc = new Scanner(System.in);

		int A, B, C, D, dif;

		System.out.println("Enter four integers:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		dif = (A * B - C * D);

		System.out.println("DIFFERENCE: " + dif);
		sc.close();
	}

}
