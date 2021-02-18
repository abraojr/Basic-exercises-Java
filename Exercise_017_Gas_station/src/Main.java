import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * A gas station wants to determine which of its products is preferred by its
		 * customers. Write an algorithm to read the type of fuel supplied (coded as
		 * follows: 1.Alcohol 2.Gasoline 3.Diesel 4.Exit). If the user enters an invalid
		 * code (outside the range of 1 to 4), a new code must be requested (until it is
		 * valid). The program will end when the code entered is number 4. The message:
		 * "THANK YOU VERY MUCH" and the number of customers who supplied each type of
		 * fuel must be written.
		 */

		Scanner sc = new Scanner(System.in);

		int x, alcohol = 0, diesel = 0, gasoline = 0;

		x = sc.nextInt();

		while (x != 4) {
			switch (x) {
			case 1:
				alcohol += 1;
				break;
			case 2:
				gasoline += 1;
				break;
			case 3:
				diesel += 1;
				break;
			default:
				System.out.println("Invalid code, enter a valid code: ");
			}
			x = sc.nextInt();
		}
		System.out.println("THANK YOU VERY MUCH!");
		System.out.println("ALCOHOL: " + alcohol);
		System.out.println("GASOLINE: " + gasoline);
		System.out.println("DIESEL: " + diesel);
		sc.close();
	}
}
