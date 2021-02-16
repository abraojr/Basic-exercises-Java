import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Make a program to read an integer and tell if the number is pair or odd.

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("PAIR");
		}
		else {
			System.out.println("ODD");
		}
		sc.close();
	}

}
