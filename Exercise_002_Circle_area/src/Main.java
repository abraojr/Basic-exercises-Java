import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read the radius value of a circle, and then show the area
		 * value of this circle with four decimal places.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Consider the value of pi = 3.14159
		double r, area, pi = 3.14159;

		System.out.print("Enter a radius value: ");
		r = sc.nextDouble();

		// Area formula: area = pi.radius^2
		area = pi * (Math.pow(r, 2.0));

		System.out.printf("Circle area= %.4f", area);
		sc.close();
	}
}
