import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Make a program that reads three double precision floating point values: A, B
		 * and C.Then, calculate and show:
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, aTriangle, aCircle, aTrapezoid, aSquare, aRectangle, pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		// a) the area of the rectangle triangle with A as the base and C as the height.
		aTriangle = (A * C) / 2.0;

		// b) the area of the circle of radius C. (pi = 3.14159)
		aCircle = pi * (Math.pow(C, 2.0));

		// c) the trapezoid area that has A and B for bases and C for height.
		aTrapezoid = (A + B) * C / (2.0);

		// d) the area of the square with side B.
		aSquare = Math.pow(B, 2.0);

		// e) the area of the rectangle that has sides A and B.
		aRectangle = A * B;

		System.out.printf("Triangle Area: %.3f%n", aTriangle);
		System.out.printf("Circle Area: %.3f%n", aCircle);
		System.out.printf("Trapezoid Area: %.3f%n", aTrapezoid);
		System.out.printf("Square Area: %.3f%n", aSquare);
		System.out.printf("Rectangle Area: %.3f%n", aRectangle);
		sc.close();
	}
}
