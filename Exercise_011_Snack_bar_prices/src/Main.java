import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 /*Based on the table below, write a program that reads the code of an item and the quantity of this item. Then calculate
         * and show the amount of the account payable.
         CODE         SPECIFICATION          PRICE
           1           Hot dog              U$ 4,00
           2           X-Salad              U$ 4,50    
           3           X-Bacon              U$ 5,00 
           4           Simple toast         U$ 2,00 
           5           Soda                 U$ 1,50 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code, qnt;
		double totPrice;

		code = sc.nextInt();
		qnt = sc.nextInt();

		if (code == 1) {
			totPrice = qnt * 4.0;
		} 
		else if (code == 2) {
			totPrice = qnt * 4.5;
		}
		else if (code == 3) {
			totPrice = qnt * 5.0;
		} 
		else if (code == 4) {
			totPrice = qnt * 2.0;
		} 
		else {
			totPrice = qnt * 1.5;
		}
		System.out.printf("Total: U$%.2f ", totPrice);
		sc.close();

	}
}
