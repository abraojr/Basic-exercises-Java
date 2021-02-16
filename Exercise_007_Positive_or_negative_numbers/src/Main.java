import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Make a program to read an integer and tell if that number is negative or not.

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x < 0) {
			System.out.println("NEGATIVE");
		} 
		else {
			System.out.println("NON-NEGATIVE");
		}
		sc.close();
	}
}
