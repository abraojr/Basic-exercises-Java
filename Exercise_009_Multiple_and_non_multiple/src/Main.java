import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Read 2 integer values (A and B). Then, the program should display the message
		 * "Are multiple" or "Are not multiple", indicating whether the values read are
		 * multiple with each other. Attention: numbers must be entered ascending or
		 * descending order.
		 */

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("They are multiple!");
		} 
		else {
			System.out.println("They're not multiple!");
		}
		sc.close();
	}

}
