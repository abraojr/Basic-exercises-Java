import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 /*
		 * Read 2 values with one decimal place (x and y), which must represent the
		 * coordinates of a point on a plane. Next, determine which quadrant the point
		 * belongs to, or whether it is on one of the Cartesian axes or at the origin (x
		 * = y = 0). If the point is at the origin, write the message “Origin”. If the
		 * point is on one of the axes, write “Axis X” or “Axis Y”, depending on the
		 * situation.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println("Q1");
		} 
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if ((x > 0 || x < 0) && y == 0) {
			System.out.println("Axis X");
		} 
		else if ((y > 0 || y < 0) && x == 0) {
			System.out.println("Axis Y");
		} 
		else {
			System.out.println("Origin");
		}
		sc.close();
	}
}
