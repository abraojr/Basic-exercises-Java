import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program that reads a value and displays a message saying which of the
		 * following intervals ([0,25], [25,50], [50,75], [75,100]) this value is in.
		 * Obviously if the value is not is in any of these ranges, the message “Out of
		 * range” should be printed.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;

		x = sc.nextDouble();

		if (0 <= x && x <= 25) {
			System.out.println("It's in the range [0,25]");
		} 
		else if (25 < x && x <= 50) {
			System.out.println("It's in the range [25,50]");
		}
		else if (50 < x && x <= 75) {
			System.out.println("It's in the range [50,75]");
		}
		else if (75 < x && x <= 100) {
			System.out.println("It's in the range [75,100]");
		} 
		else {
			System.out.println("Out of range");
		}
		sc.close();
	}
}
