import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Make a program to read the code of a part 1, the number of parts 1, the unit
		 * value of each part 1, the part 2 code, the number of parts 2 and the unit
		 * value of each part 2.Calculate and show the amount to be paid
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code1, code2, quantity1, quantity2;
		double value1, value2, amountToPay;

		code1 = sc.nextInt();
		quantity1 = sc.nextInt();
		value1 = sc.nextDouble();

		code2 = sc.nextInt();
		quantity2 = sc.nextInt();
		value2 = sc.nextDouble();

		amountToPay = (quantity1 * value1) + (quantity2 * value2);

		System.out.printf("AMOUNT TO PAY: U$ %.2f%n", amountToPay);
		sc.close();
	}
}
