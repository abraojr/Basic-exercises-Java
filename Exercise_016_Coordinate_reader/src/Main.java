import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*Make a program to read the coordinates (X, Y) of an undetermined number of points in the Cartesian system.
         * For each point, write the quadrant to which it belongs. The algorithm will be terminated when at least one
         * of the two coordinates is NULL (in this situation without writing any message).*/
		
		Scanner sc = new Scanner(System.in);

		int X, Y;

		X = sc.nextInt();
		Y = sc.nextInt();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0)
				System.out.println("1st Quadrant");
			else if (X < 0 && Y > 0)
				System.out.println("2nd Quadrant");
			else if (X < 0 && Y < 0)
				System.out.println("3rd Quadrant");
			else
				System.out.println("4th Quadrant");
			X = sc.nextInt();
			Y = sc.nextInt();
		}
		sc.close();
	}
}
